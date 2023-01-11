package ejercicio1;


import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        String nombre, apellido, dni;
        int altura, edad;
        double peso;

        ArrayList<Persona> listaPersonas = new ArrayList<>();


        System.out.println("Introduce nombre");
        nombre = lecturaTeclado.next();
        System.out.println("Introduce apellido");
        apellido = lecturaTeclado.next();
        System.out.println("Introduce dni");
        dni = lecturaTeclado.next();
        System.out.println("Introduce edad");
        edad = lecturaTeclado.nextInt();
        System.out.println("Introduce altura");
        altura = lecturaTeclado.nextInt();
        System.out.println("Introduce peso");
        peso = lecturaTeclado.nextDouble();

        Persona persona1 = new Persona(nombre, apellido, dni, edad, peso, altura);
        Persona persona2 = new Persona("Borja", "Martin");
        Persona persona3 = new Persona();


        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        for ( Persona item : listaPersonas) {
            item.setEdad(20);
            item.mostrarDatos();
        }


        /*if (persona1.getImc()<25.0){

        } else if (persona1.getImc()>=25.0 && persona1.getImc()<30.0){

        } else {

        }*/
    }
}
