public class Deportivo extends Coche{

    private int par;

    // todo lo que tiene coche

    public Deportivo(){}
    public Deportivo(String matricula, String bastidor, int cv, int cc, int par){
        super(matricula,bastidor,cv,cc);
        this.par = par;
    }

    // calcularVelocidad
        // lo que hacia
        // DEPORTIVO --> 30 - 40
        // ELECTRICO --> 20 - 30
        // SUV --> 10 - 17
    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        System.out.println("Velocidad calculada");
        int aleatorio = (int) (Math.random() * 11) +30;
        //setVelocidad(getVelocidad()+aleatorio);
        this.velocidad += aleatorio;

    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
