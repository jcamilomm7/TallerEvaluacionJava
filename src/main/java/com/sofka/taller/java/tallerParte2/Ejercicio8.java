package com.sofka.taller.java.tallerParte2;

public class Ejercicio8 {

    public static String verificarDialaboral(String dia) {

        switch (dia) {
            case "lunes":
                return "El dia " + dia + " es laboral";
            case "martes":
                return "El dia " + dia + " es laboral";
            case "miercoles":
                return "El dia " + dia + " es laboral";
            case "jueves":
                return "El dia " + dia + " es laboral";
            case "viernes":
                return "El dia " + dia + " es laboral";
            case "sabado":
                return "El dia " + dia + " no es laboral, descansa";
            case "domingo":
                return "El dia " + dia + " no es laboral, descansa";
            default:
                return "El dia no existe";
        }
    }
}
