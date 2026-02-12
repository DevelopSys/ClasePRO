import model.BiciCarretera;
import model.BiciMTB;
import model.BiciPaseo;
import model.Tienda;

public class Main {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.construirAlmacen(4);
        tienda.agregarBiciStock(new BiciMTB());
        tienda.agregarBiciStock(new BiciCarretera());
        tienda.agregarBiciStock(new BiciPaseo());

        tienda.aceptarBiciReparacion(new BiciPaseo());
        tienda.aceptarBiciReparacion(new BiciPaseo());
        tienda.aceptarBiciReparacion(new BiciPaseo());
        tienda.aceptarBiciReparacion(new BiciPaseo());
        tienda.aceptarBiciReparacion(new BiciPaseo());

        tienda.procesoReparacion();
        tienda.venderBici((int) (Math.random()*10));
        System.out.println(tienda.getCaja());
    }
}
