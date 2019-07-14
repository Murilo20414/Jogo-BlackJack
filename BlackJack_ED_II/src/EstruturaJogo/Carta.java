package EstruturaJogo;

public class Carta {

    private Naipe naipe;
    private ValorCarta valor;

    public Carta(ValorCarta valor, Naipe naipe) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    public void setValor(ValorCarta valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }

}
