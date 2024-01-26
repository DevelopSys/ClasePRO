package trigonometria.model_herencia;

public class Ciruclo extends Figura{

    private double radio;
    private double diametro;

    public Ciruclo() {
    }

    public Ciruclo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        setArea(Math.PI * Math.pow(radio,2));
    }

    public void calcularDiametro(){
        this.diametro = 2*this.radio;
    }
}
