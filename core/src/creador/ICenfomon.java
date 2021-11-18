package creador;

import objects.cenfomon.Cenfomon;
import enums.ETipoCenfomon;


public interface ICenfomon {
    Cenfomon crearCenfomon(ETipoCenfomon tipoCenfomon);

}
