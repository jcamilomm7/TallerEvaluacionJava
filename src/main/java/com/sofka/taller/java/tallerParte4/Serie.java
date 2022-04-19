package com.sofka.taller.java.tallerParte4;

/**
 * Ejercicio 18 del taller de evaluacion java
 * Clase Serie cuenta con algunos atributos , metodos propios y aparte implementa la interfaz Entregable
 *
 * @author JULIAN CAMILO MESA
 */
public class Serie implements Entregable {

    int mayor = 0;
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;

    private String genero;
    private String creador;

    /**
     * Metodo constructor por defecto
     * Inicializa algunas variables con valores por defecto
     */
    public Serie() {
        this.numeroTemporadas = 3;
        this.entregado = false;
    }

    /**
     * Metodo constructor con dos argumentos y el resto por defecto
     *
     * @param creador
     * @param titulo
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = 3;
        this.entregado = false;
    }

    /**
     * Metodo constructor con todos los atributos como argumentos
     *
     * @param creador
     * @param genero
     * @param titulo
     * @param numeroTemporadas
     */
    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGeenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String geenero) {
        this.genero = geenero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
                "NumeroTemporadas: " + numeroTemporadas + "\n" +
                "Genero: " + genero + "\n" +
                "Creador: " + creador;
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
        Serie s = (Serie) a;
        return this.getNumeroTemporadas() - s.getNumeroTemporadas();
    }
}
