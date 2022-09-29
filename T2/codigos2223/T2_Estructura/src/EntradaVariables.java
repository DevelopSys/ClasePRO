public class EntradaVariables {

    public static void main(String[] args) {
        System.out.println("Tipos de variable");
        // palabras -> String siempre ""
        // si no tiene valor asignado es null
        // variable compleja
        String nombre = "Borja";
        String apellido = "null";
        // letra -> char se ponen entre ''
        // si no tiene valor de -1
        // variable primitiva
        char grupoSang = 'A';
        // números -> int
        // byte , short
        // no le doy valor es 0
        // variable primitiva
        int edad = 0;

        // numeros con decimales y grandes -> double y float
        // si no tiene valor es 0.0
        // variable primitiva
        double peso = 68.5;
        // verdadero / false --> true false
        // boolean si no le doy valor será false
        // variable primitiva
        Boolean aprobado = true;
        System.out.println(nombre.length());
        System.out.println(apellido.length());
        System.out.println(edad);
        System.out.println(grupoSang);
        System.out.println(peso);
        System.out.println(aprobado);


        //realizarSaludo();
        valoresMaxMin();
    }

    /* Crear un metodo que se llame salurar y crear variables que guarden
       con vuestro nombre, apellido edad y salga por consola el saludo:

       "HOLA BORJA MARTIN, TIENES 38 AÑOS y ESTAS EN LA CLASE DE PROGRAMACION"
    * */

    public static void realizarSaludo() {

        String nombre = "Borja", apellido = "Martin";
        int edad = 38;
        /*System.out.println("Hola eres "+nombre+" "+apellido+", tienes "+edad+" años y estas en clase de programacion");
        System.out.print("Hola sin salto \n");
        System.out.print("Otra linea\n");*/
        System.out.printf("Hola eres %s %s y tienes %d años y estás en la clase de programación"
                ,nombre,apellido,edad);
    }
    public static void valoresMaxMin(){

        // Obtener los valores max y minimos de cada uno de los tipos
        // int float double short byte

        byte numeroByte = 9;
        short numeroShort= 9000;
        int numeroInt= 3456789;
        long numeroLong = 234567;
        float numeroFloat;
        double numeroDoule;

        byte maxValor = Byte.MAX_VALUE;
        byte minValor = Byte.MIN_VALUE;

        short maxValorShort = Short.MAX_VALUE;
        short minValorShort = Short.MIN_VALUE;

        int maxValorInt = Integer.MAX_VALUE;
        int minValorInt = Integer.MIN_VALUE;

        float maxValorFloat = Float.MAX_VALUE;
        float minValorFloat = Float.MIN_VALUE;

        // SACAR EL VALOR MAX Y MIN DE TODAS LAS VARIABLES
        //               MAX        MIN
        //  Integer     2345        34567
        //  Double     45678        23456
        System.out.println("Byte");
        System.out.println("Valor max: "+maxValor);
        System.out.println("Valor min: "+minValor);

        System.out.println("Short");
        System.out.println("Valor max: "+maxValorShort);
        System.out.println("Valor min: "+minValorShort);

        System.out.println("Integer");
        System.out.println("Valor max: "+maxValorInt);
        System.out.println("Valor min: "+minValorInt);

        System.out.println("Float");
        System.out.println("Valor max: "+maxValorFloat);
        System.out.println("Valor min: "+minValorFloat);

        //System.out.print("TIPO\t\t\t\tMAX\t\t\t\t\t\t\t\t\t\t\t\t\tMIN\n");
        //System.out.printf("Integer\t\t\t\t%d\t\t\t\t\t\t\t\t\t\t\t%d\n",maxValorInt, minValorInt);
        //System.out.printf("Double\t\t\t\t%.2f\t\t\t\t%.2f\n",maxValorFloat, minValorFloat);
        
    }


}
