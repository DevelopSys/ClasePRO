public class EntradaGaraje {

    public static void main(String[] args) {

        /*Coche coche = new Coche("Ford","Focus","1234",5,2020);
        // tiene 100 CV
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


        Pintor pintor = new Pintor("npintor","apintor","dnipintor",
                123,123,"fina","motos");
        //pintor.mostarDatos();

        Mecanico mecanico = new Mecanico("nmecanico","amecanico",
                "dnimecanico",123,5,true);

        Comercial comercial = new Comercial("ncomercial","acomercial",
                "dnicomercial",123,"mba");

        mecanico.reprogramarMotor(coche);
        System.out.println(coche.getCv());
        mecanico.reprogramarMotor(coche);
        System.out.println(coche.getCv());

        pintor.pintarCoche(coche);
        System.out.println(coche.getColor());
        /*pintor.calcularRetencion();
        mecanico.calcularRetencion();
        comercial.setVentas(20000);
        comercial.calcularRetencion();

        // tipoMotor = null

        //coche.setTipoMotor("Electrico");
        // coche.setColor("amarillo");
        // tipoMotor = "Electrico"

        //coche.pintarCoche();
        //System.out.println(coche.getColor());

        //coche.reprogramarMotor();

        //coche.setCv(200);

        //System.out.println(coche.getCv());*/

        //Autonomo pintor = new Pintor();
        Empresa norauto = new Empresa("Norauto","123A");

        Pintor pintor = new Pintor("pintor","apintor","123",123,123,"fina","motos");
        Mecanico mecanico = new Mecanico("mecanico","amecanico","234",234,234,5,true);
        Comercial comercial = new Comercial("comercial","acomercial","345",345,345,"mba");
        comercial.setVentas(20000);
        norauto.contratarTrabajador(pintor);
        norauto.contratarTrabajador(pintor);
        norauto.contratarTrabajador(new Trabajador() {
            @Override
            public void calcularRetencion() {
                double retencion = (this.sueldo * 0.15) -500;
                System.out.println(retencion);
            }
        });

        norauto.getTrabajadores().get(2).calcularRetencion();
        //norauto.contratarTrabajador(comercial);
        //norauto.contratarTrabajador(new Comercial("comercial","acomercial","345",345,"mba"));



        //System.out.println(norauto.getTrabajadores().size());
        //norauto.comprobarAutonomo(pintor);
        //System.out.println("Sus datos son:");
        //norauto.listarTrabajadores();
        // sitios = 10
        norauto.recepcionarCoche(new Coche("Ford","Focus","123",100,1000));// sitios = 9
        norauto.recepcionarCoche(new Coche("Ford","Focus","223",100,1000));// sitios = 8
        norauto.recepcionarCoche(new Coche("Ford","Focus","323",100,1000));// sitios = 7
        norauto.recepcionarCoche(new Coche("Ford","Focus","423",100,1000));// sitios = 6
        norauto.recepcionarCoche(new Coche("Ford","Focus","523",100,1000));// sitios = 5
        norauto.recepcionarCoche(new Coche("Ford","Focus","623",100,1000));// sitios = 4
        norauto.recepcionarCoche(new Coche("Ford","Focus","723",100,1000));// sitios = 3
        norauto.recepcionarCoche(new Coche("Ford","Focus","823",100,1000));// sitios = 2
        norauto.recepcionarCoche(new Coche("Ford","Focus","923",100,1000));// sitios = 1
        norauto.recepcionarCoche(new Coche("Ford","Focus","102",100,1000));// sitios = 0
        norauto.recepcionarCoche(new Coche("Ford","Focus","112",100,1000));// sitios = 0

        System.out.println(norauto.getCoches().size());

        norauto.entregarCoche("102"); // sitios = 1

        norauto.recepcionarCoche(new Coche("Ford","Focus","112",100,1000));// sitios = 0

        norauto.entregarCoche("123456"); // ???

        norauto.listarCoches();



    }
}
