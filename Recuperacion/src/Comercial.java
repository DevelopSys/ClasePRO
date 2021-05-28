public final class Comercial extends Trabajador implements Autonomo{

    private String master;
    private int ventas;

    public Comercial() {

    }

    public Comercial(String nombre, String apellido, String dni, int numeroSS, String master) {
        super(nombre, apellido, dni, numeroSS);
        this.master = master;
    }

    public Comercial(String nombre, String apellido, String dni, int numeroSS, int telefono, String master) {
        super(nombre, apellido, dni, numeroSS, telefono);
        this.master = master;
    }

    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("Master "+master);
        System.out.println("Ventas "+ventas);
    }

    @Override
    public void calcularRetencion() {
        double retencion = this.sueldo - ((this.sueldo * 0.25) + (this.ventas*0.10));
        System.out.println("Tu retencion es " +retencion);
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
        this.sueldo += (ventas *0.30);
    }

    @Override
    public void calcularCoutaAutonomo() {
        double couta = ((sueldo*RETENCIONES_FIJAS) + (ventas*RETENCIONES_FIJAS))/3;
        System.out.println("Tu cuota es de "+couta);
    }

    @Override
    public void calcularJubilacion() {
        if (ventas>10000){
            System.out.println("Te quedan 5 años para jubilarte");
        } else {
            System.out.println("Te quedan 10 años para jubilarte");
        }
    }
}
