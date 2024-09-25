package Menu;

import service.ClienteService;
import service.VeiculoService;
import service.AluguelService;
import utils.ScannerUtil;

public class MenuPrincipal {
    private final VeiculoService veiculoService;
    private final ClienteService clienteService;
    private final MenuVeiculos menuVeiculos;
    private final MenuClientes menuClientes;
    private final MenuAluguel menuAluguel;

    public MenuPrincipal(VeiculoService veiculoService, ClienteService clienteService, AluguelService aluguelService) {
        this.veiculoService = veiculoService;
        this.clienteService = clienteService;
        this.menuVeiculos = new MenuVeiculos(veiculoService);
        this.menuClientes = new MenuClientes(clienteService);
        this.menuAluguel = new MenuAluguel(aluguelService, veiculoService);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Gerenciar Veículos");
            System.out.println("2. Gerenciar Agências");
            System.out.println("3. Gerenciar Clientes");
            System.out.println("4. Aluguel & Devolução");
            System.out.println("5. Sair");
            System.out.println("==========================\n");

            int opcao = ScannerUtil.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    menuVeiculos.exibirMenuVeiculos();
                    break;
                case 2:
                    // Implementar MenuAgencias
                    break;
                case 3:
                    menuClientes.exibirMenuClientes();
                    break;
                case 4:
                    menuAluguel.exibirMenuAluguel();
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
