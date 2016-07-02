package javase.clase2;

public class Laboratorio1 {
    public static void main(String[] args) {
        int [] vecNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
        int [] vecPositivos = new int[10];
        int [] vecNegativos = new int[10];

        int totalPositivos = 0;
        int totalNegativos = 0;

        int posPositivos = 0;
        int posNegativos = 0;

        for (int num: vecNumeros) {
            if (num > 0) {
                vecPositivos[posPositivos] = num;
                totalPositivos = totalPositivos + num;
                posPositivos++;
            }

            if (num < 0) {
                vecNegativos[posNegativos] = num;
                totalNegativos = totalNegativos + num;
                posNegativos++;
            }
        }

        imprimirVector(vecNumeros);
        imprimirVector(vecPositivos);
        imprimirVector(vecNegativos);

        System.out.println(totalPositivos);
        System.out.println(totalNegativos);
    }

    public static void imprimirVector(int [] vector) {
        for (int num: vector) {
            System.out.println(num);
        }
    }
}
