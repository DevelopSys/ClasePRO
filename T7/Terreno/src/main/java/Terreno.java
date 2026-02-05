import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Terreno {
    // si quiero acceder a las cosas de casa, no puedo de forma directa
    private int metrosCuadrados, metrosCuadradosDiponibles;
    private double valoracion;
    private Casa casa;
    private Orientacion orientacionTerreno;

    public Terreno(int metrosCuadrados, Orientacion orientacionTerreno) {
        this.metrosCuadrados = metrosCuadrados;
        this.metrosCuadradosDiponibles = this.metrosCuadrados;
        this.orientacionTerreno = orientacionTerreno;
        this.valoracion = this.metrosCuadrados * 5500;
    }

    public void construirCasa(int metrosCuadrados, boolean piscina) {
        if (casa == null) {
            if (metrosCuadrados > this.metrosCuadrados) {
                System.out.println("No hay espacio disponible");
            } else {
                new Casa(metrosCuadrados, piscina);
                // todo revalorizar
            }
        } else {
            System.out.println("Ya cuentas con una casa en el terreno");
        }

    }

    public void mostrarDatos() {
        System.out.println("metrosCuadrados = " + metrosCuadrados);
        System.out.println("metrosCuadradosDiponibles = " + metrosCuadradosDiponibles);
        System.out.println("valoracion = " + valoracion);
        System.out.println("casa = " + casa.habitaciones);
        casa.mostrarDatos();
    }

    @Data
    @NoArgsConstructor
    public class Casa {
        // puedo acceder a todo lo del terreno
        private int metrosCuadrados, metrosCuadradosDiponibles;
        private int habitaciones;
        private boolean piscina;

        public Casa(int metrosCuadrados, boolean piscina) {
            if (metrosCuadrados > Terreno.this.metrosCuadradosDiponibles) {
                System.out.println("Casa demasiado grande");
            } else {
                this.metrosCuadrados = metrosCuadrados;
                this.metrosCuadradosDiponibles = this.metrosCuadrados;
                if (metrosCuadrados < 100) {
                    System.out.println("No puedes contruir la piscina");
                    // piscina = false
                } else {
                    this.piscina = piscina;
                }
                Terreno.this.metrosCuadradosDiponibles -= metrosCuadrados;
                Terreno.this.casa = this;
            }

        }

        public void construirPiscina() {
            if (piscina) {
                System.out.println("Ya cuentas con piscina, no puedes construir");
            } else if (metrosCuadrados < 100) {
                System.out.println("no puedes construir, no tienes espacio");
            } else {
                piscina = true;
                System.out.println("Piscina construida");
                // todo revalorizar
            }
        }

        public void construirHabitacion(int metrosCuadrados) {
            if (metrosCuadrados > metrosCuadradosDiponibles) {
                System.out.println("No entra la habitacion en la casa");
            } else {
                habitaciones++;
                metrosCuadradosDiponibles -= metrosCuadrados;
            }
        }

        public void construirAnexo(int metrosCuadrados) {
            if (metrosCuadrados > Terreno.this.metrosCuadradosDiponibles) {
                System.out.println("No entra el anexo en el terreno");
            } else {

                Terreno.this.metrosCuadradosDiponibles -= metrosCuadrados;
            }
        }

        public void mostrarDatos() {
            System.out.println("metrosCuadrados = " + metrosCuadrados);
            System.out.println("metrosCuadradosDiponibles = " + metrosCuadradosDiponibles);
            System.out.println("piscina = " + piscina);
            System.out.println("habitaciones = " + habitaciones);
        }
    }
}
