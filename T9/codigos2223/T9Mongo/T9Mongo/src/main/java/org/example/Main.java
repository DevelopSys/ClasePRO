package org.example;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.controller.AlumnoController;

public class Main {
    public static void main(String[] args) {


        AlumnoController controller = new AlumnoController();

        // 1. Creo el cliente
        /*MongoClient cliente = MongoClients.create(urlConnection);
        // 2. Acceder a la base de datos
        MongoDatabase baseDatos = cliente.getDatabase("academiaa");
        //System.out.println(baseDatos.getName());
        //baseDatos.createCollection("profesores");
        MongoCollection coleccionAlumnos = baseDatos.getCollection("alumnoss");
        Document alumno = new Document();
        // String
        alumno.put("nombre", "BorjaCodigo");
        alumno.put("edad", 38);
        alumno.put("experiencia", true);
        alumno.put("curso", "DAM");
        coleccionAlumnos.insertOne(alumno);
                ;*/


    }
}