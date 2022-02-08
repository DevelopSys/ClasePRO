import java.util.ArrayList;

public class Jugador {

    private String nombre, dni;
    private ArrayList<Carton> cartones;
    private int saldo;
    private boolean ganador;

    public Jugador(String nombre, String dni, int saldo){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
        this.cartones = new ArrayList<>();
    }

    public void recargarSaldo(int cantidad){
        if (cantidad>0){
            this.saldo += cantidad;
        }
    }

    public void verCartones(){
        int contador = 1;
        for ( Carton carton: cartones ) {
            System.out.println("Carton "+contador);
            carton.verNumeros();
            contador++;
        }
    }


    public void comprobarNumero(int numero){
        for ( Carton carton : cartones ) {
            carton.comprobarNumero(numero);
            if(carton.getNumeroAciertos() == 10){
                ganador = true;
                break;
            }
        }
    }

    public void comparCartones(int cantidad){
        if (saldo-cantidad >= 0){
            this.saldo -= cantidad;
            for (int i = 0; i < cantidad; i++) {
                cartones.add(new Carton());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Carton> getCartones() {
        return cartones;
    }

    public void setCartones(ArrayList<Carton> cartones) {
        this.cartones = cartones;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
}
