import java.lang.Math;
public class User {

	String nome;
	int idade;
	double peso,altura;
	
	public String calcular() {
		double imc = peso /(Math.pow(altura, 2))*10000;
		String imc2 = String.format("%.2f",imc);
		String message2 = "";
		String message = nome+", com sua altura sendo "+altura+" e seu peso sendo "+peso+", seu imc é "+imc2;
		if(imc < 18.5) {
			message2 = "Desnutrido!";
		}else if(imc > 18.5 && imc < 24.9) {
			message2 = "Normal!";
		}else if(imc >25.0 && imc < 29.9) {
			message2 = "Acima do peso";
		}else if(imc >30.0 && imc < 39.9) {
			message2 = "se cair rola!";
		}else if(imc > 39.9) {
			message2 = "Thais Carla!";
		}
		System.out.println(message2);
		return message;
	}
	
}
