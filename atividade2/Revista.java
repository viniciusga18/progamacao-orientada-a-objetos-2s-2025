public class Revista extends Material {
    private String autor;

    public Revista(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void descricao() {
        System.out.println("Revista: " + titulo + " (" + anoPublicacao + ")");
        System.out.println("Autor: " + autor);
    }
}