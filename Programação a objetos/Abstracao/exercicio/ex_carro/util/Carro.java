public class Carro extends Veiculo{
    public Carro(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
    }

    @Override
    void calculaIpva(double valorTabela) {
        double ipva = valorTabela * 0.04;
        setIpva(ipva);
        System.out.printf("%.2f", ipva);
    }
    
}
