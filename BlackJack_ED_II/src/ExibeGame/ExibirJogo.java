package ExibeGame;

import EstruturaJogo.*;

public class ExibirJogo {

    public void mostrarJogo(Player jogador) { //Mecanica de exibir o jogo
        
            System.out.println("Quantidade de cartas [" + jogador.getPilhaJogador().size + "]");
            System.out.println("Soma das Cartas [" + jogador.getPontuacao()+ "]");
            System.out.println("Cartas:");
            System.out.println(jogador.getPilhaJogador().toString());
            System.out.println("------------------------------------------------");
        
    }
}
