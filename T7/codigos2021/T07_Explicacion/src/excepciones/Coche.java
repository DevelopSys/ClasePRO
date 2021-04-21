package excepciones;

import java.util.ArrayList;

public class Coche {


    public void metodoFallo() throws NullPointerException{
        ArrayList lista = null;
        System.out.println(lista.size());
    }

}
