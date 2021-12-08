package objects.mapa;

import enums.ETiendas;
import objects.persona.PersonajePrincipal;

import java.lang.ref.PhantomReference;

public class TiendaProxy implements  Itienda {

    private ItiendaEstandar itiendaEstandar;
    @Override
    public ItiendaEstandar acceder(PersonajePrincipal personajePrincipal) throws Exception {
        boolean apertura = false;
        if (personajePrincipal.getClave()=="POZUELO"){
            apertura = true;
            return this.generador(apertura);
        }else {
            return this.generador(apertura);
        }

    }
    private ItiendaEstandar generador(boolean prueba){
        if (prueba){
            return this.tipo(ETiendas.PREMIUM);
        }else {
            return this.tipo(ETiendas.NORMAL);
        }
    }
    private ItiendaEstandar tipo(ETiendas tiendas){
        switch (tiendas){
            case NORMAL:
                itiendaEstandar=new Tienda();
                break;
            case PREMIUM:
                itiendaEstandar=new TiendaPremiun();
                break;
        }
        return itiendaEstandar;
    }
}
