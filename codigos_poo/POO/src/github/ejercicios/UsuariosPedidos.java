package github.ejercicios;


import github.ejercicios.utils.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosPedidos {

    ArrayList<Usuario> arrayList;

    public UsuariosPedidos() {
        this.arrayList = new ArrayList<>();
    }

    public void pedirUsuarios(File f){

        String continuar;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("introduce nombre");
            String nombre = sc.next();
            System.out.println("introduce ap");
            String apellido = sc.next();
            System.out.println("introduce ed");
            int edad = sc.nextInt();
            Usuario usuario = new Usuario(nombre, apellido, edad);
            arrayList.add(usuario);
            System.out.println("Continuar (SI/NO)");
            continuar = sc.next();
        } while (continuar.toUpperCase().equals("SI"));

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            for (Usuario u: arrayList) {

                bw.write(u.toString());
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
