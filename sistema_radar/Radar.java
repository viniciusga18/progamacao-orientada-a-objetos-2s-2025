package sistema_radar;

public class Radar {
    
    private String localizacao;
    private Integer limiteVelocidade;

    public Radar(String localizacao, Integer limiteVelocidade) {
        this.localizacao = localizacao;
        this.limiteVelocidade = limiteVelocidade;
    }

    public String getLocalizacao(){
        return this.localizacao;
    }

     public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

     public Integer getlimite(){
        return this.limiteVelocidade;
    }

     public void setlimite(Integer limiteVelocidade){
        this.limiteVelocidade = limiteVelocidade;
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada) {
        System.out.println("placa: "+placa);
        System.out.println("Velocidade observada: "+velocidadeObservada);
        System.out.println("Localizacao: "+ this.localizacao);
        System.out.println("Velocidade da via: "+ this.limiteVelocidade);
    }

    public void avaliarVelocidade(Carro carro) {
        if (carro.getVelocidade() > this.limiteVelocidade){
            emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
        }
    }
}
