import model.Coche;

public class Entrada {

    public static void main(String[] args) {
        Coche participante1 = new Coche("Participante1","1234A",60,3000);
        // velocidad = 0
        // acelerar(50)
            // velocidad = 0 + (0-50);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.mostrarDatos();
        System.out.println("Frenando......");
        participante1.frenar(100);
        participante1.mostrarDatos();
        System.out.println("Frenando......");
        participante1.frenar(100);
        participante1.mostrarDatos();

    }
}
