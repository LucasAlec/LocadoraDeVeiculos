package entidades;

import java.time.Instant;
import java.util.List;

public class Aluguel {
    private String id;
    private Pessoa pessoa;
    private List<Veiculo> veiculo;
    private Integer valor;
    private String local;
    private Instant dataHora;

    public Aluguel(String id, Pessoa pessoa, List<Veiculo> veiculo, Integer valor, String local, Instant dataHora) {
        this.id = id;
        this.pessoa = pessoa;
        this.veiculo = veiculo;
        this.valor = valor;
        this.local = local;
        this.dataHora = dataHora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Instant getDataHora() {
        return dataHora;
    }

    public void setDataHora(Instant dataHora) {
        this.dataHora = dataHora;
    }
}
