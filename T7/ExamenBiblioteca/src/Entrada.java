import model.*;
import utils.Tipo;

public class Entrada {
    public static void main(String[] args) {

        Biblioteca<LibroComedia> biblioteca = new Biblioteca();
        biblioteca.construirCatalogo(4);
        biblioteca.comprarLibro(new LibroComedia(1234,200,"Autor1","Infantil"));
        biblioteca.comprarLibro(new LibroComedia(1235,200,"Autor2","Infantil"));
        biblioteca.comprarLibro(new LibroComedia(1236,200,"Autor3","Infantil"));
        biblioteca.comprarLibro(new LibroComedia(1237,200,"Autor4","Infantil"));
        biblioteca.comprarLibro(new LibroComedia(1238,200,"Autor4","Infantil"));
        biblioteca.construirCatalogo(6);
        biblioteca.listarLibros();

        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.construirCatalogo(5);
        biblioteca1.comprarLibro(new LibroComedia(1238,200,"Autor4","Infantil"));
        biblioteca1.comprarLibro(new LibroPolicia(1238,200,"Autor4","asdasdasd asdasdasd", Tipo.intriga));
        biblioteca1.comprarLibro(new LibroTerror(1238,200,"Autor4",18));
        biblioteca1.comprarLibro(new LibroTerror(1238,200,"Autor4",18));



    }
}
