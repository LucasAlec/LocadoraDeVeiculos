package service;

import entidades.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {
    private List<Pessoa> clientes;

    public ClienteServiceImpl() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void cadastrar(Pessoa cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso.");
        } else {
            System.out.println("Cliente já está cadastrado.");
        }
    }

    @Override
    public Pessoa buscarPorNome(String nome) {
        for (Pessoa cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }

    @Override
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Pessoa cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    @Override
    public void removerCliente(Pessoa cliente) {
        if (clientes.contains(cliente)) {
            clientes.remove(cliente);
            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
