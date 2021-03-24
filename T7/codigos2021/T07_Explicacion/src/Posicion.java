public enum Posicion {

    // DATOS los que son precargados
    PORTERO("Portero", 100),
    DEFENSA("Mefensa", 200),
    MEDIO("Medio", 300),
    DELANTERO("Delantero", 500),
    ENTRENADOR("Entrenador");


    // propiedades - atributos
    private String posicion;
    private int valor;

    // constructor/es

    Posicion(){}

    Posicion(String posicion) {
        this.posicion = posicion;
    }

    Posicion(String posicion, int valor) {
        this.posicion = posicion;
        this.valor = valor;
    }

    // metodos

    public String getPosicion() {
        return posicion;
    }

    public int getValor() {
        return valor;
    }

    public void mostrarDatos() {
        System.out.println(this.posicion);
        System.out.println(this.valor);
    }

}
