package trabajadores.model;

public final class Director extends Persona implements Responsable{

    //TODO VOTACIONES

    private int resposabilidad;

    public Director() {
    }

    public Director(String nombre, String apellido, String dni, int resposabilidad) {
        super(nombre, apellido, dni);
        this.resposabilidad = resposabilidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Resposabilidad: "+resposabilidad);
    }

    public int getResposabilidad() {
        return resposabilidad;
    }

    public void setResposabilidad(int resposabilidad) {
        this.resposabilidad = resposabilidad;
    }

    @Override
    public int emitirVoto(int n) {
        return n*2;
    }

    @Override
    public double obtenenerResultados() {
        return resposabilidad;
    }
}
