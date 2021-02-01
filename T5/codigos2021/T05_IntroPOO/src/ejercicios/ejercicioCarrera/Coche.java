package ejercicios.ejercicioCarrera;

public class Coche {

    private int cv, velocidad;
    private String matricula, modelo;
    private double km;

    public Coche() {
        /*this.cv =0;
        this.km =0.0;
        this.velocidad = 0;*/
        this.matricula = "0000AAA";
        this.modelo = "Sin especificar";
    }

    public Coche(String modelo, String matricula, int cv) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        //this.km = 0.0;
        //this.velocidad = 0;
    }

    public void acelerar(int velocidadAcelerar) {
        //this.velocidad = this.velocidad + velocidadAcelerar;

        if (this.velocidad + velocidadAcelerar >= 180) {
            this.velocidad = 180;
            System.out.println("Velocidad máxima alcanzada");
        } else {
            this.velocidad += velocidadAcelerar;
        }
        this.km += (this.velocidad * (this.cv * (int) ((Math.random() * 10) + 1)));
    }

    public void frenar(int velocidadFrenar){

        //this.velocidad = this.velocidad - velocidadFrenar;
        if (this.velocidad - velocidadFrenar <= 0){
            this.velocidad =0;
            System.out.println("Velocidad mínima alcanzada");
        } else {
            this.velocidad -= velocidadFrenar;
        }

    }

    public void parar(){
        this.velocidad =0;
    }

    public void resetear(){
        this.velocidad = 0;
        this.km = 0;
    }

    public void mostrarDatos(){
        System.out.printf("Matricula: %s%n",this.matricula);
        System.out.printf("Modelo: %s%n",this.modelo);
        System.out.printf("CV: %d%n",this.cv);
        System.out.printf("Vel: %d%n",this.velocidad);
        System.out.printf("KM: %.2f%n",this.km
        );
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
