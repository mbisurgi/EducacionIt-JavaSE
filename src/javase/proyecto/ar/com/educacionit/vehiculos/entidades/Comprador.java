package javase.proyecto.ar.com.educacionit.vehiculos.entidades;

import javase.proyecto.ar.com.educacionit.base.entidades.Persona;

public class Comprador extends Persona{
    private double presupuesto;

    public Comprador(String nombre, String apellido, String dni, double presupuesto) {
        super(nombre, apellido, dni);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", presupuesto=" + presupuesto +
                '}';
    }
}
