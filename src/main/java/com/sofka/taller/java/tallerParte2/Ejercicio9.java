package com.sofka.taller.java.tallerParte2;

import javax.swing.*;
public class Ejercicio9 {
    public static String modificarCadenaTexto(String cadenaTexto) {

        String cadena = "La sonrisa sera la mejor arma contra la tristeza ";
        String nuevo = cadena.replaceAll("[a]", "e");
        return nuevo.concat(cadenaTexto);
    }
}
