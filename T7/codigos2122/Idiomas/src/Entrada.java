import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Idioma castellano = new Idioma("Castellano",100000) {
            @Override
            public void saludar() {
                // EL saludo en español es HOLA (priemra palara de la lista)
                System.out.println("Esto saludando en español, para que aprendamos castellano");
                System.out.println("El saludo en "+getNombre()+"es "+getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("Estoy despidiendo en español, para que aprendamos castellano");
                System.out.println("La despedida en "+getNombre()+"es "+getPalabras().get(1));

            }
        };
        Idioma ingles = new Idioma("Inglés", 200000) {
            @Override
            public void saludar() {
                // EL saludo en ingles es Hello (priemra palara de la lista)
                System.out.println("This is english idiom to learn");
                System.out.println("El saludo en "+getNombre()+"es "+getPalabras().get(0));

            }

            @Override
            public void despedir() {
                System.out.println("La despedida en "+getNombre()+"es "+getPalabras().get(1));

            }
        };
        Idioma aleman = new Idioma("Alemán",2000230) {
            @Override
            public void saludar() {
                // EL saludo en aleman es Hallo (priemra palara de la lista)
                System.out.println("asd asd asd asd asd asd asd");
                System.out.println("El saludo en "+getNombre()+"es "+getPalabras().get(0));

            }

            @Override
            public void despedir() {
                System.out.println("La despedida en "+getNombre()+"es "+getPalabras().get(1));

            }
        };
        Dialecto catalan = new Dialecto(castellano,50000);
        catalan.saludar();
        catalan.calcularNumeroHablantes(30, new Cuantificable() {
            @Override
            public void cuantificarHablantes(int n) {
                catalan.setNumeroHablates(catalan.getNumeroHablates()*n);
            }
        });

        Dialecto valenciano = new Dialecto(castellano,10000);
        valenciano.saludar();
        valenciano.calcularNumeroHablantes(30, new Cuantificable() {
            @Override
            public void cuantificarHablantes(int n) {
                valenciano.setNumeroHablates(valenciano.getNumeroHablates()*(n/2));
            }
        });


        castellano.ingresarPalabra("Hola");
        castellano.ingresarPalabra("Adios");
        castellano.ingresarPalabra("Programacion");

        ingles.ingresarPalabra("Hi");
        ingles.ingresarPalabra("By");
        ingles.ingresarPalabra("Programming");

        aleman.ingresarPalabra("Hallo");
        aleman.ingresarPalabra("Tschulss");
        aleman.ingresarPalabra("AasdAsdasd");

        ArrayList<Idioma> idiomas = new ArrayList<>();
        idiomas.add(aleman);
        idiomas.add(castellano);
        idiomas.add(ingles);

        for ( Idioma idioma : idiomas ) {
            idioma.saludar();
            idioma.despedir();
        }

        for ( Idioma idioma : idiomas ) {
            idioma.listarPalabras();
        }




    }
}
