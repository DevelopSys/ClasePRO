package ejercicios.ejercicioAsignaturas;

public class Entrada {

    public static void main(String[] args) {

        // DAM
        Asignatura programacion = new Asignatura(1);
        Asignatura baseDatos = new Asignatura(2);
        Asignatura entornos = new Asignatura(3);


        // EDI

        Asignatura palmas = new Asignatura(4);
        Asignatura juegos = new Asignatura(5);
        Asignatura ninios = new Asignatura(6);


        Alumno dani = new Alumno(programacion,baseDatos,entornos);
        // as1 = pro(id=1,cal=5) as2= bd(id=2,cal=10) as3=ed(id=3,cal=0)
        Alumno angel = new Alumno(programacion,baseDatos,entornos);
        // as1 = pro(id=1,cal=7) as2= bd(id=2,cal=7) as3=ed(id=3,cal=0)

        Alumno ana = new Alumno(palmas,juegos,ninios);
        // as1 = pal(id=4,cal=0) as2= ju(id=5,cal=0) as3=ni(id=6,cal=0)
        Alumno mario = new Alumno(palmas,juegos,ninios);
        // as1 = pal(id=4,cal=0) as2= ju(id=5,cal=0) as3=ni(id=6,cal=0)

        Alumno adam = new Alumno(7,8,9);
        Alumno aitor = new Alumno(7,8,9);

        System.out.println("Ver matriculaciones");

        System.out.println("Asignaturas dani");
        dani.verMatriculas();
        System.out.println("Asignaturas angel");
        angel.verMatriculas();
        System.out.println("Asignaturas ana");
        ana.verMatriculas();
        System.out.println("Asignaturas mario");
        mario.verMatriculas();
        System.out.println("Asignaturas adam");
        adam.verMatriculas();
        System.out.println("Asignaturas aitor");
        aitor.verMatriculas();


    }
}
