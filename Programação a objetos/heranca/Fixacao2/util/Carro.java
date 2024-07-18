public class Carro extends Veiculo{
    public Carro(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
    }

    double calculaIpva(double valorTabela) {
        double ipva = valorTabela * 0.04;
        setIpva(ipva);
        return ipva;
    }
    
}
