package objects.items;

import enums.ECristales;
import objects.abstractos.ICristal;
import objects.abstractos.IItem;

public class Cristal implements ICristal,IItem {
    private int costo;
    private ECristales tipoCristal;

    public Cristal(ECristales tipo){
        this.tipoCristal=tipo;
        switch (tipo){
            case Beta:
                costo=150;
                break;
        }
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
