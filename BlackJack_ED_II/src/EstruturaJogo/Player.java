package EstruturaJogo;

import Pilha.Pilha;

public class Player {

    private int pontuacao;
    private boolean liberaCarta;
    private Pilha<Carta> pilhaJogador;

    public Player() {
        pontuacao = 0;
        liberaCarta = true;
        pilhaJogador = new Pilha<>();
    }

    public Pilha<Carta> getPilhaJogador() {
        return pilhaJogador;
    }

    public boolean getLiberaCarta() {
        pedeCarta();
        return liberaCarta;
    }

    public void setLiberaCarta(boolean liberaCarta) {
        this.liberaCarta = liberaCarta;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    public void recebeCarta(Carta cartaEntregue) {
        if (getLiberaCarta() == true) {
            pilhaJogador.push(cartaEntregue);
            this.setPontuacao(cartaEntregue.getValor().getValue());
        } else {
            return;
        }
    }

    public void pedeCarta() {
        if (getPontuacao() < 21) {
            this.setLiberaCarta(true);
        } else {
            this.setLiberaCarta(false);
        }
    }
}
