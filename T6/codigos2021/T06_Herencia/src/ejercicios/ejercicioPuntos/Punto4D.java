package ejercicios.ejercicioPuntos;

import java.awt.*;

public class Punto4D extends Punto3D{

    private int j;

    public Punto4D(int x, int y, int z, int j){
        super(x,y,z);
        this.j = j;
    }
    public Punto4D(Punto3D punto3D, int j){
        super(punto3D);
        this.j = j;
    }
    public Punto4D(){}

    public void move(int x, int y, int z, int j) {
        super.move(x, y, z);
        this.j = j;
    }

    public void translate(int dx, int dy, int dz, int dj) {
        super.translate(dx, dy, dz);
        this.j += dj;
    }


    public void setLocation(int x, int y, int z, int j) {
        super.setLocation(x, y, z);

        move(x,y,z,j);
    }


    public void setLocation(double x, double y, double z, double j) {
        super.setLocation(x, y, z);
        this.j = (int) Math.floor(j+0.5);
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
