public class Filme {

    private String titulo = "";
    private double duracaoEmMinutos;

    //SET
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //GET
    public String getTitulo() {
        return titulo;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public double exibirDuracaoEmHoras(){
        double min = getDuracaoEmMinutos();
        double horas = 0;
        horas = min / 60;
        return horas;
    }
}