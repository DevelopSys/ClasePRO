package videos.anonimas;

public class Entrada {

    public static void main(String[] args) {

        Garaje garaje = new Garaje();
        //Coche coche = new Coche("Ford","Focus",123);
        //garaje.addCoche(coche);
        garaje.addCoche(new Coche("Ford","focus",123));
        garaje.removeCoche(new Coche("Ford","focus",123));
    }
}
