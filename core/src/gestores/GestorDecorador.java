package gestores;

import decoradorConcreto.galletaAtaque;
import objects.cenfomon.Cenfomon;

import java.util.ArrayList;

public class GestorDecorador {

    private ArrayList<Cenfomon> arrayCenfomon;

    public GestorDecorador() {

    }

    public GestorDecorador(ArrayList<Cenfomon> arrayCenfomon) {
        this.setArrayCenfomon(new ArrayList<Cenfomon>());
    }

    public ArrayList<Cenfomon> getArrayCenfomon() {
        return arrayCenfomon;
    }

    public void setArrayCenfomon(ArrayList<Cenfomon> arrayCenfomon) {
        this.arrayCenfomon = arrayCenfomon;
    }

    /* Este metodo va a decorar el ataque del cenfomon cuando se este en la batalla, tomando como parametro la batalla y seteandole al ataque el valor de la variable aumento ataque que esta en la galletaAtaque del decorador concreto
    public void decorarCenfomon (Cenfomon pCenfomon) {
        galletaAtaque galletaAtaque;
        galletaAtaque.setAumentoAtaque(30);
    }*/

}

