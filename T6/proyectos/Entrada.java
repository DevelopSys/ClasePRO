package correccion_enum;

public class Entrada {

    public static void main(String[] args) {


        Trabajador trabajador = new Trabajador("Nombre","Apellido","asdasd");
        Socio socio1 = new Socio("Socio1","Apellido","asdasd",123);
        Socio socio2 = new Socio("Socio2","Apellido","asdasd",234);
        Libro libro1 = new Libro(1, 123, "Libro1", "TituloLibro", "AutorLibro", 123, "EditorialLibro", false);
        CD cd1 = new CD(5, 567, "CD1", "CDTitulo", "AutorCD", TipoCD.Musica, false);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);
        biblioteca.agregarTrabajador(trabajador);
        biblioteca.agregarPrestable(libro1);
        biblioteca.agregarPrestable(cd1);
        System.out.println("Los elementos disponibles son");
        biblioteca.listarDisponibeles();
        biblioteca.realizarPrestamo(socio1,libro1);
        System.out.println("Los elementos disponibles despues de realizar un prestamos son");
        biblioteca.listarDisponibeles();
        System.out.println("Los elementos disponibles despues de realizar una devolución son");
        biblioteca.devolverPrestamo(socio1,libro1);
        biblioteca.listarDisponibeles();

    }
}
