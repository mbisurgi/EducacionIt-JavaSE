package javase.clase4;

public class Programa {
    public static void main(String[] args) {
        Cuidador cuidador = new Cuidador(10);
        Zoologico zoologico = new Zoologico();

        zoologico.abrir();
        zoologico.alimentarAnimales(cuidador.getCantidadRaciones());
        zoologico.cerrar();
    }
}
