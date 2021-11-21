package objects.items;

import enums.ECristales;
import objects.abstractos.ICristal;

public class Cristal implements ICristal {
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
