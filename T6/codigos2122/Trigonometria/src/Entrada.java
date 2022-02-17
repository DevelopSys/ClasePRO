import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(7);
        Rectangulo rectangulo = new Rectangulo(4,7);
        Triangulo triangulo = new Triangulo(4,5);

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(rectangulo);
        figuras.add(triangulo);
        figuras.add(circulo);

        for ( Figura item : figuras) {
            System.out.println("Imprimiendo de la clase "+item.getClass().getSimpleName());
            System.out.println(item.calcularArea());
            if (item instanceof Circulo){
                double diam = ((Circulo) item).calcularDiametro();
                System.out.println(diam);

            } else if (item instanceof Rectangulo){
                System.out.println(((Rectangulo) item).calcularPerimetro());

            }
        }
    }
}
