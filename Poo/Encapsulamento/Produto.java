public class Produto {
    private String nome;
    private double precoCusto, margemLucro, precoVenda, porcMargem;
 
    public double getPrecoCusto() {
        return precoCusto;
    }
 
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
 
    public double getMargemLucro() {
        return margemLucro;
    }
 
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
 
    public double getPrecoVenda() {
        return precoVenda;
    }
 
    public void setPrecoVenda(double precoVenda) {
        if (precoVenda < precoCusto) {
            System.out.println("Preço de venda inferior ao preço de compra");
        } else {
            this.precoVenda = precoVenda;
        }
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getNome() {
        return nome;
    }
 
    public double calcularMargemLucro() {
        margemLucro = precoVenda - precoCusto;
        return margemLucro;
    }
 
    public double getMargemLucroPorcentagem() {
        porcMargem = ((precoVenda - precoCusto) / precoCusto) * 100;
        return porcMargem;
    }
}