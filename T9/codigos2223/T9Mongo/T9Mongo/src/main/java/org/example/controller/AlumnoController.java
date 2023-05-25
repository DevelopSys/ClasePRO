package org.example.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.example.model.Alumno;

public class AlumnoController {

    // URL -- Clients -- BaseDatos

    private MongoDatabase database;

    public AlumnoController(){
        String urlConnection =  "mongodb+srv://root:root@cluster0.atbohp0.mongodb.net/?retryWrites=true&w=majority";
        try{
            database = MongoClients.create(urlConnection).getDatabase("academia");
        } catch (MongoException e){
            System.out.println("Error al conectar con la base de datos");
        }

    }


    // obtener un objeto de tipo alumno como parametro e insertarlo en la bd
    public void insertarAlumno(Alumno alumno){

    }

}
