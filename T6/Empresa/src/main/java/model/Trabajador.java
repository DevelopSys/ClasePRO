package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
// implements Regulador
public abstract class Trabajador extends Persona{
    private int sueldo;

    public Trabajador(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("sueldo = " + sueldo);
    }

    public abstract void calcularNeto();
    public abstract void calcularBruto();

    public void pedirAumento(int salario){
        this.sueldo += salario;
    }


}
