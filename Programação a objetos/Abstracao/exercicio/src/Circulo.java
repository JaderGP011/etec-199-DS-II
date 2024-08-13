public class Circulo {
    private double centro;
    private double raio;

    public Circulo(double p, double r){
        centro = p;
        raio = r;
    }

    public String forma() {
        return "Circulo: centro = " + centro.forma() + "; raio = " + raio;
    }
}
