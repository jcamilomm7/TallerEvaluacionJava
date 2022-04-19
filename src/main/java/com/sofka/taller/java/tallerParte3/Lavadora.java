package com.sofka.taller.java.tallerParte3;


/**
 * Ejercicio 17 del taller de evaluacion java
 * Clase hija que que extendie de la super clase Electrodomestico
 *
 * @author JULIAN CAMILO MESA
 */
public class Lavadora extends Electrodomestico {
    public static final double CARGA_INICIAL = 5;
    private double carga;

    /**
     * Metodo constructor por defecto
     * Inicializa algunas variables con valores por defecto
     */
    public Lavadora() {
        super();
        carga = CARGA_INICIAL;
    }

    /**
     * Metodo constructor con dos argumentos y el resto por defecto
     *
     * @param peso
     * @param precioBase
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_INICIAL;
    }

    /**
     * Metodo constructor con todos los atributos como argumentos
     *
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param carga
     */
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    /**
     * Este metodo determina el valor de la lavadora, pero tambien cumple con las condiciones de la clase padre Electrodomestico
     *
     * @return double : precioBase : Para poder calcular el precioBase se requiere de ciertas condiciones
     */
    public double precioFinal() {
        super.precioFinal();  //invocamos el metodo precio final de la clase padre
        if (this.carga > 30) {
            this.precioBase += 50;
        }
        return this.precioBase; // se retorna el precioBase total , segun condiciones de la clase padre y de esta
    }
}
