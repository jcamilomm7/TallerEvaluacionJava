package com.sofka.taller.java.tallerParte3;

/**
 * Ejercicio 17 del taller de evaluacion java
 * Clase hija que que extendie de la super clase Electrodomestico
 *
 * @author JULIAN CAMILO MESA
 */
public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizador;

    /**
     * Metodo constructor por defecto
     * Inicializa algunas variables con valores por defecto
     */
    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizador = false;
        //this.precioFinal();
    }

    /**
     * Metodo constructor con dos argumentos y el resto por defecto
     *
     * @param peso
     * @param precioBase
     */
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    /**
     * Metodo constructor con todos los atributos como argumentos
     *
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param resolucion
     * @param sintonizador
     */
    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    /**
     * Este metodo determina el valor de la Television, pero tambien cumple con las condiciones de la clase padre Electrodomestico
     *
     * @return double : precioBase : Para poder calcular el precioBase se requiere de ciertas condiciones
     */
    public double precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precioBase = this.precioBase + (this.precioBase * 0.3);
        }
        return precioBase;   /*se retorna el precioBase total , segun condiciones de la clase padre y de esta*/
    }
}