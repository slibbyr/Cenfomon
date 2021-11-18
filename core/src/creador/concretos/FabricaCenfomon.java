package creador.concretos;


import creador.ICenfomon;
import objects.cenfomon.Cenfomon;
import objects.cenfomon.concreto.*;
import utilities.ETipoCenfomon;


public class FabricaCenfomon implements ICenfomon{
    @Override
    public Cenfomon crearCenfomon(ETipoCenfomon tipoCenfomon) {
        Cenfomon cenfomon = null;
        if (tipoCenfomon==ETipoCenfomon.FUEGO){
            cenfomon = new TipoFuego();
        }else if (tipoCenfomon==ETipoCenfomon.AGUA){
            cenfomon = new TipoAgua();
        }else if (tipoCenfomon==ETipoCenfomon.BICHO){
            cenfomon = new TipoBicho();
        }else if (tipoCenfomon==ETipoCenfomon.ELECTRICO){
            cenfomon = new TipoElectrico();
        }else if (tipoCenfomon==ETipoCenfomon.FANTASMA){
            cenfomon = new TipoFantasma();
        }else if (tipoCenfomon==ETipoCenfomon.NORMAL){
            cenfomon = new TipoNormal();
        }else if (tipoCenfomon==ETipoCenfomon.PLANTA){
            cenfomon = new TipoPlanta();
        }else if (tipoCenfomon==ETipoCenfomon.VOLADOR){
            cenfomon = new TipoVolador();
        }
        return cenfomon;
    }
}
