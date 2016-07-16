package javase.proyecto.ar.com.educacionit.vehiculos.entidades;

import javase.proyecto.ar.com.educacionit.base.entidades.Vehiculo;

public class Auto extends Vehiculo{
    private String marca;
    private String modelo;
    private String color;

    public Auto(int alto, int ancho, int largo, String marca, String modelo, String color) {
        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", largo='" + largo + '\'' +
                ", ancho='" + ancho + '\'' +
                ", alto='" + alto + '\'' +
                '}';
    }
}
