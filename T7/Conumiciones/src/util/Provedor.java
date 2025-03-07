package util;

public enum Provedor {

    // tipos predefinidos
    MAHOU("Cerveza mahou",5,"Juan Gomez"),
    COCACOLA("Bebida gaseosa",10,"Julia Martinez"),
    COMIDASSL,
    BEBIDASSL ("Bebidas generales",0,"Maria Gomez");

    // variables
    private String nombre;
    private int descuento;
    private String contacto;

    // constructores
    Provedor() {
        this.nombre = "sin nombre";
        this.descuento = 0;
        this.contacto = "sin contacto";
    }

    Provedor(String nombre, int descuento, String contacto) {
        this.contacto = contacto;
        this.descuento = descuento;
        this.nombre = nombre;
    }

    // metodos

    public void calcularDescuento(int precio){
        System.out.println("El descuento que te podría aplicar cmo provedor es");
        System.out.println(((double) precio*this.descuento)/100);
    }

    public String getNombre() {
        return nombre;
    }
    public int getDescuento() {
        return descuento;
    }

    public String getContacto() {
        return contacto;
    }
}
