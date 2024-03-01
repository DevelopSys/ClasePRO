package genericos.model;

import java.util.ArrayList;
import java.util.List;

public class MiLista<T> {

    private List<T> lista;

    public MiLista() {
        this.lista = new ArrayList<>();
    }

    public void addElemento(T elemento){
        lista.add(elemento);
    }

    public T estaElemento(T elemento){
        for ( T element : lista ){
            if (element.equals(elemento)){
                return element;
            }
        }

        return null;
    }

    public void imprimirElementos(){
        for (T element:  lista ){

            // si t es un String quiero que ademas indicar la cantidad de
            // letras que teien
            // si t es un Integer quiero que ademas indcar si es positivo
            // o negatico
            // siempre quiere sacar el elemento por consola

            if (element instanceof String){
                System.out.println("El numero de letras es: "
                        +((String) element).length());
            } else if (element instanceof Integer){
                if ( (Integer)element>=0){
                    System.out.println("Positivo");
                } else {
                    System.out.println("Negativo");
                }
            }
            System.out.println(element.toString());

        }
    }
}
