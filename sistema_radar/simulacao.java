package sistema_radar;

public class simulacao {
    public static void main(String[] args) {
        Carro hellcat = new Carro();
        hellcat.ano = 24;
        hellcat.modelo = "Demon";
        hellcat.placa = "VLDM001";
        hellcat.velocidade = 0; 

        Radar radar = new Radar();
        radar.localizacao = "Pistao sul";
        radar.limiteVelocidade = 60;

        radar.avaliarVelocidade(hellcat);

        hellcat.acelerar(); //10
         hellcat.acelerar();
         hellcat.acelerar();
         hellcat.acelerar();
         hellcat.acelerar();
         hellcat.acelerar();
         hellcat.acelerar(); //10

         radar.avaliarVelocidade(hellcat);
    }
    
}
