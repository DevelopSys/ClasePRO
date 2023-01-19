package ejercicioAgenda;

import java.util.Scanner;

public class EntradaMenu {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        String dniTemporal = "";
        int opcionSeleccionada = 0;
        Agenda agenda = new Agenda();

        do {

            System.out.println("1: Agregar persona a la agenda\n" +
                    "2: Borrar persona\n" +
                    "3: Editar persona\n" +
                    "4: Buscar persona\n" +
                    "5: Listar agenda \n" +
                    "6: Vaciar agenda");
            System.out.println("Introduce la opcion seleccionada");
            opcionSeleccionada = lecturaTeclado.nextInt();
            switch (opcionSeleccionada) {
                case 1:
                    System.out.println("Dime el dni de la persona que quieres agregar");
                    dniTemporal = lecturaTeclado.next();
                    if (agenda.existePersona(dniTemporal)!=null){
                        System.out.println("La persona no se puede add porque existe el dni");
                    }else {
                        System.out.println("Dime el nombre de la persona que quieres agregar");
                        String nombreTemporal = lecturaTeclado.next();
                        System.out.println("Dime el apellido de la persona que quieres agregar");
                        String apellidoTemporal = lecturaTeclado.next();
                        System.out.println("Dime el telefono de la persona que quieres agregar");
                        int telefonoTemporal = lecturaTeclado.nextInt();
                        agenda.agregarPersona(new Persona(nombreTemporal,apellidoTemporal,dniTemporal,telefonoTemporal));
                    }

                    break;
                case 2:
                    System.out.println("Dime el dni de la persona que quieres borrar");
                    dniTemporal = lecturaTeclado.next();
                    agenda.borrarPersona(dniTemporal);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Dime que dni quieres buscar");
                    dniTemporal = lecturaTeclado.next();
                    agenda.buscarPersona(dniTemporal);
                    break;
                case 5:
                    agenda.listarAgenda();
                    break;
                case 6:
                    agenda.vaciarAgenda();
                    break;
            }
        }while (opcionSeleccionada!=7);



    }


}
