import java.util.ArrayList;
import java.util.Scanner;

public class EntradaLector {

    public static void main(String[] args) {
        Lector lector = new Lector();
        Scanner scanner = new Scanner(System.in);
        int categoriaOpcion = 0;
        ArrayList<String> categorias = lector.lecturaCategorias();
        for (int i = 0; i < categorias.size(); i++) {
            System.out.printf("%d - %s%n",i,categorias.get(i));
        }
        System.out.printf("%d - %s%n",categorias.size(),"Todos");

        System.out.println("Que categoría quieres mostar");
        categoriaOpcion = scanner.nextInt();
        // cuando se produce el error - si el n intro es más grade que size catagorias --> error
        System.out.println("La categoria seleccionada es: "+categorias.get(categoriaOpcion));
        lector.lecturaProductos(categorias.get(categoriaOpcion));
        // imprimir todos los productos



    }
}
