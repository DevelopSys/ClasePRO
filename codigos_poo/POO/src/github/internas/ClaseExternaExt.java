package github.internas;

public class ClaseExternaExt {

    private String dato;
    private int numero;

    public ClaseExternaExt(String dato, int numero) {
        this.dato = dato;
        this.numero = numero;

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

    static class ClaseInternaExt{

        private int numeroInterno;
        private String datoInterno;

        public ClaseInternaExt(int numeroInterno, String datoInterno) {
            this.numeroInterno = numeroInterno;
            this.datoInterno = datoInterno;
        }

        public void mostrarDatoInterno(){
            System.out.printf(String.format("%d %s %n",getNumeroInterno(),getDatoInterno()));
        }

        public int getNumeroInterno() {
            return numeroInterno;
        }

        public String getDatoInterno() {
            return datoInterno;
        }
    }
}
