public class simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR300", 0, 1976, "Comodoro");

        Radar radar = new Radar(40, "Pardal", "Pistão Sul");

        radar.limiteVelocidade = 40;
        radar.localizacao = "Pistão Sul";

        opala.acelerar(); // 5
        opala.acelerar(); // 10
        opala.acelerar(); // 15
        opala.acelerar(); // 20
        opala.acelerar(); // 25
        opala.acelerar(); // 30
        opala.acelerar(); // 35

        opala.acelerar(); // 40
        radar.avaliarVelocidade(opala, null);

        opala.acelerar(); // 45
        opala.setVelocidade(-60);
        radar.avaliarVelocidade(opala, null);
    }
}
