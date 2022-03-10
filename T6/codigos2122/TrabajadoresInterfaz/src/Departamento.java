public enum Departamento {

    Ventas("Ventas",10), Finanzas("Finanzas",15),
    IT("IT",3), Comercial("Comercial",20);

    String nombre;
    int numeroTrabajadores;

    Departamento(String nombre, int numeroTrabajadores) {
        this.nombre = nombre;
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }
}
