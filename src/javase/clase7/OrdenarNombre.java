package javase.clase7;

public class OrdenarNombre extends Ordenar {
    @Override
    public int compare(Object o1, Object o2) {
        Persona per1 = (Persona)o1;
        Persona per2 = (Persona)o2;

        return per1.getNombre().compareTo(per2.getNombre());
    }
}
