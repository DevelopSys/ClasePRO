package ejercicios.ejercicioConsumicion;

import java.util.ArrayList;

public class Cuenta {

    private int identificador;
    private ArrayList<Articulo> listaArticulos;
    private boolean pagado;

    public Cuenta(int identificador){
        this.identificador = identificador;
        this.listaArticulos = new ArrayList<>();
        //this.pagado = true;
    }

    public void agregarArticulo(Articulo articulo){
        this.listaArticulos.add(articulo);
    }

    public int getNumeroArticulos(){
        return this.listaArticulos.size();
    }

    public double getCosteTotal(){

        double coste = 0;

        for ( Articulo articulo : listaArticulos ) {
            coste += articulo.getCoste();
        }

        return coste;
    }

    public boolean coincideCuenta(ArrayList<Cuenta> listCuentas, int id ){

        for (int i = 0; i < listCuentas.size(); i++) {
            if (listCuentas.get(i).identificador == id && !listCuentas.get(i).pagado) {
             return true;
            }
        }

        return false;
    }


    public void setPagado() {
        if (isPagado()){
            System.out.printf("La cuenta ya ha sido pagada");
        } else {
            this.pagado = true;
        }

    }

    public boolean isPagado() {
        return pagado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void mostrarDatos(){
        System.out.println("ID: " +getIdentificador());
        System.out.println("Estado: " + isPagado());
        System.out.println("Coste: " + getCosteTotal());
    }
}
