import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CONTA BANCÁRIA ===");
        System.out.print("Informe o depósito inicial: ");
        double depositoInicial = sc.nextDouble();

        conta conta = new conta(depositoInicial); //construtor

        int opcao;

        do { //do while

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("7 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    conta.consultarSaldo();
                    break;

                case 2:
                    conta.consultarCheque();
                    break;

                case 3:
                    System.out.print("Valor do depósito: R$ ");
                    conta.depositar(sc.nextDouble());
                    break;

                case 4:
                    System.out.print("Valor do saque: R$ ");
                    conta.sacar(sc.nextDouble());
                    break;

                case 5:
                    System.out.print("Valor do boleto: R$ ");
                    conta.pagarBoleto(sc.nextDouble());
                    break;

                case 6:
                    conta.verificarChequeEspecial();
                    break;

                case 7:
                    System.out.println("Sessão encerrada.");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }

        } while (opcao != 7);

        sc.close();
    }
}