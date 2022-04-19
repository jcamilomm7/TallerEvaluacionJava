package com.sofka.taller.java.tallerParte4;

//Esta interfaz sera implementada en las clases Serie y Videojuego
public interface Entregable {
    void entregar();
    void devolver();
    boolean isEntregado();
    int compareTo(Object a);
}
