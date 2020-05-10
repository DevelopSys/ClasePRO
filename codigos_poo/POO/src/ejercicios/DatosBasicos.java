package ejercicios;

import ejercicios.utils.Usuario;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class DatosBasicos {

    Scanner teclado;
    ArrayList<Usuario> listaUsuarios;

    public DatosBasicos() {
        teclado = new Scanner(System.in);
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuarios() {

        String nombre, apellio, dni;
        int telefono, edad;
        String continuar;
        do {
            System.out.println("Intro nombre");
            nombre = teclado.next();
            System.out.println("Intro apellido");
            apellio = teclado.next();
            System.out.println("Intro dni");
            dni = teclado.next();
            System.out.println("Intro telefono");
            telefono = teclado.nextInt();
            System.out.println("Intro edad");
            edad = teclado.nextInt();
            listaUsuarios.add(new Usuario(nombre, apellio, dni, telefono, edad));
            System.out.println("Quieres continuar (SI/NO)");
            continuar = teclado.next();
        } while (continuar.toUpperCase().equals("SI"));

        exportarLista();
    }

    public void exportarLista(){

        File f = new File("src/ejercicios/documentos/ej1.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            if (listaUsuarios.isEmpty()){
                System.out.println("La lista está vacia");
            } else {
                for (Usuario item:listaUsuarios) {
                    bw.write(item.toString());
                    bw.newLine();
                }
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
