package controller;

import java.io.*;

public class OperacionesFicheros {

    public void informacionFichero(String path) {
        // src/resources/carpeta1
        File file = new File(path);
        System.out.println("Es un fichero?? " + file.isFile());
        System.out.println("Es una carpeta?? " + file.isDirectory());
        System.out.println("Puedo leerlo?? " + file.canRead());
        System.out.println("Tamaño?? " + file.length());
        System.out.println("Existe?? " + file.exists());


        // si es una carpeta quiero obtener cuantos elementos tengo dentro
        if (file.isDirectory()) {
            System.out.println("El numero de elementos que hay dentro es de: " + file.list().length);
            for (File item : file.listFiles()) {
                System.out.println(item.getName());
                if (item.isDirectory()) {

                }
            }
        }
    }

    public void listarFicheros(String path) {

        File file = new File(path);
        System.out.println("\t" + file.getName());
        if (file.isDirectory()) {
            System.out.println("Listando el contenido");
            for (File item : file.listFiles()) {
                // cada nivel le pongo un \t adicional
                listarFicheros(item.getAbsolutePath());
            }
        }
    }

    public void crearFichero(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error en la escritura");
            }
        } else{
            System.out.println(file.getName());
        }
    }

    public void crearCarpeta(String path) {
        File file = new File(path);
        if (file.mkdirs()){
            System.out.println("Carpeta creada correctamente");
        } else {
            System.out.println("Fallo en la creacion de la carpeta");
        }
    }

    public void leerFichero(String path) {
        File file = new File(path);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            int codigo;

            while ((codigo=reader.read())!=-1){
                System.out.print((char) codigo);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se puede leer el fichero");
            // dime otra ruta
            // leerFichero("");
        } catch (IOException e) {
            System.out.println("Error en los permisos de lectura");
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Errpr en el cerrado del fichero");
            }
        }

    }

    public void leerFicheroLineas(String path) {
        File file = new File(path);
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            // reader = new FileReader(file);
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea ;

            while ((linea=bufferedReader.readLine())!=null){
                // linea = bufferedReader.readLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no existe, por favor indica solucion");
        } catch (IOException e) {
            System.out.println("No tienes permisos de lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void descifrarCodigos(String s) {
        File file = new File(s);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String linea = reader.readLine();
            String[] codigos = linea.split(" ");
            for (String item: codigos) {
                char letra = (char) (Integer.parseInt(item));
                System.out.print(letra);
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }
}
