package dificil;

import java.util.ArrayList;

public class Carton {

    private ArrayList<Integer> listaNumeros;
    private int aciertos;
    private int id;

    public Carton(){
        listaNumeros = new ArrayList<>();
        // generar 10 números únicos del 1 al 99
        rellenarCarton();
        boolean existe = false ;

        /*for (int i = 0; i < 10; i++) {
            int aleatorio = (int) (Math.random() *99 +1);
            for ( int num : listaNumeros) {
                if (num == aleatorio){
                    existe = true;
                    i--;
                }
            }

            if (!existe){
                listaNumeros.add(aleatorio);
            }
        }*/

        /*do{
            int aleatorio = (int) (Math.random() *99 +1);
            for ( int num : listaNumeros) {
                if (num == aleatorio){
                    existe = true;
                }
            }
        }while (!existe);*/
    }
    public Carton(int id){
       this.id = id;
       listaNumeros = new ArrayList<>();
       // generar 10 números únicos del 1 al 99
        rellenarCarton();
        aciertos =0;
    }

    private void rellenarCarton(){

        boolean existe = false;
        //for (int i = 0; i < 10; i++) {
            do {
                int aleatorio = (int) (Math.random() * 12 + 1);
                if (!estaNumero(aleatorio)) {
                    listaNumeros.add(aleatorio);
                }
            }while (listaNumeros.size()<10);
        //}
    }

    public void mostrarNumeros(){
        for (int numero:listaNumeros) {
            System.out.println(numero);
        }
    }

    public boolean estaNumero(int numero){

        for (int num : listaNumeros) {
            if (num == numero){
                aciertos++;
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
