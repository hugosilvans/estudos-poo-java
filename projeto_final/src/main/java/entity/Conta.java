package main.java.entity;

/** Classe abstrata do exercício bancário; subclasses representam tipos de conta. */
public abstract class Conta {

    private Integer numero;
    private String agencia;
    private Float saldo;
    private Cliente titular;

    public Conta(Integer numero, String agencia, Float saldo, Cliente titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Integer getNumero() { return this.numero; }

    public void setNumero(Integer numero) { this.numero = numero; }

    public String getAgencia() { return this.agencia; }

    public void setAgencia(String agencia) { this.agencia = agencia; }

    public Float getSaldo() { return this.saldo; }

    public void setSaldo(Float saldo) { this.saldo = saldo; }

    public Cliente getTitular() { return this.titular; }

    public void setTitular(Cliente titular) { this.titular = titular; }
}
