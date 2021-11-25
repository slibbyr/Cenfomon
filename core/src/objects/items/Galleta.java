package objects.items;

public abstract class Galleta {

    protected int duracionRestante = 2;


    public Galleta() {
        this.setDuracionRestante(2);
    }

    public int getDuracionRestante() {
        return duracionRestante;
    }

    public void setDuracionRestante(int duracionRestante) {
        this.duracionRestante = duracionRestante;
    }

    protected int restarDuracionRestante() {
        int resultadoDuracionRestante = duracionRestante - 1;

        return resultadoDuracionRestante;
    }
}

