public class Coche {

    private String marca, modelo, matricula;
    private Motor motor;
    private double averias;

    public Coche(String marca, String modelo, String matricula, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.motor = motor;
    }

    public Coche(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public void arregar(String tipo, int coste){
        if (tipo.equalsIgnoreCase("aceite")){
            motor.setLitrosAceite(motor.getLitrosAceite()+10);
        } else {
            motor.setLitrosAceite((int) (motor.getLitrosAceite()+Math.random()*101));
        }
        this.averias += coste;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getAverias() {
        return averias;
    }

    public void setAverias(double averias) {
        this.averias = averias;
    }
}
