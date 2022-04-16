package com.sofka.taller.java.tallerParte1;


import java.text.DecimalFormat;

public class Ejercicio3 {

    public static String calcularArea(double radio) {
        double area = Math.PI * (Math.pow(radio, 2));
        DecimalFormat df = new DecimalFormat("###.##");
        return "EL area del circulo es: "+ df.format(area)+ "cm²";
    }
}