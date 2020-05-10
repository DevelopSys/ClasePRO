package ejercicios;

import ejercicios.utils.Usuario;
import videos.almacenamiento.FicheroExcel;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class JuegoAdivinar {

    private Scanner teclado;
    ArrayList<Usuario> listaUsuarios;

    public JuegoAdivinar() {

        teclado = new Scanner(System.in);
        listaUsuarios = new ArrayList<>();
    }

    public void iniciarJuego(){
        String nombreJugador;
        int intentos =0;
        int numeroIntro = -1;
        int aleatorio = (int) (Math.random()*10);
        System.out.println("aleatorio:" +aleatorio);
        System.out.println("introduce nombre");
        nombreJugador = teclado.next();

        do{
            intentos++;
            System.out.println("Introduce número");
            numeroIntro = teclado.nextInt();


        }while (numeroIntro!=aleatorio);

        Usuario u = new Usuario(nombreJugador,intentos);
        listaUsuarios.add(u);

        exportarResultado();
    }

    private void exportarResultado() {
        File f = new File("src/ejercicios/documentos/juego.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);

            for (Usuario usuario:listaUsuarios) {
                bw.write(usuario.formatoJuego());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
