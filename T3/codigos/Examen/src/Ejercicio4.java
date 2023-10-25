import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // introduce maestra
        // secundarias hasta que incluida

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce maestra");
        String maestra = scanner.next();
        String secundario="";

        do{
            System.out.println("Introduce secundaria");
            secundario = scanner.next();
        }while (!maestra.contains(secundario));

        if (maestra.equals(secundario)){
            for (int i = maestra.length()-1; i >=0 ; i--) {
                System.out.print(maestra.charAt(i));
            }
        } else {
            System.out.println("La longitud de la maestra es: "+maestra.length());
        }

    }
}
