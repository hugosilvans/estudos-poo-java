package main.java.entity;

/** Dados do titular usados pelo exercício de contas. */
public class Cliente {

    private Integer id;
    private String nome;
    private String email;

    public Cliente(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() { return this.id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return this.nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = email; }

    public void exibirInfo() {}
}
