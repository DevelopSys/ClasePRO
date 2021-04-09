package anidamientoestatico;

public class Entrada {

    public static void main(String[] args) {
        Externa externa = new Externa("claseExterna",1);
        Externa.Interna interna = new Externa.Interna("interna1",1);
        Externa.Interna interna1 = new Externa.Interna("interna2",2);
        Relacion relacion = new Relacion();
        relacion.relacionarClases(interna,interna1);


    }
}
