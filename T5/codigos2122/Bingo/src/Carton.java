import java.util.ArrayList;

public class Carton {

    private ArrayList<Integer> listaNumeros;
    private int numeroAciertos;




    public Carton(){
        listaNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) (Math.random()*51);
            listaNumeros.add(aleatorio);
        }
    }

    public void comprobarNumero(int n){
        for ( Integer integer: listaNumeros ) {
            if (integer == n){
                numeroAciertos++;
            }
        }
    }

    public void verNumeros(){
        for ( Integer integer : listaNumeros ) {
            System.out.println("\t "+integer);
        }
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public void setNumeroAciertos(int numeroAciertos) {
        this.numeroAciertos = numeroAciertos;
    }


}
