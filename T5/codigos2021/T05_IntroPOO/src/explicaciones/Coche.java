package explicaciones;

public class Coche {

    // propiedades
    private String marca, modelo;
    private int cv, velocidad;
    private double km;


    // método especial  -- constructor
    // por defecto todas las clases tienen constructor por defecto --> solo si no hay algún constructor escrito
    // metodo_acceso (public) nombre(argumentos)

    // marca modelo cv vel km

    public Coche(String marca, String modelo, int cv, int velocidad, double km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.velocidad = velocidad;
        this.km = km;
    }

    public Coche(String color, int cv, String modelo, int velocidad, double km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.velocidad = velocidad;
        this.km = km;
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche() {

        marca = "marca por defecto";
        modelo = "modelo por defecto";
    }

    // métodos
    // método_acceso  retorno(void no retorna nada) nombre(enMinusculas) argumentos()
    // public void nombre(){
    // funcionalidad
    // }

    public static void metodoAccesoStatic() {
        System.out.println("Ejecucion desde la clase coche");
    }

    // si pone void no retorna y solo ejecuta lo que hay dentro
    public void mostrarDatos() {
        System.out.println("Mostrando datos ......");
        System.out.printf("Marca: %s %n", marca);
        System.out.printf("Modelo: %s %n", modelo);
        System.out.printf("Velocidad: %d %n", velocidad);
        System.out.printf("CV: %d %n", cv);
        System.out.printf("KM: %.2f %n", km);
    }

    // funcionalidad para el coche acelere una cantidad de km/h determinada

    public boolean acelerarVelocidad(int velocidad) {
        // no le doy el valor a velocidad

        this.velocidad = this.velocidad + velocidad;
        if (velocidad <= 0) {
            return false;
        }
        return true;

    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }


}
