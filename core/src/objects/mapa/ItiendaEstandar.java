package objects.mapa;

import creador.abstractos.IFabricaAbstracta_Piedra;
import creador.concretos.items.piedras.FabricaAbstracta_PiedraFuego;
import creador.concretos.items.piedras.FabricaAbstracta_PiedraOscura;
import enums.ECristales;
import enums.EPiedra;
import enums.EPociones;
import objects.abstractos.ICristal;
import objects.abstractos.IPiedra;
import objects.abstractos.IPocion;

public interface ItiendaEstandar {
    IPocion comprarPocion(EPociones ePociones);
    IPiedra comprarPiedra(EPiedra ePiedra);
    ICristal comprarCristal(ECristales eCristales);
}
