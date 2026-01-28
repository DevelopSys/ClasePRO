package controller;

import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CentroEscolar {
    private HashMap<String, Profesor> profesores;
    private HashMap<Integer, Asignatura> asignaturas;

    public CentroEscolar(){
        profesores = new HashMap<>();
        asignaturas = new HashMap<>();
    }

    public void crearProfesor(Profesor profesor){
        if(profesores.put(profesor.getDni(),profesor)!=null){
            System.out.println("Profesor agregado correctamente");
        } else {
            System.out.println("No se puede agregar");
        }
    }

    public void crearAsignatura(String dni, Asignatura asignatura){
        Profesor profesor = profesores.get(dni);
        if (profesor!=null){
            // un profesor solo puede tener 4 asignaturas
            asignatura.setProfesor(profesor);
            asignaturas.put(asignatura.getCodigo(),asignatura);
            System.out.println("Asignatura añadida correctamente");
        } else {
            System.out.println("La asignatura no se puede crear, el dni no es valido");
            System.out.println("Dime un dni correcto");
            Scanner scanner = new Scanner(System.in);
            String  dniNuevo = scanner.next();
            crearAsignatura(dniNuevo,asignatura);
        }

    }

    public void crearTema(String titulo, int horas, int perc, int dificultad, int codigo){
        Asignatura asignatura = asignaturas.get(codigo);
        if (asignatura!=null){
            Asignatura.Tema tema = asignatura.new Tema(titulo,horas,dificultad,perc);
            asignatura.getTemario().add(tema);
        }
    }

    public void obtnerAsignaturasProfesor(String dni){
        for ( Asignatura asignatura : asignaturas.values()) {
            if (asignatura.getProfesor().getDni().equals(dni)){
                asignatura.mostrarDatos();
            }
        }

        asignaturas.values().stream()
                .filter(item->item.getProfesor().getDni().equals(dni))
                .forEach(Asignatura::mostrarDatos);
    }


}
