package model;

public class Motor {

    private int cv;
    private int aceite;

    public Motor(int cv, int aceite) {
        this.cv = cv;
        this.aceite = aceite;
    }

    public Motor() {
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }
}
