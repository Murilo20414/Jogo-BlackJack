package EstruturaJogo;

import java.util.ArrayList;

public class Dealer {

    private Baralho deck;
    private ArrayList<Carta> aux;

    public Dealer() {

        aux = new ArrayList<>();
        deck = new Baralho();
        deck.embaralhar();
    }

    public Carta entregaCarta() {

        return deck.retiraCarta();
    }
}
