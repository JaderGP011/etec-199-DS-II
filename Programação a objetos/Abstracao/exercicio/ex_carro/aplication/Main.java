import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Funcoes funcao = new Funcoes();
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("numero de carros que quer cadastrar: ");
        funcao.setnCarros(in.nextInt());
        System.out.println("Cadastro de Carros:");
        
        funcao.carros();
        System.out.println();
        System.out.print("numero de motos que quer cadastrar: ");
        funcao.setnMotos(in.nextInt());
        System.out.println("Cadastro de Motos:");
        funcao.motos();
        in.close();
    }
}