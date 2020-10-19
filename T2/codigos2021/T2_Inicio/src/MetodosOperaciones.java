import java.util.Scanner;

public class MetodosOperaciones {

    double resultado;


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double op1, op2;

        System.out.println("Vas a realizar operaciones");
        teclado =new Scanner(System.in);
        System.out.println("Introduce primer número");
        op1 = teclado.nextDouble();
        System.out.println("Introduce segundo número");
        op2 = teclado.nextDouble();
        new MetodosOperaciones().metodoSuma(op1,op2);
        new MetodosOperaciones().metodoResta(op1,op2);
        double res = new MetodosOperaciones().metodoMultiplicacion(op1,op2);
        System.out.printf("el resultado de la multiplicaciónes: %.2f%n",res);
        //new MetodosOperaciones().metodoDivision();
        //new MetodosOperaciones().metodoModulo();

    }


    public void metodoSuma(double n1, double n2){
        System.out.println("Operación de suma");
        resultado = n1+n2;
        System.out.printf("El resultado de la suma es: %.2f%n",resultado);
    }
    public void metodoResta(double op1, double op2){
        System.out.println("Operación de resta");
        resultado = op1-op2;
        System.out.printf("El resultado de la resta es: %.2f%n",resultado);
    }

    public double metodoMultiplicacion(double op1, double op2){
        System.out.println("Operación de multiplicación");
        resultado = op1*op2;
        //System.out.printf("El resultado de la multiplicación es: %.2f%n",resultado);
        return resultado;
    }
    /*public void metodoDivision(){
        teclado =new Scanner(System.in);
        System.out.println("Operación de división");
        System.out.println("Introduce primer número");
        op1 = teclado.nextDouble();
        System.out.println("Introduce segundo número");
        op2 = teclado.nextDouble();
        resultado = op1/op2;
        System.out.printf("El resultado de la división es: %.2f%n",resultado);
    }
    public void metodoModulo(){
        teclado =new Scanner(System.in);
        System.out.println("Operación de módulo");
        System.out.println("Introduce primer número");
        op1 = teclado.nextDouble();
        System.out.println("Introduce segundo número");
        op2 = teclado.nextDouble();
        resultado = op1%op2;
        System.out.printf("El resultado de la módulo es: %.2f%n",resultado);
    }*/
}
