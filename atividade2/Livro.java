public class Livro extends Material {
    private String edicao;

    public Livro(String titulo, int anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Livro: " + titulo + " (" + anoPublicacao + ")");
        System.out.println("Edição: " + edicao);
    }
}