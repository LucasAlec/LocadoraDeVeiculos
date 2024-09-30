package Repository.Veiculo;

import Model.Veiculo.Veiculo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class VeiculoRepositoryImpl implements VeiculoRepository {
    private final Map<String, Veiculo> veiculos = new HashMap<>();

    @Override
    public void salvar(Veiculo veiculo) {
        veiculos.put(veiculo.getPlaca(), veiculo);
    }

    @Override
    public void remover(String placa) {
        veiculos.remove(placa);
    }

    @Override
    public Optional<Veiculo> buscarPorPlaca(String placa) {
        return Optional.ofNullable(veiculos.get(placa));
    }

    @Override
    public List<Veiculo> listarTodos() {
        return veiculos.values().stream().collect(Collectors.toList());
    }
}
