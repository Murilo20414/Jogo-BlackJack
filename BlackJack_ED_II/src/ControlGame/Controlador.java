package ControlGame;

import Pilha.Pilha;
import EstruturaJogo.*;
import Fila.*;
import ExibeGame.*;

public class Controlador {

    private Pilha<Carta> pilhaMesa; //Pilha de cartas na mesa
    private Queue<Player> jogadoresMesa; //Jogadores participando da partida
    private Player jogadorImpulsivo; //Jogador impulsivo, enquanto estiver < 21, pede mais
    private Dealer dealer; //Responsavel pela mecanica de entrega de cartas
    public static Queue<Carta> filaCartas; // Cartas de cada jogador

    private enum Status { //Controlador de status do jogo
        PAROU, CONTINUA
    };

    private ExibirJogo mostrar;

    public Controlador() {
        filaCartas = new Queue<>();
        dealer = new Dealer();
        pilhaMesa = new Pilha<>();
        jogadoresMesa = new Queue<>();
        jogadorImpulsivo = new Player();
        jogadoresMesa.enqueue(jogadorImpulsivo); //Um jogador participante
        mostrar = new ExibirJogo();
    }

    public void controlarGame() {

        Status gameStatus = Status.CONTINUA; //Jogo é inciado

        // Primeira rodada
        for (int i = 0; i < 2; i++) {
            tratamento();
        }

        Carta aux = dealer.entregaCarta();
        pilhaMesa.push(aux);
        filaCartas.enqueue(aux);
        System.out.println("Carta da mesa:" + aux.toString());
        jogadoresMesa.peek().recebeCarta(aux);
        
        Carta cartaVirada = dealer.entregaCarta();

        //Verificando se os jogadores da mesa podem resceber mais cartas
        
        if ((jogadoresMesa.peek()).getLiberaCarta() == true) {
            pilhaMesa.push(cartaVirada);
            filaCartas.enqueue(cartaVirada);
            System.out.println("Carta virada: " + cartaVirada.toString());
            jogadoresMesa.peek().recebeCarta(cartaVirada);
            
        } else {  //Exibe o jogo do jogador que perdeu
            mostrar.mostrarJogo(jogadoresMesa.dequeue());
        }

        //Outras rodadas
        while (gameStatus == Status.CONTINUA && !jogadoresMesa.isEmpty()) {
            if ((jogadoresMesa.peek()).getLiberaCarta() == true) {
                tratamento();
            } else {
                mostrar.mostrarJogo(jogadoresMesa.dequeue());
                gameStatus = Status.PAROU;
            }
        }
        
        
    }

    public void tratamento() {
        Carta aux = dealer.entregaCarta();
        filaCartas.enqueue(aux);
        jogadoresMesa.peek().recebeCarta(aux);
        System.out.println("Carta distribuida :" + aux.toString());
        jogadoresMesa.enqueue(jogadoresMesa.dequeue());
    }

}
