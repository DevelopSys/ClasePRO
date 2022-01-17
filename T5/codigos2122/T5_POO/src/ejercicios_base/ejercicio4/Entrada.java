package ejercicios_base.ejercicio4;

import ejercicios_base.ejercicio1.Persona;

public class Entrada {


    public static void main(String[] args) {
        Persona persona = new Persona("Borja","Martin");
        Persona persona1 = new Persona("Otra","Persona");
        persona.setEdad(20);
        persona.setPeso(70);
        persona.setAltura(180);
        //persona.incrementarEdad(10);
        System.out.println(persona.estadoIMC());


        persona1.setEdad(40);
        persona1.setAltura(190);
        persona1.setPeso(150);
        System.out.println(persona1.estadoIMC());

    }
}
