package trigonometria.model_herencia;

public class Triangulo extends Poligono{

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public void calcularArea() {
        setArea((double)(getBase()*getAltura())/2);
    }
}
