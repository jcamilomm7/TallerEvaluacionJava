package com.sofka.taller.java.tallerParte1;

/**
 * Ejercicio 5 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio5 {

    /**
     * Este metodo no tiene argumentos, simplemente cuando se ejecuta muestra por consola dos columnas, una con los pares y
     * otra con los impares que hay del 1 al 100  (Se utiliza el ciclo while)
     */
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
