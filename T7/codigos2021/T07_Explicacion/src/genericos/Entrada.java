package genericos;

public class Entrada

{

    public static void main(String[] args) {
        /*InterfazGenerica interfazGenerica = new InventarioLetras();
        InterfazGenerica interfazGenerica1 = new InventarioNumeros();

        interfazGenerica.agregarElemento("123");
        interfazGenerica1.agregarElemento(123);*/
        //ClaseNumeros claseNumeros = new ClaseNumeros();
        ClaseNumeros<Double> objetoNumeros = new ClaseNumeros<>();
        objetoNumeros.metodoGenerico("asd");
    }
}
