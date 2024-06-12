public class JogoFisico extends Jogo{
    private double tempoPartida;
    private int quantidadeJogadores;

    public double getTempoPartida() {
        return tempoPartida;
    }

    public void setTempoPartida(double tempoPartida) {
        this.tempoPartida = tempoPartida;
    }

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public void setQuantidadeJogadores(int quantidadeJogadores) {
        this.quantidadeJogadores = quantidadeJogadores;
    }


    void calcularTempoTotal(int qntdPartidas, double tempoPartida){
        tempoPartida = this.tempoPartida;
        System.out.println("Tempo total de Jogo: " + (tempoPartida * qntdPartidas));
    }
}
/*Na classe JogoFisico, adicione um método calcularTempoTotal que recebe como parâmetro a 
quantidade de partidas e retorna o tempo total de jogo, multiplicando o tempo de partida pela quantidade de partidas.
 */