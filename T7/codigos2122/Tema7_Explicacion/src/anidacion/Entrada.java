package anidacion;

public class Entrada {

    public static void main(String[] args) {
        //ClaseGeneral claseGeneral = new ClaseGeneral("General",1,false);


        //ClaseGeneral.ClaseAnidada claseAnidada = claseGeneral.new ClaseAnidada("Hija", 2, true);
        //claseAnidada.accesoAGeneral();
        //claseGeneral.accesoHijo();

        //claseGenerica.metodoGenerico();
        ClaseGenerica claseGenerica =
                new ClaseGenerica("Nombre",
                        10,
                        true,
                        new ClaseGenerica.ClaseStatic("Static prueba", 50, false));
        claseGenerica.metodoGenerico();

        ClaseGenerica.ClaseStatic claseStatic = new ClaseGenerica.ClaseStatic("Static", 20, false);
        //claseStatic.metodoClaseStatic();
        //ClaseGenerica.metodoGenerico();


    }
}
