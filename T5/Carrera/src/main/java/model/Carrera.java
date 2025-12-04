package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrera {
    private int kmDistancia;
    private Coche participante1, participante2;


    public void iniciarCarrera() {
        int numeroVuelta = 1;
        do {
            System.out.println("Vuelta "+numeroVuelta);
            participante1.acelerar((int) (Math.random() * 10));
            participante2.acelerar((int) (Math.random() * 10));
            // 1000
            // 1500
            // 800
            numeroVuelta++;
        } while (participante1.getKm() < kmDistancia && participante2.getKm() < kmDistancia);

        System.out.println("El ganador es el coche con datos ");
        if (participante1.getKm() > participante2.getKm()) {
            participante1.mostrarDatos();
        } else {
            participante2.mostrarDatos();
        }

        System.out.println("Los datos de km son");
        System.out.println("Coche 1: "+participante1.getKm());
        System.out.println("Coche 2: "+participante2.getKm());
    }
}
