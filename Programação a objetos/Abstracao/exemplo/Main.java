public class Main {
    public static void main (String[] args) {
        Ponto p = new Ponto(2, 2);
        Circulo c = new Circulo(p, 10);
        Cilindro d = new Cilindro(c, 5);
        p.mostrar();
        c.mostrar();
        d.mostrar();
}

}