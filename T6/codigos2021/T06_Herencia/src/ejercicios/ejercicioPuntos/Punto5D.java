package ejercicios.ejercicioPuntos;

public class Punto5D extends Punto4D{

    public void mostar(){
        setLocation(3.4,.8,.8);
    }

    @Override
    public void setLocation(double x, double y, double z, double j) {
        super.setLocation(x, y, z, j);
    }

    @Override
    public void setLocation(double x, double y) {
        super.setLocation(x, y);
    }


}
