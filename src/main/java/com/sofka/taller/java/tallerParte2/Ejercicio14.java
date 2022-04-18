package com.sofka.taller.java.tallerParte2;

public class Ejercicio14 {
    public static void mostrarRangoNumeros(int numero) {

        final int limite = 1000;

        System.out.println("---------Numeros--------");

        if (numero < limite) {

            while (numero <= 1000) {
                System.out.println("\t\t\t" + numero);
                numero += 2;
            }
        } else if (numero > limite) {

            while (numero >= 1000) {

                System.out.println("\t\t\t" + numero);
                numero -= 2;
            }
        }
    }
}
