package com.sofka.taller.java.tallerParte2;

/**
 * Ejercicio 12 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio12 {

    /**
     * Este metodo verifica si dos palabras son iguales o no
     *
     * @param palabra1
     * @param palabra2
     * @return String
     */
    public static String compararPalabras(String palabra1, String palabra2) {
        //El metodo equals compara dos cadenas de string
        if (palabra1.equals(palabra2)) {
            return "\nLa palabra " + palabra1 + "es igual a la palabra " + palabra2;
        }
        return "\nLa palabra " + palabra1 + " no es igual a la palabra " + palabra2;
    }

    /**
     * Este metodo compara la longitud de dos cadenas
     *
     * @param palabra1
     * @param palabra2
     * @return String
     */
    public static String diferenciaPalabrasLongitud(String palabra1, String palabra2) {
        return "\nLa longitud de la palabra " + palabra1 + " es: " + palabra1.length() + "\n" +
                "la longitud de la palabra " + palabra2 + " es: " + palabra2.length();
    }

    /**
     * Este metodo determina si alguna de las dos palabras contiene mayusculas
     *
     * @param palabra1
     * @param palabra2
     * @return String : mensaje de resultad
     */
    public static String diferenciaPalabrasMayusculas(String palabra1, String palabra2) {
        //El metodo equals compara dos cadenas de string
        if (palabra1.equals(palabra1.toLowerCase()) && palabra2.equals(palabra2.toLowerCase())) {
            return "\nLas dos palabras que ingresaron todo es en minuscula";
        } else if (!palabra1.equals(palabra1.toLowerCase()) && !palabra2.equals(palabra2.toLowerCase())) {
            return "\nLas dos palabras que ingresaron contienen mayusculas";
        } else {
            return "\nUna  palabra de las  que ingresaron contiene mayusculas y la otra no";
        }
    }
}
