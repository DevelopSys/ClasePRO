import java.util.ArrayList;

public class Restaurante <T> {

    private int numeroComensales;
    private double caja;
    private String nombre;
    private ArrayList<T> listaPedidos;

    public Restaurante(){
        this.listaPedidos = new ArrayList();
    }

    public Restaurante(String nombre){
        this.nombre = nombre;
        this.listaPedidos = new ArrayList();
    }

    public void colocarComensales(int comensales){
        if (numeroComensales>=50){
            try{
                new ExcepcionComensales("Restaurante lleno");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }else {
            numeroComensales+=comensales;
        }
    }

    public void registrarPedido(T pedido){
        this.listaPedidos.add(pedido);
    }

    public void verPedidos(){
        for (T pedido :listaPedidos) {
            ((Pedido)pedido).mostrarFactura();
            this.caja = ((Pedido)pedido).getPrecio();
        }
        System.out.println("El precio acumulado es de "+caja);
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    class PedidoComida extends Pedido{

        // IVA_C IVA_B CIF
        double precio;
        int numeroConsumiciones;
        Comidas tipoComida;

        public PedidoComida(double precio, int numeroConsumiciones, Comidas comidas) {
            super(precio, numeroConsumiciones);
            this.tipoComida = comidas;
        }


        @Override
        public void calcularPrecioReal() {
            this.precio = this.precio + (this.precio*Constantes.IVA_COMIDAS);
        }

        @Override
        public void mostrarFactura(){
            super.mostrarFactura();
            System.out.println("Tipo "+tipoComida.name());
            System.out.println("Restaurante "+ nombre);
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getNumeroConsumiciones() {
            return numeroConsumiciones;
        }

        public void setNumeroConsumiciones(int numeroConsumiciones) {
            this.numeroConsumiciones = numeroConsumiciones;
        }

        public Comidas getTipoComida() {
            return tipoComida;
        }

        public void setTipoComida(Comidas tipoComida) {
            this.tipoComida = tipoComida;
        }
    }

    class PedidoBebida extends Pedido {

        double precio;
        int numeroConsumiciones;
        Bebidas tipoBebida;

        public PedidoBebida(double precio, int numeroConsumiciones, Bebidas bebidas) {
            super(precio, numeroConsumiciones);
            this.tipoBebida = bebidas;
        }

        @Override
        public void mostrarFactura() {
            super.mostrarFactura();
            System.out.println("Nombre: "+nombre);
            System.out.println("Tipo: "+tipoBebida.name());
        }

        @Override
        public void calcularPrecioReal() {
          this.precio = this.precio + (this.precio * Constantes.IVA_BEBIDAS);
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getNumeroConsumiciones() {
            return numeroConsumiciones;
        }

        public void setNumeroConsumiciones(int numeroConsumiciones) {
            this.numeroConsumiciones = numeroConsumiciones;
        }

        public Bebidas getTipo() {
            return tipoBebida;
        }

        public void setTipo(Bebidas tipo) {
            this.tipoBebida = tipo;
        }
    }
}
