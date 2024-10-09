
public class ContaCorrente extends Conta implements AdmContas{
	private double limiteChequeEspecial;

	public ContaCorrente(double saldo, String nome, double limiteChequeEspecial) {
		super(saldo, nome);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

 
	public void sacarComChequeEspecial(double valor) {
		if(valor <= this.limiteChequeEspecial + super.getSaldo()) {
			double valorT = super.getSaldo();
			valorT -= valor;
			super.setSaldo(valorT);
		}else {
			System.err.println("Voc� n�o tem esse valor disponivel para saque! pobre");
		}
	}

 
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
 
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	
}