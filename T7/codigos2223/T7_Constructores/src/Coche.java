public class Coche {

    private String marca, modelo;
    private int cv;

    public Coche() {
    }

    public Coche(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        System.out.println("Creando coche de forma estática");
    }

    public static Coche newInstance(String marca, String modelo, int cv){
        // quiero contruir un objeto
        Coche coche = new Coche(marca,modelo,cv);
        return coche;
    }

    public static void metodoDirecto(){
        System.out.println("Ejecucion del metodo directamente");
    }

    public void mostrarDatos(){
        System.out.println("Marca "+this.marca);
        System.out.println("Modelo "+this.modelo);
        System.out.println("CV "+this.cv);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
