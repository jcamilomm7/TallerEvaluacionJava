package com.sofka.taller.java;

import com.sofka.taller.java.tallerParte1.*;
import com.sofka.taller.java.tallerParte2.Ejercicio14;
import com.sofka.taller.java.tallerParte2.Ejercicio15;
import com.sofka.taller.java.tallerParte2.Ejercicio8;
import com.sofka.taller.java.tallerParte2.Ejercicio9;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        Menu.mostrarMenu()
                ));
                switch (opcion) {
                    case 1:
                        Scanner sc = new Scanner(System.in);
                        JOptionPane.showMessageDialog(null, "Programa para saber el mayor entre dos numeros enteros");
                        System.out.println("Ingresar el primer numero");
                        int numConsola1 = sc.nextInt();
                        System.out.println("Ingresar el segundo numero");
                        int numConsola2 = sc.nextInt();
                        System.out.println(Ejercicio1.numeroMayor(numConsola1, numConsola2));

                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Programa para saber el mayor entre dos numeros enteros");
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el primer numero"));
                        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el segundo numero"));
                        JOptionPane.showMessageDialog(null, Ejercicio2.numeroMayor(num1, num2));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Programa para calcular el area de un circulo");
                        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el radio en cm "));
                        JOptionPane.showMessageDialog(null, Ejercicio3.calcularArea(radio));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Programa para calcular en cuanto queda un producto aplicando iva");
                        float precioProducto = Float.parseFloat(JOptionPane.showInputDialog("Ingresar el precio del producto "));
                        JOptionPane.showMessageDialog(null, Ejercicio4.calcularPrecioIva(precioProducto));
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Este programa muestra por consola los numeros pares e " +
                                "impares que hay en el rango del 1 al 100");
                        Ejercicio5.mostrarNumerosParesEImpares();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Este programa muestra por consola los numeros pares e " +
                                "impares que hay en el rango del 1 al 100");
                        Ejercicio6.mostrarNumerosParesEImpares();
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Este programa verificara que el numero " +
                                "ingresado es mayor e igual a 0");
                        int numero = 0;
                        do {
                            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
                        } while (numero < 0);
                        System.out.println(Ejercicio7.observarNumeroPositivo(numero));
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Este programa es para saber si el dia ingresado " +
                                "es laboral o no es laboral");
                        String dia = JOptionPane.showInputDialog("Ingresar el dia de la semana");
                        System.out.println(Ejercicio8.verificarDialaboral(dia.toLowerCase()));

                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Este programa es para modificar una " +
                                "cadena de texto e unirla con otra ingresada por teclado");
                        String cadenaIngresada = JOptionPane.showInputDialog("Ingresar la cadena de texto");
                        JOptionPane.showMessageDialog(null, "La cadena resultante es: " + Ejercicio9.modificarCadenaTexto(cadenaIngresada));
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, "Este programa muestra por consola los numeros pares e " +
                                "impares que hay en el rango del 1 al 100");
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null, "Este programa muestra por consola los numeros pares e " +
                                "impares que hay en el rango del 1 al 100");
                    case 12:
                        JOptionPane.showMessageDialog(null, "Este programa muestra por consola los numeros pares e " +
                                "impares que hay en el rango del 1 al 100");
                    case 13:
                        JOptionPane.showMessageDialog(null, "Este programa muestra por consola los numeros pares e " +
                                "impares que hay en el rango del 1 al 100");
                    case 14:
                        JOptionPane.showMessageDialog(null, "Este programa solicita un numero y " +
                                "este sera el limite inicial hasta 1000, todos estos numeros se listaran por consola");
                        int numeroLimite = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero del limite inicial"));
                        Ejercicio14.mostrarRangoNumeros(numeroLimite);
                        break;
                    case 15:
                        JOptionPane.showMessageDialog(null, "Este programa va a mostrar por " +
                                "pantalla un menu de gestion cincematografica");
                        int opcionMenuCine = 2;
                        do {
                            try {
                                opcionMenuCine = Integer.parseInt(JOptionPane.showInputDialog(
                                        Ejercicio15.mostrarMenu()
                                ));
                                switch (opcionMenuCine) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        JOptionPane.showMessageDialog(null, "HASTA PRONTO");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                                        break;
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "SOLO SE ADMITEN NUMEROS");
                                opcionMenuCine = 1;
                            }

                        } while (opcionMenuCine != 8);
                        break;


                    case 0:
                        JOptionPane.showMessageDialog(null, "HASTA PRONTO");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                        break;

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "SEOLO SE ADMITEN NUMEROS");
                opcion = 1;
            }

        } while (opcion != 0);
        System.exit(0);


    }
}
