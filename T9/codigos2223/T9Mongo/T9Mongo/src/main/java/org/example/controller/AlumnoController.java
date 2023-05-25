package org.example.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.model.Alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoController {

    // URL -- Clients -- BaseDatos

    private MongoCollection collection;

    public AlumnoController(){
        String urlConnection =  "mongodb+srv://root:root@cluster0.atbohp0.mongodb.net/?retryWrites=true&w=majority";
        try{
            collection = MongoClients.create(urlConnection).getDatabase("academia").getCollection("alumnos");
        } catch (MongoException e){
            System.out.println("Error al conectar con la base de datos");
        }

    }


    // obtener un objeto de tipo alumno como parametro e insertarlo en la bd
    public void insertarAlumno(Alumno alumno){

        Document documentAlumno = new Document();
        documentAlumno.put("nombre", alumno.getNombre());
        documentAlumno.put("edad", alumno.getEdad());
        documentAlumno.put("experiencia", alumno.isExperiencia());
        documentAlumno.put("telefono", alumno.getTelefono());
        collection.insertOne(documentAlumno);

    }

    public void insertarAlumno(ArrayList<Alumno> alumnos){
        // insertOne
        for ( Alumno alumno: alumnos ) {
            Document document = new Document();
            document.put("nombre",alumno.getNombre());
            document.put("edad",alumno.getEdad());
            document.put("telefono",alumno.getTelefono());
            document.put("experiencia",alumno.isExperiencia());
            collection.insertOne(document);
        }
    }
    public void insertarAlumno(ArrayList<Alumno> alumnos,int numero){
        // insertMany
        List<Document> alumnosDocuments = new ArrayList<>();
        for ( Alumno alumno: alumnos ) {
            Document document = new Document();
            document.put("nombre",alumno.getNombre());
            document.put("edad",alumno.getEdad());
            document.put("telefono",alumno.getTelefono());
            document.put("experiencia",alumno.isExperiencia());
            alumnosDocuments.add(document);
        }

        collection.insertMany(alumnosDocuments);
    }


    // borrar todos los alumnos que tengan menos de 18 [0-17] años
    public void borrarAlumno(String nombre){

        Document document = new Document();
        document.put("nombre", nombre);
        collection.deleteOne(document);

        // deleteOne( Document - <Criterio> {nombre:"Borja"} ) --> return objectId
        // findOneAndDelete( Document - <Criterio> {nombre:"Borja"}) --> return objectId y el document
        // deleteMany( Document - <Criterio> {nombre:"Borja"} ) --> return objectId
        // deleteAll() -- clear()

    }

}
