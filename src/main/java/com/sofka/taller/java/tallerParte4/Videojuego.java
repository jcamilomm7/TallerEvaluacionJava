package com.sofka.taller.java.tallerParte4;

/**
 * Ejercicio 18 del taller de evaluacion java
 * Clase VideoJuego cuenta con algunos atributos , metodos propios y aparte implementa la interfaz Entregable
 *
 * @author JULIAN CAMILO MESA
 */
public class Videojuego implements Entregable {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    /**
     * Metodo constructor por defecto
     * Inicializa algunas variables con valores por defecto
     */
    public Videojuego() {
        this.horasEstimadas = 10;
        this.entregado = false;
    }

    /**
     * Metodo constructor con dos argumentos y el resto por defecto
     *
     * @param horasEstimadas
     * @param titulo
     */

    public Videojuego(String titulo, int horasEstimadas) {
        this.entregado = false;
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    /**
     * Metodo constructor con todos los atributos como argumentos
     *
     * @param compania
     * @param genero
     * @param titulo
     * @param horasEstimadas
     */
    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.entregado = false;
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "\t\tTitulo: " + titulo + "\n" +
                "\t\tHoras estimadas: " + horasEstimadas + "\n" +
                "\t\tGenero: " + genero + "\n" +
                "\t\tEmpresa: " + compania;
    }

    //Metodos de la interfaz implementada
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    /**
     * Este metodo es para comparar los objetos dentro de un arrayList y asi poner condiciones para visualziar algunos
     *
     * @param a
     */
    @Override
    public int compareTo(Object a) {
        Videojuego v = (Videojuego) a;
        return this.horasEstimadas - v.getHorasEstimadas();
    }
}
