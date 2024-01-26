package trigonometria.model_herencia;

public abstract class Poligono extends Figura {
    private int base, altura;

    public Poligono() {
    }

    public Poligono(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
