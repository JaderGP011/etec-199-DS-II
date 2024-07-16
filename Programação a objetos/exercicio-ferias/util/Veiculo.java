public class Veiculo {
    private String modelo;
    private double valorTabela;
    private String cor;
    private String combustivel;
    private double ipva;

    // CONSTRUCTOR
    public Veiculo(String modelo, double valorTabela, String cor, String combustivel) {
        this.modelo = modelo;
        this.valorTabela = valorTabela;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    // GET
    public String getModelo() {
        return modelo;
    }

    public double getValorTabela() {
        return valorTabela;
    }

    public String getCor() {
        return cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getIpva() {
        return ipva;
    }
    // SET

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorTabela(double valorTabela) {
        this.valorTabela = valorTabela;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setIpva(double ipva) {
        this.ipva = ipva;
    }
    // METODOS ADICIONIS

    void imprimirFicha() {
        System.out.println("Informações: \n"
                + "modelo " + getModelo() + "\n"
                + "valorTabela " + getValorTabela() + "\n"
                + "cor " + getCor() + "\n"
                + "combustivel " + getCombustivel() + "\n"
                + "IPVA " + getIpva());
    }
}