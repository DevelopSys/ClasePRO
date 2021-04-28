package correccionExamen;

public abstract class Bicicleta<T extends Number> {

    private String tipo;
    private int velocidades;
    private int pulgadas;
    private String tamanio;
    private boolean estado;

    public Bicicleta() {
    }

    public Bicicleta(String tipo, int velocidades, int pulgadas, String tamanio, boolean estado) {
        this.tipo = tipo;
        this.velocidades = velocidades;
        this.pulgadas = pulgadas;
        this.tamanio = tamanio;
        this.estado = estado;
    }

    public void mostrarDatos(){
        System.out.println("Tipo "+tipo);
        System.out.println("Velocidades "+velocidades);
        System.out.println("Pulgadas "+pulgadas);
        System.out.println("Tamaño "+tamanio);
        System.out.println("Estadp "+estado);
    }

    public abstract T reparar();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
