package com.sofka.taller.java.tallerParte2;

public class Ejercicio11 {
    public static String devolverLongitudCadena(String cadena) {

        int longitud = cadena.length();
        return "La cadena de texto: " + cadena +
                "\ntiene una longitud de: " + longitud + " caracteres, ";
    }

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
