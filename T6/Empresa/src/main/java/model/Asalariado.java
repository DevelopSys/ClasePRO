package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public final class Asalariado extends Trabajador{

    private int nPagas;
    private int irpf;
    private int salarioNeto;

    public Asalariado(String nombre, String apellido, String dni, int sueldo, int nPagas, int irpf) {
        super(nombre, apellido, dni, sueldo);
        this.nPagas = nPagas;
        this.irpf = irpf;
        salarioNeto = getSueldo() - (getSueldo()* irpf/100);
    }

    @Override
    public void calcularNeto() {
        double netoMes = (double) salarioNeto/nPagas;
        System.out.println("netoMes = " + netoMes);
    }

    @Override
    public void calcularBruto() {
        double brutoMes = (double) getSueldo() /nPagas;
        System.out.println("brutoMes = " + brutoMes);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nPagas = " + nPagas);
        System.out.println("irpf = " + irpf);
    }
}
