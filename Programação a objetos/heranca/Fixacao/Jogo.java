public class Jogo {

    private String nome;
    private double preco;
    private String distribuidora;
    
    

    String getNome() {
        return nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    double getPreco() {
        return preco;
    }
    void setPreco(double preco) {
        this.preco = preco;
    }
    String getDistribuidora() {
        return distribuidora;
    }
    void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    void show(){
        System.out.printf("Nome: %s\nPreço: %s\nDistribuidora: %s\n", nome, preco, distribuidora);
    }
    
}
/*Crie uma classe pai chamada Jogo que possua os seguintes atributos: nome, preço, distribuidora, juntamente com seus 
métodos acessores e um método para exibir suas informações.

Também crie as classes filhas JogoEletronico e JogoFisico. 
A classe JogoEletronico deverá ter os seguintes atributos: plataforma e gênero. Por outro lado, a classe JogoFisico deverá ter os atributos quantidadeJogadores e tempoPartida.
Adicione as seguintes funcionalidades:

Na classe JogoEletronico, adicione um método jogarOnline que recebe como parâmetro a quantidade de jogadores e exibe a mensagem "Jogando online com {quantidadeJogadores} jogadores".

Na classe JogoFisico, adicione um método calcularTempoTotal que recebe como parâmetro a quantidade de partidas e retorna o tempo total de jogo, 

multiplicando o tempo de partida pela quantidade de partidas.
No método principal (main), crie objetos das classes JogoEletronico e JogoFisico, atribua valores aos atributos e chame os métodos para exibir as informações 
e utilizar as novas funcionalidades. */