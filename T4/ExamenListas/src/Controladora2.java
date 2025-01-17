import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Controladora2 {

    private ArrayList<Object[]> listaAlumos;

    public Controladora2() {
        listaAlumos = new ArrayList<>();
    }

    public void agregarAlumno(String nombre) {
        Object[] alumno = new Object[]{nombre, -1};
        listaAlumos.add(alumno);
    }

    public void calificar() {
        for (int i = 0; i < listaAlumos.size(); i++) {
            int nota = (int) (Math.random() * 10) + 1;
            Object[] alumno = listaAlumos.get(i);
            alumno[1] = nota;
        }
    }

    public void verSuspensos() {
        for (Object[] item : listaAlumos) {
            if ((int) item[1] < 5) {
                System.out.println("El alumno es "
                        + item[0] + " y tiene una nota de " + item[1]);
            }
        }
    }

    public void listarOrdenados() {
        listaAlumos.sort(new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if ((int) o1[1] > (int) o2[1]) {
                    return 1;
                } else if ((int) o1[1] < (int) o2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Object[] item : listaAlumos) {
            System.out.println("El alumno es "
                    + item[0] + " y tiene una nota de " + item[1]);

        }
    }

}
