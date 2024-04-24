import java.util.Scanner;

public class SimulacaoBancaria {
  private static double saldo = 0;
  int operacao;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bem vindo ao sistema de conta bancária! \n");
    // Loop infinito para manter o programa em execução até que o usuário decida
    while (true) {
      SimulacaoBancaria simulacaoBancaria = new SimulacaoBancaria();
      System.out.print(
          "Por favor, escolha uma operacao: \n\n \t 1. Depositar \n \t 2. Sacar \n \t 3. Consultar Saldo \n \t 4. Encerrar \n\nDigite a operacao:  ");
      int opcao = scanner.nextInt();
      // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
      switch (opcao) {
        case 1:
          System.out.print("Digite o valor a ser depositado: ");
          double deposito = scanner.nextDouble();

          simulacaoBancaria.depositar(deposito);

          break;
        case 2:
          System.out.print("Digite o valor a ser sacado: ");
          double saque = scanner.nextDouble();
          simulacaoBancaria.sacar(saque);
          break;
        case 3:
          System.out.printf(">>> O saldo total é: %.2f \n\n", saldo);
          break;
        case 4:
          System.out.print("\n>>> Até logo \n\n");
          return;

        default:
          // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
          System.out.println(">>> Opção inválida. Tente novamente.");
      }
    }

  }

  public void depositar(double deposito) {
    saldo += deposito;
    System.out.println("\n>>> Depósito de " + deposito + " realizado com sucesso. \n");
  }

  public void sacar(double saque) {
    saldo -= saque;
    System.out.println("\n>>> Saque de " + saque + " realizado com sucesso. \n");
  }
}