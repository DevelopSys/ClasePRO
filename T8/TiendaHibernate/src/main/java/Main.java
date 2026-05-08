import controller.TiendaController;
import model.User;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gestor TIENDA");
        TiendaController controller = new TiendaController();
        // controller.signInUser(new User("Borja1","Martin1","borja1@gmail.com","234234"));
        // controller.loginUser(2);
        // controller.findUsers("Borja");
        controller.updateUser("Borja1", "Lopez","nuevo@gmail.com");
    }

    // cuando la aplicacion inicie llevar
    // a base de datos los productos consultados del JSON
    // solo quiero llevar nombre, descripcion, categoria, precio, stock
    // los productos se consultan desde dummypoducts
}
