package repository;

import entidades.Veiculo;

import java.util.List;
import java.util.Optional;

public interface RepositorioVeiculo extends Repositorio<Veiculo, String>{
    Optional<Veiculo> buscarPorPlaca(String placa);
    List<Veiculo> buscarPorTipo(Veiculo.Tipo tipo);
}
