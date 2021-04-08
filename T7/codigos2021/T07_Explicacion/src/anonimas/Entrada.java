package anonimas;

public class Entrada {



    public static void main(String[] args) {

        Garaje garaje = new Garaje();

        int numeroCoches =10;

        CocheNormal cocheNormal = new CocheNormal();
        cocheNormal.haySitio(numeroCoches);




        garaje.agregarCoche(new Coche("Ford","Focus","1234",100) {
            @Override
            public void acelerar(int velocidadAcelerar) {

                System.out.println("Acelerado el focus");
                this.setVelocidad(this.getVelocidad() + this.getCv()*velocidadAcelerar);
                this.mostrarVelocidad();
            }
        });



        garaje.agregarCoche(new Coche("Ford","Fiesta","1234",75) {
            @Override
            public void acelerar(int velocidadAcelerar) {
                System.out.println("Acelerado el fista");
                this.setVelocidad(this.getVelocidad() + this.getCv()*(velocidadAcelerar/2));

                this.mostrarVelocidad();
            }
        });

        garaje.getListaCoches().get(1).acelerar(100);
    }
}
