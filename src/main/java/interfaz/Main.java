package interfaz;

import com.sofka.taller.*;

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
                        JOptionPane.showMessageDialog(null, "Ejercicio 1");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Hasta pronto");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                        break;

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten numeros");
                opcion = 1;
            }


        } while (opcion != 0);
        System.exit(0);


    }
}
