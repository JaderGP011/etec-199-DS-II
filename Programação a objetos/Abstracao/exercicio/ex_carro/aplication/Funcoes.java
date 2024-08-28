import java.util.Scanner;

public class Funcoes {
    Scanner in = new Scanner(System.in);
    //Numero de carros que serão cadastrados
    private int nCarros;
    private int nMotos;

    public void setnCarros(int nCarros) {
        this.nCarros = nCarros;
    }
    public void setnMotos(int nMotos){
        this.nMotos = nMotos;
    }

    //Cadastro de carros
    void carros() {
        for (int i = 0; i < this.nCarros; i++) {
            System.out.printf("Informe os atibutos do carro %d:%n", (i + 1));

            System.out.print("Modelo: ");
            String modelo = in.next();

            System.out.print("Valor de tabela: ");
            double valorTabela = in.nextDouble();

            System.out.print("Cor: ");
            String cor = in.next();

            System.out.print("Combustivel: ");
            String combustivel = verficaCombustivel(in.next());
            
            switch (i) {
                case 0:
                    Carro carro = new Carro(modelo, valorTabela, cor, combustivel);
                    System.out.printf("Informações do Carro %d:%n", (i + 1));
                    carro.calculaIpva(valorTabela);
                    carro.imprimirFicha();
                    break;

                case 1:
                    Carro carro2 = new Carro(modelo, valorTabela, cor, combustivel);
                    System.out.printf("Informações do Carro %d:%n", (i + 1));
                    carro2.calculaIpva(valorTabela);
                    carro2.imprimirFicha();
                    break;
            }
            System.out.println();
        }
    }
    //Cadastro de motos
    void motos() {
        for (int i = 0; i < this.nMotos; i++) {
            System.out.printf("Informe os atibutos da moto %d:%n", (i + 1));

            System.out.print("Modelo: ");
            String modelo = in.next();

            System.out.print("Valor de tabela: ");
            double valorTabela = in.nextDouble();

            System.out.print("Cor: ");
            String cor = in.next();

            System.out.print("Combustivel: ");
            String combustivel = verficaCombustivel(in.next());

            switch (i) {
                case 0:
                    Moto moto = new Moto(modelo, valorTabela, cor, combustivel);
                    System.out.printf("Informações da Moto %d:%n", (i + 1));
                    moto.calculaIpva(valorTabela);
                    moto.imprimirFicha();
                    break;

                case 1:
                    Moto moto2 = new Moto(modelo, valorTabela, cor, combustivel);
                    System.out.printf("Informações da Moto %d:%n", (i + 1));
                    moto2.calculaIpva(valorTabela);
                    moto2.imprimirFicha();
                    break;
            }
            System.out.println();
        }
    }

    String verficaCombustivel(String combustivel) {

        switch (combustivel.toLowerCase()) {
            case "etanol":
                return "Etanol";
                
            case "alcool":
            case "álcool":
                return "Álcool";
                
            case "elétrico":
            case "eletrico":
                return "Elétrico";
                
            case "gasolina":
                return "Gasolina";
                
            case "diesel":
                return "Diesel";
                
            default:
                return "AVISO: Combustivel informado não é válido";

        }
    }

}