package com.sofka.taller.java.tallerParte1;

/**
 * Ejercicio 2 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio2 {

    /**
     * Este metodo recibe dos numeros por interfaz para analizar cual es el mayor, el menos o si son iguales
     *
     * @param num1
     * @param num2
     * @return String : mensaje de resultado por interfaz grafica
     */
    public static String numeroMayor(int num1, int num2) {
        if (num1 > num2) {
            return "El numero " + num1 + " es mayor que el numero " + num2;
        } else if (num1 < num2) {
            return "El numero " + num2 + " es mayor que el numero " + num1;
        } else {
            return "Los dos numeros son iguales";
        }
    }
}