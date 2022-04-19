package com.sofka.taller.java.tallerParte2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 13 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio13 {

    /**
     * Este metodo saca provecho de la funcionalidad de java para visualizar la fecha en tiempo real
     *
     * @return String : Fecha actual
     */
    public static String mostrarfechaActual() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now());
    }

}
