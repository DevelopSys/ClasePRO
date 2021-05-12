import org.json.*;
import utils.Coche;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OperacionesFicheros {


    public void iniciarFicheros() {
        //String os = System.getProperties().getProperty("os.name");
        //System.out.println(os);
        File fichero = new File("/Users/borjam/Desktop/nuevo.txt");
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerDirectorio() {
        File escritorio = new File("/Users/borjam");
        if (escritorio.isDirectory()) {
            System.out.println("Listando directorio");
            /*File[] listaFicheros = escritorio.listFiles();
            for (File itemFile :listaFicheros) {
                System.out.println(itemFile.getName());
            }*/
            String[] nombres = escritorio.list();
            for (String itemNombre : nombres) {
                System.out.println(itemNombre);
            }

        } else {
            System.out.println("No es un directorio");
        }
    }

    public void listarDirectorio(File file, int tabulaciones) {

        int contador = tabulaciones;
        //System.out.println("\t"+file.getName());
        for (int i = 0; i < contador; i++) {
            System.out.print("\t");
        }
        System.out.println(file.getName());


        if (file.isDirectory()) {
            System.out.println("Listando directorio");
            contador++;
            for (File fileItem : file.listFiles()) {
                // TODO lo mismo pero con una ruta inicial diferente
                listarDirectorio(fileItem, contador);
                //System.out.println(fileItem.getName());
            }
        }
    }

    public void crearCarpeta() throws IOException {
        System.out.println("Introduce el nombre de la carpeta a crear");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        String nombre = lectura.readLine();
        File file = new File("/Users/borjam/Desktop/" + nombre + ".txt");
        file.mkdir();
    }

    public void getPArentFile() {
        File file = new File("/Users/borjam/Desktop");
        file.getParentFile().listFiles();
    }

    public void leerFichero() throws IOException {
        File file = new File("src/resources/lectura.txt");
        //System.out.println(file.isFile());
        if (file.exists() && file.canRead()) {
            // FileReader
            FileReader lectorFichero = new FileReader(file);
            //int numeroChar = lectorFichero.read();
            //System.out.println(numeroChar);
            int numeroChar;
            /*do{
                numeroChar = lectorFichero.read();
                System.out.println(numeroChar);
                System.out.println((char) numeroChar);

            }while (numeroChar!=-1);*/

            numeroChar = 0;
            String palabraCompleta = "";
            while ((numeroChar = lectorFichero.read()) != -1) {
                //numeroChar = lectorFichero.read();
                System.out.println(numeroChar);
                //System.out.println((char) numeroChar);
                palabraCompleta += (char) numeroChar;
            }
            System.out.println(palabraCompleta);


        } else {
            System.out.println("Fichero no encontrado o sin permisos");
        }

    }

    public void lecturaRepaso() {
        File file = new File("src/resources/lectura.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            // int ASCII
            int asciCode = 0;
            String lectura = "";
            // asigna al asciCode del cabezal y lo compara con -1
            // asciCode != -1
            while ((asciCode = fileReader.read()) != -1) {

                System.out.print((char) asciCode);
                lectura += (char) asciCode;
            }
            // quiero el contenido entero de la lectura
            System.out.println();
            System.out.println("Impresion entera");
            System.out.println(lectura);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void lecturaJSON() {
        File file = new File("src/resources/lecturaJSON.txt");
        String lecturaJSON = "";
        int numeroLectura = 0;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            while ((numeroLectura = fileReader.read()) != -1) {
                lecturaJSON += (char) numeroLectura;
            }
            JSONObject jsonObject = new JSONObject(lecturaJSON);
            String nombre = jsonObject.getString("nombre");
            int edad = jsonObject.getInt("edad");
            JSONArray aficiones = jsonObject.getJSONArray("aficiones");
            System.out.println(nombre);
            System.out.println(edad);
            for (int i = 0; i < aficiones.length(); i++) {
                // ves capturando cada una de las posiciones
                String aficionItem = aficiones.getString(i);
                System.out.println(aficionItem);
            }
            JSONArray hijos = jsonObject.getJSONArray("hijos");
            for (int i = 0; i < hijos.length(); i++) {
                String nombreHijo = hijos.getJSONObject(i).getString("nombre");
                System.out.println(nombreHijo);
            }


            //System.out.println(lecturaJSON);
            /*String nombre = jsonObject.getString("nombre");
            int edad = jsonObject.getInt("edad");
            JSONArray aficiones = jsonObject.getJSONArray("aficiones");
            System.out.println(nombre);
            System.out.println(edad);
            //System.out.println(aficiones);
            for (int i = 0; i < aficiones.length(); i++) {
                System.out.println(aficiones.get(i));
            }*/


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            //System.out.println("Error en la creacion del JSON");
            e.printStackTrace();
        }
    }

    public void lecturaClaves() {
        File file = new File("src/resources/partidos.txt");
        String lecturaJSON = "";
        int numeroLectura = 0;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            while ((numeroLectura = fileReader.read()) != -1) {
                lecturaJSON += (char) numeroLectura;
            }

            JSONObject jsonObject = new JSONObject(lecturaJSON);
            JSONArray partidos = jsonObject.getJSONArray("events");
            //System.out.println(partidos);
            JSONObject partidoUno = partidos.getJSONObject(0);
            Iterator iterator = partidoUno.keys();
            JSONArray arrayClaves = partidoUno.names();

            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (partidoUno.get(key) != null) {
                    System.out.println(partidoUno.get(key));
                }
            }

            //System.out.println(arrayClaves);
            /*for (int i = 10; i < arrayClaves.length(); i++) {
                if (partidoUno.get((String) arrayClaves.get(i))!= null) {
                    System.out.println(partidoUno.get((String) arrayClaves.get(i)));
                }
            }*/


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            //System.out.println("Error en la creacion del JSON");
            e.printStackTrace();
        }

    }

    public void lecturaPartidos() {
        File file = new File("src/resources/partidos.txt");
        FileReader fileReader = null;
        String temporada = "";
        int lectura = 0;

        try {
            fileReader = new FileReader(file);
            while ((lectura = fileReader.read()) != -1) {
                temporada += (char) lectura;
            }

            JSONObject temporadaJSON = new JSONObject(temporada);
            JSONArray array = temporadaJSON.getJSONArray("events");
            for (int i = 0; i < array.length(); i++) {
                JSONObject partido = array.getJSONObject(i);
                String local = partido.getString("strHomeTeam");
                String visitante = partido.getString("strAwayTeam");
                ;
                int golesLocal = Integer.valueOf(partido.getString("intHomeScore"));
                int golesVisitante = Integer.valueOf(partido.getString("intAwayScore"));
                System.out.printf("%s %d vs %s %d %n", local, golesLocal, visitante, golesVisitante);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    public void lecturaBuffer() {

        File file = new File("src/resources/lectura.txt");
        FileReader lector = null;
        BufferedReader bufferedReader = null;

        try {
            lector = new FileReader(file);
            bufferedReader = new BufferedReader(lector);
            String linea = null;
            String lecturaCompleta = "";

            while ((linea = bufferedReader.readLine()) != null) {
                lecturaCompleta += linea + "\n";
            }


            System.out.println(lecturaCompleta);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void escrituraFichero() {
        File f = new File("src/resources/escritura.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // aseguro la existencia

        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            fw.write("Esto es un ejemplo de escritura");
            fw.write("\n");
            fw.write("Esto es otra linea del mensaje");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escrituraBuffer() {
        File f = new File("src/resources/escritura_buffer.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(31);
            bw.newLine();
            bw.write("Esto es una linea nueva pero anexada");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirWhile() {
        File file = new File("src/resources/escritura_while.txt");
        boolean existe = true;
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            existe = false;
        }

        FileWriter fw;
        BufferedWriter bw = null;
        //Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numeroLineas = 6;
        try {
            fw = new FileWriter(file, existe);
            bw = new BufferedWriter(fw);

            do {
                System.out.println("Mete la linea que quieres guardar");
                String linea = bufferedReader.readLine();
                bw.write(linea);
                bw.newLine();
                numeroLineas--;
            } while (numeroLineas > 0);

        } catch (IOException e) {

        } finally {
            try {
                bw.close();
            } catch (IOException e) {

            }
        }

    }


    public void escrituraObjetos(){

        // FILE --> FILEOUTPUSTREAM --> OBJECTOUTPUTSTREAM --> ESCRITURA DE OBJETOS
        File file = new File("src/resources/objetos.obj");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            ArrayList<Coche> listaCoches = new ArrayList<>();
            Coche coche =new Coche("Ford","Focus",200,2000);
            Coche coche2 =new Coche("Opel","Astra",200,2000);
            listaCoches.add(coche);
            listaCoches.add(coche2);
            oos.writeObject(listaCoches);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void lecturaObjetos(){
        // FILE --> FILEINPUTSTREAM --> OBJETINPUTSTREAM --> LEACTURA DEL OBJETO
        File file = new File("src/resources/objetos.obj");

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            ArrayList<Coche>coches = (ArrayList<Coche>) ois.readObject();

            //System.out.printf("%s",coche.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
