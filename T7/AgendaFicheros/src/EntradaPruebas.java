import controller.GestorFicheros;
import model.Contacto;

public class EntradaPruebas {

    public static void main(String[] args) {
        GestorFicheros gestorFicheros = new GestorFicheros();
        gestorFicheros.escribirContacto(new Contacto("Borja","Martin","1234A"));
    }
}
