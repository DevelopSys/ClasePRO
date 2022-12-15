import java.util.*;

public class Entrada {

    public static void main(String[] args) {

        Hashtable<String, Object[]> listaCoches = new Hashtable<>();
        System.out.println(listaCoches.size());
        // []
        listaCoches.put("1234A",new Object[]{"1234A","Mercedes1","C200",200});
        listaCoches.put("3456A",new Object[]{"3456A","Mercedes2","C300",200});
        listaCoches.put("4567A",new Object[]{"4567A","Mercedes3","C400",200});
        listaCoches.put("5678A",new Object[]{"5678A","Mercedes4","C500",200});
        // [(1234a,Object[])]
        Object[] coche = new Object[]{"2345ABC","Nissan","GT",300};
        listaCoches.put(coche[0].toString(),coche);
        // [(1234a,Object[]), (2345abc,Object[])]

        //Object[] cocheEncontradao = listaCoches.get("1234A");
        //System.out.println(cocheEncontradao[1]);

        //Object[] cocheBorrado = listaCoches.remove("1234A");
        /*if (listaCoches.remove("1234A") == null){
            System.out.println("No existe el coche en la lista");
        } else {
            System.out.println("Coche borradao correctamente: "+cocheBorrado[1]);
        }*/
        // METER UNOS CUANTOS COCHES DENTRO DE LA LISTA

        // INTENTAR SACAR LOS DATOS TODOS

        // 1- recorrer claves
        Enumeration<String> clavesEnum = listaCoches.keys();
        //clavesEnum.hasMoreElements();
        //clavesEnum.nextElement();
        /*for (Iterator<String> it = clavesEnum.asIterator(); it.hasNext(); ) {
            String clave = it.next();
            listaCoches.get(clave);
        }*/
        while (clavesEnum.hasMoreElements()){
            String clave = clavesEnum.nextElement();
            Object[] cocheLista = listaCoches.get(clave);
            for ( Object item : cocheLista ) {
                System.out.print(item+" ");
            }
            System.out.println();
        }
        // 2- recorrer los valores
        Collection<Object[]> elementos = listaCoches.values();

        Iterator<Object[]> listaIterable = elementos.iterator();
        while (listaIterable.hasNext()){
            Object[] cocheLista = listaIterable.next();
            for ( Object item : cocheLista ) {
                System.out.print(item+" ");
            }
            System.out.println();
        }

    }
}
