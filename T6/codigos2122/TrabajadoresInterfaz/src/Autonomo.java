public final class Autonomo extends Trabajador{

    private double cuota;
    private String factura;

    public Autonomo() {
    }

    public Autonomo(String dni, String nombre, String apellido, double sueldo, Departamento departamento, double cuota) {
        super(dni, nombre, apellido, sueldo, departamento);
        this.cuota = cuota;
        realizarFactura();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota: "+cuota);
        System.out.println("Factura: "+factura);
    }


    public void realizarFactura(){
        this.factura = String.format("Factura realizada por un importe de %.2f a la empresa con CIF %s",
                this.sueldo, Administracion.CIF);

    }



    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo
                -(cuota +(cuota*Administracion.IVA)) -(this.sueldo*Administracion.IRPF);
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
