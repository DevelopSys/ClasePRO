public class Entrada {

    public static void main(String[] args) {
        Partido partido = new Partido();
        Partido.Equipo atleti = partido.new Equipo("Atleti");
        Partido.Equipo sevilla = partido.new Equipo("Sevilla");


        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 3; x++) {
                partido.agregarGolesLocales();
                partido.agregarGolesVisitantes();
            }
            System.out.println("el resultado en la "+i+1+"parte es \n");
            partido.mostrarResultado();
        }

        partido.repartirPuntos();
        partido.escribirClaficacion();
        partido.reiniciarPartido();


        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 3; x++) {
                partido.agregarGolesLocales();
                partido.agregarGolesVisitantes();
            }
            System.out.println("el resultado en la "+i+1+"parte es \n");
            partido.mostrarResultado();
        }

        partido.repartirPuntos();
        partido.escribirClaficacion();







    }
}
