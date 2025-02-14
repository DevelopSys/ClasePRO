import model.Asalariado;
import model.Autonomo;
import model.Trabajador;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("Borja","Martin",12345,30000.0);
        Autonomo autonomo = new Autonomo("BorjaA","MartinA",23456,30000.0,200);

        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        // retencion = 0.21 nPagas = 14
        trabajadores.add(asalariado);
        trabajadores.add(autonomo);

        for (Trabajador t: trabajadores) {
            t.calcularSalarioMes();
        }

    }
}
