public class Cilindro {
    private Circulo base;
    private double altura;

    public Cilindro (Circulo b, double a) {
        base = b; 
        altura = a; 
    }

    public String forma() {
        return "Cilindro: base = " + base.forma() + "; altura = " + altura;
    }

    public void mostrar() {
        System.out.println(forma());
    }
}