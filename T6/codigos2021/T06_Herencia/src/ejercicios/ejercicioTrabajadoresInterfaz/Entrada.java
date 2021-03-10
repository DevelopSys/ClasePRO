package ejercicios.ejercicioTrabajadoresInterfaz;

public class Entrada {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.registrarTrabajador(new Asalariado());
        empresa.registrarTrabajador(new Autonomo());
        empresa.registrarTrabajador(new Jefe());

        empresa.registrarVoto(new Accionista(),4);
        empresa.registrarVoto(new Accionista(),7);
        empresa.registrarVoto(new Director(),9);
        empresa.registrarVoto(new Jefe(),3);

        empresa.verResultadoVotacion();



    }
}
