import model.Carrera;
import model.Validacion;
import model.Vehiculo;
import utils.TiposVehiculos;

public class Entrada {

    public static void main(String[] args) {

        Carrera carrera = new Carrera();
        // participantes = {}
        // TiposVehiculos tipo, int numeroRuedas, int cv, int peso
        Vehiculo v1 = new Vehiculo(TiposVehiculos.Coche, 2, 400, 1000) {
            @Override
            public void reprogramarMotor() {
                // reprogramar con cv
                setCv((int) (getCv() + (getCv() * 0.25)));
            }
        };
        Vehiculo v3 = new Vehiculo(TiposVehiculos.Motocicleta, 2, 400, 50) {
            @Override
            public void reprogramarMotor() {
                // reprogramar con cv
                setCv((int) (getCv() + (getCv() * 0.25)));
            }
        };

        Vehiculo v2 = new Vehiculo(TiposVehiculos.Camion, 4, 200, 1500) {
            @Override
            public void reprogramarMotor() {
                // reprogramar con cv
                setPeso((int) (getPeso() - (getPeso() * 0.35)));
            }
        };
        carrera.validarVehiculo(v2, new Validacion() {
            @Override
            public boolean validar(Vehiculo vehiculo) {
                return vehiculo.getNumeroRuedas() == 4 && vehiculo.getPeso() > 1000;

            }
        });
        carrera.validarVehiculo(v1, new Validacion() {
            @Override
            public boolean validar(Vehiculo vehiculo) {

                return vehiculo.getNumeroRuedas() == 4 && vehiculo.getCv() > 300;

            }
        });
        carrera.validarVehiculo(v3, new Validacion() {
            @Override
            public boolean validar(Vehiculo vehiculo) {

                return vehiculo.getNumeroRuedas() == 2 && vehiculo.getPeso() < 100;

            }
        });

        carrera.generarGanador();
    }
}
