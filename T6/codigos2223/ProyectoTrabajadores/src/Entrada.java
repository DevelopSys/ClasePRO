import model.Jefe;
import model.Trabajador;

public class Entrada {

    public static void main(String[] args) {
        Jefe jefe = new Jefe();
        // Autonomo - Asalariado
            // calcularNetoMes --> asalariado(sueldo - (0.21)/numPagas) autonomo --> (sueldo - (0.21) - (cuotaSS*12))/12
            // calcularNetoAnual --> lo mismo sin el numero de pagas, ni el numero de coutas

        // Asalariado
            // aumentoSueldo(int) -> aleatorio 0-1 (1 aumenta) (o no aumenta)

        // Autonomo
            // pedirAyudas() -> aleatorio 0-1 (100-300 restan a las cuotasss)
    }
}
