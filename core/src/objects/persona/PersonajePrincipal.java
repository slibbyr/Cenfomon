package objects.persona;

import objects.cenfomon.Cenfomon;

public class PersonajePrincipal extends Persona{
    private int  _Coins;
    private int _Ctq;//Cinturon con la información de cuantos cenfomones puede llevar el personaje
    private String clave;

    public void capturarCenfomon(Cenfomon capturado){
        //pendiente de definir el metodo
    }

    public int get_Coins() {
        return _Coins;
    }

    public void set_Coins(int _Coins) {
        this._Coins = _Coins;
    }

    public int get_Ctq() {
        return _Ctq;
    }

    public void set_Ctq(int _Ctq) {
        this._Ctq = _Ctq;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
