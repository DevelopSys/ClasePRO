package clases.excepciones;

public class CuentaCorriente {

    private int saldo;

    public CuentaCorriente() {
    }

    public void agregarSaldo(int ingreso){
        this.saldo += ingreso;
    }

    public void sacarSaldo(int sacar) throws SalsoInsuficienteEx {
       if ((this.saldo - sacar)<0){
           throw new SalsoInsuficienteEx("Saldo insuficiente");
       }

       this.saldo -= sacar;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
}
