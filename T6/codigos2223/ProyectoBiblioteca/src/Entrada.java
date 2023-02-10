import constantes.EnumCD;
import constantes.EnumDVD;
import constantes.TiposCD;
import model.CD;

public class Entrada {

    public static void main(String[] args) {
        /*CD cd1 = new CD(1,1,"titulo",1, TiposCD.educativo);
        CD cd2 = new CD(1,1,"titulo",1, TiposCD.monologo);
        CD cd3 = new CD(1,1,"titulo",1, TiposCD.musical);
        CD cd4 = new CD(1,1,"titulo",1, "cosa");*/

        System.out.println(EnumCD.Monologo);
        System.out.println(EnumCD.Monologo.name());
        System.out.println(EnumCD.Monologo.ordinal());

        EnumDVD.intriga

    }
}
