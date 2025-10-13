public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Cargo: " + cargo);
    }
}