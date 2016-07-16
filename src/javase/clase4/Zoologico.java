package javase.clase4;

public class Zoologico {
    public static final int CANTIDAD_ANIMALES = 25;
    public static final int RACIONES_POR_ANIMAL = 5;
    private boolean abierto;

    public void abrir() {
        if (abierto == false) {
            abierto = true;
            System.out.println("El zoologico abrio.");
        } else {
            System.out.println("El zoologico ya se encuentra abierto.");
        }
    }

    public void alimentarAnimales(int cantidadRaciones) {

    }

    public void cerrar() {
        if (abierto == true) {
            abierto = false;
            System.out.println("El zoologico cerro.");
        } else {
            System.out.println("El zoologico ya se encuentra cerrado.");
        }
    }
}
