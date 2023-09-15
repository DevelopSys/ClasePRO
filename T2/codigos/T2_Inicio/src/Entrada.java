public class Entrada {

    // Esto es un comentario de linea simple
    public static void main(String[] args) {

        /*String nombre = "Borja";
        int edad = 18;
        System.out.printf("Mi nombre es %s y tengo %d años\n",nombre,edad);
        System.out.println("Mi nombre es "+nombre+" y tengo "+edad+" años");
        System.out.print("Mi edad es "+edad);*/
        new Entrada().saludar();
        new Entrada().saludarSecundario();
        new Entrada().saludarPerso("Borja");
        new Entrada().saludarPerso("Celia");
        new Entrada().sumarNumeros(5,20);
        new Entrada().dividir(9,2);
        // Crea un nuevo programa que muestre ¡Hola mundo!, para la salida por consola
        // se haga en un método sin datos de entrada ni salida de nombre “saludar”.
    }

    // Crea un método que se llame saludarPerso el cual admita un parámetro de tipo
    // string y muestre por consola el mensaje "Hola NombreIntroducido".
    public void saludarPerso(String nombre){
        System.out.println("Hola "+nombre);
    }

    // Crea un método que admita como parámetros dos números y muestre
    // por consola su suma.

    public void sumarNumeros(int operando1, int operando2){
        System.out.println("La suma de los sumeros es: "+(operando1+operando2));
    }

    public void dividir(int operando1, int operando2){
        System.out.println("La division de los numeros es: "+((double)operando1/operando2));
    }




    public void saludar() {
        System.out.println("Hola mundo");
        System.out.println("Ejecutada otra linea");
    }

    public void saludarSecundario() {
        System.out.println("Esto es un saludo secundario");

    }

}




