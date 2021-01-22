package ejercicios.ejercicioAsignaturas;

public class Alumno {


    private Asignatura asignaturaUno, asignaturaDos, asignaturaTres;

    // constructores

    public Alumno(Asignatura asignaturaUno, Asignatura asignaturaDos, Asignatura asignaturaTres){
        this.asignaturaUno =  asignaturaUno;
        this.asignaturaDos = asignaturaDos;
        this.asignaturaTres = asignaturaTres;
    }

    public Alumno (int idUno, int idDos, int idTres){
        this.asignaturaUno = new Asignatura(idUno);
        this.asignaturaDos = new Asignatura(idDos);
        this.asignaturaTres = new Asignatura(idTres);
    }

    // metodos

    public void verMatriculas(){
        System.out.println(this.asignaturaUno.getIdentificador());
        System.out.println(this.asignaturaDos.getIdentificador());
        System.out.println(this.asignaturaTres.getIdentificador());
    }

    public void mostrarDatos(){
        System.out.println(this.asignaturaUno.getCalificacion());
        System.out.println(this.asignaturaDos.getCalificacion());
        System.out.println(this.asignaturaTres.getCalificacion());
    }


    // getter y setters

    public Asignatura getAsignaturaUno() {
        return asignaturaUno;
    }

    public Asignatura getAsignaturaDos() {
        return asignaturaDos;
    }

    public Asignatura getAsignaturaTres() {
        return asignaturaTres;
    }
}
