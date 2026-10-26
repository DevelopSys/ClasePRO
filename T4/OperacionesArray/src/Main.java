import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica cuantos numeros quieres guardar");
        int tamanio = lector.nextInt();
        int[] numeros = new int[tamanio];
        int opcion;
        do {
            System.out.println("1. Rellenar");
            System.out.println("2. Rellenar sin repetir");
            System.out.println("3. Rotar izq");
            System.out.println("4. Rotar der");
            System.out.println("5. Rotar pares");
            System.out.println("6. Invertir");
            System.out.println("7. Ordenar");
            System.out.println("8. Mostrar");
            System.out.println("9. Salir");
            System.out.println("Indica que quieres hacer");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1 -> {
                    for (int i = 0; i < numeros.length; i++) {
                        int aleatorio = (int) (Math.random() * numeros.length) + 1;
                        numeros[i] = aleatorio;
                    }
                }
                case 2 -> {
                    for (int i = 0; i < numeros.length; i++) {
                        int aleatorio;
                        do {
                            aleatorio = (int) (Math.random() * numeros.length) + 1;
                        } while (estaNumero(numeros, aleatorio));
                        numeros[i] = aleatorio;
                        /*
                        aleatorio = (int) (Math.random() * numeros.length) + 1;
                        if (estaNumero(numeros,aleatorio)){
                            i--;
                        }else {
                            numeros[i] = aleatorio;
                        }*/

                    }
                }
                case 3 -> {
                    if (estaRelleno(numeros)) {
                        int primerElemento = numeros[0];
                        for (int i = 0; i < numeros.length - 1; i++) {
                            numeros[i] = numeros[i + 1];
                        }
                        numeros[numeros.length - 1] = primerElemento;

                    } else {
                        System.out.println("No se ha rellenado todavia");
                    }
                }
                case 4 -> {
                    if (estaRelleno(numeros)) {
                        int ultimoElemento = numeros[numeros.length - 1];
                        for (int i = numeros.length - 1; i > 0; i--) {
                            numeros[i] = numeros[i - 1];
                        }
                        numeros[0] = ultimoElemento;
                    } else {
                        System.out.println("No se ha rellenado todavia");
                    }
                }
                case 5 -> {
                    if (estaRelleno(numeros)) {
                        for (int i = 0; i < numeros.length ; i+=2) {
                            int aux = numeros[i];
                            numeros[i] = numeros[i+1];
                            numeros[i+1] = aux;
                        }
                    } else {
                        System.out.println("No se ha rellenado todavia");
                    }
                }
                case 6 -> {
                    if (estaRelleno(numeros)) {
                        for (int i = 0; i < numeros.length / 2; i++) {
                            int aux = numeros[i];
                            numeros[i] = numeros[numeros.length-1-i];
                            numeros[numeros.length-1-i] = aux;
                        }
                    } else {
                        System.out.println("No se ha rellenado todavia");
                    }
                }
                case 7 -> {
                    if (estaRelleno(numeros)) {
                        // rotas
                    } else {
                        System.out.println("No se ha rellenado todavia");
                    }
                }
                case 8 -> {
                    for (int item : numeros) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                }
                case 9 -> System.out.println("Saliendo");
                default -> System.out.println("No contemplado");
            }
        } while (opcion != 0);
    }

    public static boolean estaNumero(int[] numeros, int numero) {
        for (int item : numeros) {
            if (item == numero) {
                return true;
            }
        }
        return false;
    }

    public static boolean estaRelleno(int[] numeros) {
        int sumatorio = 0;
        for (int item : numeros) {
            sumatorio += item;
        }
        return sumatorio != 0;
    }
}
