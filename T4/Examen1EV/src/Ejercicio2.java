import java.util.Scanner;

public class Ejercicio2 {
    static int saldo = 5;
    final static int PRECIO_AGUA = 1;
    final static int PRECIO_ZUMO = 2;
    final static int PRECIO_BOCATA = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("1. Comprar agua");
            System.out.println("2. Comprar zumo");
            System.out.println("3. Comprar bocata");
            System.out.println("4. Recargar saldo");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            System.out.println("Que quires hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Indica que articulo");
                    int articulo = scanner.nextInt();
                    comprarArticulo(articulo);
                }
                case 2 -> {
                    System.out.println("Indica que articulo");
                    int articulo = scanner.nextInt();
                    comprarArticulo(articulo);
                }
                case 3 -> {
                    System.out.println("Indica que articulo");
                    int articulo = scanner.nextInt();
                    comprarArticulo(articulo);
                }
                case 4 -> {
                    System.out.println("Indica que saldo quieres incrementar");
                    int saldoIncremento = scanner.nextInt();
                    if (saldoIncremento < 1) {
                        System.out.println("Operacion no permitida");
                    } else
                        saldo += saldoIncremento;
                }
                case 5 -> System.out.println("El saldo actual es de " + saldo);
            }
        } while (opcion != 6);
    }

    public static void comprarArticulo(int articulo) {
        int compra = 0;
        switch (articulo) {
            case 1 -> {
                if (saldo >= PRECIO_AGUA) {
                    compra = PRECIO_AGUA;
                } else {
                    System.out.println("No hay saldo suficiente");
                    return;

                }
            }
            case 2 -> {
                if (saldo >= PRECIO_ZUMO) {
                    compra = PRECIO_ZUMO;
                } else {
                    System.out.println("No hay saldo suficiente");
                    return;
                }
            }
            case 3 -> {
                if (saldo >= PRECIO_BOCATA) {
                    compra = PRECIO_BOCATA;
                } else {
                    System.out.println("No hay saldo suficiente");
                    return;
                }
            }
        }
        saldo -= compra;
    }
}
