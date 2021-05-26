public class EntradaGaraje {

    public static void main(String[] args) {

        Coche coche = new Coche("Ford","Focus","1234",5,2020);
        coche.acelerar(); // velocidad = 10
        coche.acelerar(); // velocidad =  10 + 10 --> velocidad = 20
        coche.acelerar(30); // velocidad = 20 + 30 --> velocidad = 50
        coche.frenar(); // velocidad = 40
        coche.frenar(); // velocidad = 30
        coche.frenar(40); // velocidad = -10

        coche.cambiarMarcha(1); // marcha = 1
        coche.cambiarMarcha(1); // marcha = 2
        coche.cambiarMarcha(1); // marcha = 3
        coche.cambiarMarcha(0); // marcha = 2
        for (int i = 0; i < 2; i++) {
            coche.cambiarMarcha(0);
        }
        // marcha = 0

        coche.cambiarMarcha(0); // marcha = -1

        coche.cambiarDireccion("marcha atras");
        coche.cambiarDireccion("marcha adelante");
        coche.cambiarDireccion("marcha izquierda");
        coche.cambiarDireccion("marcha derecha");



        // tipoMotor = null

        //coche.setTipoMotor("Electrico");
        // coche.setColor("amarillo");
        // tipoMotor = "Electrico"

        //coche.pintarCoche();
        //System.out.println(coche.getColor());

        //coche.reprogramarMotor();

        //coche.setCv(200);

        //System.out.println(coche.getCv());

    }
}
