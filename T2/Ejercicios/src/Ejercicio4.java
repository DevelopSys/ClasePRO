import java.util.Scanner;

public class Ejercicio4 {

    /*
    Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y
    los bocadillos a 2,05€. El camarero les pregunta cuántas bebidas y
    bocadillos quieren. Calcula el coste de la consumición,
    mostrando primero el coste de las bebidas y de los bocadillos. (Bar)
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double PRECIO_BEBIDAS = 1.25;
        final double PRECIO_BOCATAS = 2.05;
        System.out.println("Indica el numero de bebidas que pediras");
        int nBebidas = lector.nextInt();
        System.out.println("Indica el numero de bocatas que pediras");
        int nBocatas = lector.nextInt();
        double precioTotalBebidas = PRECIO_BEBIDAS * nBebidas;
        double precioTotalBocatas = PRECIO_BOCATAS * nBocatas;
        System.out.printf("Los bocatas valen %.2f\n",precioTotalBocatas);
        System.out.printf("Los bebidas valen %.2f\n",precioTotalBebidas);
        System.out.printf("La consumicion total es %.2f\n",precioTotalBebidas+precioTotalBocatas);

    }
}
