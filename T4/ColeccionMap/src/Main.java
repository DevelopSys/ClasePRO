import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> alumnos = new HashMap<>();
        alumnos.put(1234, "Borja");
        alumnos.put(2345, "Juan");
        alumnos.put(3456, "Maria");
        alumnos.put(4567, "Lucia");
        alumnos.replace(4567, "Celia");

        /*for (int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i); //
        }*/
        /*
        Iterator<String> values = alumnos.values().iterator();
        while (values.hasNext()) {
            String nombre = values.next();
            System.out.println(nombre);
        }*/
        Set<Integer> keys = alumnos.keySet();
        for (Integer item: keys) {
            String nombre = alumnos.get(item);
            System.out.println(nombre);
        }

        // System.out.println("Borrado "+alumnos.remove(1234,"Borja"));
        // System.out.println("Borrado "+alumnos.remove(1234));
        // alumnos.containsValue("Borja");
        // int key = 1234;
        // System.out.println(alumnos.containsKey(key) ? alumnos.get(key) : "no esta");
        /*if (alumnos.containsKey(key)) {
            System.out.println(alumnos.get(key));
        } else {
            System.out.println("No esta");
        }*/
        // String alumno =  alumnos.getOrDefault(3456,"no esta");
        // System.out.println(alumno);
        /*String nombre = alumnos.get(1234);
        if (nombre != null) {
            System.out.println("El nombre correspondiente es " + nombre);
        } else {
            System.out.println("El alumno no esta en la lista");

        }*/
        // System.out.println(nombre);
        // alumnos.put(1234,"Juan"); pisa el valor de la clase indica
        System.out.println("El tamaño de la lista es " + alumnos.size());

    }
}
