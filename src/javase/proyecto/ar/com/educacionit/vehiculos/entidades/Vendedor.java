package javase.proyecto.ar.com.educacionit.vehiculos.entidades;

import javase.proyecto.ar.com.educacionit.base.entidades.Persona;

public class Vendedor extends Persona {
    private int cantAutosVendidos;

    public Vendedor(String nombre, String apellido, String dni, int cantAutosVendidos) {
        super(nombre, apellido, dni);
        this.cantAutosVendidos = cantAutosVendidos;
    }

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", cantAutosVendidos=" + cantAutosVendidos +
                '}';
    }
}
