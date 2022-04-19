package com.sofka.taller.java.tallerParte1;

/**
 * Ejercicio 1 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio1 {
    /**
     * Este metodo recibe dos numeros por consola para analizar cual es el mayor, el menos o si son iguales
     *
     * @param numConsola1
     * @param numConsola2
     * @return String : mensaje de resultado por consola
     */
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
