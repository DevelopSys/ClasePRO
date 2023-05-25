package org.example;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.controller.AlumnoController;
import org.example.model.Alumno;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        AlumnoController controller = new AlumnoController();
        //controller.insertarAlumno(new Alumno("A1",20,123,true));
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("N1",12,123,true));
        alumnos.add(new Alumno("N2",23,1233,false));
        alumnos.add(new Alumno("N3",43,423,true));
        alumnos.add(new Alumno("N4",15,534,false));
        alumnos.add(new Alumno("N5",32,64,true));
        alumnos.add(new Alumno("N6",29,312,false));
        //controller.insertarAlumno(alumnos,0);
        controller.borrarAlumno("Juan");

        // inserteis todos los alumnos en la coleccion


    }
}