import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		User user = new User();
		System.out.println("Nome do usuario:");
		user.nome = in.next();
		System.out.println("Qual é a sua idade?:");
		user.idade = in.nextInt();
		System.out.println("Sua peso?:");
		user.peso = in.nextDouble();
		System.out.println("Qual é a sua altura?:");
		user.altura = in.nextDouble();
		System.out.println(user.calcular());
	
	
	
	}
}
