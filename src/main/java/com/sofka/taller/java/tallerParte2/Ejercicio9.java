package com.sofka.taller.java.tallerParte2;

import javax.swing.*;

/**
 * Ejercicio 9 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio9 {

    public String cadena;
    public String modificado;

    /**
     * Este metodo constructor inicializa sus atributos con un valor por defecto
     */
    public Ejercicio9() {
        this.cadena = "La sonrisa sera la mejor arma contra la tristeza ";
        this.modificado = "";
    }

    /**
     * Este metodo recibe como parametro una cadena de texto,con el fin de ser modificada
     *
     * @param cadenaTexto
     * @return String : modificado ,atrobuto modificado de la clase
     */
    public String modificarCadenaTexto(String cadenaTexto) {
        this.modificado = cadena.replaceAll("[a]", "e");
        return this.modificado;
    }

    /**
     * Este metodo recibe como argumento una cadena de texto y la concatena con un atributo de la clase
     *
     * @param cadenaTexto
     * @return String concatenacion entre atributo modificado y cadena de texto
     */
    public String concatenarCadenasTexto(String cadenaTexto) {
        return this.modificado.concat(cadenaTexto);
    }
}
