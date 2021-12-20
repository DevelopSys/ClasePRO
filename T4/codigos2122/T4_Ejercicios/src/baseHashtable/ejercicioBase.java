package baseHashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class ejercicioBase {

    public static void main(String[] args) {
        Hashtable<String,Object[]> listaCoches = new Hashtable();

        Object[] coche = new Object[]{"4567U","Mercedes","C220"};

        listaCoches.put(coche[0].toString(),coche);
        listaCoches.put("2345B",new Object[]{"2345B","Audi","A5","100"});
        listaCoches.put("3456C",new Object[]{"3456C","BMW","i8","deportivo","400"});

        // os pidan una matricula por teclado y saques todos los datos del coche encontrado
        // en el caso de no encontrar la matricula saltará un aviso

        /*
        Scanner lectura = new Scanner(System.in);
        System.out.println("Que matricula quieres buscar");
        String matriculaBusqueda = lectura.next();

        Object[] cocheEncontrado = listaCoches.get(matriculaBusqueda);
        if(listaCoches.get(matriculaBusqueda)!=null) {
            for ( Object item : listaCoches.get(matriculaBusqueda) ) {
                System.out.println(item);
            }

        } else {
            System.out.println("no esta en la lista");
        }*/

        /*Enumeration<String> listaMatriculas = listaCoches.keys();
        while (listaMatriculas.hasMoreElements()){
            String matricula = listaMatriculas.nextElement();
            Object[] cocheActual = listaCoches.get(matricula);
            /*for (int i = 0; i < cocheActual.length; i++) {
                System.out.println(cocheActual[i]);
            }

            for ( Object item : cocheActual ) {
                System.out.println(item);
            }

        }*/

        Enumeration<Object[]> listaCochesEnum = listaCoches.elements();
        while (listaCochesEnum.hasMoreElements()){
            Object[] cocheActual = listaCochesEnum.nextElement();
            for ( Object item : cocheActual ) {
                System.out.println(item);
            }
        }
    }
}
