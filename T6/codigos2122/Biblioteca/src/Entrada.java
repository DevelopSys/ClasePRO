public class Entrada {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        Libro libro5 = new Libro();
        Libro libro6 = new Libro();
        DVD dvd1 = new DVD();
        DVD dvd2 = new DVD();
        DVD dvd3 = new DVD();
        DVD dvd4 = new DVD();
        Socio socio1 = new Socio("asd","asd","asd");
        Socio socio2 = new Socio("asd","asd","asd");
        Socio socio3 = new Socio("asd","asd","asd");
        Socio socio4 = new Socio("asd","asd","asd");
        Trabajador trabajador = new Trabajador();
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addPersona(socio1);
        biblioteca.addPersona(socio2);
        biblioteca.addPersona(socio3);
        biblioteca.addPersona(socio4);
        biblioteca.addPersona(trabajador);

        //biblioteca.listarPersonas();
        biblioteca.addAlquilable(libro1);
        biblioteca.addAlquilable(libro2);
        biblioteca.addAlquilable(libro3);
        biblioteca.addAlquilable(libro4);
        biblioteca.addAlquilable(libro5);
        biblioteca.addAlquilable(libro6);

        biblioteca.realizarPrestamo(((Socio)biblioteca.getListaPersonas().get(0)),
                (Prestable)biblioteca.getListaElementos().get(0));
        //biblioteca.realizarPrestamo(socio1, libro1);
        /*biblioteca.realizarDevolucion(((Socio)biblioteca.getListaPersonas().get(0)),
                (Prestable)biblioteca.getListaElementos().get(0));
        biblioteca.realizarDevolucion(socio1, libro1);*/
        biblioteca.listarPersonas();

        //socio.getListaPrestamos().add(dvd);
        //socio.getListaPrestamos().add(libro);
    }
}
