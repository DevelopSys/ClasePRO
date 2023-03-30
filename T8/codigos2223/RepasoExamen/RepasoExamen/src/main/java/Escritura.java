import java.io.*;

public class Escritura {

    public static void main(String[] args) {
        String texto = "Este contenido muestra cual es el siguiente paso en el examen de programación. Para comprobar que está todo bien, debes publicar un comentario individual en la tarea del examen con el siguiente texto: 'Ejercicio uno completado'. Podrás continuar con el siguiente ejercicio, para lo cual la contraseña para desbloquear el fichero es la siguiente: programaciondam2223";
        File f = new File("src/main/java/ejercicio1.txt");
        /*FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(f);
            for (char letra :texto.toCharArray()) {

                    int numero = (byte)letra;
                    fileWriter.write(String.valueOf(numero)+" ");

            }

            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(f);
            bufferedReader = new BufferedReader(reader);

            String lectura = bufferedReader.readLine();
            for (String item : lectura.split(" ") ) {

                int itemCodigo = Integer.valueOf(item);
                System.out.print((char) itemCodigo);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
