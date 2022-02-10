public class Entrada {

    public static void main(String[] args) {
        /*Coche coche = new Coche("123A","123",100,2000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());*/
        Deportivo deportivo = new Deportivo("234B","234",200,2500,600);
        deportivo.calcularVelocidad(120);
        System.out.println(deportivo.getVelocidad());
        SUV suv= new SUV("234B","234",200,2500,true);
        suv.calcularVelocidad(120);
        System.out.println(suv.getVelocidad());
        Utilitario utilitario = new Utilitario("234B","234",200,2500,5);
        utilitario.calcularVelocidad(60);
        System.out.println(utilitario.getVelocidad());

    }
}
