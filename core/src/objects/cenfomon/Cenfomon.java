package objects.cenfomon;

public class Cenfomon {
    private String _Nombre;
    private String _Tipo;
    private String _Tipo2;
    private String _Genero;
    private String _Descripcion;
    private String _Textura;
    private String _lugarFrecuentado;
    private int _Salud;
    private int _Experiencia;
    private int _Nivel;

    public Cenfomon(String _Nombre, String _Tipo, String _Tipo2, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado, int _Salud, int _Experiencia, int _Nivel) {
        this._Nombre = _Nombre;
        this._Tipo = _Tipo;
        this._Tipo2 = _Tipo2;
        this._Genero = _Genero;
        this._Descripcion = _Descripcion;
        this._Textura = _Textura;
        this._lugarFrecuentado = _lugarFrecuentado;
        this._Salud = _Salud;
        this._Experiencia = _Experiencia;
        this._Nivel = _Nivel;
    }

    public Cenfomon(String _Nombre, String _Tipo2,String _Tipo, String _Genero, String _Descripcion, String _Textura, String _lugarFrecuentado) {
        this._Nombre = _Nombre;
        this._Tipo2 = _Tipo2;
        this._Tipo = _Tipo;
        this._Genero = _Genero;
        this._Descripcion = _Descripcion;
        this._Textura = _Textura;
        this._lugarFrecuentado = _lugarFrecuentado;
        this._Salud = 100;
        this._Experiencia = 0;
        this._Nivel = 0;
    }

    public String metamorfosis(String pNombre){
        this._Nombre = pNombre;
        return "El cenfomon evolucinó en :"+ pNombre;
    }
}
