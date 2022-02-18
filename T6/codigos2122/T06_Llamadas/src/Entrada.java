public class Entrada {

    public static void main(String[] args) {
        //LlamadaProvincial llamadaProvincial = new LlamadaProvincial(123,123,40);
        //llamadaProvincial.mostrarDatos();
        Centralita centralita = new Centralita();

        LlamadaNacional llamadaNacional = new LlamadaNacional(123123,123123,10,1);
        LlamadaProvincial llamadaProvincial = new LlamadaProvincial(123123,123123,20);
        LlamadaLocal llamadaLocal = new LlamadaLocal(123123,123123,30);

        centralita.agregarLlamada(llamadaLocal);
        centralita.agregarLlamada(llamadaNacional);
        centralita.agregarLlamada(llamadaProvincial);
        centralita.agregarLlamada(llamadaProvincial);
        centralita.agregarLlamada(llamadaProvincial);
        centralita.agregarLlamada(llamadaProvincial);
        centralita.agregarLlamada(llamadaProvincial);
        centralita.agregarLlamada(llamadaProvincial);

        //centralita.listarTodas();
        centralita.mostrarLlamadas("todas");
        //centralita.mostrarLlamadas("locales");
        //centralita.
        //centralita.calcularCostes();
        System.out.println(centralita.getCosteAcumulado());


    }
}
