package com.sofka.taller.java;

import com.sofka.taller.java.tallerParte1.*;
import com.sofka.taller.java.tallerParte2.*;
import com.sofka.taller.java.tallerParte3.Electrodomestico;
import com.sofka.taller.java.tallerParte3.Lavadora;
import com.sofka.taller.java.tallerParte3.Persona;
import com.sofka.taller.java.tallerParte3.Television;

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
                        JOptionPane.showMessageDialog(null, "programa para quitarle los espacios a una cadena texto" +
                                "que se ingrese por teclado");
                        String cadena = JOptionPane.showInputDialog("Ingresar cadena de texto");
                        JOptionPane.showMessageDialog(null, "La cadena sin espacios: " + Ejercicio10.devolverCadenaSinEspacios(cadena));
                        break;

                    case 11:
                        JOptionPane.showMessageDialog(null, "Este programa indica la longitud de una cadena de texto ingresada " +
                                " por teclado y adicionalmente cuantas vocales tiene de a,e,i,o,u ");
                        String cadena1 = JOptionPane.showInputDialog("Ingresar cadena de texto");
                        JOptionPane.showMessageDialog(null, Ejercicio11.devolverLongitudCadena(cadena1) +
                                "\n" + Ejercicio11.devolverNumeroVocales(cadena1));
                        break;

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

                    case 16:
                        JOptionPane.showMessageDialog(null, "Este programa Consta de una clase llamada persona," +
                                " de la cual se instancian objetos, con los atributos nombre,apellido,sexo,peso,altura,etc. con el fin " +
                                " de calcular el IMC de la persona");
                        String nombre = JOptionPane.showInputDialog("Ingresar nombre");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad"));
                        String sexo = JOptionPane.showInputDialog("Ingresar sexo  H: hombre y M: mujer");
                        char ch = sexo.charAt(0);
                        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresar peso en kg"));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresar altura en metros"));
                        Persona persona1 = new Persona(nombre, edad, ch, peso, altura);
                        Persona persona2 = new Persona(nombre, edad, ch);
                        Persona persona3 = new Persona();
                        persona3.setNombre("Carolina");
                        persona3.setEdad(25);
                        persona3.setSexo('F');
                        persona3.setPeso(65);
                        persona3.setAltura(1.68);
                        JOptionPane.showMessageDialog(null, "Informacion de los 3 objetos de la clase Persona" +
                                "\npersona1   : utilizando el constructor con todos los argumentos" +
                                "\n" + persona1.toString() +
                                "\n\npersona2 : utilizando el constructor, pero sin los argumentos peso y estatura" +
                                "\n" + persona2.toString() +
                                "\n\npersona3 : utilizando el constructor por defecto, sin argumentos" +
                                "\n" + persona3.toString()

                        );
                        break;

                    case 17:
                        JOptionPane.showMessageDialog(null, "Este programa es para almacenar en un array de 10 posiciones" +
                                " objetos de las clases Electrodomestico, lavadora o television y ver su respectiva informacion");
                        Electrodomestico array[] = new Electrodomestico[10];
                        array[0] = new Lavadora(200, "negro", 'E', 85, 25);
                        array[1] = new Lavadora(350, "rojo", 'D', 60, 45);
                        array[2] = new Television(150, "verde", 'Z', 55, 30, false);
                        array[3] = new Electrodomestico(200, 50);
                        array[4] = new Television(350, 85);
                        array[5] = new Electrodomestico();
                        array[6] = new Television(90, "violeta", 'B', 100, 50, true);
                        array[7] = new Lavadora();
                        array[8] = new Electrodomestico(200, "negro", 'D', 85);
                        array[9] = new Television();

                        int instanciasElectrodomesticos = 0;
                        double precioTotalElectrodomesticos = 0;
                        int instanciasLavadoras = 0;
                        double precioTotalLavadoras = 0;
                        int instanciasTelevision = 0;
                        double precioTotalTelevision = 0;

                        for (int i = 0; i < array.length; i++) {

                            if (array[i] instanceof Electrodomestico) {
                                instanciasElectrodomesticos++;
                                precioTotalElectrodomesticos += array[i].precioFinal();
                            }
                            if (array[i] instanceof Lavadora) {
                                instanciasLavadoras++;
                                precioTotalLavadoras += array[i].precioFinal();
                            }
                            if (array[i] instanceof Television) {
                                instanciasTelevision++;
                                precioTotalTelevision += array[i].precioFinal();
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Los objetos instanciados fueron los siguientes\n" +
                                array[0] + "\n\n" + array[1] + "\n\n" + array[2] + "\n\n" + array[3] + "\n\n" + array[4] + "\n\n" + array[5] +
                                "\n\n" + array[6] + "\n\n" + array[7] + "\n\n" + array[8] + "\n\n" + array[9]
                        );
                        JOptionPane.showMessageDialog(null, "Informe final de electrodomesticos creados\n" +
                                " Numero de lavadoras:               " + instanciasLavadoras + "\n" +
                                " Precio total de lavadoras:         " + precioTotalLavadoras + " euros" + "\n" +
                                " Numeros de television:             " + instanciasTelevision + "\n" +
                                " Precio total de television:        " + precioTotalTelevision + " euros" + "\n" +
                                " Otros electrodomesticos:           " + (instanciasElectrodomesticos - (instanciasLavadoras + instanciasTelevision)) + "\n" +
                                " Numero de electrodomesticos:       " + instanciasElectrodomesticos + "\n" +
                                " Precio total de electrodomesticos: " + precioTotalElectrodomesticos + " euros" + "\n"

                        );
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null, "HASTA PRONTO");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "SOLO SE ADMITEN NUMEROS");
                opcion = 1;
            }

        } while (opcion != 0);
        System.exit(0);
    }
}
