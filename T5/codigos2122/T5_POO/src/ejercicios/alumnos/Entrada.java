package ejercicios.alumnos;

public class Entrada {

    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        // calificacion = 0, identificador = 1
        Asignatura entornos = new Asignatura(2);
        // calificacion = 0, identificador = 2
        Asignatura bbdd = new Asignatura(3);
        // calificacion = 0, identificador = 3

        Alumno borja = new Alumno("borja",programacion,entornos,bbdd);
        // as1= programacion (//id=1 calificacion=6)
        // as2= entornos (//id=2 calificacion=3)
        // as3= bbdd (//id=3 calificacion=9)

        Alumno diego = new Alumno("diego",4,5,6);
        // as1=  (//id=4 calificacion=8)
        // as2=  (//id=5 calificacion=9)
        // as3=  (//id=6 calificacion=5)

        //borja.getAsignatura1().setCalificacion(9);
        //borja.getAsignatura3().getCalificacion();

        Profesor profesor = new Profesor();
        profesor.ponerNotas(borja);

        System.out.println(borja.getAsignatura1().getCalificacion());
        System.out.println(borja.getAsignatura2().getCalificacion());
        System.out.println(borja.getAsignatura3().getCalificacion());

        profesor.ponerNotas(diego);
        //System.out.println(profesor.calcularMedia(borja));
        if (profesor.calcularMedia(borja)>=5){
            System.out.println(borja.getNombre()+ " pasa de curso");
        } else {
            System.out.println(borja.getNombre()+ " no pasa de curso");
        }

    }
}
