package EstruturaJogo;

/**
 *
 * @author Murilo Martins
 */
public enum ValorCarta {
    AS(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10), VALETE(10), DAMA(10), REIS(10);

    private int value;

    private ValorCarta(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
