package ejercicios.ejercicioLlamadas;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        //Llamada llamada = new Llamada();
        LlamadaLocal llamadaLocal1 = new LlamadaLocal(123, 123, 40);
        LlamadaLocal llamadaLocal2 = new LlamadaLocal(234, 123, 40);
        LlamadaLocal llamadaLocal3 = new LlamadaLocal(657, 123, 40);
        LlamadaLocal llamadaLocal4 = new LlamadaLocal(876, 123, 40);
        //llamadaLocal.mostrarDatos();
        LlamadaProvincial llamadaProvincial1 = new LlamadaProvincial(876, 123, 40);
        LlamadaProvincial llamadaProvincial2 = new LlamadaProvincial(123, 123, 40);
        LlamadaProvincial llamadaProvincial3 = new LlamadaProvincial(654, 123, 40);
        LlamadaProvincial llamadaProvincial4 = new LlamadaProvincial(1234, 123, 40);
        //llamadaProvincial.mostrarDatos();
        LlamadaNacional llamadaNacional1 = new LlamadaNacional(123, 123, 40, 3);
        LlamadaNacional llamadaNacional2 = new LlamadaNacional(323, 123, 50, 3);
        LlamadaNacional llamadaNacional3 = new LlamadaNacional(123, 455, 40, 3);
        //llamadaNacional.mostrarDatos();

        Centralita centralita = new Centralita();
        centralita.agregarLlamada(llamadaLocal1);
        centralita.agregarLlamada(llamadaLocal2);
        centralita.agregarLlamada(llamadaLocal3);
        centralita.agregarLlamada(llamadaLocal4);
        centralita.agregarLlamada(llamadaNacional1);
        centralita.agregarLlamada(llamadaNacional2);
        centralita.agregarLlamada(llamadaNacional3);
        centralita.agregarLlamada(llamadaProvincial1);
        centralita.agregarLlamada(llamadaProvincial2);
        centralita.agregarLlamada(llamadaProvincial3);
        centralita.agregarLlamada(llamadaProvincial4);
        //centralita.calcularCostes("LlaMADAProvinCIal");
        //centralita.mostrarLlamadas("LlaMADAProvinCIal");
        //centralita.mostrarLlamadas(LlamadaLocal.class);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Que tipo de llamadas quieres mostrar");
        System.out.println("1. Llamadas localas");
        System.out.println("2. Llamadas nacionales");
        System.out.println("3. Llamadas provinciales");
        int opcionLlamada = teclado.nextInt();
        Class claseLlamada = null;
        switch (opcionLlamada) {
            case 1:
                //centralita.mostrarLlamadas(LlamadaLocal.class);
                claseLlamada = Llamada.class;
                break;
            case 2:
                //centralita.mostrarLlamadas(LlamadaNacional.class);
                claseLlamada = LlamadaNacional.class;
                break;
            case 3:
                claseLlamada =LlamadaProvincial.class;
                break;
            default:
                System.out.println("No existe el tipo de llamada introducido");
                break;
        }
        centralita.mostrarLlamadas(claseLlamada);



    }
}
