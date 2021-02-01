package ejercicios.ejercicioEquipo;

public class Entrada {

    public static void main(String[] args) {
        Equipo atletico = new Equipo("Atleti",98,54,76);
        Equipo cadiz = new Equipo("Cadiz",70,65,97);

        // cadiz.atacar() --> true
        // atletico.atacar() --> true

        int contador=0;

        System.out.println("Mostrando datos----");
        atletico.mostrarDatos();
        cadiz.mostrarDatos();

        System.out.println("Jugar partido");

        do{
            if(atletico.atacar()){
                System.out.println("Gol del atleti");
            };

            if(cadiz.atacar()){
                System.out.println("Gol del Cadiz");
            };
            contador++;
        }while(contador<3);


        System.out.printf("El resultado es %s: %d VS %s: %d %n",atletico.getNombre(), atletico.getNumeroGoles(), cadiz.getNombre(), cadiz.getNumeroGoles() );





    }
}
