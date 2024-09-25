package service;

import entidades.Pessoa;

public interface ClienteService {
    void cadastrar(Pessoa cliente);
    Pessoa buscarPorNome(String nome);
    void listarClientes();
    void removerCliente(Pessoa cliente);
}
