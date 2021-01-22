package ejercicios.ejercicioAsignaturas;

public class Entrada {

    public static void main(String[] args) {

        // DAM
        Asignatura programacion = new Asignatura(1);
        Asignatura baseDatos = new Asignatura(2);
        Asignatura entornos = new Asignatura(3);


        Alumno dani = new Alumno(programacion, baseDatos, entornos);
        // as1 = pro(id=1,cal=0) as2= bd(id=2,cal=0) as3=ed(id=3,cal=0)
        Alumno angel = new Alumno(programacion, baseDatos, entornos);
        // as1 = pro(id=1,cal=0) as2= bd(id=2,cal=0) as3=ed(id=3,cal=0)

        Profesor borja = new Profesor();
        borja.ponerNotas(dani);

        System.out.println("Notas de Dani");
        dani.mostrarDatos();
        System.out.println(borja.calcularMedia(dani));

        borja.ponerNotas(angel);
        System.out.println("Notas de Angel");

        angel.mostrarDatos();
        System.out.println(borja.calcularMedia(angel));



    }
}
