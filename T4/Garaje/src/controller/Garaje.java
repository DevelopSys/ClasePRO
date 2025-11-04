package controller;

public class Garaje {

    // propiedades
    private Object[][] listaCoches; // null
    private double acumulado; // 0.0

    // constructor
    public Garaje() {
        listaCoches = new Object[5][6];
        // acumulado = 0.0;
    }

    // metodos - funcionalidades
    public void admitirCoche(String matricula,
                             String marca,
                             String modelo,
                             int cv, String averia) {

        // NO SE PUEDEN ADMITIR COCHES QUE YA ESTEN EN EL GARAJE
        // NO PUEDO ADMITIR UN COCHE CON UNA MATRICULA DUPLICADA

        int huecosLlenos = 0;
        Object[] cocheBuscado = estaCoche(matricula);
        if (cocheBuscado != null) {
            System.out.println("El coche ya lo tengo guardado");
        } else {
            for (int i = 0; i < listaCoches.length; i++) {
                if (listaCoches[i][0] == null) {
                    listaCoches[i] =
                            new Object[]{matricula, marca, modelo, cv, 0.0, averia};
                    System.out.println("Guardado correctamente");
                    break;
                } else {
                    huecosLlenos++;
                }
            }
            if (huecosLlenos == listaCoches.length) {
                System.out.println("El garaje esta lleno, no podemos admitir el coche");
            }
        }

    }


    // cuando se admite un coche, no se guarda siempre en la posicion 0.
    // un coche se guarda en la primera posicion disponible

    // en caso de no tener hueco -> salta un aviso "no hay sitio"
    // en caso de si tener hueco -> saltar un aviso "guardado correctamente"


    private boolean estaCocheBool(String matricula) {

        for (Object[] coche : listaCoches) {
            if (coche[0] != null && coche[0].equals(matricula)) {
                return true;
            }
        }

        return false;
    }

    public void obtenerInformacion(String matricula) {

        if (estaCoche(matricula) != null) {
            for (Object dato : estaCoche(matricula)) {
                System.out.print(dato);
            }
            System.out.println();
        } else {
            System.out.println("El coche no esta");
        }


    }

    private Object[] estaCoche(String matricula) {

        for (Object[] coche : listaCoches) {
            if (coche[0] != null && coche[0].equals(matricula)) {
                return coche;
            }
        }

        return null;
    }

    public void listarCoches() {


        for (Object[] coche : listaCoches) {
            for (Object dato : coche) {
                System.out.print(dato + " ");
            }
            System.out.println();
        }
    }

    public void areglarCoche(String matricula) {
        Object[] coche = estaCoche(matricula);
        if (coche != null) {
            System.out.println("Procedemos al arreglo");
            if ((int) coche[3] <= 100 && coche[5].equals("aceite")) {
                coche[4] = (double) coche[4] + 100;
                acumulado += 100;

            } else if ((int) coche[3] > 100 && coche[5].equals("aceite")) {
                coche[4] = (double) coche[4] + 200;
                acumulado += 200;
            } else if ((int) coche[3] < 100 && coche[5].equals("motor")) {
                coche[4] = (double) coche[4] + 400;
                acumulado += 400;
            } else if ((int) coche[3] >= 100 && coche[5].equals("motor")) {
                coche[4] = (double) coche[4] + 600;
                acumulado += 600;
            } else {
                coche[4] = (double) coche[4] + 50;
                acumulado += 50;
            }
            eliminarCoche(matricula);
            // si la averia es aceite y tienes 100 o menos, te sumo a las averias 100
            // si la averia es aceite y tienes mas de 100 , te sumo a las averias 200
            // si la averia es motor y tienes menos de 100 , te sumo a las averias 400
            // si la averia es motor y tienes mas o 100 , te sumo a las averias 600
            System.out.println("Coche arreglado correctamente");
        } else {
            System.out.println("No encontramos el coche indicado");
        }
    }

    private void eliminarCoche(String matricula){
        for (int i = 0; i <listaCoches.length; i++) {
            if (listaCoches[i][0].toString().equals(matricula)){
                listaCoches[i] = new Object[listaCoches[i].length];
                break;
            }
        }
    }

    public double getAcumulado() {
        return acumulado;
    }
}
