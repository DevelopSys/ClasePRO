package model;

public class Base {

    private String palabra;
    private int numero;
    private boolean acierto;

    private ClaseHija claseHija;

    public Base(String palabra, int numero, boolean acierto) {
        this.palabra = palabra;
        this.numero = numero;
        this.acierto = acierto;
        //this.claseHija = new ClaseHija("asd",123,false);
    }

    public void sacarPalabraHija(){
        System.out.println(claseHija.getPalabraHija());
    }

    public void agregarClaseHija(ClaseHija claseHija){
        this.claseHija = claseHija;
    }

    public ClaseHija getClaseHija() {
        return claseHija;
    }

    public void setClaseHija(ClaseHija claseHija) {
        this.claseHija = claseHija;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
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

    public class ClaseHija{

        private String palabraHija;
        private int numeroHija;
        private boolean aciertoHija;

        public ClaseHija(String palabraHija, int numeroHija, boolean aciertoHija) {
            this.palabraHija = palabraHija;
            this.numeroHija = numeroHija;
            this.aciertoHija = aciertoHija;
            claseHija = this;
        }

        public void metodoHija(){}

        public String getPalabraHija() {

            return palabraHija;
        }

        public void setPalabraHija(String palabraHija) {
            this.palabraHija = palabraHija;
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
