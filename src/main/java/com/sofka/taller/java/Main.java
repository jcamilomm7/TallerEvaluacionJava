package com.sofka.taller.java;

import com.sofka.taller.java.tallerParte1.*;
import com.sofka.taller.java.tallerParte2.*;
import com.sofka.taller.java.tallerParte3.Electrodomestico;
import com.sofka.taller.java.tallerParte3.Lavadora;
import com.sofka.taller.java.tallerParte3.Persona;
import com.sofka.taller.java.tallerParte3.Television;
import com.sofka.taller.java.tallerParte4.Entregable;
import com.sofka.taller.java.tallerParte4.Serie;
import com.sofka.taller.java.tallerParte4.Videojuego;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * En esta clase se correra toda la aplicacion, va hacer la unica clase con el metodo main
 *
 * @author JULIAN CAMILO MESA
 */
public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        do {
            try {

                //En opcion se almacenara el numero del ejercicio que el usuario desea ejecutar
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        //Se manda a llamr el metodo estatico menu de la clase Menu
                        Menu.mostrarMenu()
                ));

                //Cada uno de los casos corresponde al ejercicio como tal , ejem: case 1 : ejercicio 1 dle taller
                switch (opcion) {
                    case 1:
                        Scanner sc = new Scanner(System.in);
                        JOptionPane.showMessageDialog(null, "Programa para saber el mayor entre dos numeros enteros + " +
                                "\nLos datos se ingresaran por consola y asi mismo se visualizara el resultado en consola");
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
                                "impares que hay en el rango del 1 al 100. Pero esta vez utilizando un ciclo for");
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
                                "es laboral o no es laboral. El dia se ingresara por teclado en la interfaz y el resultado se visualziara en consola");
                        String dia = JOptionPane.showInputDialog("Ingresar el dia de la semana");
                        System.out.println(Ejercicio8.verificarDialaboral(dia.toLowerCase()));
                        break;

                    case 9:
                        JOptionPane.showMessageDialog(null, "Este programa es para modificar una " +
                                "cadena de texto e unirla con otra ingresada por teclado");
                        Ejercicio9 ejercicio9 = new Ejercicio9();
                        String cadenaIngresada = JOptionPane.showInputDialog("Ingresar la cadena de texto");
                        JOptionPane.showMessageDialog(null, "Cadena de texto original: " + ejercicio9.cadena +
                                "\n La cadena reemplazando todas las 'a' por la 'e' en la cadena original: " + ejercicio9.modificarCadenaTexto(cadenaIngresada) +
                                "\n Cadena ingresada por el usuario: " + cadenaIngresada +
                                "\n La cadena resultante de concatenar la modificada y la que se ingreso por teclado es: " + ejercicio9.concatenarCadenasTexto(cadenaIngresada));
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
                        JOptionPane.showMessageDialog(null, "Este programa determina si dos palabras son iguales o cuales son sus diferencias");
                        String palabra1 = JOptionPane.showInputDialog("Ingresar la primera palabra");
                        String palabra2 = JOptionPane.showInputDialog("Ingresar la segunda palabra");
                        //Este ejercicio consta de tres item de comparacion de las palabras ingresadas (igualdad,mayusculas,longitud)
                        JOptionPane.showMessageDialog(null, "La comparacion de las dos palabras arrojo lo siguiente \n" +
                                Ejercicio12.compararPalabras(palabra1, palabra2) + "\n" +
                                Ejercicio12.diferenciaPalabrasMayusculas(palabra1, palabra2) + "\n" +
                                Ejercicio12.diferenciaPalabrasLongitud(palabra1, palabra2) + "\n" +
                                Ejercicio12.diferenciaLetras(palabra1, palabra2)
                        );

                        break;
                    case 13:
                        JOptionPane.showMessageDialog(null, "Este programa muestra la fecha actual");
                        JOptionPane.showMessageDialog(null, Ejercicio13.mostrarfechaActual());
                        break;

                    case 14:
                        JOptionPane.showMessageDialog(null, "Este programa solicita un numero y " +
                                "este sera el limite inicial hasta llegar a 1000 de a 2 en 2, todos estos numeros se listaran por consola");
                        int numeroLimite = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero del limite inicial"));
                        JOptionPane.showMessageDialog(null, "Listado de numeros en el rango de: " +
                                numeroLimite + " a " + 1000 + ", los cuales se visualizaran en la consola"
                        );
                        Ejercicio14.mostrarRangoNumeros(numeroLimite);
                        break;

                    case 15:
                        JOptionPane.showMessageDialog(null, "Este programa va a mostrar por " +
                                "pantalla un menu de gestion cincematografica");
                        int opcionMenuCine = 2;
                        do {
                            try {
                                opcionMenuCine = Integer.parseInt(JOptionPane.showInputDialog(
                                        //Se manda a llamar el metodo del menu de la clase Ejercicio15
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

                        //Pedir informacion al usuario
                        String nombre = JOptionPane.showInputDialog("Ingresar nombre");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad"));
                        String sexo = JOptionPane.showInputDialog("Ingresar sexo  H: hombre y M: mujer");
                        char ch = sexo.charAt(0);
                        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresar peso en kg"));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresar altura en metros"));

                        //Se instancian los objetos de la clase Persona, utilizando diferentes constructores
                        Persona persona1 = new Persona(nombre, edad, ch, peso, altura);
                        Persona persona2 = new Persona(nombre, edad, ch);
                        Persona persona3 = new Persona();
                        persona3.setNombre("Carolina");
                        persona3.setEdad(25);
                        persona3.setSexo('F');
                        persona3.setPeso(65);
                        persona3.setAltura(1.68);

                        //Se muestra la informacion de cada objeto al usuario por pantalla, utilizando el metodo toString
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

                        //Se crea un array de tipo Electrodomestico de 10 posiciones, en el cual se almacenaran los objetos de la clase
                        //Electrodomestico, y sus clases hijas Lavadora y Television
                        Electrodomestico array[] = new Electrodomestico[10];

                        //Se instancian los objetos utilizando diferentes constructores
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

                        int instanciasElectrodomesticos = 0;      //Contador para saber cuantos objetos Electrodomestico existen
                        double precioTotalElectrodomesticos = 0;  //Se sumara todos los precios de los electrodomesticos
                        int instanciasLavadoras = 0;              //Contador para saber cuantos objetos Lavadora existen
                        double precioTotalLavadoras = 0;          // Se sumara todos los precios de las lavadoras
                        int instanciasTelevision = 0;             //Contador para saber cuantos objetos Television existen
                        double precioTotalTelevision = 0;         // Se sumara todos los precios de television

                        for (int i = 0; i < array.length; i++) {

                            if (array[i] instanceof Electrodomestico) {  //con instanceof sabemos a que clase apunta el objeto
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
                        //Se le meustra al usuario todos los objetos instanciados (Todos los electrodomesticos)
                        JOptionPane.showMessageDialog(null, "Los objetos instanciados fueron los siguientes\n" +
                                array[0] + "\n\n" + array[1] + "\n\n" + array[2] + "\n\n" + array[3] + "\n\n" + array[4] + "\n\n" + array[5] +
                                "\n\n" + array[6] + "\n\n" + array[7] + "\n\n" + array[8] + "\n\n" + array[9]
                        );
                        //Se le meustra el informe final por pantalla al usuario
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

                    case 18:
                        JOptionPane.showMessageDialog(null, "Este programa consta de dos clases, una llamda Serie y otra " +
                                " Videojuego. y tambien una interfaz llamada entregable, con al cual se implemtaran algunos metodos compartidos  " +
                                "impares que hay en el rango del 1 al 100");

                        //Se crea un array de tipo Serie, en el cual se instanciaran 5 objetos con diferentes constructores
                        Serie series[] = new Serie[5];
                        series[0] = new Serie("La casa de papel", 5, "suspenso", "Alberto Salas");
                        series[1] = new Serie("La casa de papel", "Alberto Salas");
                        series[2] = new Serie("Resident evil", 2, "terror", "Jose Carmon");
                        series[3] = new Serie("Elite", 4, "Aventura", "David Posada");
                        series[4] = new Serie();
                        //Estos set son para el constructor vacio
                        series[4].setTitulo("Quien mato a sara");
                        series[4].setNumeroTemporadas(2);
                        series[4].setGenero("Suspenso");
                        series[4].setCreador("Santiago Arenas");

                        //Se crea un array de tipo Videojeugo, en el cual se instanciaran 5 objetos con diferentes constructores
                        Videojuego videojuegos[] = new Videojuego[5];
                        videojuegos[0] = new Videojuego("Fifa 22", 8, "Futbol", "EA Sports");
                        videojuegos[1] = new Videojuego("Call of duty", 15, "Shooter", "Activision");
                        videojuegos[2] = new Videojuego("Hallo", 20);
                        videojuegos[3] = new Videojuego("Forza horizon", 18, "Carros", "Playground Games");
                        videojuegos[4] = new Videojuego("Resident evil", 6);


                        //Se recorre el array series y asi poder saber la seria con mas temporadas
                        int serieMayorDuracion = 0;
                        for (Serie s : series) {
                            if (s.getNumeroTemporadas() > serieMayorDuracion) {
                                serieMayorDuracion = s.getNumeroTemporadas();
                            }
                            //Algunos objetos se les aplica el metodo entregar y este pasa a true
                            if (s.getTitulo() == "La casa de papel" || s.getTitulo() == "Resident evil") {
                                s.entregar();
                            }
                        }
                        //Se recorre el array videojuego y asi poder saber el videojuego con mas horas estimadas
                        int videojuegoMayorDuracion = 0;
                        for (Videojuego v : videojuegos) {
                            if (v.getHorasEstimadas() > videojuegoMayorDuracion) {
                                videojuegoMayorDuracion = v.getHorasEstimadas();
                            }
                            //Algunos objetos se les aplica el metodo entregar y este pasa a true
                            if (v.getTitulo() == "Hallo" || v.getTitulo() == "Fifa 22") {
                                v.entregar();
                            }
                        }
                        //se crea un ArrayList de tipo String, en el cual se guardara la informacion de la serie mas vista
                        //y el videojuego mas visto
                        ArrayList<String> objetosVistos = new ArrayList<String>();
                        for (Serie s : series) {
                            if (s.getNumeroTemporadas() == serieMayorDuracion) {
                                objetosVistos.add(s.toString());
                            }
                        }
                        for (Videojuego v : videojuegos) {
                            if (v.getHorasEstimadas() == videojuegoMayorDuracion) {
                                objetosVistos.add(v.toString());
                            }
                        }

                        //Se crea un arraylist de tipo Serie, en la cual se van a ir agregando las series que estan entregadas
                        ArrayList<Serie> seriesDevolver = new ArrayList();
                        for (Serie s : series) {
                            if (s.isEntregado()) {
                                seriesDevolver.add(s);
                            }
                        }
                        //Se crea un arraylist de tipo Videojuegos, en la cual se van a ir agregando los videojuegos que estan entregados
                        ArrayList<Videojuego> videojuegosDevolver = new ArrayList();
                        for (Videojuego v : videojuegos) {
                            if (v.isEntregado()) {
                                System.out.println(v.isEntregado());
                                videojuegosDevolver.add(v);
                            }
                        }
                        //Se crea una variable de tipo String vacia, en la cual se iran concatenando los objetos de la clase Videojuego
                        // que estan entregados, en true
                        String cadenaVacia = "";
                        for (int i = 0; i < videojuegosDevolver.size(); i++) {
                            cadenaVacia += "\nVideojuego " + (i + 1) + "\n" + videojuegosDevolver.get(i).toString() + "\n";

                        }
                        //Se crea una variable de tipo String vacia, en la cual se iran concatenando los objetos de la clase Serie
                        // que estan entregados, en true
                        String cadenaVacia2 = "";
                        for (int i = 0; i < seriesDevolver.size(); i++) {
                            cadenaVacia2 += "\nVideojuego " + (i + 1) + "\n" + seriesDevolver.get(i).toString() + "\n";

                        }
                        //Se le muestra al usuario el total de los videojuegos y series entregados
                        JOptionPane.showMessageDialog(null, "Total de videojuegos y series entregados" +
                                "\nVidejuegos entregados: " + videojuegosDevolver.size() + "\n" +
                                cadenaVacia + "\n" +
                                "\nSeries entregadas: " + seriesDevolver.size() + "\n" +
                                cadenaVacia2
                        );

                        //Se le meustra al usuario el videojeugo con mayor horas estimadas y la serie con mas temporadas
                        JOptionPane.showMessageDialog(null, "Series y Videojuegos con mas temporadas y " +
                                "horas estimadas respectivamente" +
                                "\n\nSerie con mayor numero de temporadas: \n" + objetosVistos.get(0) + "\n" +
                                "\nVideojuego con mayor numero de horas estimadas: \n" + objetosVistos.get(1) + "\n"
                        );
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null, "HASTA PRONTO");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                        break;
                }
                //Todo el menu esta en un try, ya que si hay algun error, saltara a esta excepcion y el programa seguira funcionando
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "SOLO SE ADMITEN NUMEROS");
                opcion = 1;
            }
        } while (opcion != 0);
        System.exit(0);
    }
}
