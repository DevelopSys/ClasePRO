import model.*;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("Borja","Martin",12345,30000.0);
        Autonomo autonomo = new Autonomo("BorjaA","MartinA",23456,30000.0,200);
        Jefe jefe = new Jefe("BorjaJ","MArtinJ",12345,60000.0);

        // tratando el jefe como empleador
        // tratando el jefe como jefe
        //jefe.realizarTrabajo(3);





        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        // retencion = 0.21 nPagas = 14
        trabajadores.add(asalariado);
        trabajadores.add(autonomo);
        trabajadores.add(jefe);

        for (Trabajador t: trabajadores) {
            t.calcularSalarioMes();
            if (t instanceof Empleador){
                // t es Trabajado y Jefe
                if (((Empleador) t).realizarTrabajo(4)){
                    System.out.println("Trabajo completado");
                } else {
                    System.out.println("El jefe no trabaja tanto");
                }
            }
            if (t instanceof Sindicador){
                ((Sindicador) t).realizarHuelga();
            }

        }

    }
}
