package javase.proyecto.ar.com.educacionit.vehiculos.pruebas;

import javase.proyecto.ar.com.educacionit.vehiculos.entidades.Auto;
import javase.proyecto.ar.com.educacionit.vehiculos.entidades.Comprador;
import javase.proyecto.ar.com.educacionit.vehiculos.entidades.Vendedor;

public class Programa {
    public static void main(String[] args) {
        Auto auto = new Auto(2, 3, 5, "Peugeot", "208", "Blanco");
        System.out.println(auto);

        Comprador comp = new Comprador("Maximiliano", "Bisurgi", "33899255", 10000);
        System.out.println(comp);

        Vendedor vend = new Vendedor("Yanina", "Jimenez", "32849355", 2);
        System.out.println(vend);
    }
}
