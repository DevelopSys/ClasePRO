import java.util.ArrayList;

public final class Pizza {

    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> listaIngredientes;
    private int id;
    private boolean servida;

    public Pizza (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.listaIngredientes = new ArrayList();
        //this.precio=15;
    }
    public Pizza(){
        this.listaIngredientes = new ArrayList();
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        this.listaIngredientes.add(ingrediente);
        this.precio += ingrediente.getPrecio();
        //agregarCoste(ingrediente.getPrecio());
    }

    public void verDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio "+precio);

        String servidaRes = servida ? String.format("Servida") : String.format("Pendiente");
        System.out.println(servidaRes);

        System.out.println("Nº Ingredientes: "+listaIngredientes.size());
        for ( Ingrediente ingrediente: listaIngredientes ) {
            System.out.println("\t"+ingrediente.getNombre());
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
    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }
    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isServida() {
        return servida;
    }
    public void setServida(boolean servida) {
        this.servida = servida;
    }
}
