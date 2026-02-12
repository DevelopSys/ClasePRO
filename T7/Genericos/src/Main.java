import controller.Almacen;
import model.*;

public class Main {


    public static void main(String[] args) {
        Almacen<Carne, Vendible> almacen1 = new Almacen();
        almacen1.agregarProductos(new Carne());
        almacen1.agregaStock(new Lacteo());
        almacen1.agregaStock(new Mueble());

        // almacen1.agregarProductos(new Lacteo());

        Almacen<Ropa, Vendible> almacen2 = new Almacen();
        almacen2.agregarProductos(new Ropa());
        almacen2.agregarProductos(new Ropa());
        almacen2.agregaStock(new Lacteo());
        almacen2.agregaStock(new Mueble());


        Almacen almacen3 = new Almacen();
        almacen3.agregarProductos(new Carne());
        almacen3.agregarProductos(new Lacteo());
        almacen3.agregaStock(new Lacteo());
        almacen3.agregaStock(new Mueble());
        almacen3.venderCosas();



    }
}
