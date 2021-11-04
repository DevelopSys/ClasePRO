import java.util.Scanner;

public class EjercicioFecha {

    public static void main(String[] args) {
        int dia, mes, anio;
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce dia");
        dia = lecturaTeclado.nextInt();

        System.out.println("Introduce mes");
        mes = lecturaTeclado.nextInt();

        System.out.println("Introduce año");
        anio = lecturaTeclado.nextInt();

        if ((mes > 0 && mes < 13) && (dia > 0 && dia < 32)) {

            switch (mes) {

                case 2:
                    if (dia > 29) {
                        System.out.println("fecha incorrecta");
                    } else if (dia == 29) {
                        if (anio % 4 != 0) {
                            System.out.println("fecha incorrecta");
                        } else {
                            // imprimo fecha
                        }
                    } else {
                        // imprimo fecha
                    }
                    break;
                case 4 | 6 | 9 | 11:

                    if (dia > 30) {
                        System.out.println("fecha incorrecta");
                    } else {
                        // imprimo fecha
                    }
                    break;

                default:
                    // imprimo fecha
                    break;

            }

        } else {
            System.out.println();
        }


    }
}
