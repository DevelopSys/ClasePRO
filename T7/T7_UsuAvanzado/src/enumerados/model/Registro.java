package enumerados.model;

public class Registro {

    private int temperatura;
    private int hora, minuto, dia,mes, anio;
    private Estaciones estacion;

    public Registro(int temperatura, int hora, int minuto, int dia, int mes, int anio, Estaciones estacion) {
        this.temperatura = temperatura;
        this.hora = hora;
        this.minuto = minuto;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.estacion = estacion;
        saltarAviso();
    }

    private void saltarAviso(){
        if (temperatura>estacion.getTemperaturaMedia()){
            System.out.println("El registro es superior a " +
                    "la temperatura media, ¿Es correcto?");
        }
    }
}
