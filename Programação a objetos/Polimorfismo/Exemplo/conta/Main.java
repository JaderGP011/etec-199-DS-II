package conta;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe: ");
        System.out.print("Nome: ");
        String nome = in.next();
        System.out.print("CPF: ");
        String cpf = in.next();
        System.out.print("Número da conta: ");
        String numeroConta = in.next();
        
        Conta conta = new Conta(nome, cpf, numeroConta);

        
    }
}
