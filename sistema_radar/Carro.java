/** Dados do veículo utilizados na simulação do radar. */
public class Carro {
    public Integer ano;
    public String modelo;
    public String placa;
    private Integer velocidade;

    public Carro(String placa, Integer velocidade, Integer ano, String modelo) {
        this.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;
    }

    public Integer getVelocidade() { return this.velocidade; }

    public void setVelocidade(Integer velocidade) {
        if (velocidade != null && velocidade > 0) {
            this.velocidade = velocidade;
        }
    }

    public String getPlaca() { return this.placa; }

    public void acelerar() { this.velocidade += 5; }

    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade -= 5;
        }
    }
}