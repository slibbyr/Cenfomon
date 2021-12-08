package objects.cenfomon.concreto;

import objects.cenfomon.Cenfomon;
import objects.pelea.Ataque;

public class TipoNormal extends Cenfomon {


    public TipoNormal(String _Nombre, String _Tipo, String _Tipo2, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado, int _Salud, int _Experiencia, int _Nivel) {
        super(_Nombre, _Tipo, _Tipo2, _Genero, _Descripcion, _Textura, _lugarFrecuentado, _Salud, _Experiencia, _Nivel);
    }

    public TipoNormal(String _Nombre, String _Tipo2, String _Tipo, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado) {
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

    public TipoNormal(){
        super.set_Nombre ("Corder");
        super.set_Tipo("Normal");
        super.set_Genero("");
        super.set_Descripcion("Es de los cenfomones iniciales. Es un Cenfomon tipo normal de la primera generación");
        super.set_Textura("");
        super.set_lugarFrecuentado("");
        super.set_Salud(100);
        super.set_Experiencia(0);
        super.set_Nivel(1);
        super.setAtaque(new Ataque(100,"Agarre"));
    }
}
