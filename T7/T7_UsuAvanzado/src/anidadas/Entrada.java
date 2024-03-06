package anidadas;

import anidadas.model.ClaseExterna;

public class Entrada {

    public static void main(String[] args) {

        ClaseExterna claseExterna = new ClaseExterna("Dato externo", 10);
        ClaseExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna("Dato interno"
                , 20, claseExterna);
        //claseExterna.setClaseInterna(claseInterna);
        claseExterna.metodo();

        //claseInterna.metodo();

        //claseExterna.mostrarDatos();
        // claseInterna.algo();

        // desde la clase interna ejecutar el método mostrar datos de la clase externa


    }


}
