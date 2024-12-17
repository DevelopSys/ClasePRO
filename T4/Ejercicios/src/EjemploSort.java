import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjemploSort {

    public static void main(String[] args) {


        ArrayList<Object[]> listado = new ArrayList<>();
        listado.add(new Object[]{"Mesa 1", 45.6});
        listado.add(new Object[]{"Mesa 2", 55.6});
        listado.add(new Object[]{"Mesa 3", 25.6});
        listado.add(new Object[]{"Mesa 4", 15.6});
        listado.add(new Object[]{"Mesa 5", 85.6});
        Collections.sort(listado, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if (Double.parseDouble(o1[1].toString()) > Double.parseDouble(o2[1].toString()))
                    return 1;
                else if (Double.parseDouble(o1[1].toString()) < Double.parseDouble(o2[1].toString()))
                    return -1;
                else
                    return 0;
            }
        });
        for ( Object[] item : listado) {
            System.out.println(item[0].toString());
        }
    }
}
