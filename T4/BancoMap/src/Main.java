import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static HashMap<Integer, Object[]> listaCuentas = new HashMap<>();
    private static int id = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {

            System.out.println("1. Abrir cuenta");
            System.out.println("2. Consultar cuenta");
            System.out.println("3. Ingresar saldo");
            System.out.println("4. Restirar saldo");
            System.out.println("5. Ver bloqueados");
            System.out.println("6. Eliminar bloqueados");
            System.out.println("7. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Indica titular");
                    String titular = scanner.next();
                    System.out.println("Indica pin");
                    int pin = scanner.nextInt();
                    System.out.println("Indica saldo");
                    int saldo = scanner.nextInt();
                    int nCuenta = (int) (Math.random() * 9001) + 1000;
                    /*if(abrirCuenta(titular,saldo,pin,nCuenta)){
                        System.out.println("Cuenta abierta correctamente");
                    } else {
                        System.out.println("Fallo en el proceso");
                    }*/
                    System.out.println(abrirCuenta(titular, saldo, pin, nCuenta) ? "Cuenta abierta" : "Fallo en proceso");
                }
                case 2 -> {
                    System.out.println("Indica tu numero de cuenta");
                    int nCuenta = scanner.nextInt();
                    System.out.println("Indica titular");
                    String titular = scanner.next();
                    System.out.println("Indica pin");
                    int pin = scanner.nextInt();
                    System.out.println("Indica saldo");
                    Object[] cuentaBuscar = buscarCuenta(nCuenta);
                    if (cuentaBuscar != null && cuentaBuscar[2].toString().equalsIgnoreCase(titular)
                            && (Integer) cuentaBuscar[3] == pin) {
                        mostrarDatos(cuentaBuscar);
                    } else {
                        System.out.println("No existe ese nCuenta");
                    }
                }
                case 3 -> {
                    System.out.println("Indica tu numero de cuenta");
                    int nCuenta = scanner.nextInt();
                    System.out.println("Indica titular");
                    String titular = scanner.next();
                    System.out.println("Indica pin");
                    int pin = scanner.nextInt();
                    System.out.println("Indica saldo a ingresar");
                    int saldo = scanner.nextInt();
                    Object[] cuentaBuscar = buscarCuenta(nCuenta);
                    if (cuentaBuscar != null && cuentaBuscar[2].toString().equalsIgnoreCase(titular)
                            && (Integer) cuentaBuscar[3] == pin) {
                        if (saldo > 0) {
                            cuentaBuscar[4] = (Integer) cuentaBuscar[4] + saldo;
                        } else {
                            System.out.println("No se pueden ingresar saldo negativo");
                        }

                    } else {
                        System.out.println("No existe ese nCuenta");
                    }
                }
                case 4 -> {
                    System.out.println("Indica tu numero de cuenta");
                    int nCuenta = scanner.nextInt();
                    System.out.println("Indica titular");
                    String titular = scanner.next();
                    System.out.println("Indica pin");
                    int pin = scanner.nextInt();
                    System.out.println("Indica saldo a sacar");
                    int saldo = scanner.nextInt();
                    Object[] cuentaBuscar = buscarCuenta(nCuenta);
                    if (cuentaBuscar != null && cuentaBuscar[2].toString().equalsIgnoreCase(titular)
                            && (Integer) cuentaBuscar[3] == pin) {
                        if (saldo > 0 && ((Integer) cuentaBuscar[4] - saldo < -1000)) {
                            cuentaBuscar[4] = (Integer) cuentaBuscar[4] - saldo;
                        } else {
                            System.out.println("No se pueden ingresar saldo negativo");
                        }

                    } else {
                        System.out.println("No existe ese nCuenta");
                    }
                }
                case 5 -> {
                    mostrarBloqueados();
                }
                case 6 -> {
                    eliminarBloqueados();
                }
                case 7 -> System.out.println("Saliendo...");
            }

        } while (opcion != 7);
    }

    public static boolean abrirCuenta(String titular, int saldo, int pin, int nCuenta) {
        if (buscarCuenta(nCuenta) == null) {
            Object[] cuenta = new Object[]{id, nCuenta, titular, pin, saldo};
            id++;
            listaCuentas.put((Integer) cuenta[1], cuenta);
            System.out.println("Tu numero de cuenta es " + nCuenta);
            return true;
        }
        return false;

    }

    public static Object[] buscarCuenta(int nCuenta) {
        return listaCuentas.get(nCuenta);
    }

    public static void mostrarBloqueados() {
        Iterator<Object[]> listaBloqueados = listaCuentas.values().iterator();
        while (listaBloqueados.hasNext()) {
            Object[] cuenta = listaBloqueados.next();
            if ((Integer) cuenta[4] <= -1000) {
                mostrarDatos(cuenta);
            }
        }
    }

    public static void eliminarBloqueados() {
        Iterator<Object[]> listaBloqueados = listaCuentas.values().iterator();
        while (listaBloqueados.hasNext()) {
            Object[] cuenta = listaBloqueados.next();
            if ((Integer) cuenta[4] <= -1000) {
                listaCuentas.remove((Integer) cuenta[1]);
            }
        }
    }

    public static void mostrarDatos(Object[] cuenta) {
        System.out.println("Los datos de la cuenta son:");
        for (Object item : cuenta) {
            System.out.println(item);
        }
    }
}
