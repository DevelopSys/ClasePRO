package explicaciones;

public class Cuenta {

    private int id, pin, saldo;
    private String titular;

    public Cuenta(int id, String titular, int pin, int saldo) {
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta (int id, String titular, int pin){
        this.id = id;
        this.titular = titular;
        this.pin = pin;
    }

    // sacar un dinero concreto
    public void sacarDinero(int saldoSacar){
        System.out.println("Sacando cantidad concreta");
        this.saldo -= saldoSacar;
    }

    // sacar todo el dinero de la cuenta
    public boolean sacarDinero(int saldo,int otro){
        System.out.println("Sacando todo el dinero");
        this.saldo=0;

        return false;
    }

}
