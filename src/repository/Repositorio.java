package repository;

import java.util.List;
import java.util.Optional;

public interface Repositorio<T, E>{
    void salvar(T elemento);
    void remover(String placa);
    Optional<T> buscarPorId(E id);
    List<T> listarTodos();
}
