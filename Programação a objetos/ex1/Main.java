package desenvolvimento;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		double result;
		Scanner in = new Scanner(System.in);
;		Quadrado area = new Quadrado();
		System.out.println("Base: ");
		area.base = in.nextDouble();
		System.out.println("Altura: ");
		area.altura = in.nextDouble();
		result = area.calcular();
		
		System.out.println(result);

	}

}
