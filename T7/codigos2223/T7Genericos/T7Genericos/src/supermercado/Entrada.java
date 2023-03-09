package supermercado;

public class Entrada {

    public static void main(String[] args) {
        Supermercado<Mueble> ikea = new Supermercado<>();
        Supermercado<Alimento> alcampo = new Supermercado<>();
        Supermercado<Ropa> zara = new Supermercado<>();


        Supermercado<Producto> corteingles = new Supermercado<>();


        ikea.agregarProducto(new Mueble(100,"Silla","Ejemplo de silla"));
        ikea.agregarProducto(new Mueble(200,"Mesa","Ejemplo de mesa"));

        ikea.vaciarAlmacen();


    }
}
