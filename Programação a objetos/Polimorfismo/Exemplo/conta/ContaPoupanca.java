package conta;

public class ContaPoupanca extends Conta {
    private double percentualRendimento = 0.01;

    double atualizarSaldo() {
        setSaldo(saldoAtual + saldoAtual * percentualRendimento);
    }
}
