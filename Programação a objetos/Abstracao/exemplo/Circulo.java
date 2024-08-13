public class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo(Ponto p, double r){
        centro = p;
        raio = r;
    }

    public String forma() {
        return "Circulo: centro = " + centro.forma() + "; raio = " + raio;
    }
    
    public void mostrar() {
        System.out.println(forma());
    }
}