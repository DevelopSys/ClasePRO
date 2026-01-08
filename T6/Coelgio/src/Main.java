import controller.CentroEscolar;

import model.Fijo;
import model.Interino;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        // Persona persona = new Persona("Borja", "Martin","1234A");
        Alumno alumno1 = new Alumno("Borja1", "Martin1","1234A",1,1);
        Alumno alumno2 = new Alumno("Borja2", "Martin2","1234A",1,1);
        Alumno alumno3 = new Alumno("Borja3", "Martin3","1234A",1,1);

        /*
        alumno.mostrarDatos();
        alumno.saludar();
        alumno.saludar1();

        Profesor profesor1 = new Profesor("BorjaP1", "Martin","1234A","borja@gmail.com",11111,11);
        Profesor profesor2 = new Profesor("BorjaP2", "Martin","1234A","borja@gmail.com",11111,11);
        Profesor profesor3 = new Profesor("BorjaP3", "Martin","1234A","borja@gmail.com",11111,11);

        /*
        profesor.mostrarDatos();
        profesor.evaluar();
        profesor.saludar();
        profesor.saludar1();

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(profesor3);
        listaPersonas.add(profesor2);
        listaPersonas.add(alumno3);
        listaPersonas.add(alumno2);
        listaPersonas.add(profesor1);
        listaPersonas.add(alumno1);


        for (Persona persona : listaPersonas) {
            persona.saludar();
            persona.mostrarDatos();
            if (persona instanceof Profesor){
                ((Profesor) persona).evaluar();
            } else if(persona instanceof Alumno){
                ((Alumno) persona).realizarExamen();
            }
            // persona.evaluar()
        }*/
        /*
        Profesor fijo = new Fijo("Borja", "Martin",
                "1234A", "borja@gmail.com", 20000, 5);
        fijo.saludar();
        fijo.pedirAumento();
        fijo.cambiarDocencia(2);
        fijo.mostrarDatos();
        */

        CentroEscolar centroEscolar = new CentroEscolar();
        // listaProfes = []
        // listaAlumnos = []
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a contratar un profesor");
        System.out.println("Indica nombre");
        String nombre = scanner.next();
        System.out.println("Indica apellido");
        String apellido= scanner.next();
        System.out.println("Indica dni");
        String dni= scanner.next();
        System.out.println("Indica correo");
        String correo= scanner.next();
        System.out.println("Indica salario");
        int salario= scanner.nextInt();
        System.out.println("Indica horas");
        int horas=scanner.nextInt();
        Fijo fijo = new Fijo(nombre,apellido,dni,correo,salario,horas);
        System.out.println("Indica nombre");
         nombre = scanner.next();
        System.out.println("Indica apellido");
         apellido= scanner.next();
        System.out.println("Indica dni");
         dni= scanner.next();
        System.out.println("Indica correo");
         correo= scanner.next();
        System.out.println("Indica salario");
         salario= scanner.nextInt();
        System.out.println("Indica horas");
         horas=scanner.nextInt();
        System.out.println("Indica horas experiencia");
        int horasExp=scanner.nextInt();
        Interino interino = new Interino(nombre,apellido,dni,correo,salario,horas, horasExp);
        centroEscolar.contratarProfesor(fijo);
        centroEscolar.contratarProfesor(interino);
        System.out.println("Mostrando los datos de los profesores contratados");
        centroEscolar.mostrarDatosProfesor();
    }
}
