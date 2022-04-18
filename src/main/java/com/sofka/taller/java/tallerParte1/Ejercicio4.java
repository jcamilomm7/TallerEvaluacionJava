package com.sofka.taller.java.tallerParte1;

public class Ejercicio4 {
    final static int iva = 21;
    public static String calcularPrecioIva(float precioProducto) {
        float precioFinal = precioProducto + ((precioProducto * iva) / 100);
        return "Precio del producto: " + precioProducto + "$" +
                "\nIva: " + iva + "%" +
                "\nPrecio Final: " + precioFinal + "$";
    }
}
