package com.sofka.taller.java.tallerParte2;

public class Ejercicio10 {
    public static String devolverCadenaSinEspacios(String cadena) {

        String result = cadena.replaceAll("\\s+", "");
        return result;
    }
}
