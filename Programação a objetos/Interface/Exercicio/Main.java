import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe seu nome: ");
        String nome = in.nextLine();
        System.out.print("Informe o saldo inicial: ");
        double saldoInicial = in.nextDouble();
        in.nextLine();

        System.out.print("Deseja criar uma conta corrente ou poupança? ");
        String userResp = in.nextLine();

        switch (userResp) {
            case "corrente":
                System.out.print("Informe o limite do seu cheque especial: ");
                double chequeEspecial = in.nextDouble();
                ContaCorrente corrente = new ContaCorrente(saldoInicial, nome, chequeEspecial);

                System.out.print("Deposite um valor: ");
                double deposito = in.nextDouble();
                corrente.depositar(deposito);

                System.out.print("Digite um valor para sacar: ");
                double saque = in.nextDouble();
                corrente.sacarComChequeEspecial(saque);

                corrente.verificar();
                break;

            case "poupanca":
                System.out.print("Digite a taxa de rendimento mensal: ");
                double taxa = in.nextDouble();
                Conta poupanca = new ContaPoupanca(saldoInicial, nome, taxa);

                System.out.print("Deposite um valor: ");
                deposito = in.nextDouble();
                poupanca.depositar(deposito);

                System.out.print("Digite um valor para sacar: ");
                saque = in.nextDouble();
                poupanca.sacar(saque);

                poupanca.verificar();
                break;

            default:
                System.out.println("Digite corretamente.");
                break;
        }

        in.close();
    }
}
