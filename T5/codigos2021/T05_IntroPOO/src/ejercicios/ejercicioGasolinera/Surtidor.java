package ejercicios.ejercicioGasolinera;

public class Surtidor {

    private int capacidadTotal, capacidadActual, id;
    private String tipoGasolina;
    private boolean funcionando;



    public Surtidor(int id, String tipoGasolina, int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.id = id;
        this.tipoGasolina = tipoGasolina;
        this.capacidadActual = capacidadTotal;
        this.funcionando = true;
    }

    public Surtidor(int id, String tipoGasolina) {
        this.id = id;
        this.tipoGasolina = tipoGasolina;
    }

    // metodos


    public void arreglar(){
        setFuncionando(true);
        //this.funcionando = true;
    }

    // 100 capacidad total
    // 60 capacidad actual
    // rellenar 50
    public void rellenarGasolina(int litrosGasolina){
        if(capacidadTotal<(capacidadActual+litrosGasolina)){
            setCapacidadActual(capacidadTotal);
        } else {
            setCapacidadActual(capacidadActual+litrosGasolina);
        }
    }

    public void quitarGasolina(int litroGasolina){
        if ( capacidadActual >= litroGasolina ){
            setCapacidadActual(capacidadActual - litroGasolina);
        }else {
            System.out.println("No puedo quitar porque no hay suficiente");
        }
    }

    // getter y setter
    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}
