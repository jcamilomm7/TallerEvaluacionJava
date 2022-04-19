package com.sofka.taller.java.tallerParte2;

/**
 * Ejercicio 11 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio11 {

    /**
     * Este metodo mide la longitud de una cadena de texto
     *
     * @param cadena
     * @return String
     */
    public static String devolverLongitudCadena(String cadena) {

        int longitud = cadena.length();
        return "La cadena de texto: " + cadena +
                "\ntiene una longitud de: " + longitud + " caracteres, ";
    }

    /**
     * Este metodo mira cuantas vocales tiene una cadena de texto
     *
     * @param cadena
     * @return String : numero de vocales en una cadena de texto
     */
    public static String devolverNumeroVocales(String cadena) {

        int contador = 0;

        for (int x = 0; x < cadena.length(); x++) {

            if ((cadena.toLowerCase().charAt(x) == 'a') || (cadena.toLowerCase().charAt(x) == 'e') || (cadena.toLowerCase().charAt(x) == 'i')
                    || (cadena.toLowerCase().charAt(x) == 'o') || (cadena.toLowerCase().charAt(x) == 'u')) {
                contador++;
            }
        }
        return "la cantidad de vocales a,e,i,o,u que contiene son: " + contador + " vocales";
    }


}
