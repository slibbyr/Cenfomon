package objects.cenfomon.metamorfosis;

import enums.ETipoCenfomon;
import objects.cenfomon.Cenfomon;

public abstract class Metamorfosis {
    public abstract void evolucionar(ETipoCenfomon tipoCenfomon, Cenfomon cenfomon);
    public abstract boolean proximoNivel(int pNumero);
}
