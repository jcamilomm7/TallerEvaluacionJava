package com.sofka.taller.java.tallerParte1;

public class Ejercicio6 {
    public static void mostrarNumerosParesEImpares() {

        int i;

        System.out.println("\t--------------------------------");
        System.out.println("\tNumeros Pares\t Numeros Impares");
        System.out.println("\t--------------------------------");

        for (i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print("\t\t" + i);
            } else {

                if (i == 1) {
                    System.out.println("\t\t\t\t\t\t" + i);
                    System.out.println("\t--------------------------------");
                } else {
                    System.out.println("\t\t\t\t" + i);
                    System.out.println("\t--------------------------------");
                }
            }
        }
    }
}
