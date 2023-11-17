import java.util.*;

public class Entrada {

    public static void main(String[] args) {
        ArrayList<Object[]> listaCoches = new ArrayList<>();
        // Object[], Object[], Object[], Object[], Object[]
        Hashtable<String, Object[]> listaCochesHash = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        listaCochesHash.put("1234A", new Object[]{"Ford", "Focus", 1000, "1234A"});
        listaCochesHash.put("2345A", new Object[]{"Seat", "Ibiza", 2000, "2345A"});
        listaCochesHash.put("3456B", new Object[]{"Seat", "Leon", 2000, "3456B"});
        //listaCochesHash.put("3456B",new Object[]{"Seat","Ibiza",2000,"3456B"});
        //Object[] coche = listaCochesHash.get("1234A");

        /*for ( Object item : coche) {
            System.out.println(item);
        }*/
        //listaCochesHash.remove("1234A");

        //System.out.println("El tamaño de la tabla es "+listaCochesHash.size());
        // recorrido por claves
        Enumeration<String> claves = listaCochesHash.keys();

        // sacar todas las claves

        /*while (claves.hasMoreElements()) {
            String clave = claves.nextElement();
            if (clave.contains("A")) {
                Object[] coche = listaCochesHash.get(clave);
                for (Object item : coche) {
                    System.out.println("\t" + item);
                }
            }
        }*/

        Enumeration<Object[]> elementos = listaCochesHash.elements();
        while (elementos.hasMoreElements()) {
            Object[] element = elementos.nextElement();
            for (Object item : element) {
                System.out.println("\t" + item);
            }
        }

    }
}
