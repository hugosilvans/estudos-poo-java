package Atividade1;

/** Representa o sistema operacional do exercício de composição. */
public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) { this.computador = computador; }

    public boolean executarPrograma(Programa p) {
        // Verificação de SSD
        if (p.getSSDocupado() > computador.getSSD()) {
            System.out.println("Erro na instalação: SSD insuficiente!");
            return false;
        }

        // Verificação de Memória RAM
        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro na execução: Memória RAM insuficiente!");
            return false;
        }

        // Execução com sucesso
        Float tempo = p.getQuantidadeOperacoes() /
                      (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso!");

        System.out.println("Tempo de execução: " + tempo + " segundos.");
        return true;
    }

    public Computador getComputador() { return this.computador; }

    public void setComputador(Computador computador) { this.computador = computador; }
}