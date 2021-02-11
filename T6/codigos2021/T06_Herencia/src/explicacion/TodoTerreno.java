package explicacion;

public final class TodoTerreno extends Coche{

    private int litrosCapacidad;
    // constructores
    public TodoTerreno(String marca, int cv, int bastidor, int litrosCapacidad){
        super(marca,cv,bastidor);
        this.litrosCapacidad = litrosCapacidad;

    }



    @Override
    public void frenar() {
        System.out.println("Frenando desde la clase TodoTerreno");
    }

    @Override
    public void metodoObligatorio() {

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad: "+litrosCapacidad);

    }
}
