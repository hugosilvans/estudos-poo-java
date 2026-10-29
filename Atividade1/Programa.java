package Atividade1;

/** Representa um programa associado ao computador no exercício. */
public class Programa {
    private Integer MemoriaRAMAlocada;
    private Integer SSDocupado;
    private Integer QuantidadeOperacoes;

    public Programa(Integer MemoriaRAMAlocada, Integer SSDocupado, Integer QuantidadeOperacoes) {
        this.MemoriaRAMAlocada = MemoriaRAMAlocada;
        this.SSDocupado = SSDocupado;
        this.QuantidadeOperacoes = QuantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocada() { return MemoriaRAMAlocada; }

    public void setMemoriaRAMAlocada(Integer MemoriaRAMAlocada) {
        this.MemoriaRAMAlocada = MemoriaRAMAlocada;
    }

    public Integer getSSDocupado() { return SSDocupado; }

    public void setSSDocupado(Integer SSDocupado) { this.SSDocupado = SSDocupado; }

    public Integer getQuantidadeOperacoes() { return QuantidadeOperacoes; }

    public void setQuantidadeOperacoes(Integer QuantidadeOperacoes) {
        this.QuantidadeOperacoes = QuantidadeOperacoes;
    }
}
