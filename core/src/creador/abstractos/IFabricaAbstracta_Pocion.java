package creador.abstractos;

import enums.EPociones;
import objects.abstractos.IPocion;
import objects.cenfomon.Cenfomon;

public interface IFabricaAbstracta_Pocion {
    IPocion crearPocion();
}
