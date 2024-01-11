package clase.ejercicio1.model;

public class Motor {

    private int cv;
    private int libtrosAceite;

    public Motor() {
    }
    public Motor(int cv)
    {
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public int getLibtrosAceite() {
        return libtrosAceite;
    }
    public void setLibtrosAceite(int libtrosAceite) {
        this.libtrosAceite = libtrosAceite;
    }
}
