package ejercicios.ejercicioGasolinera;

public class Coche {

    private String tipoGasolina;
    private int litrosDeposito;

    public Coche(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    // metodos

    public boolean respostar(Surtidor surtidor, int litrosRepostar) {

        // misma gasolina
        // funcionando
        // litros suficientes

        if (surtidor != null && tipoGasolina.equals(surtidor.getTipoGasolina())
                && surtidor.isFuncionando()
                && surtidor.getCapacidadActual() >= litrosRepostar) {
            setLitrosDeposito(litrosDeposito + litrosRepostar);
            //this.litrosDeposito += litrosRepostar;
            surtidor.quitarGasolina(litrosRepostar);
            return true;
        }
        // solo llego a esta linea si el if de arriba no se ha ejecutado
        System.out.println("Fallo al respostar");
        return false;


    }


    public void mostrarDatos() {
        System.out.println("Tipò de galosina del coche: " + tipoGasolina);
        System.out.println("Litros del deposito " + litrosDeposito);
    }


    // getter y setter
    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public int getLitrosDeposito() {
        return litrosDeposito;
    }

    public void setLitrosDeposito(int litrosDeposito) {
        this.litrosDeposito = litrosDeposito;
    }
}
