
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*double numeroDecimal = 1.54785;
        System.out.printf("El número es: %.4f \n", numeroDecimal);
        String saludo = String.format("El número es: %.4f ", numeroDecimal);
        System.out.println(saludo);*/

        // ARITMETICOS
        // MONARIOS
        int numero = 10;
        // incrementa en uno
        numero++;
        numero++;
        // decremento
        numero--;
        // cambio de signo
        numero = -numero;
        //System.out.printf("%d %n", numero);

        //BINARIOS
        int operando1 = 10;
        int operando2 = 5;
        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int multiplicacion = operando1 * operando2;
        int division = operando1 / operando2;
        int resto = operando1 % operando2;
        //System.out.printf("%d", resto);

        // ASIGNACION
        int numeroAsig = 5;
        numeroAsig += 5; // numeroAsig = numeroAsig + 5;
        //System.out.printf("%d %n", numeroAsig);
        numeroAsig -= 5; // numeroAsig = numeroAsig -5;
        numeroAsig *= 5; // numeroAsig = numeroAsig *5;
        numeroAsig /= 5; // numeroAsig = numeroAsig /5;
        numeroAsig %= 5; // numeroAsig = numeroAsig %5;
        Scanner teclado = new Scanner(System.in);
        int factura = 0;
        //System.out.println("Introduce el numeor de bebida");
        int bebidas;
        /*bebidas = teclado.nextInt();
        factura +=(bebidas*2); // 0+1
        System.out.println("Introduce el numeor de bebida");
        bebidas = teclado.nextInt();
        factura +=(bebidas*2); // 1+3
        System.out.println(factura);*/
        
        
        // RELACION O COMPARACION  --> boolean
        boolean decision;
        int numero1 = 10;
        int numero2 = 10;
        // valor1<valor2
        decision = numero1<numero2; // 10<5
        System.out.println(decision);
        // valor1>valor2
        decision = numero1>numero2; //10>5
        System.out.println(decision);
        // valor1<=valor2
        decision = numero1<=numero2;
        System.out.println(decision);
        // valor1>=valor2
        decision = numero1>=numero2;
        System.out.println(decision);
        // == comparaciones igualdad entre números
        decision = numero1==numero2;
        System.out.println(decision);
        // valor1 != valor2
        decision = numero1!=numero2;
        System.out.println(decision);
        
        System.out.printf("NOMBRE \t APELLIDO \t DNI \t LETRA \n");
        System.out.printf("%s \t %s \t %d \t %s \n", "nombre","apellido",123,"A");
        
    }

}
