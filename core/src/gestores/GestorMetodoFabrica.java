package gestores;

import creador.ICenfomon;
import creador.concretos.FabricaCenfomon;
import objects.cenfomon.Cenfomon;
import enums.ETipoCenfomon;

public class GestorMetodoFabrica {

    private static ICenfomon gFabrica;

    public GestorMetodoFabrica(){
        gFabrica = new FabricaCenfomon();
    }

    public Cenfomon nuevocenfomon(ETipoCenfomon tipoCenfomon){
        return gFabrica.crearCenfomon(tipoCenfomon);
    }

}
