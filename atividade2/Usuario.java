public class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Matrícula: " + matricula);
    }
}