import Menu.MenuPrincipal;
import repository.RepositorioVeiculo;
import repository.RepositorioVeiculoImpl;
import service.ClienteServiceImpl;
import service.VeiculoServiceImpl;

public class Main {
    public static void main(String[] args) {

        // Instanciando o repositório de veículos
        RepositorioVeiculo repositorioVeiculo = new RepositorioVeiculoImpl();

        // Instanciando os serviços necessários
        VeiculoServiceImpl veiculoService = new VeiculoServiceImpl(repositorioVeiculo);
        ClienteServiceImpl clienteService = new ClienteServiceImpl();

        // Iniciando o Menu Principal com os serviços
        MenuPrincipal menuPrincipal = new MenuPrincipal(veiculoService, clienteService);
        menuPrincipal.exibirMenu();
    }
}