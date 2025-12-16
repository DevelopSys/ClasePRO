import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Prestamo;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Biblioteca {

    private String nombre;
    private ArrayList<Prestamo> listaPrestamos;
    private int caja;

    public Biblioteca(){
        listaPrestamos = new ArrayList<>();
        // caja = 0;
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaPrestamos = new ArrayList<>();
        // caja = 0;
    }


    public void agregarPrestamo(Prestamo prestamo){
        if (estaPrestamo(prestamo.getSocio().getDni())!=null){
            System.out.println("No se puede añadir, socio con prestamo activo");
        } else {
            listaPrestamos.add(prestamo);
            System.out.println("Prestamo añadido correctamente");
        }
    }

    public void finalizarPrestamo(String dni, int diasRetraso){
        Prestamo prestamo = estaPrestamo(dni);
        if (prestamo!=null){
            caja += prestamo.calcularMulta(diasRetraso);
            prestamo.setActivo(false);
        }
    }

    private Prestamo estaPrestamo(String dni){

        for (Prestamo item : listaPrestamos) {
            if (item.getSocio().getDni().equals(dni)
                    && item.isActivo()){
                return item;
            }
        }

        return null;
    }


    private Prestamo estaPrestamo(Prestamo prestamo){

        for (Prestamo item : listaPrestamos) {
            if (item.getSocio().getDni().equals(prestamo.getSocio().getDni())
            && item.isActivo()){
                return item;
            }
        }

        return null;
    }

    public void listarPrestamos(){
        for (Prestamo prestamo: listaPrestamos) {
            prestamo.mostrarDatos();
        }
    }

    public void listarPrestamosActivos(){
        for (Prestamo prestamo: listaPrestamos) {
            if (prestamo.isActivo()){
                prestamo.mostrarDatos();
            }
        }
    }
}
