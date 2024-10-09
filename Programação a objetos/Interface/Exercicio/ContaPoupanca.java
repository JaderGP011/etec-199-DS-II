import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class ContaPoupanca extends Conta implements AdmContas{
	private double taxa;
 
	public ContaPoupanca(double saldo, String nome, double taxa) {
		super(saldo, nome);
		this.taxa = taxa;
		aplicaRTaxa();
	}
	
	public void aplicaRTaxa() {
		 	long meses = ChronoUnit.MONTHS.between(super.getDataCriacaoConta(), LocalDate.now());
	        double valor = (super.getSaldo() / 100) * taxa * meses;
	        super.setSaldo(super.getSaldo() + valor);	
	}


}