package creador.concretos;


import creador.ICenfomon;
import objects.cenfomon.Cenfomon;
import objects.cenfomon.concreto.TipoFuego;
import utilities.ETipoCenfomon;


public class FabricaCenfomon implements ICenfomon{
    @Override
    public Cenfomon crearCenfomon(ETipoCenfomon tipoCenfomon) {
        Cenfomon cenfomon;
        if (tipoCenfomon==ETipoCenfomon.FUEGO){
            //cenfomon = new TipoFuego();
        }
        return null;
    }
}
