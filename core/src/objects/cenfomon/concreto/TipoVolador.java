package objects.cenfomon.concreto;

import objects.cenfomon.Cenfomon;
import objects.pelea.Ataque;

public class TipoVolador extends Cenfomon {


    public TipoVolador(String _Nombre, String _Tipo, String _Tipo2, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado, int _Salud, int _Experiencia, int _Nivel) {
        super(_Nombre, _Tipo, _Tipo2, _Genero, _Descripcion, _Textura, _lugarFrecuentado, _Salud, _Experiencia, _Nivel);
    }

    public TipoVolador(String _Nombre, String _Tipo2, String _Tipo, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado) {
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

    public TipoVolador(){
        super.set_Nombre ("Ebren");
        super.set_Tipo("Volador");
        super.set_Genero("");
        super.set_Descripcion("Es de los cenfomones iniciales. Es un Cenfomon tipo volador de la primera generación");
        super.set_Textura("");
        super.set_lugarFrecuentado("");
        super.set_Salud(100);
        super.set_Experiencia(0);
        super.set_Nivel(1);
        super.setAtaque(new Ataque(100,"Vuelo"));
    }
}
