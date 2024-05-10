package controller;

import repository.ClienteCRUDRepository;
import repository.ProductCRUDRepository;

public class TiendaController {

    private ProductCRUDRepository productCRUDRepository;
    private ClienteCRUDRepository clienteCRUDRepository;

    public TiendaController() {
        productCRUDRepository = new ProductCRUDRepository();
        clienteCRUDRepository = new ClienteCRUDRepository();


        // productCRUDRepository.getProductoId();
    }

    public void registrarUsuario(String correo, String pass) {

        if (!clienteCRUDRepository.obtenerClienteCorreo(correo)) {
            clienteCRUDRepository.insertarCliente(correo, pass);
            System.out.println("Cliente insertado con exito");
        } else {
            System.out.println("El cliente ya existe en DB, no se puede insertar");
        }

    }
}
