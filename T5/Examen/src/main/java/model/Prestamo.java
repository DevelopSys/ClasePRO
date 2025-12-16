package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prestamo {

    private Socio socio;
    private Libro libro;
    private int diasPrestamo;
    private int diasRetraso;
    private int multa;
    private boolean activo;

    public Prestamo(Socio socio, Libro libro, int diasPrestamo) {
        this.socio = socio;
        this.libro = libro;
        this.diasPrestamo = diasPrestamo;
        this.activo = true;
    }

    public void mostrarDatos(){
        socio.mostrarDatos();
        libro.mostrarDatos();
        System.out.println("diasPrestamo = " + diasPrestamo);
        System.out.println("diasRetraso = " + diasRetraso);
        System.out.println("activo = " + activo);
        System.out.println("multa = " + multa);
    }

    public int calcularMulta(int dias){
        if (dias>0 && dias<10){
            return (int) (Math.random()*6)+5;
        } else {
            return (int) (Math.random()*10)+11;
        }
    }
}
