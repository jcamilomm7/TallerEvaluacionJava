package com.sofka.taller.java.tallerParte1;

/**
 * Ejercicio 6 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio6 {

    /**
     * Este metodo no tiene argumentos, simplemente cuando se ejecuta muestra por consola dos columnas, una con los pares y
     * otra con los impares que hay del 1 al 100  (Se utiliza el ciclo for)
     */
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
