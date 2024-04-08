import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Produto prod = new Produto();
 
        System.out.println("Informe os seguintes dados:");
        System.out.println("Seu Nome:");
        prod.setNome(in.next());
 
        System.out.println("Preço de custo:");
        prod.setPrecoCusto(in.nextDouble());
 
        System.out.println("Preço de venda:");
        prod.setPrecoVenda(in.nextDouble());
 
        double margemLucro = prod.calcularMargemLucro();
        double porcMargem = prod.getMargemLucroPorcentagem();
 
        System.out.println(prod.getNome() + ", você tem uma margem de lucro de " + porcMargem + "% (Ou " + margemLucro + " R$.)");
 
        in.close();
    }
}