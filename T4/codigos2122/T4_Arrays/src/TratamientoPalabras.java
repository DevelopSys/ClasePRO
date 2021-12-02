public class TratamientoPalabras {

    public static void main(String[] args) {

        String palabraTratar = "Ejemplo de palabra";
        System.out.println(palabraTratar.toLowerCase());
        // palabraTratar = "Esto es un palabra"
        System.out.println(palabraTratar.toUpperCase());
        // palabraTratar = "Esto es un palabra"
        String palabraComparar = "ejemplo de palabra";
        if (palabraTratar.equalsIgnoreCase(palabraComparar)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        String fraseCompleta = "Esto es una frase completa de un conjunto de palabras";
        System.out.println(fraseCompleta.length());

        // saber cuantas palabras tengo
        String[]palabras = fraseCompleta.split(" ");
        System.out.println("El numero de palabras es: "+palabras.length);

        // saber cuantas letras tengo
        int letasTotales = 0;
        for ( String item : palabras){
            letasTotales += item.length();
        }
        System.out.println("El numero total de letras es; "+letasTotales);

        fraseCompleta.replaceAll(" ","")
                .replaceAll(",","")
                .replaceAll(".","");

        //System.out.println(fraseCompleta);

        System.out.println(fraseCompleta.replaceAll(" ","").length());

        for (int i = 0; i < fraseCompleta.length(); i++) {
            if (fraseCompleta.charAt(i) != ' ') {
                System.out.println(fraseCompleta.charAt(i));
            }
        }

        System.out.println(fraseCompleta.indexOf("w"));
        //fraseCompleta.indexOf(9876);
        fraseCompleta = "Esto es una frase completa de un conjunto de palabras";
        //fraseCompleta.substring("10","20");
        String correo = "borja.martin@cesjuawsedrftgyhujnpablosegundo.es";
        // borja.martin
        // cesjuanpablosegundo.es
        correo.indexOf("@");
        String nombre = correo.substring(0,correo.indexOf("@"));
        System.out.println(nombre);
        String dominio  = correo.substring(correo.indexOf("@")+1,correo.length());
        System.out.println(dominio);
        





    }
}
