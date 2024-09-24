package service;

import Agencia.Agencia;
import Model.Veiculo.Veiculo;
import Model.pessoa.Pessoa;
import Model.pessoa.PessoaFisica;
import Model.pessoa.PessoaJuridica;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluguel <T extends Veiculo<?>, P extends Pessoa>{
    private T veiculo;
    private P pessoa;
    private Agencia agencia;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;

    public Aluguel(T veiculo, P pessoa, Agencia agencia, LocalDate dataAluguel, LocalDate dataDevolucao) {
        this.veiculo = veiculo;
        this.pessoa = pessoa;
        this.agencia = agencia;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
    }

    public BigDecimal calcularValorTotal() {
        long diasAlugados = ChronoUnit.DAYS.between(dataAluguel, dataDevolucao);
        BigDecimal valorTotal = veiculo.getValorGrupo().multiply(new BigDecimal(diasAlugados));

        if(pessoa instanceof PessoaFisica && diasAlugados > 5){
            valorTotal = valorTotal.multiply(BigDecimal.valueOf(0.95));
        } else if (pessoa instanceof PessoaJuridica && diasAlugados > 3) {
            valorTotal = valorTotal.multiply(BigDecimal.valueOf(0.90));

        }
        return valorTotal;
    }

    public T getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(T veiculo) {
        this.veiculo = veiculo;
    }

    public P getPessoa() {
        return pessoa;
    }

    public void setPessoa(P pessoa) {
        this.pessoa = pessoa;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
