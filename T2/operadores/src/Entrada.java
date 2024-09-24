public class Entrada {

    public static void main(String[] args) {
         // OPERADORES ARITMETICOS - BINARIOS
        System.out.println("OPERADORES ARITMETICOS");
        float operador1 = 10;
        int operador2 = 5;
        float resultado = operador1 + operador2; // 15
        System.out.println("El resultado de la suma es "+resultado);
        resultado = operador1 -operador2; //5
        System.out.println("El resultado de la resta es "+resultado);
        resultado = operador1*operador2; //50
        System.out.println("El resultado de la multiplicacion es "+resultado);
        operador1 = 7;
        operador2 =4;
        resultado = operador1/operador2; //2
        System.out.println("El resultado de la division es "+resultado);
        resultado = operador1%operador2; // 3.0
        System.out.println("El resultado del resto es "+resultado); // 3
        // ARITMETICOS MONARIOS
        resultado = -resultado; // -3
        System.out.println("El resultado del opuesto es "+resultado); // -3
        // resultado = resultado + 1
        resultado++;
        resultado++;
        resultado++;
        resultado++;
        resultado++;
        System.out.println("El resultado del incremento es "+resultado); // 2
        resultado--;
        System.out.println("El resultado del decremento es "+resultado); // 1
        System.out.println("OPERADORES DE ASIGNACION");
        // resultado =1
        operador1 =10;
        resultado+=operador1; // 11
        System.out.println("El resultado de la suma asignada es "+resultado);
        resultado -=6; // 5
        System.out.println("El resultado de la resta asignada es "+resultado);
        resultado*=3; // 15
        System.out.println("El resultado de la multiplicacion asignada es "+resultado);
        resultado/=2; // 7.5
        System.out.println("El resultado de la division asignada es "+resultado);
        resultado%=2; // 1
        System.out.println("El resultado del modulo asignado es "+resultado);
    }
}
