public class Entrada {

    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros =new OperacionesFicheros();
        // operacionesFicheros.cifrarMensaje("Este mensaje sera cifrado",3, "src/resources/cifrado.txt");
        //operacionesFicheros.descifrarMensaje(3, "src/resources/cifrado_codigo.txt");
        operacionesFicheros.descifrarMensajeCodigo(3, "src/resources/cifrado_codigo.txt");
    }
}
