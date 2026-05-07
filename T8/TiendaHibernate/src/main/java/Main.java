import controller.TiendaController;
import model.User;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gestor TIENDA");
        TiendaController controller = new TiendaController();
        controller.signInUser(new User("Borja1","Martin1","borja1@gmail.com","234234"));
    }
}
