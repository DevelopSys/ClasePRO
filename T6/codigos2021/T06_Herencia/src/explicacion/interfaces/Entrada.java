package explicacion.interfaces;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        //System.out.println(EjemploInterfaz.IVA);
        //System.out.println(EjemploInterfaz.NOMBRE_EMPRESA);
        //Producto carne = new Carne(123,23,"asd");
        //Alimento carne = new Carne(123,123,"asd");
        Carne carne = new Carne(123, 12, "asd");
        Perfume perfume = new Perfume("asd", 211, 23);

        //ArrayList<Alimento> listaAlimnentos = new ArrayList<>();
        //ArrayList<Cosmetico> listaCosmeticos = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(carne);
        listaProductos.add(perfume);
        //listaCosmeticos.add(carne);

        for (Producto itemProducto : listaProductos) {
            if (itemProducto.getClass().getSimpleName().equals("Carne")) {
                ((Carne)itemProducto).certificarOrigen();
            }
        }


    }
}
