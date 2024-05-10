package controller;

import repository.ClienteCRUDRepository;
import repository.PedidoCRUDRepository;
import repository.ProductCRUDRepository;

public class TiendaController {

    private ProductCRUDRepository productCRUDRepository;
    private ClienteCRUDRepository clienteCRUDRepository;
    private PedidoCRUDRepository pedidoCRUDRepository;
    private int idUsuario = -1;

    public TiendaController() {
        productCRUDRepository = new ProductCRUDRepository();
        clienteCRUDRepository = new ClienteCRUDRepository();
        pedidoCRUDRepository = new PedidoCRUDRepository();


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

    public void iniciarSesion(String correo, String pass){
        idUsuario = clienteCRUDRepository.obtenerIdUsuario(correo,pass);
        if (idUsuario!=-1){
            System.out.println("Sesion iniciada correctamente");
        } else {
            System.out.println("Fallo en el inicio de sesion");
        }
    }

    public void realizarCompra(int idProducto){

        System.out.println(idUsuario);
        if (idUsuario !=-1){
            pedidoCRUDRepository.comprarProducto(idProducto,idUsuario);
        } else {
            System.out.println("No se puede comprar si no has iniciado sesion");
        }
    }
}
