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

        int huecosLlenos =0;
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
        if (huecosLlenos==listaCoches.length){
            System.out.println("El garaje esta lleno, no podemos admitir el coche");
        }


        // cuando se admite un coche, no se guarda siempre en la posicion 0.
        // un coche se guarda en la primera posicion disponible

        // en caso de no tener hueco -> salta un aviso "no hay sitio"
        // en caso de si tener hueco -> saltar un aviso "guardado correctamente"
    }

    public void listarCoches() {
        for (Object[] coche : listaCoches) {
            for (Object dato : coche) {
                System.out.print(dato + " ");
            }
            System.out.println();
        }
    }


}
