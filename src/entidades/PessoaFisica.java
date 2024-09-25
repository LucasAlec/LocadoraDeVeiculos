package entidades;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String telefone, String cpf) {
        super(nome, telefone); // Chama o construtor da classe Pessoa
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " | CPF: " + cpf;
    }
}
