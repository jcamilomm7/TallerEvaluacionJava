package com.sofka.taller.java.tallerParte3;

import java.util.Arrays;

/**
 * Ejercicio 17 del taller de evaluacion java
 * Super clase, de la cual heredaran sus clases hijas Lavadora y Television
 *
 * @author JULIAN CAMILO MESA
 */
public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    /**
     * Metodo constructor por defecto
     * Inicializa algunas variables con valores por defecto
     */
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    /**
     * Metodo constructor con dos argumentos y el resto por defecto
     *
     * @param peso
     * @param precioBase
     */
    public Electrodomestico(double precioBase, double peso) {
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    /**
     * Metodo constructor con todos los atributos como argumentos
     *
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase + "$" +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso + "kg" +
                '}';
    }

    /**
     * Metodo para comprobar si la letra de consumo energetico ingresada por el usuario si esta , si no coloca el valor defecto
     *
     * @return char: Letra de consumo energetico
     */
    private char comprobarConsumoEnergetico() {
        String charToString = String.valueOf(this.consumoEnergetico); //Convertir un char en string
        String charMinuscula = charToString.toLowerCase(); //Pasarla a minuscula
        String cadena = "abcdef";          //Cadena de caracteres permitidas en el atributo consumo energetico,
        //en caso de que no este , se colocara el valor por defecto
        if (!cadena.contains(charMinuscula)) {
            this.consumoEnergetico = 'F';
        }
        return this.consumoEnergetico;
    }

    /**
     * Metodo para comprobar si la color ingresado por el usuario si esta , si no coloca el valor defecto
     */
    private void comprobarColor() {
        String colorminuscula = this.color.toLowerCase();
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        Arrays.asList(colores);

        if (!Arrays.asList(colores).contains(colorminuscula)) {
            this.color = "blanco";
        }
    }

    /**
     * Este metodo es el mas importante de la aplicacion , determina el valor de cada Electrodomestico
     *
     * @return double : precioBase : Para poder calcular el precioBase se requiere de ciertas condiciones
     */
    public double precioFinal() {

        char consumoEnergetico = this.comprobarConsumoEnergetico();
        String charToString = String.valueOf(consumoEnergetico); //Pasar de un char a String
        String charMayuscula = charToString.toUpperCase();   //Pasar a mayuscula

        switch (charMayuscula) {

            case "A":
                this.precioBase += 100;
                break;

            case "B":
                this.precioBase += 80;
                break;

            case "C":
                this.precioBase += 60;
                break;

            case "D":
                this.precioBase += 50;
                break;

            case "E":
                this.precioBase += 30;
                break;

            case "F":
                this.precioBase += 10;
                break;
        }

        double peso = this.peso;

        if (peso >= 0 && peso < 20) {
            this.precioBase += 10;
        } else if (peso >= 20 && peso < 50) {
            this.precioBase += 50;
        } else if (peso >= 50 && peso < 80) {
            this.precioBase += 80;
        } else if (peso >= 80) {
            this.precioBase += 100;
        }
        return this.precioBase;
    }
}
