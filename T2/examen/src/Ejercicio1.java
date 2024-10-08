import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {

        // pedir nombre, apellidos, dinero, play, iphone, iva
        // puedo o no comprar
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String nombre = Integer.parseInt(br.readLine());
        System.out.println("Introduce nombre");
        String nombre = scanner.next();
        System.out.println("Introduce apellido");
        String apellido = scanner.next();
        System.out.println("Cuanto dinero tienes");
        int dineroBolsillo = scanner.nextInt();
        System.out.println("Cuanto vale la play (sin iva)");
        double play = scanner.nextInt();
        System.out.println("Cuanto vale la iphone (sin iva)");
        double iphone = scanner.nextInt();
        System.out.println("Que iva se aplica");
        int iva = scanner.nextInt();

        play = play + (play * ((double) iva/100));
        iphone = iphone + (iphone * ((double) iva/100));

        boolean compraPlay = dineroBolsillo>=play;
        boolean compraIphone = dineroBolsillo>=iphone;
        boolean compraTodo = dineroBolsillo >= (play+iphone);
        /*
        if (dineroBolsillo>=play){
            System.out.println("Me puedo comprar la play");
        }
        if (dineroBolsillo>=iphone){
            System.out.println("Me puedo comprar el iphone");
        }
        if (dineroBolsillo >= (play+iphone)){
            System.out.println("Me puedo comprar los dos");
        }*/
        System.out.println("Me puedo comprar la play: "+compraPlay);
        System.out.println("Me puedo comprar el iphone: "+compraIphone);
        System.out.println("Me puedo comprar los dos: "+ compraTodo);
    }
}
