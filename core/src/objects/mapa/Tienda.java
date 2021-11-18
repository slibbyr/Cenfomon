package objects.mapa;

import creador.abstractos.IFabricaAbstracta_Pocion;
import creador.concretos.items.pociones.FabricaAbstracta_PocionMaxima;
import creador.concretos.items.pociones.FabricaAbstracta_PocionMedia;
import creador.concretos.items.pociones.FabricaAbstracta_PocionNormal;
import enums.EPociones;
import objects.abstractos.IItem;
import objects.abstractos.IPocion;
import objects.persona.PersonajePrincipal;

public class Tienda {


    public IPocion comprarPocion(EPociones ePociones){
        IFabricaAbstracta_Pocion pocion;
        switch (ePociones){
            case NORMAL:pocion = new FabricaAbstracta_PocionNormal();
                return pocion.crearPocion();
                break;
            case MEDIA:pocion = new FabricaAbstracta_PocionMedia();
                return pocion.crearPocion();
                break;
            case MAXIMA:pocion = new FabricaAbstracta_PocionMaxima();
                return pocion.crearPocion();
                break;

        }
    }

}
