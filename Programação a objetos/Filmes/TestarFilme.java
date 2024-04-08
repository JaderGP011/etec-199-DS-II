public class TestarFilme {
    public static void main(String[] args) {
        
        Filme filme1 = new Filme();
        filme1.setTitulo("Os Vingadores");
        filme1.setDuracaoEmMinutos(142);
        
        Filme filme2 = new Filme();
        filme2.setTitulo("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos(93);
        
        Filme filme3 = new Filme();
        filme3.setTitulo("Até o Último Homem");
        filme3.setDuracaoEmMinutos(139);
        
        Filme filme4 = new Filme();
        filme4.setTitulo("Pantera Negra");
        filme4.setDuracaoEmMinutos(135);

        Filme filme5 = new Filme();
        filme5.setTitulo("Carros 2");
        filme5.setDuracaoEmMinutos(106);

        Filme[] filmes = {filme1, filme2, filme3, filme4, filme5};

        System.out.println("Os filmes em cartaz são:");
        System.out.println();
        
        for (Filme filme : filmes) {
            System.out.printf("%s. Tempo: %.2f\n", filme.getTitulo(), filme.exibirDuracaoEmHoras());
        }
        
    }
}