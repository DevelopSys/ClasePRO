import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;

public class Controladora3 {

    private Hashtable<String, Object[]> listaAgenda;

    public Controladora3(){
        listaAgenda = new Hashtable<>();
    }

    // agregarContacto
    public void agregarContacto(String dni, String nombre, String apellido,
                                int telefono, boolean disponiblidad){
        Object[] contacto = new Object[]{dni,nombre,apellido,telefono,disponiblidad};
        if (listaAgenda.containsKey(contacto[0])){
            System.out.println("No se puede, contacto ya existente");
        } else {
            listaAgenda.put(contacto[0].toString(),contacto);
        }
    }
    // buscarContacto
    public void buscarContacto(String dni){
        if (!listaAgenda.containsKey(dni)){
            System.out.println("No se puede, contacto no existente");
        } else {
            Object[] contacto = listaAgenda.get(dni);
            // recorrer
        }
    }
    // borrarContacto
    public void borrarContacto(String dni){
        if (!listaAgenda.containsKey(dni)){
            System.out.println("No se puede, contacto no existente");
        } else {
            listaAgenda.remove(dni);
            // recorrer
        }
    }
    // listarContactos
    public void listarContactos(){
        // Enumeration listaValores = (Enumeration) listaAgenda.values();
        Enumeration<String> claves = listaAgenda.keys();
        while (claves.hasMoreElements()){
            String clave = claves.nextElement();
            buscarContacto(clave);
        }
    }
}
