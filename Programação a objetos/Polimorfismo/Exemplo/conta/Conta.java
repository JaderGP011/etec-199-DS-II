package conta;

public class Conta {
    private String nome;
    private String cpf;
    private String numeroConta;
    private double saldo;

    public conta(String nome, String cpf, String numeroConta){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
    }

    double depositar(double quantia) {
        this.saldo += quantia;
        return saldo;
    }

    double sacar(double quantia) {
        this.saldo -= quantia;
        return saldo;
    }

    void setSaldo(double saldo){
        this.saldo = saldo;
    }

    void imprimirSaldo() {
        System.out.println(saldo);
    }
}
