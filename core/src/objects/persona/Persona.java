package objects.persona;

import objects.cenfomon.Cenfomon;

import java.util.ArrayList;

public class Persona {
    private ArrayList<Cenfomon> _Cenfomones;
    private String _Textura;

    public Persona() {

    }

    public Persona(ArrayList<Cenfomon> _Cenfomones, String _Textura) {
        this._Cenfomones = _Cenfomones;
        this._Textura = _Textura;
    }

    public ArrayList<Cenfomon> get_Cenfomones() {
        return _Cenfomones;
    }

    public void set_Cenfomones(ArrayList<Cenfomon> _Cenfomones) {
        this._Cenfomones = _Cenfomones;
    }

    public String get_Textura() {
        return _Textura;
    }

    public void set_Textura(String _Textura) {
        this._Textura = _Textura;
    }
}
