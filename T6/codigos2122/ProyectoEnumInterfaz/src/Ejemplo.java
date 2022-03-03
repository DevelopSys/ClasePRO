public class Ejemplo {

    Equipo equipo1 = Equipo.Getafe;
    Equipo equipo2 = Equipo.Madrid;
    Equipo equipo3 = Equipo.Barcelona;
    Equipo equipo4 = Equipo.Atletico;
    Equipo equipo5 = Equipo.Sevilla;
    Equipo equipo6 = Equipo.Alcorcon;

    public void mostarConjunto(){
        equipo6.setPresupuesto(800);
        equipo6.mostrarDatos();
    }

    public void mostarDatos(){
        System.out.println(equipo1.name());
        System.out.println(equipo2.name());
        System.out.println(equipo3.name());
        System.out.println(equipo4.name());
        System.out.println(equipo5.name());
    }



}
