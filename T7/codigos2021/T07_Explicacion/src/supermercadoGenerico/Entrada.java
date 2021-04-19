package supermercadoGenerico;

public class Entrada {

    public static void main(String[] args) {

        //Lacteo lacteo = new Lacteo("Premium","Galicia",5,100);
        //System.out.printf(lacteo.mostrarDatos());
        Carne carne = new Carne("asd","asd",123,2);
        Silla silla = new Silla("asd",4,2,2);
        Supermercado<Carne> supermercado = new Supermercado();
        supermercado.registrarProducto(carne);

    }


}
