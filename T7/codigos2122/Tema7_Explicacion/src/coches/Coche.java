package coches;

public class Coche {

    private String marca, modelo;
    private double precio;
    private int velocidad;
    private Motor motor;

    public Coche(String marca, String modelo, double precio, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.velocidad = velocidad;
    }

    public void mostrarDatos(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(precio);
        System.out.println(velocidad);
        if (motor!=null){
            this.motor.mostrarDatos();
        }else {
            System.out.println("El coche aún no tiene motor");
        }
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        if (motor.cv>0 && motor.cv<50){
            precio = precio *1.25;
        } else if (motor.cv>50 && motor.cv<100){
            precio = precio *1.30;
        } else if (motor.cv>100 && motor.cv<200){
            precio = precio *1.40;
        } else {
            precio = precio *1.60;
        }
    }

    class Motor{

        int cv, cc;

        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }



        public void mostrarDatos(){
            System.out.println("CV: "+cv);
            System.out.println("CC: "+cc);
        }

        public int getCv() {
            return cv;
        }

        public void setCv(int cv) {
            this.cv = cv;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }
    }
}
