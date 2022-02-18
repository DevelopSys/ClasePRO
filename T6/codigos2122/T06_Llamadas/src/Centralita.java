import java.util.ArrayList;

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;
    private int costeAcumulado =0;

    public Centralita() {
        listaLlamadas = new ArrayList<>();
    }

    public void calcularCostes(){
        for ( Llamada item : listaLlamadas ) {
                costeAcumulado += item.getCoste();
        }

        System.out.println("El coste de todas las llamadas realizadas es: "+costeAcumulado);
    }

    public void agregarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        System.out.println("Agregada con exito y sus datos son");
        llamada.mostrarDatos();
        this.costeAcumulado += llamada.getCoste();
    }

    public void mostrarLlamadas(String tipo){
        switch (tipo){
            case "locales":
                listarLocales();
                break;
            case "nacionales":
                listarNacionales();
                break;
            case "provinciales":
                listarProvinciales();
                break;
            default:
                listarTodas();
        }
    }

    private void listarTodas(){
        for ( Llamada item: listaLlamadas) {
            System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
        }
    }

    private void listarNacionales(){
        for ( Llamada item: listaLlamadas) {
            if (item instanceof LlamadaNacional){
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    private void listarLocales(){
        for ( Llamada item: listaLlamadas) {
            if (item instanceof LlamadaLocal){
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    private void listarProvinciales(){
        for ( Llamada item: listaLlamadas) {
            if (item instanceof LlamadaProvincial){
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    public int getCosteAcumulado() {
        return costeAcumulado;
    }

    public void setCosteAcumulado(int costeAcumulado) {
        this.costeAcumulado = costeAcumulado;
    }
}
