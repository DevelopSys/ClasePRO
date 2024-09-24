public class EntradaComparacion {

    public static void main(String[] args) {
        int n1 = 40;
        int n2 = 30;
        // > mayor que
        boolean resultado = n1>n2; // 20>30
        System.out.println("El resultado de la comparacion es "+resultado);
        // >= mayor o igual que
        resultado = n2 >= n1; // 30>=40
        System.out.println("El resultado de la comparacion es "+resultado);
        // < menor que
        resultado = n2<n1; // 30<40
        System.out.println("El resultado de la comparacion es "+resultado);
        // <= menos o igual
        n2 = 80;
        n1 = 30;
        resultado = n2<=n1; // 80<30
        System.out.println("El resultado de la comparacion es "+resultado);
        // == igual que
        n1=90;
        n2=90;
        resultado = n1 == n2; // 90 == 90
        System.out.println("El resultado de la comparacion es "+resultado);
        // != diferente
        resultado = n1!=n2; // 90 != 90 -> false
        System.out.println("El resultado de la comparacion es "+resultado);
        // negacion !
        resultado = !resultado; // true
        System.out.println("OPERADIORES LOGICOS");
        n1 = 30;
        n2 = 40;
        boolean n3 = true;
        int n4 = -20;
        boolean resultadoLogico = (n1<n2) && n3 && n4<0; // true && true && true = true
        System.out.println("El resultado logico de las && es "+resultadoLogico);
        resultadoLogico = (n1>0) || (n2!=n1) || n3 || n4>0; // true || true || true || false = true
        System.out.println("El resultado logico de las && es "+resultadoLogico);
        boolean resultadoCompuesto = ((n1>n2)&& !n3 && (n4<10)) || n4>0 || n2>0;
        String palabra1 = "Hola";
        String palabra2 = "hola";
        boolean resultadoPalabras = palabra1.equalsIgnoreCase(palabra2);
        System.out.println("El resultado de la comparacion de las palabras es "
                +resultadoPalabras);

        n1 = 4;
        n2 = 3;
        double resultadoOperacion = (double) n1/n2;
        double n1Double = (double) n1;
        String n1String = String.valueOf(n1);
        String palabra = "Hola ya terminamos";
        int numeroPalabra = Integer.parseInt(palabra);
        System.out.println("El resultado de la division es "+resultadoOperacion);




    }
}
