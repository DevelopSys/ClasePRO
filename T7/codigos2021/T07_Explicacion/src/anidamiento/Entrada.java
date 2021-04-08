package anidamiento;

public class Entrada {

    public static void main(String[] args) {
        Externa externa = new Externa("Clase externa");
        Externa.Interna interna = externa.new Interna("Clase interna");
        interna.ejecucionInterna();
    }

}
