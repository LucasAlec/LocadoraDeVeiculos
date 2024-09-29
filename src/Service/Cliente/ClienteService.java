package Service.Cliente;

import Model.Pessoa.Cliente;

public interface ClienteService {
    void cadastrar(Cliente cliente);
    void editarCliete(Cliente cliente);
    Cliente buscarPorNome(String nome);
    void listarClientes();
    void removerCliente(Cliente cliente);
}