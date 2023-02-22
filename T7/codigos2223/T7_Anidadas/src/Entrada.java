import model.Base;
import model.*;


public class Entrada {
    public static void main(String[] args) {
        Base base = new Base("Ejemplo",10,false);
        Base.ClaseHija claseHija = base.new ClaseHija("palabra hija",
                20, true);
        //base.agregarClaseHija(claseHija);
        System.out.println(base.getClaseHija().getPalabraHija());

    }
}
