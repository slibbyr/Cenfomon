package gestores;


import objects.cenfomon.Cenfomon;
import objects.pelea.Pelea;

public class GestorPelea {
    private static Pelea pelea;

    public GestorPelea(Cenfomon principal,Cenfomon enemigo) {
        pelea = new Pelea(principal,enemigo);
    }

    public void ataqueEnemigo(){
        pelea.ataqueEnemigo(this);
    }
    public void huirenemigo(){
        pelea.huirenemigo(this);
    }
}