package base;

import base.model.Persona;

public class Entrada {


    public static void main(String[] args) {
        Persona p =
                new Persona("Borja","Martin","123123X",40,170,70,'H');
        p.mostraDatos();
        //System.out.println(p.calcularIMC());
        double imc = p.calcularIMC();
        if (p.getGenero() == 'H'){
            if (imc<18.5){
                System.out.println("peso por debajo");
            } else if (imc>=18.5 && imc<25){
                System.out.println("Peso normal");
            } else if (imc>=25 && imc<30) {
                System.out.println("Por encima de lo normal");
            } else {
                System.out.println("sobrepeso");
            }
        } else if (p.getGenero() == 'F'){
            if (imc<18.5){
                System.out.println("peso por debajo");
            } else if (imc>=18.5 && imc<25){
                System.out.println("Peso normal");
            } else if (imc>=25 && imc<30) {
                System.out.println("Por encima de lo normal");
            } else {
                System.out.println("sobrepeso");
            }
        }

    }
}
