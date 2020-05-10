package videos.anonimas;

import java.util.ArrayList;

public class Garaje {

    private ArrayList<Coche> coches;

    public Garaje() {
        coches = new ArrayList();
    }

    public void addCoche(Coche c) {
        if (coches.contains(c)) {
            System.out.println("El coche ya está en el garaje");
        }
        else {
            coches.add(c);
        }
    }

    public void removeCoche(Coche c){
        if (coches.contains(c)) {
            System.out.println("Coche eliminado");
            coches.remove(c);
        }
        else {
            System.out.println("no se ha podido eliminar el coche");
        }
    }


}
