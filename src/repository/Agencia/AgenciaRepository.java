package repository.Agencia;

import Model.Agencia.Agencia;

import java.util.List;

public interface AgenciaRepository {

    void salvar(Agencia agencia);
    void editar(Agencia agencia);
    List<Agencia> procurarPeloNome(String nome);
    List<Agencia> procurarPeloEndereco(String endereco);
    Agencia getById(String id);
}
