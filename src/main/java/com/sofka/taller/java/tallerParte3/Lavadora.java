package com.sofka.taller.java.tallerParte3;

public class Lavadora extends Electrodomestico {
    public static final double CARGA_INICIAL = 5;
    private double carga;

    public Lavadora() {

        super();
        carga = CARGA_INICIAL;
    }

    public Lavadora(double precioBase, double peso) {

        super(precioBase, peso);
        this.carga = CARGA_INICIAL;
    }
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {

        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    public double precioFinal() {

        super.precioFinal();

        if (this.carga > 30) {
            this.precioBase = this.precioBase + 50;
        }
        return this.precioBase;
    }
}
