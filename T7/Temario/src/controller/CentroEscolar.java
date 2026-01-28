package controller;

import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;
import java.util.HashMap;

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

    public void crearAsignatura(Asignatura asignatura){
        asignaturas.put(asignatura.getCodigo(),asignatura);
    }


}
