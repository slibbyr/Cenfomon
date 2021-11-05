package objects.cenfomon.concreto;

import objects.cenfomon.Cenfomon;

public class TipoFantasma extends Cenfomon {


    public TipoFantasma(String _Nombre, String _Tipo, String _Tipo2, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado, int _Salud, int _Experiencia, int _Nivel) {
        super(_Nombre, _Tipo, _Tipo2, _Genero, _Descripcion, _Textura, _lugarFrecuentado, _Salud, _Experiencia, _Nivel);
    }

    public TipoFantasma(String _Nombre, String _Tipo2, String _Tipo, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado) {
        super(_Nombre, _Tipo2, _Tipo, _Genero, _Descripcion, _Textura, _lugarFrecuentado);
    }
}
