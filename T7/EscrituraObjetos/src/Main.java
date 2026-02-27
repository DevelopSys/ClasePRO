import controller.Gestor;
import model.Usuario;

public class Main {

    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        // gestor.escribirObjeto(new Usuario("Borja","Martin","1234A"));
        gestor.leerObjeto();
    }
}
