package Menu;

import service.AluguelService;
import service.VeiculoService;
import utils.ScannerUtil;

public class MenuAluguel {

    private final AluguelService aluguelService;
    private final VeiculoService veiculoService;

    public MenuAluguel(AluguelService aluguelService, VeiculoService veiculoService) {
        this.aluguelService = aluguelService;
        this.veiculoService = veiculoService;
    }

    public void exibirMenuAluguel() {
        while (true) {
            System.out.println("\n===== Menu de Aluguel =====");
            System.out.println("1. Alugar Veículo");
            System.out.println("2. Devolver Veículo");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.println("===========================\n");

            int opcao = ScannerUtil.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    alugarVeiculo();
                    break;
                case 2:
                    devolverVeiculo();
                    break;
                case 3:
                    return; // Voltar ao menu principal
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void alugarVeiculo() {
        String clienteId = ScannerUtil.lerString("Informe o ID do cliente: ");
        String veiculoId = ScannerUtil.lerString("Informe o ID do veículo: ");
        int dias = ScannerUtil.lerInteiro("Informe a quantidade de dias de aluguel: ");
        String local = ScannerUtil.lerString("Informe o local de retirada: ");

        aluguelService.alugarVeiculo(clienteId, veiculoId, dias, local);
    }

    private void devolverVeiculo() {
        String clienteId = ScannerUtil.lerString("Informe o ID do cliente: ");
        String veiculoId = ScannerUtil.lerString("Informe o ID do veículo: ");

        //aluguelService.devolverVeiculo(clienteId, veiculoId);
    }
}
