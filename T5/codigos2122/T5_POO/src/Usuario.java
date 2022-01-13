public class Usuario {

    // variables
    private String correoElectronico, nombre, apellidos, password, fecha;
    private int edad;
    private boolean experiencia;

    // constructores
    // si no hay constructores escritos, hay un constructor que es el vacio (por defecto)
    // este constructor deja de existir cuando se escribe algun constructor

    public Usuario(){
        nombre = "Por defecto";
        correoElectronico = "Por defecto";
        edad = 18;
    }
    public Usuario(String nombre, String correoElectronico, String password){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }

    public Usuario (String correoElectronico, String password, int edad){
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }

    // métodos

    public void mostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellidos);
        System.out.println("Pass "+password);
        System.out.println("Correo "+correoElectronico);
        System.out.println("Fecha " +fecha);
        System.out.println("Edad "+edad);
    }

    public String mostrarDatosRetorno(){
        nombre = "Otra cosa";
        return "Nombre "+nombre+"\n"+"Apellido "+apellidos;
    }

    public void saludar(String nombreSaludar){
        System.out.println("Hola " + nombreSaludar + " que tal estas");
    }
    
    public void saludar(Usuario usuario){
        System.out.println("Hola " + usuario.getNombre() + " que tal estas");
    }

    // métodos getters y setters


    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isExperiencia() {
        return experiencia;
    }
}

