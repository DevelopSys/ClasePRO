import controller.TiendaController;
import repository.ProductCRUDRepository;

public class Entrada {

    public static void main(String[] args) {
        //ProductCRUDRepository productCRUDRepository = new ProductCRUDRepository();
        //productCRUDRepository.importarProductos();
        TiendaController controller = new TiendaController();
        //controller.registrarUsuario("borja@gmail.com","123123");
        controller.iniciarSesion("borja@gmail.com","123123");
        controller.realizarCompra(64);

    }
}
