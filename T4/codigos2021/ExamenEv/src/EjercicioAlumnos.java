import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class EjercicioAlumnos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        ArrayList<ArrayList<Object>> agenda = new ArrayList();
        // alumno dni nombre apellido telefono --> [String, String, String, int]

        do {
            System.out.println("1.Agregar persona");
            System.out.println("2.Busca persona");
            System.out.println("3.Borrar persona");
            System.out.println("4.Listar persona");
            System.out.println("5.Salir");
            System.out.println("Introduce opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:

                    String nombre, apellido, dni;
                    int telefono;

                    System.out.println("Introduce DNI");
                    dni = teclado.next();
                    System.out.println("Introduce Nombre");
                    nombre = teclado.next();
                    System.out.println("Introduce Apellido");
                    apellido = teclado.next();
                    System.out.println("Introduce Teléfono");
                    telefono = teclado.nextInt();
                    ArrayList<Object> alumno = new ArrayList<>();
                    alumno.add(dni);
                    alumno.add(nombre);
                    alumno.add(apellido);
                    alumno.add(telefono);
                    //ArrayList<Object> alumnoMetodo = new EjercicioAlumnos().addAlumn();
                    if (agenda.add(alumno)) {
                        System.out.println("Alumno agregado correctamente");
                    } else {
                        System.out.println("Error al agregar");
                    }
                    ;
                    alumno = null;

                    break;
                case 2:
                    System.out.println("Introduce el dni a buscar");
                    dni = teclado.next();
                    /*for (ArrayList<Object> persona : agenda) {
                        if (persona.get(0).toString().equals(dni)) {
                            for (Object item : persona) {
                                System.out.println(item);
                            }
                        }
                    }*/

                    for (int i = 0; i < agenda.size(); i++) {
                        ArrayList<Object> persona = agenda.get(i);
                        if (persona.get(0).toString().equals(dni)) {
                            for (int j = 0; j < persona.size(); j++) {
                                System.out.println(agenda.get(i).get(j));
                            }
                        }
                        persona = null;
                    }

                    break;
                case 3:
                    System.out.println("Introduce el dni a borrar");
                    dni = teclado.next();
                    boolean existe = false;
                    int posicion=-1;

                    for (int i = 0; i < agenda.size(); i++) {
                        ArrayList<Object> persona = agenda.get(i);
                        if (persona.get(0).toString().equals(dni)) {
                            existe = true;
                            posicion = i;
                        }
                    }

                    if (existe) {
                        // borras
                        agenda.remove(posicion);
                    } else {
                        System.out.println("No se puede borrar porque el dni no está registrado");
                    }


                    break;
                case 4:

                    System.out.println("Listado de datos");
                    for (int i = 0; i < agenda.size(); i++) {
                        ArrayList<Object> persona = agenda.get(i);
                        for (int j = 0; j < persona.size() ; j++) {
                            System.out.println(persona.get(j));
                        }
                        System.out.println("Nueva persona");
                    }

                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 5);


    }

    public ArrayList<Object> addAlumn() {
        String nombre = "", dni, apellido;
        int telefono;

        ArrayList<Object> alumno = new ArrayList<>();
        alumno.add(nombre);
        return alumno;
    }
}
