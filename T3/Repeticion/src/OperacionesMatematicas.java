public class OperacionesMatematicas {

    // acceso retorno nombreMetodo(arg) { cuerpo }

    public void realizarSaludo(String nombre){
        System.out.println("Hola "+nombre);
    }

    public int realizarSuma(int operador1, int operador2){
        if (numerosValidos(operador1,operador2)){
            int resultado = operador1+operador2;
            // System.out.printf("El resultado de la suma de %d + %d es %d%n"
            //         ,operador1,operador2,resultado);
            return resultado;
        }
        return 0;

    }

    private boolean numerosValidos(int op1, int op2){
        if(op1>0 && op2>0){
            return true;
        }
        return false;
    }

}
