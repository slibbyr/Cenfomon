package objects.abstractos;

import enums.EPociones;
import objects.cenfomon.Cenfomon;

public interface IPocion {
    double curar(Cenfomon cenfomon);
    public EPociones getTipo();
}
