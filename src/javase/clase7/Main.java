package javase.clase7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona("33899255", "Maximiliano", "Bisurgi");
        Persona per2 = new Persona("43212311", "Claudio", "Perez");
        Persona per3 = new Persona("14315108", "Jorge", "Estevez");
        Persona per4 = new Persona("14567214", "Matias", "Salmon");

        System.out.println(per2.equals(per3));

        Set<Persona> personas = new HashSet<>();

        personas.add(per1);
        personas.add(per2);
        personas.add(per3);
        personas.add(per4);

        System.out.println(personas.contains(per1));
        System.out.println(personas.contains(per2));

        for (Persona persona: personas) {
            System.out.println(persona);
        }

        List<Persona> lista = new ArrayList<>();
        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        lista.add(per4);

        lista.sort(new OrdenarNombre());

        System.out.println("Ordenar por Nombre");

        for (Persona persona: lista) {
            System.out.println(persona);
        }

        lista.sort(new OrdenarApellido());

        System.out.println("Ordernar por Apellido");

        for (Persona persona: lista) {
            System.out.println(persona);
        }

        Map<String, String> mapa = new HashMap<>();

    }

}
