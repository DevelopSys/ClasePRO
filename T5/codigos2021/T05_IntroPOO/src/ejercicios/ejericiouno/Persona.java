package ejercicios.ejericiouno;

import java.util.Scanner;

public class Persona {

    // variables
    // nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;


    // constructores

    /* un constructor que permita crear una persona con todos los datos
        un constructor que permita crear una persona sin peso ni altura
        un constructor que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
        un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a "datos por defecto", 1111111111X y 0 respectivamente
    * */

    public Persona(){
        this.nombre = "datos por defecto";
        this.apellido = "datos por defecto";
        this.dni = "1111111111X";
        /*this.edad = 0;
        this.altura = 0;
        this.peso = 0.0;*/
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "1111111111X";
        /*this.edad = 0;
        this.altura = 0;
        this.peso = 0.0;*/
    }

    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        /*this.peso = 0;
        this.altura = 0;*/
    }

    public Persona (String nombre, String apellido, String dni, int edad, double peso, int altura){
        this.peso = peso;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
        this.altura = altura;
        this.nombre = nombre;
    }


    // metodos


    public void mostrarDatos(){
        System.out.printf("Nombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
        System.out.printf("Dni: %s%n",dni);
        System.out.printf("Edad: %d%n",edad);
        System.out.printf("Altura: %d%n",altura);
        System.out.printf("Peso: %.2f%n",peso);
    }
    public void agregarEdad(int edadIncremento){

        this.edad += edadIncremento;
    }


    // IMC = peso / (altura * altura)

    public double calcularIMC(){

        //178 --> 1,78

        // 70,00 /  (double) (180/100) -> 1,80 1,00


        // (double) (int/int) --> 180/100 --> 1,80 --> 1,00
        // ((double)int / (double) int) --> 180 / 100 --> 180,00 / 100,00 --> 1,80



        double imc = this.peso / (((double)this.altura/(double)100 )* ((double)this.altura/(double)100));
        //System.out.printf("El IMC es: %.2f%n",imc);
        //Math.pow(this.altura,2);

        return imc;

    }


    // getter
    public String getNombre() {
        return this.nombre;
    }
    public double getPeso() {
        return peso;
    }
    public int getAltura() {
        return altura;
    }
    public int getEdad() {
        return edad;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }

    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}

