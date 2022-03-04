public class Canterano extends Persona implements Seleccionable{

    private int posibilidades;
    private int ataque;


    public Canterano(String nombre, String apellido, double sueldo, int posibilidades) {
        super(nombre, apellido, sueldo);
        this.posibilidades = posibilidades;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posibilidades);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = 100;
    }

    @Override
    public int atacar() {
       this.ataque = (int) (Math.random() *61);
       return ataque;
    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }
}
