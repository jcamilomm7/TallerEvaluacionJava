package com.sofka.taller.java.tallerParte3;

import java.util.Arrays;
public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {

        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
        comprobarConsumoEnergetico();
        comprobarColor();
        //precioFinal();
    }

    public Electrodomestico(double precioBase, double peso) {

        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

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
    private char comprobarConsumoEnergetico() {

        String charToString = String.valueOf(this.consumoEnergetico);
        String charMinuscula = charToString.toLowerCase();
        String cadena = "abcdef";
        if (!cadena.contains(charMinuscula)) {
            this.consumoEnergetico = 'F';
        }
        return this.consumoEnergetico;
    }

    private void comprobarColor() {

        String colorminuscula = this.color.toLowerCase();
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        Arrays.asList(colores);

        if (!Arrays.asList(colores).contains(colorminuscula)) {
            this.color = "blanco";
        }
    }
    public double precioFinal() {

        char consumoEnergetico = this.comprobarConsumoEnergetico();
        String charToString = String.valueOf(consumoEnergetico);
        String charMayuscula = charToString.toUpperCase();

        switch (charMayuscula) {

            case "A":
                this.precioBase = this.precioBase + 100;
                break;

            case "B":
                this.precioBase = this.precioBase + 80;
                break;

            case "C":
                this.precioBase = this.precioBase + 60;
                break;

            case "D":
                this.precioBase = this.precioBase + 50;
                break;

            case "E":
                this.precioBase = this.precioBase + 30;
                break;

            case "F":
                this.precioBase = this.precioBase + 10;
                break;
        }

        double peso = this.peso;

        if (peso >= 0 && peso < 20) {
            this.precioBase = this.precioBase + 10;
        }else if (peso >= 20 && peso < 50) {
            this.precioBase = this.precioBase + 50;
        }else if (peso >= 50 && peso < 80) {
            this.precioBase = this.precioBase + 80;
        } else if (peso >= 80) {
            this.precioBase = this.precioBase + 100;
        }
        return this.precioBase;
    }
}
