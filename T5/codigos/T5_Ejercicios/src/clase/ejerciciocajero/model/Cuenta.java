package clase.ejerciciocajero.model;

public class Cuenta {

    private int id;
    private String dni;
    private int pin;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int id, String dni, int pin, double saldo) {
        this.id = id;
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
    }

    public void ingresarDinero(double dinero){
        if (dinero<=0){
            System.out.println("Operacion no disponible");
        } else {
            // this.saldo = this.saldo + dinero
            this.saldo += dinero;
            System.out.println("Saldo actualizado a "+this.saldo);
        }
    }

    public void sacarDinero(double dinero){
        if (this.saldo>=dinero){
            this.saldo -= dinero;
            System.out.println("Saldo actualizado a "+this.saldo);
        } else {
            System.out.println("Opcion no disponible");
        }
    }

    public void mostrarDatos(){
        System.out.println("ID: "+id);
        System.out.println("DNI: "+dni);
        System.out.println("PIN: "+pin);
        System.out.println("Saldo: "+saldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
