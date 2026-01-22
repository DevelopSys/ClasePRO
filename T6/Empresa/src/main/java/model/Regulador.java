package model;

public interface Regulador {

    // metodos -> abs public
    // metodos -> default public
    default void metodoComun()
    {

        System.out.println("Este metodo lo tendran los reguladores");
    }
    // como se le sube el salario a un trabajador
    boolean subirSalario(Trabajador trabajador, int salario);

    // variables -> const static
    String regulador ="REGULADOR OFICIAL";
}
