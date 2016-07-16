package javase.proyecto.ar.com.educacionit.base.entidades;

public abstract class Vehiculo {
    protected int alto;
    protected int ancho;
    protected int largo;

    public Vehiculo(int alto, int ancho, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", largo=" + largo +
                '}';
    }
}
