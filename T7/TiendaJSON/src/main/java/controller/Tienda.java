package controller;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    private ArrayList<Product> carrito;
    private APIController apiController;
    private FileController fileController;

    public Tienda() {
        carrito = new ArrayList<>();
        apiController = new APIController();
        fileController = new FileController();
    }

    public void mostrarTodos() {
        apiController.getAll();
    }

    public void addCarrito(int id) {
        Product product = apiController.getById(id);
        if (product != null) {
            carrito.add(product);
        } else {
            System.out.println("el id no es valido");

        }
    }

    public void importarCarrito(){
        carrito = fileController.importarLista();
    }

    public void buscarProducto(int id) {
        Product product = apiController.getById(id);
        if (product != null) {
            System.out.println("Nombre: " + product.getTitle());
            System.out.println("Precio: " + product.getPrice());
            System.out.println("Descripcion: " + product.getDescription());
            System.out.println("Stock: " + product.getStock());
            System.out.println("Categorias:");
            for (String tag : product.getTags()) {
                System.out.println("\t" + tag);
            }
        } else {
            System.out.println("Id invalida");
        }
    }

    public void realizarCompra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estas seguro que quieres comprar (s/n)");
        String opcion = scanner.next();
        if (opcion.equalsIgnoreCase("s")) {
            if (carrito.isEmpty()) {
                System.out.println("No tienes nada en carrito");
            } else {
                /* double sumatorio = 0.0;
                for (Product product: carrito) {
                    sumatorio += product.getPrice();
                }*/

                double precioTotal = carrito.stream().mapToDouble(Product::getPrice).sum();
                System.out.println("Procedes a comprar con un importe de "+precioTotal);
                carrito.clear();
            }
        } else {
            System.out.println("Nos vemos despues");
        }
    }

    public void exportarCarrito(){
        fileController.exportarDatos(carrito);
    }

    public void cerrarTienda(){
        apiController.closeClient();
    }
}
