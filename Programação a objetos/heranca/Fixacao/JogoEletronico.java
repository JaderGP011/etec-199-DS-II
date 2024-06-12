public class JogoEletronico extends Jogo{

    private String plataforma;
    private String genero;
    
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    String jogarOnline(int quantidadePlayer) {
        return "Jogando online com: " + quantidadePlayer;
    }
}
/*Na classe JogoEletronico, adicione um método jogarOnline que recebe como 
parâmetro a quantidade de jogadores e exibe a mensagem "Jogando online com
 {quantidadeJogadores} jogadores". */