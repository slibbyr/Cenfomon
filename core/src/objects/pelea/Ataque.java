package objects.pelea;

public class Ataque {
    private int daño;
    private String nombre;

    public Ataque(int daño, String nombre) {
        this.daño = daño;
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
