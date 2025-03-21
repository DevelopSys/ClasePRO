package utils;

public enum Sabores {
    // datos fijos
    Fresa(2,40, 50, 150),
    Vainilla(1,80, 60, 250),
    Mango(4,40, 50, 150),
    Chocolate(3,90, 100, 350);

    private int calorias;
    private int precio;
    private int grasas;
    private int azucar;

    Sabores(int precio, int grasa, int azucar, int calorias) {
        this.azucar = azucar;
        this.grasas = grasa;
        this.calorias = calorias;
        this.precio = precio;
    }
    Sabores(int grasa, int azucar, int calorias) {
        this.azucar = azucar;
        this.grasas = grasa;
        this.calorias = calorias;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getGrasas() {
        return grasas;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }
}
