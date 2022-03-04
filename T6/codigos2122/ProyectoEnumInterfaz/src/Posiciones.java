public enum Posiciones {

    // objetos precargados
    // si quiero sacar el String del tiempo .name()
    portero("portero",1000), defensa("defensa",1500),
    medio("mediocentro",2000), delantero("delantero",3000);

    // variables
    String definicion;
    int valor;

    // constructores

    Posiciones(){}

    Posiciones(String definicion, int valor) {
        this.definicion = definicion;
        this.valor = valor;
    }


    // metodos


    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
