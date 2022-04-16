package com.sofka.taller.java.tallerParte1;


public class Ejercicio2 {

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