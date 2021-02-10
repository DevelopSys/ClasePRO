package ejercicios.ejercicioCentralita;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Centralita centralita = new Centralita();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce llamada local");
            System.out.println("Introduce número origen");
            long nOrigen = teclado.nextLong();
            System.out.println("Introduce número destino");
            long nDestino = teclado.nextLong();
            System.out.println("Introduce número duración");
            double duracion = teclado.nextDouble();
            LlamadaLocal llamadaLocal = new LlamadaLocal(nOrigen,nDestino,duracion);
            centralita.agregarLlamadaLocal(llamadaLocal);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce llamada nacionales");
            System.out.println("Introduce número origen");
            long nOrigen = teclado.nextLong();
            System.out.println("Introduce número destino");
            long nDestino = teclado.nextLong();
            System.out.println("Introduce número duración");
            double duracion = teclado.nextDouble();
            System.out.println("Introduce destino");
            char destino = teclado.next().charAt(0);
            LlamadaNacional llamadaNacional =
                    new LlamadaNacional(nOrigen,nDestino,duracion,destino);
            centralita.agregarLlamadaNacional(llamadaNacional);
        }

        System.out.println("***Listando locales***");
        centralita.listarLlamadasLocal();
        System.out.println("***Listando nacionales***");
        centralita.listarLlamadasNacional();
        System.out.println("***Listando costes acumulados***");
        System.out.println(centralita.getCosteAcumulado()); // 56



    }
}
