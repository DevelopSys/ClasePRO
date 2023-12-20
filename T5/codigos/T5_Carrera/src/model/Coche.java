package model;

public class Coche {

    // parado, recto, izquierda, derecha
    private String nombre, matricula, direccion;
    private int cv, cc, km, velocidad, puntos;
    private char categoria;
    // A -> cv>200
    // B -> cv entre 150-200
    // C -> cv<150

    public Coche() {

    }

    public Coche(String nombre, String matricula, int cv, int cc) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.cc = cc;
        this.cv = cv;
        direccion = "parado";
        categoria = categorizarCoche(cv);
        // puntos = 0
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    private char categorizarCoche(int cv) {
        if (cv >= 200) {
            return 'A';
        } else if (cv >= 150) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("MAtricula: " + matricula);
        System.out.println("Direccion: " + direccion);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);
        System.out.println("KM: " + km);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Categoria: " + categoria);
    }

    public void acelerar(int velocidad) {
        // setVelocidad(this.velocidad+ (int)(Math.random()*velocidad+1));
        this.velocidad += (int) (Math.random() * velocidad + 1);
        switch (categoria) {
            case 'A':
                if (this.velocidad >300){
                    this.velocidad = 300;
                }
                break;
            case 'B':
                if (this.velocidad >250){
                    this.velocidad = 250;
                }
                break;
            case 'C':
                if (this.velocidad >200){
                    this.velocidad = 200;
                }
                break;
        }

        // modificarDireccion - 0 izq 1 fre 2 der
        int numeroGirar = (int) (Math.random()*3);
        switch (numeroGirar){
            case 0:
                this.direccion = "izquierda";
                break;
            case 1:
                this.direccion = "recto";
                break;
            case 2:
                this.direccion = "derecha";
                break;
        }

        int kmAvanza = (int) (Math.random()*(velocidad+1));
        this.km += kmAvanza;

        girar();
    }

    public void frenar(int velocidad){
        this.velocidad -= velocidad;
        if (this.velocidad <=0){
            this.velocidad =0;
            this.direccion="parado";
        }
    }

    private void girar(){
        if (!this.direccion.equalsIgnoreCase("recto")){
            this.direccion = "recto";
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public char getCategoria() {
        return categoria;
    }
}
