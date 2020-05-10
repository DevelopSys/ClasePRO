package github.internas;

public class ClaseExterna {

    private String dato;
    private int numero;

    public ClaseExterna(String dato, int numero) {
        this.dato = dato;
        this.numero = numero;
    }

    public void mostrarDatos(){
        System.out.printf(String.format("%d %s %n",getNumero(),getDato()));
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    class ClaseInterna{

        private int numeroInterno;
        private String datoInterno;

        public ClaseInterna(int numeroInterno, String datoInterno) {
            this.numeroInterno = numeroInterno + numero;
            this.datoInterno = dato.concat(" "+datoInterno);
        }

        public void mostrarDatosInternos(){
            System.out.printf(String.format("%d %s %n",getNumeroInterno(),getDatoInterno()));
        }

        public int getNumeroInterno() {
            return numeroInterno;
        }

        public void setNumeroInterno(int numeroInterno) {
            this.numeroInterno = numeroInterno;
        }

        public String getDatoInterno() {
            return datoInterno;
        }

        public void setDatoInterno(String datoInterno) {
            this.datoInterno = datoInterno;
        }
    }
}
