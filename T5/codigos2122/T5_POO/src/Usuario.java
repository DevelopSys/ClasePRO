public class Usuario {

    // variables
    private String correoElectronico, nombre, apellidos, password, fecha;
    private int edad;

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

    // métodos getters y setters

    // getter de pass
    public String getPassword(){
        return password;
    }

    // setter de pass
    public void setPassword(String password){
        this.password = password;
    }

}

