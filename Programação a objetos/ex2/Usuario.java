package dsaula3;

public class Usuario {
	String nome;
	double salarioBruto, imposto, salarioLiquido, vAumento;
	
	public double salarioLiq() {
		salarioLiquido = salarioBruto / 100 * imposto;
		
		return salarioLiquido;
	}
	public double aumentaSl() {
		salarioBruto += vAumento;
		
		return salarioBruto;
	}
}