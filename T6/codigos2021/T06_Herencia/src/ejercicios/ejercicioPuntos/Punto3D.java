package ejercicios.ejercicioPuntos;

import java.awt.*;

public class Punto3D extends Point {

    protected int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public Punto3D(Point point,int z){
        super(point);
        this.z = z;
    }
    public Punto3D(){
        //x=0
        //y=0
        //z=0
    }
    public Punto3D(Punto3D punto3D){
        super(punto3D.x, punto3D.y);
        this.z = punto3D.z;
    }


    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }

    public void translate(int dx, int dy, int dz) {
        super.translate(dx, dy);
        this.z += dz;

    }

    public final void setLocation(double x, double y, double z) {
        super.setLocation(x, y);
        this.z = (int) Math.floor(z+0.5);
    }

    public void setLocation(int x, int y, int z) {
        //super.setLocation(x,y);
        //this.z = z;
        move(x,y,z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
