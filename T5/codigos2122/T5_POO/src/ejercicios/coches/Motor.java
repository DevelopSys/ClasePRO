package ejercicios.coches;

public class Motor {

    private int cv, litros;

    public Motor(int cv, int litros){
        this.cv = cv;
        this.litros = litros;
    }

    public Motor(int cv){
        this.cv = cv;
        // litros = 0;
    }

    public int getCv() {
        return cv;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
}
