package objects.items;

import enums.EPociones;
import creador.abstractos.IFabricaAbstracta_Pocion;
import objects.abstractos.IPocion;
import objects.cenfomon.Cenfomon;

public class Pocion implements IPocion {
    private double porcentajeRecuperacion;
    private EPociones tipo;

    public Pocion(EPociones tipo) {
        switch (tipo){
            case NORMAL: porcentajeRecuperacion = 0.20; break;
            case MEDIA: porcentajeRecuperacion = 0.45; break;
            case MAXIMA: porcentajeRecuperacion = 1; break;
        }
    }

    public double curar(Cenfomon cenfomon){
        return cenfomon.get_SaludMaxima()* porcentajeRecuperacion;
    }

    public EPociones getTipo() {
        return tipo;
    }
}
