package sistema_radar;

public class simulacao {
    public static void main(String[] args) {
        Carro hellcat = new Carro("VLDM001", 0, 24, "Demon");

        Radar radar = new Radar("Pistao Sul",60);
      
        radar.avaliarVelocidade(hellcat);

        hellcat.acelerar(); //10
         hellcat.acelerar();
         hellcat.acelerar();
         hellcat.acelerar();
         hellcat.acelerar();
         hellcat.acelerar();
         hellcat.acelerar(); //10
         hellcat.setVelocidade(-60);
         radar.avaliarVelocidade(hellcat);
    }
    
}
