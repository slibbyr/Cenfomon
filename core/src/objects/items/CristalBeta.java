package objects.items;

public class CristalBeta {
    private int costo= 150;

    public CristalBeta() {
        this.setCosto(costo);
    }

    public CristalBeta(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
