package clases.anonimas;

public class Entrada {

    public static void main(String[] args) {
       ClaseOperaciones claseOperaciones = new ClaseOperaciones();
       claseOperaciones.realizarOperaciones(new Operaciones() {
           @Override
           public void suma(int a, int b) {
               int suma = a+b;
               System.out.println("La suma es "+suma);
           }

           @Override
           public void resta(int a, int b) {
                int resta = a -b;
                if (resta<0){
                    System.out.println("numero negativo");
                }
                else {
                    System.out.println("La resta es "+resta);
                }
           }
       },10,5);


       claseOperaciones.realizarOperaciones(new Operaciones() {
           @Override
           public void suma(int a, int b) {

               System.out.println("No se puede hacer");
           }

           @Override
           public void resta(int a, int b) {
               System.out.println("No se puede hacer");

           }
       },54,234);
    }


}
