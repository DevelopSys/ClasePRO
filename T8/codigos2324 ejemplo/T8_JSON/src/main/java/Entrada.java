import controller.OperacionesJSON;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        OperacionesJSON operacionesJSON = new OperacionesJSON();
        //operacionesJSON.lecturaAPI();
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Indica el nombre de la liga de la cual quieres ver los equipos");
        //String liga = scanner.nextLine();
        //operacionesJSON.lecturaAPIEquipos(liga);
        operacionesJSON.consultaTabla(4335,"2020-2021");
    }
}
