package anidamiento;

public class Externa {

    private String nombreClaseExterna;

    public Externa(String nombreClaseExterna) {
        this.nombreClaseExterna = nombreClaseExterna;
    }

    public void ejecucionExterna(){
        System.out.println("Método ejecutado de la clase externa");
    }

    class Interna{

        private String nombreClaseInterna;


        public Interna(String nombreClaseInterna) {
            this.nombreClaseInterna = nombreClaseInterna;
        }

        public void ejecucionInterna(){
            System.out.println("Ejecucion desde la clase interna");
            ejecucionExterna();
        }
    }
}
