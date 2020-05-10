package github.internas;

public class Entrada {

    public static void main(String[] args) {


        ClaseExternaExt.ClaseInternaExt claseInternaExt = new ClaseExternaExt.ClaseInternaExt(1,"dato interno");
        claseInternaExt.mostrarDatoInterno();

        //ClaseExterna claseExterna = new ClaseExterna("dato externo",1);
        //claseExterna.mostrarDatos();

        // Error


        //ClaseExterna.ClaseInterna claseInterna =  claseExterna.new ClaseInterna(1,"dato interno");
        //claseInterna.mostrarDatosInternos();



        /*ClaseC claseC = new ClaseC();
        claseC.registrarMensajeElemento(new ClaseA() {
            @Override
            public void mostrarMensajeAbstracto() {
                System.out.println("mensaje lanzado desde la clase main");
            }
        });*/

        /*Mensajes mensajes = new Mensajes();
        String m = "Mensaje ejemplo para Lanzarlo desde CLASE anónima";
        mensajes.lanzarMensajes(new InterfazMensajes() {
            @Override
            public void lanzarMensajeMinusculas() {
                System.out.println(m.toLowerCase());
            }
            @Override
            public void lanzarMensajeMayusculas() {
                System.out.println(m.toUpperCase());
            }
        });*/
    }
}
