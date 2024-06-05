import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean rodando = true;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (rodando) {

            // System.out.println("Favor escolher uma das opções seguintes: "
            //         .concat("\n 1 - Depositar")
            //         .concat("\n 2 - Sacar")
            //         .concat("\n 3 - Consultar saldo")
            //         .concat("\n 4 - Encerrar"));

            int opcao = scanner.nextInt();
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.
            switch (opcao) {
                case 1:
                    double valorADepositar = 0;
                    valorADepositar = scanner.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Saldo atual: ".concat(String.valueOf(saldo)));

                    break;

                case 2:
                    double valorASacar = 0;
                    valorASacar = scanner.nextDouble();
                    if (saldo > valorASacar && saldo != 0) {
                        double saldoAtual = saldo - valorASacar;
                        System.out.println(
                                "Saldo atual: ".concat(String.valueOf(saldoAtual)));

                    } else {
                        System.out.println("Saldo insuficiente.");
                    }

                    break;

                case 3:
                    System.out.println("Saldo atual: ".concat(String.valueOf(saldo)));
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    rodando = false;
                    break;

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}