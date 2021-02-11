package explicacion;

public final class Deportivo extends Coche{

    // marca cv bastido
    private int par;

    public Deportivo(String marca, int cv, int bastidor) {
        super(marca, cv, bastidor);
        this.par = 200;
    }

    public Deportivo(String marca, int cv, int bastidor, int par){
        super(marca,cv,bastidor);
        this.par = par;
    }

    public Deportivo(){
    }


    // getters setters constructores

    @Override
    public void acelerar() {
        //super.acelerar();
        System.out.println("Coche acelerado desde la clase deportivo");
    }

    @Override
    public void metodoObligatorio() {

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Par "+par);
    }


    // constructor vacio
    // constructor marca cv bastidor

}
