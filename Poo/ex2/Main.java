package dsaula3;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Usuario pedro = new Usuario();
		Usuario vagner = new Usuario();
		
		pedro.nome = "Pedro";
		vagner.nome = "Vagner";
		
		// Pedro
		
		System.out.println(pedro.nome + ", informe salario bruto:");
		pedro.salarioBruto = in.nextDouble();
		System.out.println("Informe aumento de salario:");
		pedro.vAumento = in.nextDouble();
		System.out.println("Informe porcentagem de imposto:");
		pedro.imposto = in.nextDouble();	
		
		pedro.salarioBruto = pedro.aumentaSl();
		pedro.salarioLiquido = pedro.salarioLiq();
		
		System.out.println("Salario bruto com aumento de Pedro : " +  pedro.salarioBruto + "\n Salario liquido de pedro: " + pedro.salarioLiquido );
		
		
		// Vagner
		
		System.out.println(vagner.nome + ", informe salario bruto:");
		vagner.salarioBruto = in.nextDouble();
		System.out.println("Informe aumento de salario:");
		vagner.vAumento = in.nextDouble();
		System.out.println("Informe porcentagem de imposto:");
		vagner.imposto = in.nextDouble();	
		
		vagner.salarioBruto = vagner.aumentaSl();
		vagner.salarioLiquido = vagner.salarioLiq();
		
		System.out.println("Salario bruto com aumento de Vagner : " +  vagner.salarioBruto + "\n Salario liquido de Vagner: " + vagner.salarioLiquido );
	
	}

}
