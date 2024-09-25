import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;
import entidades.Veiculo;
import repository.RepositorioVeiculo;
import repository.RepositorioAluguel;
import service.AluguelService;

public class AluguelServiceImpl implements AluguelService {

    private final RepositorioVeiculo repositorioVeiculo;
    private final RepositorioAluguel repositorioAluguel;

    public AluguelServiceImpl(RepositorioVeiculo repositorioVeiculo, RepositorioAluguel repositorioAluguel) {
        this.repositorioVeiculo = repositorioVeiculo;
        this.repositorioAluguel = repositorioAluguel;
    }

    @Override
    public void alugarVeiculo(String clienteId, String veiculoId, int diasAluguel, String local) {
        Veiculo veiculo = repositorioVeiculo.buscarVeiculo(veiculoId);
        Pessoa cliente = repositorioAluguel.buscarCliente(clienteId); // Supondo que você tenha acesso ao cliente

        if (veiculo.disponivel) {  // Usando o atributo diretamente
            double valorTotal = calcularValorTotal(veiculo, diasAluguel, cliente);

            veiculo.setDisponivel(false);  // Marcando como indisponível
            repositorioAluguel.registrarAluguel(clienteId, veiculo, diasAluguel, local, valorTotal);
            System.out.println("Veículo alugado com sucesso! Valor total: R$" + valorTotal);
        } else {
            System.out.println("Veículo não disponível para aluguel.");
        }
    }

    @Override
    public void devolverVeiculo(String clienteId, String veiculoId) {
        Veiculo veiculo = repositorioVeiculo.buscarVeiculo(veiculoId);
        if (!veiculo.disponivel) {  // Verificando diretamente o atributo
            veiculo.setDisponivel(true);  // Marcando como disponível
            repositorioAluguel.registrarDevolucao(clienteId, veiculo);
            System.out.println("Veículo devolvido com sucesso!");
        } else {
            System.out.println("Este veículo já está disponível.");
        }
    }

    private double calcularValorTotal(Veiculo veiculo, int diasAluguel, Pessoa cliente) {
        double valorTotal = veiculo.getTipo().getValor() * diasAluguel;  // Usando o valor da diária do enum Tipo

        // Regras de desconto conforme o tipo de cliente
        if (cliente instanceof PessoaFisica) {
            if (diasAluguel > 5) {
                valorTotal *= 0.95; // Aplica 5% de desconto
                System.out.println("Desconto aplicado (5% para Pessoa Física).");
            }
        } else if (cliente instanceof PessoaJuridica) {
            if (diasAluguel > 3) {
                valorTotal *= 0.90; // Aplica 10% de desconto
                System.out.println("Desconto aplicado (10% para Pessoa Jurídica).");
            }
        }

        return valorTotal;
    }
}
