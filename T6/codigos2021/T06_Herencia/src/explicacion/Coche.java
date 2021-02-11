package explicacion;

public abstract class Coche {

    private int cv;
    private int bastidor;
    private String marca;

    public Coche(String marca,int cv, int bastidor){
        this.bastidor = bastidor;
        this.cv = cv;
        this.marca = marca;
    }

    public Coche(){

    }

    // metodos

    public void acelerar(){
        System.out.println("Coche acelerado desde la clase coche");
    }

    public void frenar(){
        System.out.println("Coche frenado desde la clase coche");
    }

    public abstract void metodoObligatorio();

    public void mostrarDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("CV: "+cv);
        System.out.println("Bastidor: "+bastidor);
    }


    // getters y setters

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getBastidor() {
        return bastidor;
    }

    public void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
