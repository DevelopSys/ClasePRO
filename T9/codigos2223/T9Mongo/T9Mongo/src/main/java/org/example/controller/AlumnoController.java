package org.example.controller;

import com.mongodb.MongoException;
import com.mongodb.client.*;
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

    // rango de [18-25]

    public void borrarEdad(int edad){
        Document documentCriterio = new Document();
        /*Document documentoQuery = new Document();
        documentoQuery.put("$lt",18);*/
        documentCriterio.put("edad",new Document().append("$lt",18));
        collection.deleteMany(documentCriterio);
    }

    public void actualizarAlumno(){

        Document documentoUpdate= new Document();
        documentoUpdate.put("edad", 20);
        Document documentoSet = new Document();
        documentoSet.put("$set",new Document().append("experiencia",true));
        collection.updateMany(documentoUpdate,documentoSet);

    }

    public void actualizacionRango(){

        Document documentoUpdate = new Document();
        documentoUpdate.put("edad",new Document().append("$lte",20));

        Document documentoSet = new Document();
        documentoSet.put("$set",new Document().append("experiencia",true));

        collection.updateMany(documentoUpdate,documentoSet);


        documentoUpdate = new Document();
        documentoUpdate.put("edad",new Document().append("$gt",20));

        documentoSet = new Document();
        documentoSet.put("$set",new Document().append("experiencia",false));

        collection.updateMany(documentoUpdate,documentoSet);

    }
    public void obtenerDatos(){

        // find() -> All -> Document -> get
        // find({}) -> condicion

        // db.collection.find({experiencia: false})
        MongoCursor<Document> cursor =  collection.find(new Document().append("experiencia",false)).iterator();
        while (cursor.hasNext()){
            Document document = cursor.next(); // {nombre: "Borja", edad: 39, experiencia: false, telefono: 123123}
            System.out.println(document.getString("nombre") + ", "+ document.getInteger("edad") );
        }

        // obtener todos los usuarios que no tienen experiencia


    }


    public void setConocimientos(){

        //2-  Aquellos usuarios que tenga mas de 30, añadirle a sus conocinientos: "gestion"
        Document documentUpdate = new Document();
        documentUpdate.put("edad", new Document().append("$lt",14));


        Document documentSet = new Document();
        documentSet.put("$push",new Document("conocimientos","gestion"));

        collection.updateMany(documentUpdate, documentSet);


    }
    public void agregarConocimientos(){

        //1-  agregar una lista de conocimientos "Programacion", "Base datos" con la key conocimientos
        // a todos aquellos usuarios que tengan como experiencia true

        ArrayList<String> conocimientos = new ArrayList<>();
        conocimientos.add("Programacion");
        conocimientos.add("Base datos");

        Document documentUpdate = new Document();
        documentUpdate.put("experiencia", true);

        Document documentSet = new Document();
        documentSet.put("$set",new Document("conocimientos",conocimientos));


        collection.updateMany(documentUpdate,documentSet);



        //3- A un usuario que tenga conocimientos, cambiarle la experiencia a false. Una vez esto completo,
        // quitarle los conocimientos a dicho usuario

        /*
        * id: ObjectId
        * nombre: "borja"
        * edad: 39
        * experiencia: true
        * telefono: 1234
        * conocimientos: List
        * */

    }
}
