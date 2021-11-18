package objects.cenfomon;

public abstract class Cenfomon {
    private String _Nombre;
    private String _Tipo;
    private String _Tipo2;
    private String _Genero;
    private String _Descripcion;
    private String _Textura;
    private String _lugarFrecuentado;
    private int _Salud;
    private int _SaludMaxima;
    private int _Experiencia;
    private int _Nivel;

    public Cenfomon() {
    }

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

    public abstract String metamorfosis( );

    public abstract String metamorfosis2( );

    public String get_Nombre() {
        return _Nombre;
    }

    public void set_Nombre(String _Nombre) {
        this._Nombre = _Nombre;
    }

    public String get_Tipo() {
        return _Tipo;
    }

    public void set_Tipo(String _Tipo) {
        this._Tipo = _Tipo;
    }

    public String get_Tipo2() {
        return _Tipo2;
    }

    public void set_Tipo2(String _Tipo2) {
        this._Tipo2 = _Tipo2;
    }

    public String get_Genero() {
        return _Genero;
    }

    public void set_Genero(String _Genero) {
        this._Genero = _Genero;
    }

    public String get_Descripcion() {
        return _Descripcion;
    }

    public void set_Descripcion(String _Descripcion) {
        this._Descripcion = _Descripcion;
    }

    public String get_Textura() {
        return _Textura;
    }

    public void set_Textura(String _Textura) {
        this._Textura = _Textura;
    }

    public String get_lugarFrecuentado() {
        return _lugarFrecuentado;
    }

    public void set_lugarFrecuentado(String _lugarFrecuentado) {
        this._lugarFrecuentado = _lugarFrecuentado;
    }

    public int get_Salud() {
        return _Salud;
    }

    public void set_Salud(int _Salud) {
        this._Salud = _Salud;
    }

    public int get_Experiencia() {
        return _Experiencia;
    }

    public void set_Experiencia(int _Experiencia) {
        this._Experiencia = _Experiencia;
    }

    public int get_Nivel() {
        return _Nivel;
    }

    public void set_Nivel(int _Nivel) {
        this._Nivel = _Nivel;
    }

    public int get_SaludMaxima() {
        return _SaludMaxima;
    }

    public void set_SaludMaxima(int _SaludMaxima) {
        this._SaludMaxima = _SaludMaxima;
    }



}
