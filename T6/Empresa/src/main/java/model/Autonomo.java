package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Autonomo extends Trabajador{

    private int segurosSociales;
    private boolean ayuda;

    public Autonomo(String nombre, String apellido, String dni, int sueldo, int segurosSociales) {
        super(nombre, apellido, dni, sueldo);
        this.segurosSociales = segurosSociales;
    }

    @Override
    public void calcularNeto() {
        double netoMes = getSueldo()/12 - segurosSociales;
    }

    @Override
    public void calcularBruto() {
        double brutoMes = getSueldo()/12;
    }

    public void pedirAyuda(){

        // segurosSociales = ayuda ? segurosSociales=segurosSociales/2 : segurosSociales;
        if(!ayuda){
            setSegurosSociales(getSegurosSociales()/2);
            ayuda=true;
        } else {
            System.out.println("Ya has pedido la ayuda");
        }
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("segurosSociales = " + segurosSociales);
    }
}
