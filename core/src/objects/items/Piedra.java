package objects.items;

import enums.EPiedra;

public class Piedra {

    private EPiedra tipoPiedra;

    private int costoPiedra= 100;

    public Piedra() {
        this.setTipoPiedra(tipoPiedra);
    }

    public Piedra(EPiedra tipoPiedra) {
        this.tipoPiedra = tipoPiedra;
    }

    public EPiedra getTipoPiedra() {
        return tipoPiedra;
    }

    public void setTipoPiedra(EPiedra tipoPiedra) {
        this.tipoPiedra = tipoPiedra;
    }

    public int getCostoPiedra() {
        return costoPiedra;
    }

    public void setCostoPiedra(int costoPiedra) {
        this.costoPiedra = costoPiedra;
    }
}
