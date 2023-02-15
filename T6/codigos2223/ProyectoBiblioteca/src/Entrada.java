import constantes.EnumCD;
import constantes.EnumDVD;
import constantes.TiposCD;
import model.*;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarPersona(new Socio("Borja1","Martin","123A"));
        biblioteca.registrarPersona(new Socio("Borja2","Martin","123A"));
        biblioteca.registrarPersona(new Trabajador("Borja","Martin","123A"));
        biblioteca.registrarPersona(new Socio("Borja3","Martin","123A"));
        biblioteca.registrarPersona(new Socio("Borja4","Martin","123A"));
        biblioteca.registrarPersona(new Socio("Borja5","Martin","123A"));
        biblioteca.registrarPersona(new Trabajador("Borja","Martin","123A"));
        biblioteca.registrarPersona(new Socio("Borja6","Martin","123A"));
        biblioteca.darBajaSocio(4);
        biblioteca.darBajaSocio(6);
        biblioteca.registrarPersona(new Socio("Borja7","Martin","123A"));
        biblioteca.listarUsuarios();


        // int id, int seccion, String titulo, int anio, EnumCD tipo
        biblioteca.registrarElemento(new CD(1,1,"CD1",123, EnumCD.Educativo));
        biblioteca.registrarElemento(new CD(2,1,"CD2",123, EnumCD.Musical));
        // int id, int seccion, String titulo, int anioEdicion, String director, ArrayList<String> actores, EnumDVD tipo
        biblioteca.registrarElemento(new DVD(3,1,"DVD1",123, "Director1", new ArrayList<>(),EnumDVD.musical));
        biblioteca.registrarElemento(new DVD(4,1,"DVD2",123, "Director2", new ArrayList<>(),EnumDVD.terror));
        biblioteca.registrarElemento(new Libro(5,1,"Libro1","","Autor1","Editoria1",123));
        biblioteca.registrarElemento(new Libro(6,1,"Libro2","","Autor2","Editoria2",123));

        biblioteca.listarElementos();


        //System.out.println("El número de socios que tiene la biblioteca es de "+ biblioteca.getNumeroSocios());


    }
}
