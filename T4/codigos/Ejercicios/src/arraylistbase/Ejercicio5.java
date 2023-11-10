package arraylistbase;

import java.util.*;

public class Ejercicio5 {

    private ArrayList<Object[]> listaCoches;

    public void iniciarEjercicio(){
        iniciarLista();
        reprogramarCoches("ford",50);
        mostrarCoches();
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Que marca quieres buscar");
        String marca = scanner.next();

        System.out.println("Cuantos CV minimo quieres");
        int cv = scanner.nextInt();
        filtrarDatos(marca,cv);*/
    }

    private void iniciarLista(){
        listaCoches = new ArrayList<>();
        // marca(str) modelo(str) cv(int) --> Coche
        Object[] coche1 = new Object[]{"Ford","Focus",150};
        Object[] coche4 = new Object[]{"Ford","Fiesta",90};
        Object[] coche7 = new Object[]{"Ford","Mustang",300};
        Object[] coche2 = new Object[]{"Opel","Astra",100};
        Object[] coche5 = new Object[]{"Opel","Corsa",110};
        Object[] coche3 = new Object[]{"Seat","Leon",120};
        Object[] coche6 = new Object[]{"Seat","Ibiza",150};
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(coche4);
        listaCoches.add(coche5);
        listaCoches.add(coche6);
        listaCoches.add(coche7);
        System.out.println("Los cv del seat son "+listaCoches.get(2)[2]);
    }

    private void mostrarCoches(){
        for (Object[] coche :listaCoches) {
            System.out.printf("%s %s %d\n",coche[0],coche[1],coche[2]);
        }
    }

    private void filtrarDatos(String marca, int cv){
        // sacar todos los coches de una marca pedido por parametros
        for (Object[] item : listaCoches ) {
            if (item[0].toString().equalsIgnoreCase(marca) && (int)item[2]>cv
            ){
                System.out.printf("%s %s %d\n",item[0],item[1],item[2]);
            }
        }
    }

    private void filtrarDatos(String marca){
        // sacar todos los coches de una marca pedido por parametros
        for (Object[] item : listaCoches ) {
            if (item[0].toString().equalsIgnoreCase(marca)){
                System.out.printf("%s %s %d\n",item[0],item[1],item[2]);
            }
        }
    }

    private void reprogramarCoches(String marca, int cv){
        for ( Object[] item: listaCoches) {
            if(item[0].toString().equalsIgnoreCase(marca)){
                item[2] = (int)item[2]+cv;
            }
        }

        /*for (int i = 0; i < listaCoches.size(); i++) {
            if(listaCoches.get(i)[0].toString().equalsIgnoreCase(marca)){
                listaCoches.get(i)[2] = (int)listaCoches.get(i)[2]+cv;
            }
        }*/
    }

}
