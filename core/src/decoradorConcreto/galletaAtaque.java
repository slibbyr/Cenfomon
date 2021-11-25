package decoradorConcreto;

import objects.cenfomon.Cenfomon;
import objects.items.Galleta;

public class galletaAtaque extends Galleta {

    protected Cenfomon tmpCenfomon;

    protected int aumentoAtaque = 30;

    public Cenfomon getTmpCenfomon() {
        return tmpCenfomon;
    }

    public void setTmpCenfomon(Cenfomon tmpCenfomon) {
        this.tmpCenfomon = tmpCenfomon;
    }

    public int getAumentoAtaque() {
        return aumentoAtaque;
    }

    public void setAumentoAtaque(int aumentoAtaque) {
        this.aumentoAtaque = aumentoAtaque;
    }


}
