package Atividade1;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando computador
        Computador pc = new Computador(8, 500, 4, 2.5f);

        // Criando sistema operacional
        SistemaOperacional Hugos = new SistemaOperacional(pc);

        // Criando programas
        Programa p1 = new Programa(6, 300, 10000); // Deve rodar com sucesso
        Programa p2 = new Programa(2, 600, 5000);  // SSD insuficiente
        Programa p3 = new Programa(16, 100, 8000); // RAM insuficiente

        // Testando execuções
        Hugos.executarPrograma(p1);
        Hugos.executarPrograma(p2);
        Hugos.executarPrograma(p3);
    }
}
