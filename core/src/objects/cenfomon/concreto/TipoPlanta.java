package objects.cenfomon.concreto;

import objects.cenfomon.Cenfomon;

public class TipoPlanta extends Cenfomon {


    public TipoPlanta(String _Nombre, String _Tipo, String _Tipo2, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado, int _Salud, int _Experiencia, int _Nivel) {
        super(_Nombre, _Tipo, _Tipo2, _Genero, _Descripcion, _Textura, _lugarFrecuentado, _Salud, _Experiencia, _Nivel);
    }

    public TipoPlanta(String _Nombre, String _Tipo2, String _Tipo, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado) {
        super(_Nombre, _Tipo2, _Tipo, _Genero, _Descripcion, _Textura, _lugarFrecuentado);
    }

    public TipoPlanta(){
        super.set_Nombre ("Orucros");
        super.set_Tipo("Planta");
        super.set_Tipo2("Bicho");
        super.set_Genero("");
        super.set_Descripcion("Es de los cenfomones iniciales. Es un Cenfomon tipo planta/bicho de la primera generación");
        super.set_Textura("");
        super.set_lugarFrecuentado("");
        super.set_Salud(100);
        super.set_Experiencia(0);
        super.set_Nivel(1);
    }
}
