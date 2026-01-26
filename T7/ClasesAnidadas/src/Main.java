public class Main {

    public static void main(String[] args) {
        ClaseA a = new ClaseA("ClaseA",3);
        // nombre = "claseA", cantidad = 3 claseB = null
        // a.mostrarDatosClaseA();
        ClaseA.ClaseB b = a.new ClaseB("ClaseB",5);
        // nombre = "claseB", cantidad = 5
        System.out.println("Los datos de la clase b");
        b.mostrarDatos();
        System.out.println("Los datos de la clase a");
        a.mostrarDatos();

        // a.mostrarDatosClaseA();
        // ClaseA.ClaseB claseB =new ClaseA.ClaseB();

        // a.mostrarDatosClaseA();
        // b.mostrarDatosClaseB();


    }
}
