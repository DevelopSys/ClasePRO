public final class Jugador extends Persona implements Seleccionable{

    // sueldo nombre apellido

    private String posicion;
    private int ataque;

    public Jugador(String nombre, String apellido, double sueldo, String posicion) {

        super(nombre, apellido, sueldo);
        this.posicion = posicion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posicion);
    }


    @Override
    public void calcularSueldo() {
        // sueldo neto =  sueldo bruto - retencione (IRPF 0.20)
        this.sueldo = this.sueldo - (this.sueldo * Constantes.IRPF);
    }

    @Override
    public int atacar() {
        //System.out.println("El jugador está atacando, su nivel es muy alto");
        if (posicion.equalsIgnoreCase(Posiciones.delantero.getDefinicion())){
            this.ataque = (int) (Math.random() * 26)+75;
        }else if (posicion.equalsIgnoreCase(Posiciones.medio.getDefinicion())){
            this.ataque = (int) (Math.random() * 26)+50;
        } else if (posicion.equalsIgnoreCase(Posiciones.defensa.getDefinicion())){
            this.ataque = (int) (Math.random() *51);
        }

        return  ataque;
    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }
}
