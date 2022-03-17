package anidacion;

public class ClaseGeneral {

    private String nombre;
    private int numero;
    private boolean acierto;
    private ClaseAnidada claseAnidada;

    public ClaseGeneral(String nombre, int numero, boolean acierto) {
        this.nombre = nombre;
        this.numero = numero;
        this.acierto = acierto;
    }

    public void mostrarDatosGeneral(){
        System.out.println(nombre);
        System.out.println(numero);
        System.out.println(acierto);
    }

    public void accesoHijo(){
        claseAnidada.mostrarDatosHija();
    }

    public ClaseAnidada getClaseAnidada() {
        return claseAnidada;
    }

    public void setClaseAnidada(ClaseAnidada claseAnidada) {
        this.claseAnidada = claseAnidada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }

    class ClaseAnidada{
        String nombreHija;
        int numeroHija;
        boolean aciertoHija;

        public ClaseAnidada(String nombreHija, int numeroHija, boolean aciertoHija) {
            this.nombreHija = nombreHija;
            this.numeroHija = numeroHija;
            this.aciertoHija = aciertoHija;
            setClaseAnidada(this);
        }

        public void accesoAGeneral(){
            mostrarDatosGeneral();
        }

        public void mostrarDatosHija(){
            System.out.println(nombreHija);
            System.out.println(numeroHija);
            System.out.println(aciertoHija);
        }

        public String getNombreHija() {
            return nombreHija;
        }

        public void setNombreHija(String nombreHija) {
            this.nombreHija = nombreHija;
        }

        public int getNumeroHija() {
            return numeroHija;
        }

        public void setNumeroHija(int numeroHija) {
            this.numeroHija = numeroHija;
        }

        public boolean isAciertoHija() {
            return aciertoHija;
        }

        public void setAciertoHija(boolean aciertoHija) {
            this.aciertoHija = aciertoHija;
        }
    }
}
