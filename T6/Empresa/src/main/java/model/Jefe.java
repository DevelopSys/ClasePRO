package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Jefe extends Trabajador implements Regulador{

    private int nivelResponsabilidad;
    private Tipo tipoJefe;

    public Jefe(String nombre, String apellido, String dni, int sueldo, int nivelResponsabilidad, Tipo tipoJefe) {
        super(nombre, apellido, dni, sueldo);
        this.nivelResponsabilidad = nivelResponsabilidad;
        this.tipoJefe = tipoJefe;
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
        System.out.println("Mi nivel de dureza es de "+tipoJefe.getNivelDureza());
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

    @Override
    public boolean subirSalario(Trabajador trabajador, int salario) {
        trabajador.setSueldo(trabajador.getSueldo()+salario);
        return true;
    }
}
