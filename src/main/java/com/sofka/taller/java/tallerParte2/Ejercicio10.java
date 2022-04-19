package com.sofka.taller.java.tallerParte2;

/**
 * Ejercicio 10 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio10 {

    /**
     * Este metodo recibe una cadena de texto, la cual retorna pero sin espacios en blanco
     *
     * @param cadena
     * @return String : cadena sin espacios
     */
    public static String devolverCadenaSinEspacios(String cadena) {

        String result = cadena.replaceAll("\\s+", "");
        return result;
    }
}
