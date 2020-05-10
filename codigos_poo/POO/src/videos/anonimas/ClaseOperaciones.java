package videos.anonimas;

public class ClaseOperaciones {

    private int suma, resta;

    public void realizarSuma(int a, int b, Operaciones operaciones){
        this.suma = operaciones.sumar(a,b);
    }

    public void realizarResta(int a, int b, Operaciones operaciones){
        this.resta = operaciones.resta(a,b);
    }

    public void realizarTodasOperaciones (int a, int b, Operaciones operaciones){
        this.suma = operaciones.sumar(a,b);
        this.resta = operaciones.resta(a,b);
    }

    public int getSuma() {
        return suma;
    }

    public int getResta() {
        return resta;
    }
}
