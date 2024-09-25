package service;

public interface AluguelService {
    void alugarVeiculo(int clienteId, String veiculoId, int diasAluguel);
    void devolverVeiculo(int clienteId, String veiculoId);
}
