package com.sofka.taller.java.tallerParte3;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizador;
    public Television() {

        super();
        this.resolucion = 20;
        this.sintonizador = false;
        //this.precioFinal();
    }
    public Television(double precioBase, double peso) {

        super(precioBase, peso);

    }
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
    public double precioFinal() {

        super.precioFinal();
        if (this.resolucion > 40) {
            this.precioBase = this.precioBase + (this.precioBase * 0.3);
        }
        return precioBase;
    }
}