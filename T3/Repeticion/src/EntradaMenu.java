import java.util.Scanner;

public class EntradaMenu {

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("MAIN Menu");
        int opcion;
        do{
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            System.out.println("Que quieres hacer");
            opcion = lectorTeclado.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Seleccionado sumar");
                }
                case 2->{
                    System.out.println("Seleccionado restar");
                }
                case 3->{
                    System.out.println("Seleccionado multiplicar");
                }
                case 4->{
                    System.out.println("Seleccionado dividir");
                }
                case 5->{
                    System.out.println("Saliendo del menu.....");
                }
                default -> {
                    System.out.println("Caso no contemplado");
                }
            }
        }while (opcion!=5);


        System.out.println("Terminando el programa completo");

    }
}
