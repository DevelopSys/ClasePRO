package ejercicios.ejercicioBiblioteca;

public final class DVD extends Elemento implements Prestar {

    private String director, actor;
    private int anio;

    public DVD(int id, String titulo, String seccion, String director, String actore, int anio) {
        super(id, titulo, seccion);
        this.director = director;
        this.actor = actore;
        this.anio = anio;
    }

    public DVD() {
    }

    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("Año edición: "+anio);
        System.out.println("Director: "+director);
        System.out.println("Actor: "+actor);

    }

    @Override
    public void prestar() {
        if (disponible) {
            this.disponible = false;
        } else {
            System.out.println("Elemento ya prestado");
        }
    }

    @Override
    public void devolver() {
        if (!disponible) {
            this.disponible = true;
        } else {
            System.out.println("El elemento está ya disponible");
        }
    }
}
