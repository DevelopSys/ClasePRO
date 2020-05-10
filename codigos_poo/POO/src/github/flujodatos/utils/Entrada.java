package github.flujodatos.utils;

import java.io.*;

public class Entrada {

    public static void main(String[] args) {

        File f = new File("src/github/flujodatos/documentos/agenda.obj");
        Agenda a = new Agenda();

        if (f.exists()){
            a.importarAgenda(f);
        }

        if (a.getUsuarios().size()>0){
            a.listarUsuarios();
        }else{
            System.out.println("la agenda está vacía");
        }

        a.agregarUsuario(new Usuario("Jose","Martin Perez","000000A",1111111));
        a.agregarUsuario(new Usuario("Pedro","Lopez Merino","000000B",2222222));
        a.agregarUsuario(new Usuario("Luis","Herrera Gomez","000000B",2222222));
        a.borrarUsuario("000000C");
        a.borrarUsuario("000000B");
        a.listarUsuarios();
        a.exportarAgenda(f);
    }
}
