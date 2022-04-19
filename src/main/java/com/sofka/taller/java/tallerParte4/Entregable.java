package com.sofka.taller.java.tallerParte4;

/**
 * Ejercicio 18 del taller de evaluacion java
 * Interfaz en la cual se definen algunos metodos que seran implementados por la clase Serie y la clase Videojuego
 *
 * @author JULIAN CAMILO MESA
 */
public interface Entregable {
    void entregar();
    void devolver();
    boolean isEntregado();
    int compareTo(Object a);
}
