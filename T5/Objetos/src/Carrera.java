import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Carrera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Coche> participantes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Indica marca del participante " + (i + 1));
            String marca = scanner.next();
            System.out.println("Indica matricula del participante " + (i + 1));
            String matricula = scanner.next();
            System.out.println("Indica modelo del participante " + (i + 1));
            String modelo = scanner.next();
            System.out.println("Indica cv del participante " + (i + 1));
            int cv = scanner.nextInt();
            Coche coche = new Coche(marca, modelo, matricula, cv);
            participantes.add(coche);
        }

        System.out.println("De cuentas vueltas consta la carrera");
        int vueltas = scanner.nextInt();

        for (int i = 0; i < vueltas; i++) {
            for (Coche coche : participantes) {
                int kmAleaotrio = (int) (Math.random() * 26) + 50;
                coche.setKm(kmAleaotrio);
            }
        }

        participantes.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getKm() > o2.getKm()) {
                    return -1;
                } else if (o1.getKm() < o2.getKm()) {
                    return 1;
                }
                return 0;

            }
        });

        System.out.println("El ganadro de la carrera es "
                + participantes.get(0).getMatricula()
                + " con km " + participantes.get(0).getKm());

        for (Coche coche: participantes) {
            System.out.printf("Matricula %s Modelo %s Km %d%n",coche.getMatricula(),coche.getModelo(),coche.getKm());
        }

    }
}

/*


Para ello en cada vuelta
cada coche recorre un numero de km aleatorio (50-75)
Una vez se terminan las vueltas el sistema mostrara:

El ganado es el coche XXXX XXXX XXXXX
La clasificacion final es:
1- XXXX XXXX XXXX XX
2- XXXX XXXX XXXX XX

 */
