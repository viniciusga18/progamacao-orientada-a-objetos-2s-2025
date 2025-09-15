package atividade1;

public class Main {
    public static void main(String[] args) {
       
        Computador computador = new Computador(8, 512, 4, 1000.0f); 

        SistemaOperacional os = new SistemaOperacional(computador);

    
        System.out.println("--- Executando Programa 1 (Sucesso) ---");
        Programa programa1 = new Programa(2, 50, 2, 50000); 
        os.executarPrograma(programa1);
        System.out.println();

        System.out.println("--- Executando Programa 2 (Erro na Instalação) ---");
        Programa programa2 = new Programa(4, 600, 4, 100000); 
        os.executarPrograma(programa2);
        System.out.println();

        System.out.println("--- Executando Programa 3 (Erro na Execução) ---");
        Programa programa3 = new Programa(10, 100, 4, 100000); 
        os.executarPrograma(programa3);
    }
}


