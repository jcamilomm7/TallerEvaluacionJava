package com.sofka.taller.java.tallerParte1;

/**
 * Ejercicio 4 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio4 {
    final static int iva = 21;

    /**
     * Este metodo calcula el iva de un producto y lo suma para saber su precio final
     *
     * @param precioProducto
     * @return String : informacion de este (precio sin iva, iva, precio
     */
    public static String calcularPrecioIva(float precioProducto) {
        float precioFinal = precioProducto + ((precioProducto * iva) / 100);
        return "Precio del producto: " + precioProducto + "$" +
                "\nIva: " + iva + "%" +
                "\nPrecio Final: " + precioFinal + "$";
    }
}
