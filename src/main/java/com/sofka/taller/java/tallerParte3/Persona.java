package com.sofka.taller.java.tallerParte3;

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
    public Persona() {

        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
        comprobarSexo();
        generarDNI();
    }
    public Persona(String nombre, int edad, char sexo) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();
        generarDNI();
    }
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
    public boolean esMayorDeEdad() {

        boolean mayor = false;
        if (this.edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    private void comprobarSexo() {

        if (this.sexo != 'H' && this.sexo != 'M') {
            this.sexo = 'H';
        }
    }
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
    public String muestraMensajeMyorEdad() {

        String mensajeMayorEdad = "";
        if (esMayorDeEdad())
            mensajeMayorEdad = "La persona si es mayor de edad";
        else
            mensajeMayorEdad = "la persona no es mayor de edad";
        return mensajeMayorEdad;
    }
    public void generarDNI() {

        int numero = (int) (100000000 * Math.random());
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        String numeroDNI = String.valueOf(numero);
        int modulo = numero % 23;
        char letra = juegoCaracteres.charAt(modulo);
        this.dni = letra + numeroDNI;
    }
}




