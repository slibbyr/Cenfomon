package Observador;

import gestores.GestorPelea;
import java.util.concurrent.ThreadLocalRandom;

public class ObservadorPelea implements Observador {
    @Override
    public void update(GestorPelea gestorPelea) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 2 );
        switch (randomNum){
            case 1: gestorPelea.ataqueEnemigo();
                break;
            case 2: gestorPelea.huirenemigo();
                break;
        }
    }
}
