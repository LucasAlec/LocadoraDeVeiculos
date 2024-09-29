package View;

import Service.Cliente.ClienteService;
import Service.Veiculo.VeiculoService;
import Utils.ScannerUtil;

public class ViewPrincipal{
    private final VeiculoService veiculoService;
    //private final ClienteService clienteService;
    private final VeiculosView veiculosView;
    //private final MenuClientes menuClientes;
    ///private final MenuAluguel menuAluguel;

    public ViewPrincipal(VeiculoService veiculoService, ClienteService clienteService) {
        this.veiculoService = veiculoService;
        //this.clienteService = clienteService;
        this.veiculosView = new VeiculosView(veiculoService);
        //this.menuClientes = new MenuClientes(clienteService);
        //this.menuAluguel = new MenuAluguel(aluguelService, veiculoService);
    }

    public void exibirViewPrincipal() {
        while (true) {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Gerenciar Veículos"); // ok
            System.out.println("2. Gerenciar Agências");
            System.out.println("3. Gerenciar Clientes");
            System.out.println("4. Aluguel & Devolução");
            System.out.println("5. Sair");
            System.out.println("==========================\n");

            int opcao = ScannerUtil.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    veiculosView.exibirVeiculosView();
                    break;
                case 2:
                    // Implementar ViewAgencias
                    break;
                case 3:
                    //Implementar  ViewClientes
                    break;
                case 4:
                    //Implementar ViewAluguel
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
