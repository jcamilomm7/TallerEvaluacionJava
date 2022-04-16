package com.sofka.taller.java.tallerParte1;


public class Ejercicio1 {
    public static String numeroMayor(int numConsola1, int numConsola2) {
        if (numConsola1 > numConsola2) {
            return "El numero " + numConsola1 + " es mayor que el numero " + numConsola2;
        } else if (numConsola1 < numConsola2) {
            return "El numero " + numConsola2 + " es mayor que el numero " + numConsola1;
        } else {
            return "Los dos numeros son iguales";
        }
    }
}
