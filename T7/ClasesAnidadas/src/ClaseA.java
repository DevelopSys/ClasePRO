public class ClaseA {
    private String nombre;
    private int cantidad;
    private ClaseB claseB;

    // desde la ClaseA, no puedo acceder directamente a los atributos de la clase inner
    // en caso de querer tener acceso, es necesario un objeto de claseB

    public ClaseA(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public ClaseA() {
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("cantidad = " + cantidad);
        System.out.println("claseB = " + claseB);
        // claseB.mostrarDatosClaseB();
    }

    /*public void crearClaseB(String nombre, int cantidad){
        this.claseB = new ClaseB(nombre,cantidad);
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {


    return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    class ClaseB{
        private String nombre;
        private int cantidad;
        // Desde ClaseB, son accesibles los attr y metodos de la ClaseA

        public ClaseB(String nombre, int cantidad){
            this.nombre = nombre;
            this.cantidad =cantidad;
            claseB = this;

        }

        public ClaseB(){}

        public void mostrarDatos(){
            System.out.println("nombreB = " + nombre);
            System.out.println("cantidadB = " + cantidad);
            ClaseA.this.mostrarDatos();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    }
}
