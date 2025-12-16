import model.Libro;
import model.Prestamo;
import model.Socio;

public class Entrada {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("BiblioCES");
        Socio socio1 = new Socio("12345A", "Borja", 1234);
        Socio socio2 = new Socio("23456A", "Luis", 2345);
        Libro libro1 = new Libro("Titulo1", "Autor1", 1);
        Libro libro2 = new Libro("Titulo2", "Autor1", 2);
        Libro libro3 = new Libro("Titulo3", "Autor1", 3);
        Libro libro$ = new Libro("Titulo4", "Autor1", 4);
        Prestamo prestamo1 = new Prestamo(socio1, libro1, 10);
        Prestamo prestamo2 = new Prestamo(socio2, libro2, 20);
        // Prestamo prestamo3 = new Prestamo(socio1,libro1,10);
        biblioteca.agregarPrestamo(prestamo1);
        biblioteca.finalizarPrestamo("12345A", 10);
        biblioteca.finalizarPrestamo("23456A", 5);
        biblioteca.listarPrestamos();
        System.out.println("La caja de la biblioteca es de " + biblioteca.getCaja());
    }
}
