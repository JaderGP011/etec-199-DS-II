import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Forma> formas = new ArrayList<>();

        System.out.print("Quantas formas deseja inserir? ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite qual figura quer (circulo ou quadrado): ");
            String tipo = in.next().toLowerCase();

            switch (tipo) {
                case "circulo":
                    System.out.print("Digite o raio do circulo: ");
                    double raio = in.nextDouble();
                    formas.add(new Circulo(raio));
                    break;
                case "quadrado":
                    System.out.print("Digite o lado do quadrado: ");
                    double comprimento = in.nextDouble();
                    formas.add(new Quadrado(comprimento));
                    break;
                default:
                    System.out.println("Tipo de figura desconhecido.");
                    i--; 
                    break;
            }
        }

        System.out.println("�reas das formas:");
        for (Forma forma : formas) {
            System.out.println(forma.calcularArea());
        }

        in.close();
    }
}
