public class Coche {

    // atributos o variables
    private String marca, modelo, matricula;
    private int cv, cc, numeroPuertas, anio;
    private String tipoMotor;
    private String color;
    private boolean contaminante;
    private int velocidad, marcha;
    private String direccion;

    // constructores
    public Coche(){
        this.cc = 1500;
        this.cv = 100;
    }
    public Coche(String marca, String modelo, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        //this.cc = 1500;
        this.cv = 100;
    }
    public Coche(String marca, String modelo, String matricula, int numeroPuertas, int anio){
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.anio = anio;
        //this.cc = 1500;
        this.cv = 100;
    }

    // métodos

    public void cambiarDireccion(String direccion){
        this.setDireccion(direccion);
    }

    public void acelerar(){
        setVelocidad( this.getVelocidad() + 10);
    }

    public void acelerar(int velocidad){
        setVelocidad(this.getVelocidad() + velocidad);
    }

    public void frenar(){
        //setVelocidad(0);
        setVelocidad(this.getVelocidad() - 10);
    }

    public void frenar( int velocidad){
        if (velocidad > this.velocidad){
            frenarSeco();
        } else {
            setVelocidad(this.getVelocidad()-velocidad);
        }

    }

    public void frenarSeco(){
        setVelocidad(0);
    }

    public void cambiarMarcha(int tipoMarcha){
        // ¿subo o bajo?
        if (tipoMarcha==1){
            marcha++;
        } else if (tipoMarcha==0){
            if (marcha>0) {
                marcha--;
            }
        } else {
            System.out.println("No reconocido");
        }
    }

    public void mostrarDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Matricula: "+matricula);
        System.out.println("CV: "+cv);
        System.out.println("CC: "+cc);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isContaminante() {
        return contaminante;
    }

    public void setContaminante(boolean contaminante) {
        this.contaminante = contaminante;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoMotor(String tipoMotor){
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor(){
        return this.tipoMotor;
    }

}
