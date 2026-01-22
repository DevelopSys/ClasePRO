import controller.Empresa;
import model.*;

public class Main {
    public static void main(String[] args) {
        // Persona persona = new Persona();
        // Trabajador trabajador = new Trabajador()


        Empresa empresa = new Empresa();
        // 1 director - 1234A
        Jefe jefe1 = new Jefe("Jefe1","ApellidoJefe","2345A",40000,1, Tipo.BLANDO);
        Jefe jefe2 = new Jefe("Jefe2","ApellidoJefe","2345A",40000,1, Tipo.MODERADO);
        Jefe jefe3 = new Jefe("Jefe3","ApellidoJefe","2345A",40000,1, Tipo.DURO);
        Jefe jefe4 = new Jefe("Jefe4","ApellidoJefe","2345A",40000,1, Tipo.MODERADO);
        // empresa.getListaUsuarios().put(jefe.getDni(),jefe);
        // 1 jefe - 2345A
        empresa.contratarTrabajador("2345A", new Asalariado("Asalariado1","ApelldoAs","3456A",20000,12,10));
        empresa.contratarTrabajador("2345A", new Asalariado("Asalariado2","ApelldoAs","4456A",70000,15,20));
        empresa.contratarTrabajador("2345A", new Autonomo("Autonomo1","ApelldoAu","5456A",20000,12));
        empresa.contratarTrabajador("2345A", new Autonomo("Autonomo2","ApelldoAu","6456A",40000,12));
        empresa.subirSalario();

        empresa.mostrarDatos();


    }
}
