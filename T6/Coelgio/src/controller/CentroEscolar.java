package controller;

import model.Alumno;
import model.Fijo;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;

public final class CentroEscolar  {

    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Profesor> listaProfesores;

    public CentroEscolar(){
        listaAlumnos = new ArrayList<>();
        listaProfesores = new ArrayList<>();
    }

    public void contratarProfesor(Profesor profesor){
        listaProfesores.add(profesor);
    }
    public void despedirProfesor(String dni){

        for (Profesor profesor: listaProfesores) {
            if(profesor.getDni().equals(dni)){
                listaProfesores.remove(profesor);
                System.out.println("Profesor despedido correctamente");
                break;
            }
        }
    }

    public void mostrarDatosProfesor(){

        // ArrayList<Persona> todos =

        for (Profesor profesor: listaProfesores) {
            profesor.mostrarDatos();
        }
    }

    // realizar evaluacion -> cada año se mira la funcionalidad de los profes fijos
    // y se les incrementa el sueldo
    public void analizarFuncionalidad(){
        for (Profesor profesor: listaProfesores) {
            if(profesor instanceof Fijo){
                ((Fijo) profesor).pedirAumento();
            }
        }
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }
}
