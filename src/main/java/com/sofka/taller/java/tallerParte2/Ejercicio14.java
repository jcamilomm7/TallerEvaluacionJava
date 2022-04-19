package com.sofka.taller.java.tallerParte2;

/**
 * Ejercicio 14 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio14 {

    /**
     * Este metodo despliega por consola todo los numeros que hay entre el argumento y el limit definido en una constante
     *
     * @param numeroIngresado
     */
    public static void mostrarRangoNumeros(int numeroIngresado) {
        final int limite = 1000;

        if (numeroIngresado > limite) {
            while (numeroIngresado > limite) {
                System.out.println(numeroIngresado);
                numeroIngresado -= 2;
            }
        }
        while (numeroIngresado <= limite) {
            System.out.println(numeroIngresado);
            numeroIngresado += 2;
        }

    }
}