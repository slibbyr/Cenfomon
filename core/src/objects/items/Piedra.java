package objects.items;

import enums.EPiedra;
import objects.abstractos.IItem;
import objects.abstractos.IPiedra;

public class Piedra implements IPiedra, IItem {

    private EPiedra tipoPiedra;

    private int costoPiedra;

    public Piedra() {
        this.setTipoPiedra(tipoPiedra);
    }

    public Piedra(EPiedra tipoPiedra) {
        this.tipoPiedra = tipoPiedra;

        switch (tipoPiedra){
            case OSCURA:
                costoPiedra=100;
                break;
            case FUEGO:
                costoPiedra=200;
                break;
        }
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
