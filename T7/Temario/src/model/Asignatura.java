package model;

import java.util.ArrayList;

public class Asignatura {
    private Profesor profesor;
    private int horasTemario;
    private ArrayList<Tema> temario;
    private int dificultad;
    private String nombre;
    private int codigo;
    private Tipo tipoAsignatura;
    private int perctotal;

    private Tema tema;

    public Asignatura() {
        this.temario = new ArrayList<>();

    }

    public Asignatura(String nombre, Profesor profesor, int codigo, Tipo tipoAsignatura) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.codigo = codigo;
        this.tipoAsignatura = tipoAsignatura;
        this.temario = new ArrayList<>();
    }

    public void listarTemario() {
        /*for ( Tema tema: temario ) {
            tema.mostrarDatos();
        }*/

        // temario.forEach(item->item.mostrarDatos());
        temario.forEach(Tema::mostrarDatos);
        // temario.forEach(item-> System.out.println(item.titulo));
        // temario.stream().map(Tema::getTitulo).forEach(System.out::println);
    }

    public void mostrarDatos() {
        System.out.println("Los datos de la asgintaura son");
        System.out.println(profesor.getNombre() + " " + profesor.getApellidos());
        System.out.println(this.nombre);
        System.out.println(this.codigo);
        System.out.println("Dificultad " + this.dificultad / temario.size());
        System.out.println("% total " + this.perctotal);
        System.out.println("Datos del temario");
        System.out.println("Numero de temas: " + temario.size());
        System.out.println(this.tipoAsignatura.name().toLowerCase());
        System.out.println(this.tipoAsignatura.getDescripcion());
        // pregunto de que tipo es la asignura -> LIBRE/OPTATIVA/TRONCAL
        if (tipoAsignatura == Tipo.LIBRE) {
            horasTemario /= 3;
        } else if (tipoAsignatura == Tipo.OPTATIVA) {
            horasTemario /= 2;
        }
        System.out.println("Horas del temario: " + horasTemario);
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getHorasTemario() {
        return horasTemario;
    }

    public void setHorasTemario(int horasTemario) {
        this.horasTemario = horasTemario;
    }

    public ArrayList<Tema> getTemario() {
        return temario;
    }

    public void setTemario(ArrayList<Tema> temario) {
        this.temario = temario;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tipo getTipoAsignatura() {
        return tipoAsignatura;
    }

    public void setTipoAsignatura(Tipo tipoAsignatura) {
        this.tipoAsignatura = tipoAsignatura;
    }

    public int getPerctotal() {
        return perctotal;
    }

    public void setPerctotal(int perctotal) {
        this.perctotal = perctotal;
    }

    public class Tema {
        private String titulo;
        private int nHpras;
        private int difucultad;
        private int perc;

        public Tema() {
        }

        public Tema(String titulo, int nHpras, int difucultad, int perc) {
            this.titulo = titulo;
            this.nHpras = nHpras;
            this.difucultad = difucultad;
            this.perc = perc;
            Asignatura.this.tema = this;
            // comprobaciones -> perc > 100 horas
            if (perctotal + perc > 100) {
                System.out.println("Lo sentimos este tema no se puede añadir");
            } else {
                Asignatura.this.dificultad += difucultad;
                perctotal += perc;
                horasTemario += nHpras;
                temario.add(this);
            }

        }

        public void mostrarDatos() {
            System.out.println("titulo = " + titulo);
            System.out.println("nHpras = " + nHpras);
            System.out.println("difucultad = " + difucultad);
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getnHpras() {
            return nHpras;
        }

        public void setnHpras(int nHpras) {
            this.nHpras = nHpras;
        }

        public int getDifucultad() {
            return difucultad;
        }

        public void setDifucultad(int difucultad) {
            this.difucultad = difucultad;
        }

        public int getPerc() {
            return perc;
        }

        public void setPerc(int perc) {
            this.perc = perc;
        }
    }
}
