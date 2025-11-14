import java.util.Scanner;

public class Menuzinho {
    private Banco[] bancos;
    private Usuario[] usuarios;
    private int i;
    private int j;

    Menuzinho() {
        Scanner scanner = new Scanner(System.in);
        int N = 10;
        do {
            System.out.printf("---------------");
            System.out.printf("Digite 1 para operacoes com o usuario\n");
            System.out.printf("Digite 2 para operacoes no banco\n");
            System.out.printf("Digite 3 para operacoes de movimentacao bancaria\n");
            System.out.printf("Digite 0 para sair\n");
            System.out.printf("Resposta: ");
            N = scanner.nextInt();

            if (N == 1) {

            } else if (N == 2) {

            } else if (N == 0) {
                System.out.printf("Saindo...\n");
            } else if (N == 3) {

            }
            else {
                System.out.printf("Operação invalida\n");
            }

            System.out.printf("---------------");

        }while(N != 0);
    }

    public void OperacoesBanco() {
        System.out.printf("Operacoes do banco\n");
        System.out.printf("---------------");
        System.out.printf("Digite 1 para criar um novo banco\n");
        System.out.printf("Digite 2 para adicionar um cliente a um banco\n");
        System.out.printf("Digite 0 para sair");
        System.out.printf("---------------");
    }

    public void OperacoesUsuarios() {
        System.out.printf("Operacoes do usuario");
        System.out.printf("---------------");
        System.out.printf("Digite 1 para criar um novo usuario\n");
        System.out.printf("Digite 2 para se matar\n");
        System.out.printf("Digite 3 para listar as contas ");
    }

    public void OperacoesExtratos() {

    }


}
