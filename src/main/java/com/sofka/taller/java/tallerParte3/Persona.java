package com.sofka.taller.java.tallerParte3;

/**
 * Ejercicio 16 del taller de evaluacion java
 * Clase en donde estaran todos los atributos y comportamientos de tipo Persona, para calular su IMC
 *
 * @author JULIAN CAMILO MESA
 */
public class Persona {
    public static final int PESO_IDEAL = 0;
    public static final int SOBRE_PESO = 1;
    public static final int INFRA_PESO = -1;
    private static final char SEXO_DEF = 'H';

    private String nombre;
    private int edad;
    private String dni;   // sera aleatorio
    private char sexo;
    private double peso;
    private double altura;

    /**
     * Metodo constructor por defecto
     * Inicializa algunas variables con valores por defecto
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
        comprobarSexo();
        generarDNI();
    }

    /**
     * Metodo constructor con dos argumentos y el resto por defecto
     *
     * @param nombre
     * @param edad
     * @param sexo
     */
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();
        generarDNI();
    }

    /**
     * Metodo constructor con dos argumentos
     *
     * @param nombre
     * @param edad
     * @param sexo
     * @param peso
     * @param altura
     */
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo();
        generarDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Datos de la persona"
                + "\nNombre                      :" + nombre
                + "\nEdad                            :" + edad
                + "\nDNI                               :" + dni
                + "\nSexo                            :" + sexo
                + "\nPeso                            :" + peso + " kg"
                + "\nAltura                          :" + altura + " m"
                + "\nAnalisis de peso      :" + muestraMensajePeso()
                + "\nAnalisis de edad      :" + muestraMensajeMyorEdad();
    }

    /**
     * Metodo para determinar el IMC de una persona
     *
     * @return IMC : se retorna el valor del imc
     */
    public int calcularIMC() {
        double pesoActual = this.peso / Math.pow(this.altura, 2);
        if (pesoActual < 20) {
            return Persona.INFRA_PESO;
        } else if (pesoActual <= 25) {
            return Persona.PESO_IDEAL;
        } else {
            return Persona.SOBRE_PESO;
        }
    }

    /**
     * Metodo para saber si la persona es mayor de edad
     *
     * @return boolean : true o false de acuerdo al resultado
     */
    public boolean esMayorDeEdad() {

        boolean mayor = false;
        if (this.edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    /**
     * Metodo para determinar si el sexo ingresado por el usuario es 'H' o 'M'. De lo contrario se asignara el valor por defecto
     */
    private void comprobarSexo() {

        if (this.sexo != 'H' && this.sexo != 'M') {
            this.sexo = 'H';
        }
    }

    /**
     * Este metodo muestra al usuario, por medio de un mensaje en que estado esta de peso , de acuerdo al IMC
     *
     * @return String : Mensaje de resultado
     */
    public String muestraMensajePeso() {
        String mensajePeso = "";
        if (this.peso == 0 && this.altura == 0) {
            mensajePeso = "Sin estatura y sin peso no es posible calcular el IMC";
        } else {
            int IMC = calcularIMC();

            switch (IMC) {

                case Persona.PESO_IDEAL:
                    mensajePeso = "La persona esta en su peso ideal";
                    break;

                case Persona.INFRA_PESO:
                    mensajePeso = "La persona esta por debajo de su peso ideal";
                    break;

                case Persona.SOBRE_PESO:
                    mensajePeso = "La persona esta en sobrepeso";
                    break;
            }
        }
        return mensajePeso;
    }

    /**
     * Metodo para determinar si una persona es mayor de edad
     *
     * @return String : mesnaje de mayor o no
     */
    public String muestraMensajeMyorEdad() {
        String mensajeMayorEdad = "";
        if (esMayorDeEdad())
            mensajeMayorEdad = "La persona si es mayor de edad";
        else
            mensajeMayorEdad = "la persona no es mayor de edad";
        return mensajeMayorEdad;
    }

    /**
     * Metodo para proporcionar un DNI aleatorio a una persona
     */
    public void generarDNI() {
        int numero = (int) (100000000 * Math.random());      //Se escoge un numero aleatorio, de esta cantidad de digitos
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";  //Se crea una cadena de caracteres para poder sacar el dni
        String numeroDNI = String.valueOf(numero);           //Se pasa el numero aleatorio a String
        int modulo = numero % 23;                            //Para sacar el dni , se debe dividir el numero aleatorio /23 y el sobrante
        //se analiza que posicion es de la cadena de caracteres, este sera la letra para el dni
        char letra = juegoCaracteres.charAt(modulo);
        this.dni = letra + numeroDNI;                        //Se concatena el numero dni convertido a string con la letra
    }
}




