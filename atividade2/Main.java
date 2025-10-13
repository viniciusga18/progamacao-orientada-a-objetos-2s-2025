public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Maria Eduarda", "mariaed@email.com", 323);
        Funcionario funcionario = new Funcionario("Luciana", "luciana@email.com", "Bibliotecário");

        Livro livro = new Livro("Java Básico", 2021, "3ª edição");
        Revista revista = new Revista("Ciência Hoje", 2023, "Paulo Henrique");

        Emprestimo e1 = new Emprestimo(usuario, livro, "10/10/2025", "20/10/2025");
        Emprestimo e2 = new Emprestimo(funcionario, revista, "12/10/2025", "22/10/2025");

        e1.exibirDetalhes();
        System.out.println();
        e2.exibirDetalhes();
    }
}