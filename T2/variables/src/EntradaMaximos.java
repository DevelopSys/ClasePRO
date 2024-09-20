public class EntradaMaximos {

    public static void main(String[] args) {
        int numero = 9;
        System.out.println("Vamos a mostrar los MIN y MAX de cada tipo");
        //valoresMaximos();
        System.out.println("Terminando la ejecucion.....");
    }

    public static void valoresMaximos(){
        // byte, short, int, long, float, double
        System.out.println("El valor minimo del byte es "+Byte.MIN_VALUE
                +" y el maximo es "+Byte.MAX_VALUE);
        System.out.printf("El valor minimo del byte es %d y el maximo es %d\n"
                ,Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("El valor minimo del short es %d y el maximo es %d\n"
                ,Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("El valor minimo del int es %d y el maximo es %d\n"
                ,Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("El valor minimo del long es %d y el maximo es %d\n"
                ,Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("El valor minimo del double es %f y el maximo es %f\n"
                ,Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("El valor minimo del float es %f y el maximo es %f\n"
                ,Float.MIN_VALUE, Float.MAX_VALUE);
        
    }

}
