package creador.concretos.items.cristales;

import creador.abstractos.IFabricaAbstracta_Cristal;
import enums.ECristales;
import objects.abstractos.ICristal;
import objects.items.Cristal;

public class FabricaAbstracta_CristalBeta implements IFabricaAbstracta_Cristal {
    @Override
    public ICristal crearCristal() { return new Cristal(ECristales.Beta); }
}
