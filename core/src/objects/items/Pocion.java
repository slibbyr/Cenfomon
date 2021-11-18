package objects.items;

import enums.EPociones;
import objects.cenfomon.Cenfomon;

public class Pocion {
    private double porcentajeRecuperacion;
    private EPociones tipo;

    private int costoPocion=0;

    public Pocion(EPociones tipo) {
        switch (tipo) {
            case NORMAL:
                porcentajeRecuperacion = 0.20;
                costoPocion=20;
                break;
            case MEDIA:
                porcentajeRecuperacion = 0.45;
                costoPocion=45;
                break;
            case MAXIMA:
                porcentajeRecuperacion = 1;
                costoPocion=100;
                break;

            case REVIVIR:
                porcentajeRecuperacion=0.15;
                costoPocion= 150;
                break;
        }
    }

    public double curar(Cenfomon cenfomon) {
        return cenfomon.get_SaludMaxima() * porcentajeRecuperacion;
    }

    public EPociones getTipo() {
        return tipo;
    }
}
