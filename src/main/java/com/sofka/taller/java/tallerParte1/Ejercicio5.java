package com.sofka.taller.java.tallerParte1;

public class Ejercicio5 {
    public static void mostrarNumerosParesEImpares() {

        int contador = 1;
        System.out.println("\t--------------------------------");
        System.out.println("\tNumeros Pares\t Numeros Impares");
        System.out.println("\t--------------------------------");

        while (contador <= 100) {

            if (contador % 2 == 0) {
                System.out.print("\t\t" + contador);
            } else {

                if (contador == 1) {
                    System.out.println("\t\t\t\t\t\t" + contador);
                    System.out.println("\t--------------------------------");
                } else {
                    System.out.println("\t\t\t\t" + contador);
                    System.out.println("\t--------------------------------");
                }
            }
            contador++;
        }
    }
}
