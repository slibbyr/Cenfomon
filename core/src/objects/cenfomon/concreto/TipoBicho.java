package objects.cenfomon.concreto;

import objects.cenfomon.Cenfomon;
import objects.pelea.Ataque;

public class TipoBicho extends Cenfomon {


    public TipoBicho(String _Nombre, String _Tipo, String _Tipo2, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado, int _Salud, int _Experiencia, int _Nivel) {
        super(_Nombre, _Tipo, _Tipo2, _Genero, _Descripcion, _Textura, _lugarFrecuentado, _Salud, _Experiencia, _Nivel);
    }

    public TipoBicho(String _Nombre, String _Tipo2, String _Tipo, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado) {
        super(_Nombre, _Tipo2, _Tipo, _Genero, _Descripcion, _Textura, _lugarFrecuentado);
    }

    @Override
    public String metamorfosis() {
        return null;
    }

    @Override
    public String metamorfosis2() {
        return null;
    }

    public TipoBicho(){
        super.set_Nombre ("Baji");
        super.set_Tipo("Bicho");
        super.set_Genero("");
        super.set_Descripcion("Es de los cenfomones iniciales. Es un Cenfomon tipo bicho de la primera generación");
        super.set_Textura("");
        super.set_lugarFrecuentado("");
        super.set_Salud(100);
        super.set_Experiencia(0);
        super.set_Nivel(1);
        super.setAtaque(new Ataque(100,"Defensa"));
    }
}
