import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe:");

        System.out.print("Modelo: ");
        String modelo = in.next();

        System.out.print("Valor de tabela: ");
        double valorTabela = in.nextDouble();

        System.out.print("Cor: ");
        String cor = in.next();

        System.out.print("Combustivel: ");
        String combustivel = in.next();

        System.out.println("Essas informações são de moto ou de Carro? (Moto = 1, Carro = 2)");
        byte resp = in.nextByte();
        switch (resp) {
            case 1:
                Moto moto = new Moto(modelo, valorTabela, cor, combustivel);
                moto.calculaIpva(valorTabela);
                moto.imprimirFicha();
                break;
        
            case 2:
                Carro carro = new Carro(modelo, valorTabela, cor, combustivel);
                carro.calculaIpva(valorTabela);
                carro.imprimirFicha();
                break;
        }
        in.close();
    }
}