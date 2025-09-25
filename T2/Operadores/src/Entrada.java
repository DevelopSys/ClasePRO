public class Entrada {

    public static void main(String[] args) {
        /*
        // ARITMETICOS
        /*int operadorUno = 10;
        operadorUno++;
        operadorUno++;
        operadorUno++;
        operadorUno++;
        operadorUno++; // operadorUno = operadorUno +1
        System.out.println(operadorUno);
        operadorUno--;
        operadorUno--; // operadorUno = operadorUno -1
        operadorUno = -operadorUno;
        System.out.println(operadorUno);
        int operandoUno = 10;
        int operandoDos = 7;
        System.out.println("Vamos a calcular la suma");
        int suma = operandoUno+operandoDos;
        int resta =  operandoDos - operandoUno;
        int multi = operandoUno* operandoDos;
        double division = (double) operandoUno/operandoDos;
        int modulo = operandoUno%operandoDos;
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multi es "+multi);
        System.out.println("La division es "+division);
        System.out.println("El modulo es "+modulo);*/
        /*
        // ASIGNACION
        int operando1 = 10;
        int operando2 = 5;
        operando1 += 10; // suma = 20
        operando1-=3;
        operando1*=2;
        operando1/=3; // 11
        operando1%=operando2; //
        System.out.println("El operando 1 vale "+operando1);*/
        // COMPARACION
        /*int numeroUno = 10;
        int numeroDos = 10;
        boolean resultado = numeroDos>numeroUno;
        resultado = numeroDos>=numeroUno;
        resultado = numeroDos<numeroUno;
        resultado = numeroDos<=numeroUno;
        resultado = numeroDos==numeroUno;
        resultado = numeroDos!=numeroUno;
        System.out.println("La comparacion es "+resultado);*/
        // LOGICOS
        /*int numeroUno = 20;
        int numeroDos = 10;
        int numeroTres = 15;
        boolean acierto = false;
        boolean resultado = !acierto || numeroUno==numeroDos
                            && numeroTres!=numeroUno && numeroDos<100;
        System.out.println("El resultado de la comparacion es "+resultado);*/
        // COMPARACION DE CADENAS
        String nombre1 = "Borjaces.com";
        String nombre2 = "borja";
        //boolean resultado = nombre1.length()>=5;
        boolean resultado = nombre1.contains("@");
        System.out.println("Las palabras son iguales "+resultado);

    }
}
