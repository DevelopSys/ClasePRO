package trabajadores;

import trabajadores.controller.Empresa;
import trabajadores.model.*;

public class Entrada {

    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("A1","A1","A1",10000,12);
        Autonomo autonomo = new Autonomo("A2","A2","A2",10000,true);
        Jefe jefe = new Jefe("J1","J1","J1",20000,5000,5);
        Director director = new Director("D1","D1","D1",50);
        Accionista accionista = new Accionista("AC1","AC1","AC1",10);
        Responsable accionista1 = new Accionista("AC1","AC1","AC1",10);
        Persona accionista2 = new Accionista("AC1","AC1","AC1",10);

        Empresa empresa = new Empresa();
        empresa.agregarPersona(asalariado);
        empresa.agregarPersona(autonomo);
        //empresa.agregarPersona(jefe);
        //empresa.agregarPersona(director);
        empresa.agregarPersona(accionista);
        //empresa.buscarPersona("AC1");
        //empresa.mostrarTrabajadores();
        empresa.realizarVotacion();
    }
}
