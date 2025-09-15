package atividade1;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: SSD insuficiente!");
            return false;
        }
        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: RAM insuficiente!");
            return false;
        }

        System.out.println("Programa executado com sucesso!");
        float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());
        System.out.printf("Tempo de execução: %.2f segundos%n", tempoExecucao);
        return true;
    }
}
