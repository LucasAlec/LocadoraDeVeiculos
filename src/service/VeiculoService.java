package service;

import entidades.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoService {
    void cadastrar(Veiculo veiculo);
    void editar(Veiculo veiculo);
    Optional<Veiculo> buscarPorPlaca(String placa);
    List<Veiculo> buscarPorTipo(Veiculo.Tipo tipo);
    List<Veiculo> listarTodos();
}
