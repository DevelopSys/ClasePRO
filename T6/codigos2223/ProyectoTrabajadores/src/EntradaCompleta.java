import model.*;

public class EntradaCompleta {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarPersona(new Accionista("Ac1","Ac1","correo1@correo",100));
        empresa.agregarPersona(new Accionista("Ac2","Ac2","correo2@correo",100));
        empresa.agregarPersona(new Jefe("Jefe","Jefe","Jefe", 10,20000.0));
        empresa.agregarPersona(new Propietario("Prop","Prop","correo3@correo"));
        empresa.agregarPersona(new Asalariado("As1","As1","correo4@correo",10.0,true,90000));
        empresa.agregarPersona(new Autonomo("As1","As1","correo5@correo",10.0,true,90000));

        // jefe
        empresa.aplicarDespido("As1",(Jefe)empresa.getListaPersonasEmpresa().get(2));
        // propietario
        empresa.aplicarDespido("Jefe",(Propietario) empresa.getListaPersonasEmpresa().get(3));

        empresa.realizarVotacion();
    }
}
