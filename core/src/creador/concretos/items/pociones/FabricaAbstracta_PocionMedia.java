package creador.concretos.items.pociones;

import creador.abstractos.IFabricaAbstracta_Pocion;
import enums.EPociones;
import objects.abstractos.IPocion;
import objects.items.Pocion;

public class FabricaAbstracta_PocionMedia implements IFabricaAbstracta_Pocion {
    @Override
    public IPocion crearPocion() {return new Pocion(EPociones.MEDIA);}
}
