import java.time.LocalDate;
public abstract class Conta implements AdmContas {
		private double saldo;
		private String nome;
		private LocalDate dataCriacaoConta;

		public Conta(double saldo, String nome) {
			this.saldo = saldo;
			this.nome = nome;
			dataCriacaoConta = LocalDate.now();
		}
		
		
		public void depositar(double valor) {
			this.saldo += valor;
			System.out.println("Sucesso. Saldo atualizado " + this.saldo);
		}
		public LocalDate getDataCriacaoConta() {
			return dataCriacaoConta;
		}

		public void setDataCriacaoConta(LocalDate dataCriacaoConta) {
			this.dataCriacaoConta = dataCriacaoConta;
		}

		public void sacar(double valor) {
			if(valor <= saldo) {
				this.saldo -= valor;
			}else {
				System.err.println("Voc� n�o tem esse valor disponivel para saque! pobre");
			}
			
		}
		
		public void verificar(){
			System.out.printf("Informações gerais da conta: %n Nome: %s%n Saldo: %.2f", nome, saldo);	
		}
		public double getSaldo() {
			return saldo;
		}
 
 
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
 
 
		public String getNome() {
			return nome;
		}
 
 
		public void setNome(String nome) {
			this.nome = nome;
		}

}