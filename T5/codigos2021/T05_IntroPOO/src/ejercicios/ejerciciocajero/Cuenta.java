package ejercicios.ejerciciocajero;

public class Cuenta {

    private int IBAN;
    private int pin;
    private String dni;
    private double saldo;


    public Cuenta(String dni, int pin, double saldo) {
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
        this.IBAN = (int) (Math.random() * 10000) + 1;
    }

    public void sacarDinero(double saldoRetirar, String dni, int pin) {


        if (this.permitirAcceso(dni, pin)) {
            if (saldo >= saldoRetirar) {
                this.saldo -= saldoRetirar;
                //this.saldo = this.saldo -saldoRetirar;
                System.out.println("Dinero retirado");
            } else {
                System.out.println("Saldo infuciente");
            }
        }else {
            System.out.println("Credenciales incorrectas");
        }
    }

    public void ingresarDinero(double saldoIngresar, String dni, int pin) {

        if (permitirAcceso(dni, pin)) {
            if (saldoIngresar > 0) {
                this.saldo += saldoIngresar;
                System.out.println("Dinero ingresado");
            } else {
                System.out.println("operacion no contemplada");
            }
        } else {
            System.out.println("Credenciales incorrectas");

        }

    }

    public void verResumen(String dni, int pin) {
        if (permitirAcceso(dni, pin)) {
            System.out.println("IBAN: " + this.IBAN);
            System.out.println("DNI: " + this.dni);
            System.out.println("Saldo: " + this.saldo);
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }

    public boolean permitirAcceso(String dni, int pin) {

        if (this.dni.toLowerCase().equals(dni.toLowerCase()) && this.pin == pin) {
            return true;
        }
        //System.out.println("Credenciales incorrectas");
        return false;
    }

    public int getIBAN() {
        return IBAN;
    }

    public void setIBAN(int IBAN) {
        this.IBAN = IBAN;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
