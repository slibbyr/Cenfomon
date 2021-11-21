package objects.mapa;

import creador.abstractos.IFabricaAbstracta_Cristal;
import creador.abstractos.IFabricaAbstracta_Piedra;
import creador.abstractos.IFabricaAbstracta_Pocion;
import creador.concretos.items.cristales.FabricaAbstracta_CristalBeta;
import creador.concretos.items.piedras.FabricaAbstracta_PiedraFuego;
import creador.concretos.items.piedras.FabricaAbstracta_PiedraOscura;
import creador.concretos.items.pociones.FabricaAbstracta_PocionMaxima;
import creador.concretos.items.pociones.FabricaAbstracta_PocionMedia;
import creador.concretos.items.pociones.FabricaAbstracta_PocionNormal;
import enums.ECristales;
import enums.EPiedra;
import enums.EPociones;
import objects.abstractos.ICristal;
import objects.abstractos.IItem;
import objects.abstractos.IPiedra;
import objects.abstractos.IPocion;
import objects.persona.PersonajePrincipal;

public class Tienda {


    public IPocion comprarPocion(EPociones ePociones){
        IFabricaAbstracta_Pocion pocion;
        IPocion resultado = null;
        switch (ePociones){
            case NORMAL:pocion = new FabricaAbstracta_PocionNormal();
                resultado = pocion.crearPocion();
                break;
            case MEDIA:pocion = new FabricaAbstracta_PocionMedia();
                resultado = pocion.crearPocion();
                break;
            case MAXIMA:pocion = new FabricaAbstracta_PocionMaxima();
                resultado = pocion.crearPocion();
                break;
        }
        return resultado;
    }
    public IPiedra comprarPiedra(EPiedra ePiedra){
        IFabricaAbstracta_Piedra piedra;
        IPiedra resultado =null;
        switch (ePiedra){

            case FUEGO: piedra = new FabricaAbstracta_PiedraFuego();
                resultado = piedra.crearPiedra();
                break;
            case OSCURA: piedra = new FabricaAbstracta_PiedraOscura();
                resultado = piedra.crearPiedra();
                break;
        }
        return resultado;
    }

    public ICristal comprarCristal(ECristales eCristales){
        IFabricaAbstracta_Cristal cristal;
        ICristal resultado =null;
        switch (eCristales){

            case Beta: cristal = new FabricaAbstracta_CristalBeta();
                resultado = cristal.crearCristal()
                ;
                break;
        }
        return resultado;
    }

}
