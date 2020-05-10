package clases.ejercicios.Inventario;

import java.util.ArrayList;

public class SupermercadoEsp<X extends Inventariable> {

    private ArrayList<X> listaElementos;

    public SupermercadoEsp() {
        this.listaElementos = new ArrayList<>();
    }

    public void registrarElemento(X elemento) {
        listaElementos.add(elemento);
    }

    public void mostrarPrecios() {


        for (X elemento : listaElementos) {

            //TODO
                (elemento).calcularPrecio();

        }
    }


}
