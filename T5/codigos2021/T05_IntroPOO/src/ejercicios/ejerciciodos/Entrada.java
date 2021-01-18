package ejercicios.ejerciciodos;

import ejercicios.ejericiouno.Persona;
import explicaciones.Coche;

import java.util.Scanner;

public class Entrada {

    static Scanner teclado;

    public static void main(String[] args) {

        Persona p1, p2, p3, p4;


        teclado = new Scanner(System.in);
        String nombre, apellido, dni;
        double peso;
        int edad, altura;
        int contador = 1;



        System.out.println("Introduce nombre:");
        nombre = teclado.next();
        System.out.println("Introduce apellido:");
        apellido = teclado.next();
        System.out.println("Introduce dni:");
        dni = teclado.next();
        System.out.println("Introduce edad:");
        edad = teclado.nextInt();
        System.out.println("Introduce peso:");
        peso = teclado.nextDouble();
        System.out.println("Introduce altura:");
        altura = teclado.nextInt();

        p1 = new Persona(nombre, apellido, dni, edad, peso, altura);

        //p2 = new Persona("Borja", "Martin");
        //p3 = new Persona();

        /*System.out.println("Introduce nombre:");
        nombre = teclado.next();
        System.out.println("Introduce apellido:");
        apellido = teclado.next();
        System.out.println("Introduce dni:");
        dni = teclado.next();
        System.out.println("Introduce edad:");
        edad = teclado.nextInt();
        System.out.println("Introduce peso:");
        peso = teclado.nextDouble();
        System.out.println("Introduce altura:");
        altura = teclado.nextInt();
        p4 = new Persona(nombre, apellido, dni, edad, peso, altura);*/

        //p1.mostrarDatos(); // --> si es void no tengo nada
        //p2.mostrarDatos(); // --> si es void no tengo nada
        //p3.mostrarDatos(); // --> si es void no tengo nada

        /*System.out.println("Cuantos años quiere incrementar");
        int edadAdd = teclado.nextInt();
        p1.agregarEdad(edadAdd);
        System.out.printf("El IMC es: %.2f%n",p1.calcularIMC());
        p1.calcularIMC(); // --> EL IMC DE P1: 21,60
        p2.calcularIMC(); // --> EL IMC DE p2: 30,70*/


        /*if (p1.calcularIMC() > p4.calcularIMC()){
            System.out.printf("El estado de %s es más saludable que el estado de %s",p4.getNombre(), p1.getNombre());
        } else {
            System.out.printf("El estado de %s es más saludable que el estado de %s",p1.getNombre(), p4.getNombre());
        }*/


        double IMCp1 = p1.calcularIMC();
        if (IMCp1<18.5){
            System.out.println("Peso inferior al normal");
        } else if(IMCp1>18.5 && IMCp1<24.9){
            System.out.println("normal");
        } else if(IMCp1>25.0 && IMCp1<29.0){
            System.out.println("por encima");
        } else {
            System.out.println("sobrepeso");
        }

        /*
        * - Peso inferior al normal		Menos de 18.5
        - Normal		18.5 – 24.9
        - Peso superior al normal		25.0 – 29.9
        - Obesidad		Más de 30.0
        * */

        // crear dos personas pedidas por teclado: (Borja)90 160 (Pepe)70 180
        // if ( comparo IMC )
        // La salud de Pepe es más saludable que la salud de Borja



        // cuando es VOID
        /*
        *  double imc = this.peso / (this.altura * this.altura);
            System.out.printf("El IMC es: %.2f%n",imc);
        * */

        // cuando es double
        // imc --> su valor



        //p2.agregarEdad(edadAdd);

        //p1.mostrarDatos();
        //p2.mostrarDatos();

        /*p1.setEdad(20);
        p2.setEdad(25);
        p3.setEdad(30);

        p1.mostrarDatos(); // --> si es void no tengo nada
        p2.mostrarDatos(); // --> si es void no tengo nada
        p3.mostrarDatos(); // --> si es void no tengo nada
        /*
        * System.out.printf("Nombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
        System.out.printf("Dni: %s%n",dni);
        System.out.printf("Edad: %d%n",edad);
        System.out.printf("Altura: %d%n",altura);
        System.out.printf("Peso: %.2f%n",peso);
        * */


    }
}
