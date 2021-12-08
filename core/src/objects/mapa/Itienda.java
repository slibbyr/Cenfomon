package objects.mapa;

import objects.persona.PersonajePrincipal;

public interface Itienda {
    ItiendaEstandar acceder(PersonajePrincipal personajePrincipal) throws Exception;
}
