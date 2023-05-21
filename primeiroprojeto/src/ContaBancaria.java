import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        //Variáveis
        String nome;
        String tipoContaString = "";
        double saldo;
        String menu = """
                #############################
                Menu de Opções:
                1 - Consultar Saldo
                2 - Depositar valor
                3 - Sacar Valor
                4 - Sair
                #############################
                """ + "Digite a opção desejada: ";

        //Inicializar o nome
        System.out.print("Digite o seu nome: ");
        nome = leitura.nextLine();

        //Inicializar o tipo da conta
        for (int i = 0; i < 100; i++) {
            System.out.print("Digite 1 para Conta Corrente, ou 2 para Conta Poupança: ");
            int tipoContaInteiro = leitura.nextInt();
            if (tipoContaInteiro == 1) {
                tipoContaString = "Conta Corrente";
                break;
            } else if (tipoContaInteiro == 2) {
                tipoContaString = "Conta Poupança";
                break;
            } else System.out.println("Código inválido!");
        }

        //Inicializar o saldo
        System.out.print("Quanto deseja transferir para abrir a conta: R$ ");
        saldo = leitura.nextDouble();

        //Mostrar os dados
        System.out.println("#############################");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoContaString);
        System.out.println("Saldo inicial: " + saldo);

        // Menu
        int opcaoMenu = 0;
        while (opcaoMenu != 4) {
            System.out.println(menu);
            opcaoMenu = leitura.nextInt();

            switch (opcaoMenu) {
                case 1: // Consultar saldo
                    System.out.println("Seu saldo é: R$ " + saldo);
                    break;

                case 2: // Depositar valor
                    System.out.print("Qual valor deseja depositar: R$ ");
                    double valorDeposito = leitura.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Seu saldo ficou em: R$ " + saldo);
                    break;

                case 3: // Sacar valor
                    System.out.print("Qual valor deseja sacar: R$ ");
                    Double valorSaque = leitura.nextDouble();
                    if (valorSaque > saldo) System.out.println("Saldo insuficiente!");
                    else {
                        saldo -= valorSaque;
                        System.out.println("Seu saldo ficou em: R$ " + saldo);
                    }
                    break;

                case 4: // Sair do sistema
                    break;

                default:
                    System.out.println("Código inválido!");
                    break;
            }
        }
        System.out.println("Saindo do sistema. Obrigado por utilizar o nosso banco!");




    }
}
