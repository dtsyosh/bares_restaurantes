package view;

import controller.GerenteController;
import java.util.Scanner;

/**
 *
 * @author yosh
 */
public class Principal {

    public static void main(String[] args) {
        menuPrincipal();

    }

    public static void menuGerente() {
        Scanner ler = new Scanner(System.in);
        GerenteController gerenteController = new GerenteController();
        boolean aux = true;

        while (true) {
            System.out.println("-> Menu gerente <-");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Cadastrar Produtos");
            System.out.println("3. Gerar Relatório de Funcionários");
            System.out.println("4. Gerar Relatório de Vendas");
            System.out.println("5. Voltar ao menu anterior.");

            switch (ler.nextInt()) {
                case 1:

                    String nome_funcionario,
                     numero_celular;
                    int rg;

                    ler.nextLine();
                    System.out.print("Digite o nome do funcionário: ");
                    nome_funcionario = ler.nextLine();
                    System.out.print("Digite o celular do funcionário: ");
                    numero_celular = ler.nextLine();
                    System.out.print("Digite o RG do funcionário: ");
                    rg = ler.nextInt();

                    gerenteController.cadastrarFuncionario(nome_funcionario, numero_celular, rg);
                    break;
                case 2:
                    String nome_produto;
                    int categoria_id;
                    Double valor;

                    ler.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    nome_produto = ler.nextLine();
                    System.out.print("Digite o id da categoria: ");
                    categoria_id = ler.nextInt();
                    System.out.print("Digite o valor: ");
                    valor = ler.nextDouble();
                    gerenteController.cadastrarProduto(nome_produto, categoria_id, valor);

                    break;

                case 3:
                    gerenteController.gerarRelatorio();
                    System.out.println("Relatório gerado com sucesso!");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void menuFuncionario() {
        System.out.println("-> Menu funcionário <-");
        System.out.println("1. Anotar Pedido");
        System.out.println("2. Receber Pagamento");

    }

    public static void menuPrincipal() {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Menu Gerente");
            System.out.println("2. Menu Funcionario");
            System.out.println("3. Sair");
            switch (ler.nextInt()) {
                case 1:
                    menuGerente();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

}
