public class Entrada {

    static int edadClase = 50;
    // mod_acc mod_adional mod_ret nombre (argumentos) { cuerpo }
    public static void main (String[] args){
        // edadClase =20;
        System.out.println("Proyecto de variables");
        valoresMaximos();

        // Tipo nombre = valor (el valor es opcional)
        String nombre="Borja";
        final String CIF = "B12345";

        char letra='A';
        Character letraCompleta = 'a';

        short numeroPequeno = 23; // numero pequepo (-255,255)
        Short pequenioCompleto = 23;
        //pequenioCompleto


        int edad = 40; // numeros sin decimal (-65.435, 65.435)
        Integer edadCompleja = 40;


        System.out.println("Mi edad es "+edad);
        edad = 41;
        System.out.println("Cambiando edad");
        System.out.println("Mi edad es "+edad);
        long telefono = 123456789;
        Long telefonoComplejo = 123123123L;


        float altura = 3.14f;
        Float alturaCompleja =4.123123f;


        double decimalesDetalle = 3.1415163456;
        Double decimalesComplejos;

        boolean carnet = true; // false
        Boolean carnetComplejo;

    }

    public static void miMetodo(){
        String nombre = "Julia";
        int edad = 40;
        edadClase=80;
    }

    public static void otroMetodo(){
        int edadClase =90;
        // this.edadClase =90;
    }

    public static void valoresMaximos(){
        System.out.println("Impimiento los valores maximos y minimos de los tipos");
    }


}
