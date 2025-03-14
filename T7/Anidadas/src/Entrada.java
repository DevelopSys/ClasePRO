import model.ClasePadre;

public class Entrada {

    public static void main(String[] args) {
        ClasePadre clasePadre = new ClasePadre("Borja","Martin",40,"correo@gmail.com");


        /*
        sout(Todos los datos del padre)
        // solo sale esto si tengo hija, sino no sale nada
        sout("Tengo una hija con los siguientes dato")
        sout("Los datos de la clase hija")
         */
        ClasePadre.ClaseHija claseHija = clasePadre.new ClaseHija("Celia","Martin",10,"celia@gmail.com");
        // clasePadre.setClaseHija(claseHija);
        clasePadre.mostrarDatos();
        // claseHija.mostrarDatos();
    }
}
