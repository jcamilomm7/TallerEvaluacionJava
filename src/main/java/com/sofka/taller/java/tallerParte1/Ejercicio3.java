package com.sofka.taller.java.tallerParte1;

import java.text.DecimalFormat;

/**
 * Ejercicio 3 del taller evaluacion java
 *
 * @author JULIAN CAMILO MESA
 */
public class Ejercicio3 {
    /**
     * Metodo para calcular el area de un circulo
     *
     * @param radio
     * @return String mensaje de resultado + el area del circulo
     */
    public static String calcularArea(double radio) {
        double area = Math.PI * (Math.pow(radio, 2));
        DecimalFormat df = new DecimalFormat("###.##");
        return "EL area del circulo es: " + df.format(area) + "cm²";
    }
}