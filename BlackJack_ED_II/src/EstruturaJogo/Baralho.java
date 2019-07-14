package EstruturaJogo;

import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo Martins
 */
public class Baralho {

    private ArrayList<Carta> myDeck;
    private ValorCarta[] baralhoValor = {ValorCarta.AS, ValorCarta.DOIS, ValorCarta.TRES, ValorCarta.QUATRO, ValorCarta.CINCO,
        ValorCarta.SEIS, ValorCarta.SETE, ValorCarta.OITO, ValorCarta.NOVE, ValorCarta.DEZ, ValorCarta.VALETE, ValorCarta.DAMA,
        ValorCarta.REIS};
    private Naipe[] baralhoNaipe = {Naipe.COPAS, Naipe.ESPADA, Naipe.OURO, Naipe.PAUS};

    public Baralho() {
        myDeck = new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                myDeck.add(new Carta(baralhoValor[i], baralhoNaipe[j]));
            }
        }
    }

    public void embaralhar() {

        int size = myDeck.size();

        Random rnd = new Random();

        for (int i = size - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            Carta temp = myDeck.get(j);

            myDeck.set(j, myDeck.get(i));
            myDeck.set(i, temp);
        }

    }

    public Carta retiraCarta() {
        Random rnd = new Random();

        int carta = rnd.nextInt(myDeck.size() - 1);

        return myDeck.get(carta);
    }

    public String imprimeBaralho() {
        String saida = "";
        for (int i = 0; i < myDeck.size(); i++) {
            if (i == myDeck.size() - 1) {
                saida += myDeck.get(i).toString() + "\n";
            } else {
                saida += myDeck.get(i).toString() + "|| \n";
            }
        }

        return saida;
    }

}
