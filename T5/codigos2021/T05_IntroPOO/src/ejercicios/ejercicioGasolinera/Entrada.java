package ejercicios.ejercicioGasolinera;

public class Entrada {

    public static void main(String[] args) {

        // 4 surtidores
        Surtidor s1 = new Surtidor(1,"asd");

        int idSurtidor=1;
        Gasolinera gasolinera = new Gasolinera("GasolineraUno");
        gasolinera.addSurtidor(new Surtidor(idSurtidor,"diesel",100));
        idSurtidor++;
        gasolinera.addSurtidor(new Surtidor(idSurtidor,"gasolina",100));
        idSurtidor++;
        gasolinera.addSurtidor(new Surtidor(idSurtidor,"diesel",150));
        gasolinera.mostrarDatos();

        Coche coche = new Coche("diesel");
        Coche coche1 = new Coche("gasolina");
        coche.mostrarDatos();

        if (coche.respostar(gasolinera.buscarSurtidor(1),100)){
            coche.mostrarDatos();
            gasolinera.setGanancias(gasolinera.getGanancias()+100);

        }else {
            System.out.println("El coche tiene los mismos datos que antes");
        }

        if (coche1.respostar(gasolinera.buscarSurtidor(2),60)){
            coche1.mostrarDatos();
            gasolinera.setGanancias(gasolinera.getGanancias());

        }else {
            System.out.println("El coche tiene los mismos datos que antes");
        }

        gasolinera.mostrarDatos();
        //gasolinera.setGanancias(gasolinera.getGanancias()+100);





    }
}
