import java.util.ArrayList;

public class EjercicioClase {

    public static void main(String[] args) {
        // rellena con 50 doubles aleatorios

        ArrayList<Double> aleatorios = new EjercicioClase().rellenarArray() ;
        /*ArrayList<Double> aleatorios = new ArrayList<>() ;
        for (int i = 0; i < 50; i++) {
            aleatorios.add(Math.random()*50);
        }*/
        /*for ( Double item : aleatorios ) {
            System.out.printf(String.format("%.2f%n",item));
        }*/
        new EjercicioClase().listarArray(aleatorios);
    }

    public void listarArray(ArrayList<Double> lista){
        for ( Double item : lista ) {
            System.out.printf(String.format("%.2f%n",item));
        }
    }
    public ArrayList<Double> rellenarArray(){
        ArrayList<Double> aleatorios = new ArrayList();

        for (int i = 0; i < 50; i++) {
            aleatorios.add(Math.random()*50);
        }

        return aleatorios;
    }
}
