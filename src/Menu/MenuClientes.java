package Menu;

import entidades.PessoaJuridica;
import service.ClienteService;
import utils.ScannerUtil;

public class MenuClientes {
    private final ClienteService clienteService;

    public MenuClientes(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void exibirMenuClientes() {
        while (true) {
            System.out.println("\n1. Cadastrar Pessoa Física");
            System.out.println("2. Cadastrar Pessoa Jurídica");
            System.out.println("3. Sair\n");

            int opcao = ScannerUtil.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    // Lógica para cadastrar Pessoa Física
                    break;
                case 2:
                    //cadastrarPessoaJuridica();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
