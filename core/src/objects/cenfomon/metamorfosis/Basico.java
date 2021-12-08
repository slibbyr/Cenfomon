package objects.cenfomon.metamorfosis;

import enums.ETipoCenfomon;
import objects.cenfomon.Cenfomon;

public class Basico extends Metamorfosis{
    @Override
    public void evolucionar(ETipoCenfomon tipoCenfomon, Cenfomon cenfomon) {
        switch (tipoCenfomon){
            case FUEGO:
        }
    }

    @Override
    public boolean proximoNivel(int pNumero) {
        return false;
    }
}
