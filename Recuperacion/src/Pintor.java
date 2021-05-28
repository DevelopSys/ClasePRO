public final class Pintor extends Trabajador implements Autonomo{

    private String tipoBroncha, especialidad;

    public Pintor(){
    }
    public Pintor(String nombre, String apellido, String dni, int numeroSS, int telefono, String tipoBrocha, String especialidad){
       super(nombre,apellido,dni,numeroSS,telefono);
       this.tipoBroncha = tipoBrocha;
       this.especialidad = especialidad;
    }
    public Pintor(String nombre, String apellido, String dni, int numeroSS, String tipoBrocha, String especialidad){
        super(nombre,apellido,dni,numeroSS);
        this.tipoBroncha = tipoBrocha;
        this.especialidad = especialidad;
    }


    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("Especialidad " +this.especialidad);
        System.out.println("Tipo brocha "+this.tipoBroncha);
    }

    public void calcularRetencion(){
        double retencion = this.sueldo - this.sueldo * 0.10;
        System.out.println("Tu retencion es " +retencion);
    }

    public void pintarCoche(Coche coche){

        String[] colores = new String[]{"verde","azul","amarillo","rojo","violeta"};
        int aleatorio = (int) (Math.random() * 5);
        coche.setColor(colores[aleatorio]);
    }

    public String getTipoBroncha() {
        return tipoBroncha;
    }

    public void setTipoBroncha(String tipoBroncha) {
        this.tipoBroncha = tipoBroncha;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void calcularCoutaAutonomo() {
        double couta = (this.sueldo * RETENCIONES_FIJAS) /4;
        System.out.println("Tu cuota es de "+couta);
    }

    @Override
    public void calcularJubilacion() {
        if (especialidad.equals("coches")){
            System.out.println("te quedan 10 años para la jubilacion");
        } else {
            System.out.println("te quedan 5 años para la jubilacion");
        }
    }
}
