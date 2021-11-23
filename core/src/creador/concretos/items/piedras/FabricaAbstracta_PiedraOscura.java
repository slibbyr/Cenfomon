package creador.concretos.items.piedras;

import creador.abstractos.IFabricaAbstracta_Piedra;
import enums.EPiedra;
import objects.abstractos.IPiedra;
import objects.items.Piedra;

public class FabricaAbstracta_PiedraOscura implements IFabricaAbstracta_Piedra {
    public IPiedra crearPiedra() {return new Piedra(EPiedra.OSCURA);}
}
