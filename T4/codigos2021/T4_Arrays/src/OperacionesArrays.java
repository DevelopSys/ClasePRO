import java.util.Arrays;

public class OperacionesArrays {

    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros.length);
        /*int[] numerosCopia = Arrays.copyOf(numeros,11);
        System.out.println(numerosCopia.length);
        System.out.println(numerosCopia[9]);
        numeros = null;*/
        //numeros = Arrays.copyOf(numeros,11);
        //{1,2,3,4,5,6,7,8,9,10,0}
        //numeros[10]=11;
        numeros = Arrays.copyOf(numeros,12);
        //{1,2,3,4,5,6,7,8,9,10,0,0};
        //numeros[11]=12;
        //Arrays.cop
        //{1,2,3,4,5,6,7,8,9,10,0,0};
        int[] arraySub =  Arrays.copyOfRange(numeros,0,4);

        new OperacionesArrays().metodoUno("hola","adios");
        new OperacionesArrays().metodoUno("asd","asdass");
        new OperacionesArrays().metodoUno("asd","gfd");

    }


    public void metodoUno(String param1, String param2){


    }


}
