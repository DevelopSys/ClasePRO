package ejercicios.ejercicioPuntos;


import java.awt.*;

public class Entrada {

    public static void main(String[] args) {

        //Point punto = new Point();
        //Point punto = new Point(new Point(1,5));
        /*Point punto = new Point(1,1);
        System.out.println("Punto creado");
        System.out.println(punto.getX());
        System.out.println(punto.getY());


        System.out.println("Punto localizado");
        punto.setLocation(4.4,5.9);
        System.out.println(punto.getX());
        System.out.println(punto.getY());

        System.out.println("Punto localizado con int");
        punto.setLocation(2,3);
        // llama al metodo move
        System.out.println(punto.getX());
        System.out.println(punto.getY());

        System.out.println("Punto movido con int");
        punto.move(2,3);
        System.out.println(punto.getX());
        System.out.println(punto.getY());

        System.out.println("Punto transaladado");
        punto.translate(1,5);
        System.out.println(punto.getX());
        System.out.println(punto.getY());

        // X=1  y=5
        // translado 5 posiciones en cada coordenada
        // X=1+5  y=5+5*/

        //Punto3D punto3D = new Punto3D();
        Punto3D punto3D = new Punto3D(4,4,3);
        //Punto3D punto3D = new Punto3D(new Point(3,4),5);
        punto3D.translate(1,1,1);
        System.out.println(punto3D.getX());
        System.out.println(punto3D.getY());
        System.out.println(punto3D.getZ());

        //Punto4D punto4D = new Punto4D(1,2,3,4);
        Punto4D punto4D = new Punto4D(new Punto3D(1,2,3),1);


    }
}
