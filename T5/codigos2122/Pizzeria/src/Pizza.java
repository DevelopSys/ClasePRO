import java.util.ArrayList;

public class Pizza {

    private String nombre;
    private double precio;
    private int id;
    private ArrayList<Ingrediente> listaIngredientes;
    private boolean estado;

     public Pizza(int id, String nombre){
         this.id = id;
         this.nombre = nombre;
         listaIngredientes = new ArrayList<>();
         // estado = false
         // precio = 0
     }

    public Pizza(int id, String nombre, ArrayList listaIngredientes){
        this.id = id;
        this.nombre = nombre;
        this.listaIngredientes = listaIngredientes;
    }

    public void calcularPrecio(){
        for ( Ingrediente item : listaIngredientes ) {
            precio = precio + item.getPrecio();
        }
    }

    public void verDatos(){
        System.out.println(nombre);
        System.out.println(id);
        System.out.println(estado);
        System.out.println(precio);
        for (Ingrediente item : listaIngredientes) {
            System.out.println(item.getNombre() + " - " + item.getPrecio());

        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
