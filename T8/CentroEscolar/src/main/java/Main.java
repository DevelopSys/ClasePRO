import controller.ControllerCentro;
import database.DBConnector;
import dto.AlumnoDTO;
import model.Alumno;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // AlumnoDTO alumnoDTO = new AlumnoDTO();
        // pido los datos por consola
        /*Alumno alumno = new Alumno("Jose", "Garcia", "jose@gmail.com", 1234);
        boolean resultado = false;
        boolean fallo = false;
        do {
            try {
                resultado = alumnoDTO
                        .addUser(alumno);
                fallo = false;
            } catch (SQLException e) {
                fallo = true;
                System.out.println("Error en un mail duplicado, por favor introduce nuevamente el mail");
                Scanner scanner = new Scanner(System.in);
                String mail = scanner.next();
                alumno.setCorreo(mail);
            }
        }while (fallo);
        System.out.println("Usuario insertado correctamente");*/
        /*
        Crear un programa que pida por consola el nombde, apellido, correo y telefono del usuario
        En caso de insercion correcta -> sout("dato insertado correctamente")
        En caso de error en duplicidad -> indica un mail diferente, y lo vuelve a intentars
         */
        //         int row = alumnoDTO.addUserPS(new Alumno("Matias","Gomez","matias@gmail.com",23456));
        //      System.out.println("El numero de filas afectadas es de: "+row);
        /*System.out.println("El numero de elementos borrados es de "
                + alumnoDTO.deleteFromLocalidad("Barcelona"));
        ;*/
        /* int row = alumnoDTO.addUserPS(new Alumno("Matias","Gomez","matias@gmail.com",23456));
        row = alumnoDTO.addUserPS(new Alumno("Maria","Jimenez","maria@gmail.com",123123));
         row = alumnoDTO.addUserPS(new Alumno("Lucas","Martin","lucas@gmail.com",456456));*/
        /*
        Crear un programa que permita indicar una localidad y cuanto sube la couta
        // capturar todos los usuarios de esa localidad y subirles la cuota en lo que estipule lo indicado
        MADRID, 500
         */
        // alumnoDTO.getAllAlumnos().forEach(item -> System.out.println(item.getNombre()));

        ControllerCentro controllerCentro = new ControllerCentro();
        System.out.println("Sistema de registro de usuarios");
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("1-Insertar un usuario");
            System.out.println("2-Matricular usuario");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Indica nombre");
                    String nombre = scanner.next();
                    System.out.println("Indica apellido");
                    String apellido = scanner.next();
                    System.out.println("Indica correo");
                    String mail = scanner.next();
                    System.out.println("Indica telefono");
                    int  telefono = scanner.nextInt();
                    controllerCentro.registrarAlumno(new Alumno(nombre,apellido,mail,telefono));
                    break;
                case 2:
                    System.out.println("Que comunidad");
                    String comunidad = scanner.next();
                    break;
            }

        }while (opcion!=7);
    }
}
