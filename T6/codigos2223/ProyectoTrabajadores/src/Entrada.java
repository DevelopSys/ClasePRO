import model.*;

import javax.swing.plaf.basic.DefaultMenuLayout;

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

        // Jefe
            // Tiene que tener la posibilidad de despedir a un trabajador.
            // Para despedir un trabajador se le cambia el atributo contratado a false


        Autonomo autonomo = new Autonomo("Borja","Martin","123A",20000,true,200);
        Asalariado asalariado = new Asalariado("Ejemplo", "Ejemplo","1234B", 20000, true,12);
        Jefe jefe1 = new Jefe("Jefe1","A1","1234A",12,10000);

        Empresa empresa = new Empresa();
        empresa.agregarTrabajador(autonomo);
        empresa.agregarTrabajador(asalariado);
        empresa.agregarJefe(jefe1);

        //empresa.aplicarDespido("123A",empresa.getListaJefes().get(0));
        empresa.emitirFactura("56789","Cliente 2",30000);


        autonomo.mostrarDatos();





        //asalariado.pedirAumento(15000);
        //System.out.println(asalariado.calcularNetoAnual());
        //autonomo.calcularNetoAnual(); // dato

    }
}
