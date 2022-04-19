package com.sofka.taller.java.tallerParte2;

/**
 * Ejercicio 8 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio8 {

    /**
     * Este metodo analiza si el dia ingresado es laboral o no es laboral
     *
     * @param dia
     * @return String
     */
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
