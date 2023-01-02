package objetos;

// base del objeto de tipo coche
public class Coche {

    // propiedades o atributos -> variables
    // cosas que definen al objeto (Coche)
    // marca, modelo, cv, numeroPuertas, precio
    private String marca, modelo;
    private int cv, numeroPuertas, precio, velocidad;

    private int litrosGasolina, km, marcha;

    // métodos -> constructor siempre y cuando no tenga otro hay uno por defecto
    // por defecto tengo el constructor default Coche()
    // marca = null modelo = null cv = 0 numeroPuertas = 0 precio = 0

    // public NombreClase(parametros){}

    public Coche(String marca, String modelo, int cv, int numeroPuertas, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.numeroPuertas = numeroPuertas;
        this.precio = precio;
    }

    public Coche(String marca, String modelo, int cv, int numeroPuertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.numeroPuertas = numeroPuertas;
        this.precio = 5000;
    }

    public Coche() {
        this.marca = "defecto";
        this.modelo = "defecto";
    }

    // métodos -> funcionalidades -> cosas que el objeto puede hacer

    // acelerar --> aumenta la velocidad, consume gasolina, suben los KM y se cambia la marca (dependiendo de la velocidad)


    public void acelerar(int velocidad) {


        // no puedo acelerar si al menos no tengo la misma cantidad de
        // gasolina que velocidad acelero

        if (litrosGasolina - velocidad < 0) {
            // no puedo acelerar
            System.out.println("No tienes gasolina suficiente");
        } else {
            // subira la velocidad
            if (this.velocidad + velocidad <= 300) {
                this.velocidad += velocidad;
            } else {
                this.velocidad = 300;
            }
            // gastara gasolina
            this.litrosGasolina -= (velocidad * 30) / 100;
            // cambiara marcha
            cambiarMarcha(true);


            // aumenta km
            this.km += velocidad / 3;
        }
    }

    private void cambiarMarcha(boolean movimiento) {
        if (movimiento) {
            // aumentar --> true
            if (marcha ==6){
                marcha =6;
            } else {
                marcha++;
            }
        } else {

            // disminuir --> false
            if (marcha ==0){
                marcha =0;
            } else {
                marcha--;
            }
        }
    }

    public void mostrarDatos() {

        System.out.println("Modelo " + this.modelo);
        System.out.println("Velocidad " + this.velocidad);
        System.out.println("Marcha " + this.marcha);
        System.out.println("KM " + this.km);
        System.out.println("Gasolina " + this.litrosGasolina);
    }

    public void cargarGasolina(int litros) {
        if (litros <= 0) {
            System.out.println("No se puede recargar negativo");
        } else if (litrosGasolina + litros > 200) {
            litrosGasolina = 200;
        } else {
            litrosGasolina += litros;
        }
    }

    // frenar --> baja o pone a 0 la velocidad, se cambia la marca (dependiendo de la velocidad)
    public void frenar(int velocidad) {
        if (velocidad < 0) {
            System.out.println("No se puede frenar");
        } else if (this.velocidad - velocidad <= 0) {
            this.velocidad = 0;
        } else {
            this.velocidad -= velocidad;
        }
        cambiarMarcha(false);

    }
    // cambiarMarcha --> cambia la marcha del motor


    // métodos -> getter / setter


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(int litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}
