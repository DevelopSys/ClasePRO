package cocheanidado;

public class Coche {

    private String marca, modelo;
    private int velocidad, numBastidor;
    private Motor motor;

    public Coche(String marca, String modelo, int numBastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.numBastidor = numBastidor;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Nº Bastidor: " + numBastidor);
        if (motor != null) {
            System.out.println("Motor: " + motor);
        } else {
            System.out.println("No hay motor asignado");

        }
    }

    public void reprogramar(){
        motor.setCv(160);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    class Motor {

        private String fabricante;
        private int cv;
        private double cc;

        public Motor(String fabricante, int cv, double cc) {
            this.fabricante = fabricante;
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }

        public void algo(){
            // ejecución de un método del coche
            setMarca("asdasd");
        }

        public void mostrarDatos() {
            System.out.println("Fabricante " + fabricante);
            System.out.println("CV " + cv);
            System.out.println("CC " + cc);
        }

        public String getFabricante() {
            return fabricante;
        }

        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }

        public int getCv() {
            return cv;
        }

        public void setCv(int cv) {
            this.cv = cv;
        }

        public double getCc() {
            return cc;
        }

        public void setCc(double cc) {
            this.cc = cc;
        }
    }
}
