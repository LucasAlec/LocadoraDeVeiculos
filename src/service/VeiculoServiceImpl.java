package service;

import entidades.Veiculo;
import repository.RepositorioVeiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class VeiculoServiceImpl implements VeiculoService {
    private final RepositorioVeiculo repositorioVeiculo;

    // Construtor que recebe o repositório como parâmetro
    public VeiculoServiceImpl(RepositorioVeiculo repositorioVeiculo) {
        this.repositorioVeiculo = repositorioVeiculo;
    }

    @Override
    public void cadastrar(Veiculo veiculo) {
        Optional<Veiculo> veiculoMesmaPlaca = buscarPorPlaca(veiculo.getPlaca());
        if (veiculoMesmaPlaca.isPresent()) {
            System.out.println("Veículo com a mesma placa já cadastrado.");
            return;
        }
        repositorioVeiculo.salvar(veiculo);
        System.out.println("Veículo cadastrado com sucesso.");
    }

    @Override
    public void editar(Veiculo veiculo) {
        Optional<Veiculo> veiculoMesmaPlaca = buscarPorPlaca(veiculo.getPlaca());
        if (veiculoMesmaPlaca.isPresent()) {
            System.out.println("Veículo com a mesma placa já existe.");
            return;
        }
        repositorioVeiculo.salvar(veiculo);
        System.out.println("Veículo editado com sucesso.");
    }

    @Override
    public Optional<Veiculo> buscarPorPlaca(String placa) {
        return repositorioVeiculo.buscarPorPlaca(placa);
    }

    @Override
    public List<Veiculo> buscarPorTipo(Veiculo.Tipo tipo) {
        return repositorioVeiculo.buscarPorTipo(tipo);
    }

    @Override
    public List<Veiculo> listarTodos() {
        List<Veiculo> veiculos = repositorioVeiculo.listarTodos();
        return veiculos != null ? veiculos : new ArrayList<>();  // Retorna a lista de veículos ou uma lista vazia
    }

}
