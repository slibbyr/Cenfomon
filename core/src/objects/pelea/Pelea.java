package objects.pelea;

import Observador.Observador;
import Observador.Sujeto;
import gestores.GestorPelea;
import objects.abstractos.IItem;
import objects.cenfomon.Cenfomon;

public class Pelea implements Sujeto {
    private Cenfomon principal;
    private Cenfomon enemigo;
    private int turno;
    private Observador observador;

    public Pelea(Cenfomon principal, Cenfomon enemigo) {
        this.principal = principal;
        this.enemigo = enemigo;
    }

    public void ataque(GestorPelea gestorPelea){
        enemigo.set_Salud(enemigo.get_Salud()-principal.getAtaque().getDaño());
        this.notifyObservers(gestorPelea);
    }
    public void ataqueEnemigo(GestorPelea gestorPelea){
        principal.set_Salud(principal.get_Salud()-enemigo.getAtaque().getDaño());
        this.notifyObservers(gestorPelea);
    }
    public void curar(GestorPelea gestorPelea){
        this.notifyObservers(gestorPelea);
    }
    public void usarItem(IItem pItem, GestorPelea gestorPelea){
        this.notifyObservers(gestorPelea);
    };
    public void cambiarCenfomon(GestorPelea gestorPelea, Cenfomon cambio){
        this.principal=cambio;
        this.notifyObservers(gestorPelea);
    }
    public void huir(GestorPelea gestorPelea){
        this.notifyObservers(gestorPelea);
    }
    public void huirenemigo(GestorPelea gestorPelea){
        this.notifyObservers(gestorPelea);
    }
    public void captura(GestorPelea gestorPelea){
        this.notifyObservers(gestorPelea);
    }

    @Override
    public void addObserver(Observador o) {
        this.observador=o;
    }

    @Override
    public void notifyObservers(GestorPelea gestorPelea) {
        this.observador.update(gestorPelea);
    }

    @Override
    public void removeObserver(Observador o) {

    }
}
