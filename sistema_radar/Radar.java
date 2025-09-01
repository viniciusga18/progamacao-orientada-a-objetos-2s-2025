package sistema_radar;

public class Radar {
    
    public String localizacao;
    public Integer limiteVelocidade;

    public void emitirNotificacao(String placa, Integer velocidadeObservada) {
        System.out.println("placa: "+placa);
        System.out.println("Velocidade observada: "+velocidadeObservada);
        System.out.println("Localizacao: "+ this.localizacao);
        System.out.println("Velocidade da via: "+ this.limiteVelocidade);
    }

    public void avaliarVelocidade(Carro carro) {
        if (carro.velocidade > this.limiteVelocidade){
            emitirNotificacao(carro.placa, carro.velocidade);
        }
    }
}
