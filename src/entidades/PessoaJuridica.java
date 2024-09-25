package entidades;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    private String endereco;
    private String telefoneComercial;


    public PessoaJuridica(String nome, String telefone, String cnpj, String razaoSocial, String inscricaoEstadual, String endereco, String telefoneComercial) {
        super(nome, telefone); // Chama o construtor da superclasse Pessoa
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
        this.telefoneComercial = telefoneComercial;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica: " + razaoSocial + " | CNPJ: " + cnpj + " | Inscrição Estadual: " + inscricaoEstadual +
                " | Endereço: " + endereco + " | Telefone Comercial: " + telefoneComercial;
    }
}