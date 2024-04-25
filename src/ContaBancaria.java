import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String nome = "Jorge Augusto";
        String tipoConta = "Conta Corrente";
        double saldoInicial = 2500;
        double saldo = saldoInicial;
        int operacao=0;
        String menu = """
                
                Selecione uma operação:
                
                1- Consultar saldo:
                2- Receber valor:
                3- Transferir valor:
                4- Sair:        
                """;

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("\n**** Dados do cliente ****\n");
            System.out.println("Nome:             " + nome);
            System.out.println("Tipo de Conta:    " + tipoConta);
            System.out.println("Saldo Inicial:    " + saldoInicial);

            System.out.println(menu);

            operacao = input.nextInt();

            switch (operacao){
                case 1:
                    System.out.println("\nSeu saldo atual é de : " + saldo);
                    break;
                case 2:
                    System.out.println("\nInsira o valor a ser recebido:\n");
                    double recebimento = input.nextDouble();
                    saldo += recebimento;
                    System.out.println("\nSeu saldo atual é de: " + saldo);
                    break;
                case 3:
                    System.out.println("\nDigite o valor a ser transferido:");
                    double debitado = input.nextDouble();
                    if(debitado > saldo){
                        System.out.println("Saldo insuficiente!");
                    }else {
                        saldo -= debitado;
                        System.out.println("\nSeu saldo atual é de: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("\nObrigado, volte sempre !!!");
                    break;
                default:
                    System.out.println("\nOpção Inválida !");
                    break;


            }

        }while(operacao != 4);
        input.close();
    }
}
