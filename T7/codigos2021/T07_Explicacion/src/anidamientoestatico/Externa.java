package anidamientoestatico;

public class Externa {

    private static String nombreExterna;
    private int numeroExterna;


    public Externa(String nombreExterna, int numeroExterna) {
        this.nombreExterna = nombreExterna;
        this.numeroExterna = numeroExterna;
    }

    public String getNombreExterna() {
        return nombreExterna;
    }

    public void setNombreExterna(String nombreExterna) {
        this.nombreExterna = nombreExterna;
    }

    public int getNumeroExterna() {
        return numeroExterna;
    }

    public void setNumeroExterna(int numeroExterna) {
        this.numeroExterna = numeroExterna;
    }

    static class Interna{

        private String nombreInterna;
        private int numeroInterna;

        public Interna(String nombreInterna, int numeroInterna) {
            this.nombreInterna = nombreInterna;
            this.numeroInterna = numeroInterna;
        }

        public String getNombreInterna() {
            return nombreInterna;
        }

        public void setNombreInterna(String nombreInterna) {
            this.nombreInterna = nombreInterna;
        }

        public int getNumeroInterna() {
            return numeroInterna;
        }

        public void setNumeroInterna(int numeroInterna) {
            this.numeroInterna = numeroInterna;
        }
    }
}
