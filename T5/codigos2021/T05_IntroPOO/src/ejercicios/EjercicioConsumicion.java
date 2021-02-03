package ejercicios;

import ejercicios.ejerciciocajero.Cuenta;

public class EjercicioConsumicion {

    public static void main(String[] args) {

        int contador=0;
        Cuenta c1 = new Cuenta(contador,"qw",0);
        contador++;
        Cuenta c2= new Cuenta(contador,"qw",0);
        contador++;
        Cuenta c3 = new Cuenta(contador,"qw",0);
    }
}
