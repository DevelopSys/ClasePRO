package excepcionsaldo.model;

import excepcionsaldo.utils.SaldoInsuficienteException;

public class Cuenta {

    private double saldo;
    private String numeroCuenta;


    public Cuenta() {
    }

    public Cuenta(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public void realizarTransaccion(int saldoSacar) throws Exception {
        if (saldoSacar<0){
            throw new IllegalArgumentException("Saldo a sacar negativo");
        } else if (this.saldo < saldoSacar){
            throw new SaldoInsuficienteException("Saldo infuciente",saldoSacar);
        }
        else {
            this.saldo -=saldoSacar;
            System.out.println("El saldo resultante es: "+this.saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
