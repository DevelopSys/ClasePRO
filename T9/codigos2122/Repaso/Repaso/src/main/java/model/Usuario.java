package model;

public class Usuario {

    private String nombre, apellido, pais;
    private int id, sueldo, telefono, id_perfil;


    public Usuario(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Usuario(String nombre, String apellido, String pais, int telefono, int id_perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.telefono = telefono;
        this.id_perfil = id_perfil;
    }

    public Usuario(String nombre, String apellido, String pais, int id, int sueldo, int telefono, int id_perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.id = id;
        this.sueldo = sueldo;
        this.telefono = telefono;
        this.id_perfil = id_perfil;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais='" + pais + '\'' +
                ", id=" + id +
                ", sueldo=" + sueldo +
                ", telefono=" + telefono +
                ", id_perfil=" + id_perfil +
                '}';
    }
}
