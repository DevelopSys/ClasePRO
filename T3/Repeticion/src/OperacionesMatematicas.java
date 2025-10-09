public class OperacionesMatematicas {

    // acceso retorno nombreMetodo(arg) { cuerpo }

    public void realizarSaludo(String nombre){
        System.out.println("Hola "+nombre);
    }

    // suma -> int
    public int sumar(int operador1, int operador2){
        if (validarNumeros(operador1,operador2)){
            return operador1+operador2;
        }
        return 0;
    }
    // resta -> int
    public Integer restar(int operando1, int operando2){
        // 5,5
        if (validarNumeros(operando1, operando2)){
            return operando1-operando2;
        }
        return null;
    }
    // multi -> int
    // division -> double

    // validarNumero (tienen que ser mayor que 0) -> true/false

    private boolean validarNumeros(int op1, int op2){
        return op1>0&&op2>0;
    }

    /*
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
    }*/

}
