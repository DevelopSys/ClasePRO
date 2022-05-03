package model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String imagen, mail;
    private Name nameJAVA;

    public Usuario(String imagen, String mail, Name name) {
        this.imagen = imagen;
        this.mail = mail;
        this.nameJAVA = name;
    }

    public Usuario() {
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Name getName() {
        return nameJAVA;
    }

    public void setName(Name name) {
        this.nameJAVA = name;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "imagen='" + imagen + '\'' +
                ", mail='" + mail + '\'' +
                ", nameJAVA=" + nameJAVA +
                '}';
    }
}
