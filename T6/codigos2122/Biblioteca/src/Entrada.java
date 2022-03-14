public class Entrada {

    public static void main(String[] args) {
        Libro libro = new Libro();
        DVD dvd = new DVD();
        Socio socio = new Socio("asd","asd","asd",1);
        Trabajador trabajador = new Trabajador();
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addPersona(socio);
        biblioteca.addPersona(trabajador);

        //socio.getListaPrestamos().add(dvd);
        //socio.getListaPrestamos().add(libro);
    }
}
