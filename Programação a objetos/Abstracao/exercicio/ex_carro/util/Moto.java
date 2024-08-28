public class Moto extends Veiculo {
    public Moto(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
    }

    @Override
    void calculaIpva(double valorTabela) {
        double ipva = valorTabela * 0.02;
        setIpva(ipva);
        System.out.printf("%.2f", ipva);
    }
}
