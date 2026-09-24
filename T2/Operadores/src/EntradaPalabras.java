public class EntradaPalabras {

    public static void main(String[] args) {
        String frase = "Hola";
        // aritmeticos: +
        // frase = frase+" que tal";
        // asignacion = +=
        frase += " que tal estas";
        String frase2 = "Este es un ejemplo de frase";
        System.out.println(frase);
        // comparacion equal/equalIgnoreCase -> true/false
        boolean iguales = frase.equals("hola que tal");
        boolean igualesSinCap = frase.equalsIgnoreCase("hola que tal");
        System.out.println("Son iguales: "+iguales);
        System.out.println("Son iguales sin Cap: "+igualesSinCap);
        int letrasFrase = frase.length();
        System.out.println("El numero de letras es de "+letrasFrase);
        boolean comprarcionFrases = frase2.length() > frase.length();
        System.out.println("La compracion es "+comprarcionFrases);
        frase = "ejemplo de programacion";
        boolean condicionContiene = frase.contains("programación");
        System.out.println("Condicion contiene "+condicionContiene);
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        System.out.println(frase);
        frase = "Esta frase consta de varias cosas. Lo que quiero es que veais dos oraciones. terminamos";
        int numeroFrases = frase.split("\\.").length; // [f1,f2,f3]
        int numeroPalabras = frase.split(" ").length; // [f1,f2,f3]
        System.out.println("numero de frases: "+numeroFrases);
        System.out.println("numero de palabras: "+numeroPalabras);
        System.out.println("\\thola");
        frase = "Vola que tal";
        // la primera letra de la frase es v?
        boolean comparacionLetra = frase.toLowerCase().charAt(0) == 'v';
    }

}
