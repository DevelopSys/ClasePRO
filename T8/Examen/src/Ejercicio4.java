import model.Inventario;

public class Ejercicio4 {

    public static void main(String[] args) {
        Inventario<Inventario.Producto> inventario = new Inventario();
        inventario.agregar(inventario.new Producto("Queso",34,5));
        inventario.agregar(inventario.new Producto("Jamon",76,6));
        inventario.agregar(inventario.new Producto("Carne",31,2));

        inventario.mostrarInventario();

    }
}
