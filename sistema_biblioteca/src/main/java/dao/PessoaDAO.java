package dao;

import java.util.ArrayList;
import java.util.function.Consumer;
import model.Pessoa;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/** Acesso persistente a Pessoa, com sessões curtas e falhas propagadas ao chamador. */
public class PessoaDAO {
    private static final SessionFactory sessionFactory =
        new Configuration().configure().buildSessionFactory();

    /** Encerre a fábrica somente ao finalizar a aplicação inteira. */
    public void close() { sessionFactory.close(); }

    private void executarTransacao(Consumer<Session> operacao) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transacao = session.beginTransaction();
            try {
                operacao.accept(session);
                transacao.commit();
            } catch (RuntimeException erro) {
                // O rollback ainda tem uma sessão aberta; não esconda a falha original.
                try {
                    if (transacao.isActive())
                        transacao.rollback();
                } catch (RuntimeException falhaRollback) {
                    erro.addSuppressed(falhaRollback);
                }
                throw new IllegalStateException("Falha na persistência de Pessoa.", erro);
            }
        }
    }

    public void salvarPessoa(Pessoa pessoa) { executarTransacao(session -> session.save(pessoa)); }

    public Pessoa getPessoaById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Pessoa.class, id);
        }
    }

    public void atualizarPessoa(Pessoa pessoa) {
        executarTransacao(session -> session.update(pessoa));
    }

    public void deletarPessoa(Pessoa pessoa) {
        executarTransacao(session -> session.delete(pessoa));
    }

    /** Lista vazia significa ausência de registros, não erro de conexão. */
    public ArrayList<Pessoa> getTodasPessoas() {
        try (Session session = sessionFactory.openSession()) {
            return new ArrayList<>(session.createQuery("FROM Pessoa", Pessoa.class).list());
        }
    }
}
