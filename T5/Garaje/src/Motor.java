public class Motor {

    private int litrosAceite;
    private int cv;

    public Motor(int litrosAceite, int cv) {
        this.litrosAceite = litrosAceite;
        this.cv = cv;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
