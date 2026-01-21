package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Jefe extends Trabajador{

    private int nivelResponsabilidad;

    public Jefe(String nombre, String apellido, String dni, int sueldo, int nivelResponsabilidad) {
        super(nombre, apellido, dni, sueldo);
        this.nivelResponsabilidad = nivelResponsabilidad;
    }

    @Override
    public void calcularNeto() {
        double netoMes = getSueldo()/12;
        System.out.println("salario = " + netoMes);
    }

    @Override
    public void calcularBruto() {
        calcularNeto();
    }

    public void cambiarResponsabilidad(int nivel){
        if (nivel<0){
            System.out.println("No puedes no tener resposabilidad");
        } else if(nivel>5){
            System.out.println("No te podemos dar tanta responsabilidad");
        } else if(nivelResponsabilidad == nivel){
            System.out.println("Indica un nivel diferente");
            int nivelResp = 0;
            cambiarResponsabilidad(nivelResp);
        }

        else {
            setNivelResponsabilidad(nivel);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nivelResponsabilidad = " + nivelResponsabilidad);
    }

    public boolean contratarTrabajador(Trabajador trabajador){
        if(trabajador.getSueldo() >30000
                && trabajador instanceof Asalariado){
            return false;
        } else if(trabajador instanceof Asalariado){
            return true;
        } else if(trabajador.getSueldo()<30000 && trabajador instanceof Autonomo){
            return true;
        } else {
            return false;
        }
    }
}
