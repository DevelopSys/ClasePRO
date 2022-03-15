import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Entrada {

    public static void main(String[] args) {
        ClaseC claseC = new ClaseC();
        ClaseB claseB = new ClaseB();
        ClaseA claseA = new ClaseA() {

            @Override
            public void mostrarMensaje() {
                System.out.println("Comportamiento diferente");
            }

            @Override
            public void mensajeAbstracto() {
                System.out.println("El mensaje abs de la clase A");
            }
        };
        ClaseA claseA1 = new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("Mensaje abs diferente");
            }
        };
        claseC.registrarMensaje(claseA);
        claseC.registrarMensaje(claseA1);
        claseC.registrarMensaje(new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("Mensaje desde una anonima 100%");
            }
        });
        claseC.registrarMensaje(new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("Mensaje desde una anonima 100% de forma diferente");
            }
        });
        claseC.registrarMensaje(claseA);
        claseC.modificarMensaje("Este es el mensaje que quiero modificar", new Modicables() {
            @Override
            public void lanzarMayusculas(String s) {
                System.out.println(s.toUpperCase());
            }

            @Override
            public void lanzarMinisculas(String s) {
                System.out.println(s.toLowerCase());
            }
        });
        claseC.modificarMensaje("Hola que tal", new Modicables() {
            @Override
            public void lanzarMayusculas(String s) {
                System.out.println(s.split(" ")[0].toUpperCase());
            }

            @Override
            public void lanzarMinisculas(String s) {
                System.out.println(s.split(" ")[0].toLowerCase());
            }
        });
    }
}
