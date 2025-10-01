public class EntradaIF {
    public static void main(String[] args) {
        int numero = 2;
        String mensaje;
        /*if (numero >= 0) {
            // mensaje = "Continuando el bloque";
            // System.out.println("El numero es positivo");
            // System.out.println(mensaje);
            mensaje = "Positivo";
        } else {
            // System.out.println("El numero es negativo");
            mensaje = "Nevativo";
        }
        System.out.println("El resultaod es "+mensaje);*/

        // el numero esta entre 0 y 9.99
        // el numero esta entre 10 y 99.99
        // el numero esta entre 100 y 999.99
        // el numero no esta entre los anteriores
        numero = 19;
        if (numero>0){
            if (numero<10){
                System.out.println("El numero esta entre 0 y 9.99");
            } else if (numero<100){
                System.out.println("El numero esta entre 10 y 99.99");
            } else if (numero<1000) {
                System.out.println("El numero esta entre 100 y 999.99");
            } else{
                System.out.println("No esta entre los anteriores");
            }
        } else {
            System.out.println("Numero negativo, no vale");
        }





    }
}
