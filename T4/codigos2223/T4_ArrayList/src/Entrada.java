import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        //listasTipadas();
        //ejercicioNumeros();
        //ejercicioBase1();
        //ejercicioBase2();
        //ejercicioBase3();
        //ejercicioBase4();
        //ejercicioBase5();
        //listasArrays();
        ejercicioCoches();

    }

    private static void ejercicioCoches() {
        ArrayList<Object[]> listaCoches = new ArrayList<>();
        int opcion = 0;
        do{
            System.out.println("1. Agregar coche");
            System.out.println("2. Lista coches");
            System.out.println("3. Buscar marca");
            System.out.println("4. Borrar marca");
            System.out.println("5. Salir");
            System.out.println("Que quieres hacer");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce marca");
                    String marca = new Scanner(System.in).next();
                    System.out.println("Introduce modelo");
                    String modelo = new Scanner(System.in).next();
                    System.out.println("Introduce CV");
                    int cv = new Scanner(System.in).nextInt();
                    listaCoches.add(new Object[]{marca, modelo, cv});
                    break;
                case 2:
                    listarCoches(listaCoches);
                    break;
                case 3:
                    System.out.println("Indica que marca quieres buscar");
                    String marcaBusqueda = new Scanner(System.in).next();
                    buscarMarca(listaCoches,marcaBusqueda);
                    break;
                case 4:
                    System.out.println("Indica que marca quieres borrar");
                    String marcaBorrar = new Scanner(System.in).next();
                    borrarMarca(listaCoches, marcaBorrar);
                    break;
                case 5:
                    System.out.println("Saliendo......");
                    break;
                default:
                    System.out.println("Opción incorrecta, intentalo de nuevo");
            }

        }while (opcion!=5);

        /*Object[] coche1 = new Object[]{"Ford", "Fiesta", 100};
        Object[] coche2 = new Object[]{"Audi", "A5", 200};
        Object[] coche3 = new Object[]{"Mercedes", "C220", 300};

        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        listarCoches(listaCoches);
        System.out.println("Indica que marca quieres buscar");
        String marca = new Scanner(System.in).next();
        buscarMarca(listaCoches,marca);*/
    }

    public static void listarCoches(ArrayList<Object[]> lista){
        if (lista.isEmpty()){
            System.out.println("La lista de los coches está vacía");
        } else {
            for ( Object[] coche : lista ) {
                System.out.printf("Marca: %s \t\tModelo: %s \t\t CV: %d%n"
                        , coche[0], coche[1], coche[2]);
            }
        }

    }
    public static void buscarMarca(ArrayList<Object[]>lista, String marca){

        int cochesEncontrados = 0;

        for ( Object[] coche : lista ) {
            if (((String)coche[0]).equalsIgnoreCase(marca)){
                System.out.printf("Marca: %s \t\tModelo: %s \t\t CV: %d%n"
                        , coche[0], coche[1], coche[2]);
                cochesEncontrados++;
            }
        }

        if (cochesEncontrados==0){
            System.out.println("No hay coches de la marca pedida");
        }
        // si no hay coches de la marca buscada, un aviso
    }

    public static void borrarMarca(ArrayList<Object[]> lista, String marca){
        /*for ( Object[] coche : lista ) {
            if (((String)coche[0]).equalsIgnoreCase(marca)){
                lista.remove(coche);
            }
        }*/
        for (int i = 0; i < lista.size(); i++) {
            if (((String)lista.get(i)[0]).equalsIgnoreCase(marca)){
                lista.remove(i);
            }
        }
    }


    private static void ejercicioAlumnos() {

    }

    private static void listasArrays() {
        ArrayList<Object[]> listaAgenda = new ArrayList<>();


        Object[] usuarioNuevo = new Object[]{"Juanjo", "contrasenia", 18, "correo@ces", "1234A", "user"};
        listaAgenda.add(usuarioNuevo);
        listaAgenda.add(new Object[]{"Borja", "contrasenia", 18, "correo@ces", "1234A", "admin"});
        listaAgenda.add(new Object[]{"Pedro", "1234", 34, "correo@ces", "2345A", "admin"});
        listaAgenda.add(new Object[]{"Juan", "qwer", 23, "correo@ces", "3456A", "user"});
        listaAgenda.add(new Object[]{"Luis", "4567", 54, "correo@ces", "4567A", "user"});
        listaAgenda.add(new Object[]{"Celia", "asdf", 76, "correo@ces", "5678A", "user"});
        listaAgenda.add(new Object[]{"Claudia", "prueba", 23, "correo@ces", "4321", "admin"});
        listaAgenda.add(new Object[]{"Cristina", "ejemplo", 37, "correo@ces", "5432A", "user"});
        listaAgenda.add(new Object[]{"Marcos", "pass", 21, "correo@ces", "6543A", "admin"});

        // usuario Luis --> admin???
        //listaAgenda.get(3)
        //listaAgenda.set(3,new Object[]{"Luis","4567",54,"correo@ces","4567A","admin"});
        usuarioNuevo[5] = "admin";
        System.out.println("Nombre " + listaAgenda.get(0)[0] + " Perfil: " + listaAgenda.get(0)[5]);

        // ¿como imprimo el correo?
        /*for (int i = 0; i < listaAgenda.get(0).length; i++) {
            System.out.println(listaAgenda.get(0)[i]);
        }

        for ( Object item : listaAgenda.get(0) ) {
            System.out.println(item);
        }*/
        // Sacar los datos de todos aquellos elementos que tengan una edad menor de 35
        /*for ( Object[] usuario : listaAgenda ) {
            if ((int)usuario[2]<35){
                for ( Object item : usuario ) {
                    System.out.print(item+" ");
                }
                System.out.println();
            }
        }*/
        // Pedir al usuario por teclado un nombre y una contraseña
        //  Si el usuario no está en la lista --> no existe el usuario
        //  Si el usuario está en la lista pero su pass no es correcta --> pass incorrecta
        //  Si el usuario está en la lista y su pass es correcta pero es user --> privilegios insuficientes
        //  Si el usuario está en la lista y su pass es correcta pero es admin --> acceso correcto
        String nombre = new Scanner(System.in).next();
        String pass = new Scanner(System.in).next();
        Object[] usuario = estaUsuario(nombre, listaAgenda);
        if (usuario != null) {
            // System.out.println("El usuario esta en la lista");
            // su pass no es la correcta
            if (((String) usuario[1]).equals(pass)) {
                // nombre y pass iguales
                if (((String) usuario[5]).equals("admin")) {
                    System.out.println("Acceso correcto");
                } else {
                    System.out.println("No hay privilegios");
                }
            } else {
                System.out.println("Pass incorrecta");
            }
        } else {
            System.out.println("El usuario no esta en la lista");
        }

    }

    public static Object[] estaUsuario(String nombre, ArrayList<Object[]> lista) {


        // busqueda
        for (Object[] usuario : lista) {
            if (((String) usuario[0]).equalsIgnoreCase(nombre)) {
                return usuario;

            }
        }

        return null;

    }


    private static void ejercicioBase5() {
        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Ejemplo");
        listaPalabras.add("Otra");
        listaPalabras.add("Cosa");
        listaPalabras.add("Una");
        listaPalabras.add("Java");

        int contadorLetras = 0;
        String palabraGrande = listaPalabras.get(0).replaceAll(" ", ""), palabraPequenia = listaPalabras.get(0).replaceAll(" ", "");

        for (String item : listaPalabras) {
            contadorLetras += item.replaceAll(" ", "").length();
            if (item.replaceAll(" ", "").length() > palabraGrande.length()) {
                palabraGrande = item;
            }

            if (item.replaceAll(" ", "").length() < palabraPequenia.length()) {
                palabraPequenia = item;
            }
        }

        System.out.println("La palabra más grande es " + palabraGrande);
        System.out.println("La palabra más pequeña es " + palabraPequenia);
        System.out.println("El numero de letras es " + contadorLetras);

    }

    private static void ejercicioBase4() {
        ArrayList<Integer> numerosUno = new ArrayList<>();
        ArrayList<Integer> numerosDos = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            //int aletorio = (int) (Math.random()*21);
            //numerosDos.add(aletorio);
            //numerosUno.add(aletorio);
            numerosUno.add((int) (Math.random() * 21));
            numerosDos.add((int) (Math.random() * 21));
        }

        int contador = 0;
        for (int i = 0; i < numerosDos.size(); i++) {
            if (numerosUno.get(i) == numerosDos.get(i)) {
                contador++;
            }
        }

        System.out.println("el numero de coincidencias es: " + contador);

    }

    private static void ejercicioBase3() {
        ArrayList<String> companieros = new ArrayList<>();
        companieros.add("Alumno1");
        companieros.add("Alumno2");
        companieros.add("Alumno3");
        companieros.add("Alumno4");
        companieros.add("Alumno5");
        companieros.add("Alumno6");
        companieros.add("Alumno7");
        companieros.add("Alumno8");
        companieros.add("Alumno9");
        companieros.add("Alumno10");
        // lista -> size 10 (0-9)
        int aleatorio = (int) (Math.random() * companieros.size());
        System.out.println(companieros.get(aleatorio));


    }

    private static void ejercicioBase2() {
        // 20 valores
        ArrayList<Integer> listaNumeros = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            listaNumeros.add((int) (Math.random() * 101));
        }

        int sumatorio = 0, max = 0, min = 101;
        double media = 0.0;

        for (Integer numero : listaNumeros) {
            sumatorio += numero;
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        media = (double) sumatorio / listaNumeros.size();

        /*for (int i = 0; i < listaNumeros.size(); i++) {
            sumatorio += listaNumeros.get(i);
            if (listaNumeros.get(i)>max){
                max = listaNumeros.get(i);
            }
            if (listaNumeros.get(i)<min){
                min = listaNumeros.get(i);
            }
        }*/
    }

    private static void ejercicioBase1() {
        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Ejemplo");
        listaPalabras.add("Otra");
        listaPalabras.add("Cosa");
        listaPalabras.add("Una");
        listaPalabras.add("Java");

        for (String item : listaPalabras) {
            System.out.println(item);
        }

    }

    private static void ejercicioNumeros() {
        // Crear una lista de numeros (solo numeros)
        // Meter 50 aleatorios entre 0-20
        // Pedir al usuario un número
        // Indicar las veces que se repite dicho número
        // Obtener primera la posicion del numero indicado
        // En el caso de no repetirse nunca, avisar al usuario
        // En el caso de no estar, avisar al usuario
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listaNumeros.add((int) (Math.random() * 21));
        }

        int numeroEvaluar = new Scanner(System.in).nextInt();
        int posicionInicial = -1;
        int numeroRepeticiones = 0;

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) == numeroEvaluar) {
                numeroRepeticiones++;
                if (numeroRepeticiones == 1) {
                    posicionInicial = i;
                }
            }

        }

        if (listaNumeros.contains(numeroEvaluar)) {
            // el numero esta
            if (numeroRepeticiones > 1) {
                // el numero se repite
            } else {
                // el numero no se repite
            }
        } else {
            // el numero no esta
        }
    }

    public static void listasTipadas() {
        ArrayList<String> listaPalabras = new ArrayList();
        listaPalabras.add("Programacion");
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Ejemplo");
        listaPalabras.add("Coincide");
        listaPalabras.add("Mestra");
        listaPalabras.add("Secundaria");
        // busquedas
        //encontraElemento("no existe",listaPalabras);
        if (listaPalabras.contains("Programacion")) {
            System.out.println("Esta la palabra");
        } else {
            System.out.println("No esta la palabra");
        }
        // busca elementos
        // --> se pide una palabra por teclado
        // --> se comprueba si la palabra esta en la lista
    }

    public static void encontraElemento(String elemento, ArrayList<String> lista) {

        boolean encontrado = false;
        String palabraEncontrada = null;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(elemento)) {
                encontrado = true;
                palabraEncontrada = lista.get(i);
                break;
            }
        }

        // despues del break o terminar
        if (palabraEncontrada != null) {
            System.out.println("Palabra encontrada");
        } else {
            System.out.println("Palabra no encontrada");
        }
    }

    public static void inicioArrayList() {
        ArrayList lista = new ArrayList();
        // tamaño de la lista
        System.out.println(lista.size());
        // añadir elemento
        lista.add("Elemento 1");
        lista.add(12345);
        lista.add(true);
        lista.add('A');
        System.out.println(lista.size());
        // eliminar elementos
        lista.remove(2);
        lista.remove(1);
        System.out.println(lista.size());
        // antes del cambio
        System.out.println("El elemento de la posicion 1 es " + lista.get(0));
        // cambio elemento
        lista.set(0, 9876);
        System.out.println(lista.size());
        System.out.println("El elemento de la posicion 1 es " + lista.get(0));
        // sacar todos los elementos de la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (Object item : lista) {
            System.out.println(item);
        }
    }
}
