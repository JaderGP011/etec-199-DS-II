import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JogoEletronico jogoEletronico = new JogoEletronico();
        JogoFisico jogoFisico = new JogoFisico();

        //ELETRÔNICO
        System.out.println("Jogo eletrônico:");
        System.out.print("Nome do jogo: ");
        jogoEletronico.setNome(in.next());
        System.out.print("Preço: ");
        jogoEletronico.setPreco(in.nextDouble());
        System.out.print("Distribuidora");
        jogoEletronico.setDistribuidora(in.next());
        System.out.print("Plataforma: ");
        jogoEletronico.setPlataforma(in.next());
        System.out.print("Gênero: ");
        jogoEletronico.setGenero(in.next());
        System.out.print("Quantidade de players: ");
        int players = in.nextInt();

        System.out.println();
        jogoEletronico.show();
        jogoEletronico.jogarOnline(players);
        
        //FISICO
        System.out.println("Jogo Físico: ");
        System.out.print("Nome do jogo: ");
        jogoFisico.setNome(in.next());
        System.out.print("Preço: ");
        jogoFisico.setPreco(in.nextDouble());
        System.out.print("Distribuidora");
        jogoFisico.setDistribuidora(in.next());
        System.out.print("Quantidade de jogadores: ");
        jogoFisico.setQuantidadeJogadores(in.nextInt());
        System.out.print("Tempo de partida:");
        jogoFisico.setTempoPartida(in.nextDouble());
        System.out.print("Quantidade de partidas: ");
        int partidas = in.nextInt();

        System.out.println();
        jogoFisico.show();
        jogoFisico.calcularTempoTotal(partidas, jogoFisico.getTempoPartida());


        in.close();
    }
}
/*
 * No método principal (main), crie objetos das classes JogoEletronico e
 * JogoFisico,
 * atribua valores aos atributos e chame os métodos para exibir as informações
 * e utilizar as novas funcionalidades.
 */