package genericos;

import java.util.ArrayList;

public class ColeccoinCamisetas {

    private ArrayList<Camiseta> lista;

    public ColeccoinCamisetas(ArrayList<Camiseta> lista) {
        this.lista = lista;
    }

    public void addCamiseta(Camiseta c){
        lista.add(c);
    }
}
