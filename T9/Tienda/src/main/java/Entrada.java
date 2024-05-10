import repository.ProductCRUDRepository;

public class Entrada {

    public static void main(String[] args) {
        ProductCRUDRepository productCRUDRepository = new ProductCRUDRepository();
        productCRUDRepository.importarProductos();
    }
}
