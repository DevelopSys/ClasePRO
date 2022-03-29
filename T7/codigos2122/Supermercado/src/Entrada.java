import java.io.File;

public class Entrada {

    public static void main(String[] args) {
        Silla silla = new Silla("Roble",5,100,4);
        silla.calcularPrecio();
        Carne filete = new Carne("Superior","Galicia",100,50);
        filete.calcularPrecio();
        Mesa mesa = new Mesa("Roble",20,300,6);
        mesa.calcularPrecio();
        Lacteo leche = new Lacteo("Premiun","Galicia",50,100);
        leche.calcularPrecio();

        Supermercado<Alimento> supermercadoAlimentos = new Supermercado<>();
        supermercadoAlimentos.anadirGenero(filete);
        supermercadoAlimentos.anadirGenero(leche);
        // supermercadoAlimentos.mostrarPrecioFinal();
        // supermercadoAlimentos.listarDatos();

        Supermercado<Mueble> supermercadoMuebles = new Supermercado<>();
        supermercadoMuebles.anadirGenero(silla);
        supermercadoMuebles.anadirGenero(mesa);
        // supermercadoMuebles.mostrarPrecioFinal();
        // supermercadoMuebles.listarDatos();

        Supermercado<Inventariable> supermercadoGenerico = new Supermercado<>();
        supermercadoGenerico.anadirGenero(silla);
        supermercadoGenerico.anadirGenero(mesa);
        supermercadoGenerico.anadirGenero(leche);
        supermercadoGenerico.anadirGenero(filete);
        supermercadoGenerico.listarDatos();
        supermercadoGenerico.mostrarPrecioFinal();

    }
}
