package supermercadoGenerico;

public class Entrada {

    public static void main(String[] args) {

        //Lacteo lacteo = new Lacteo("Premium","Galicia",5,100);
        //System.out.printf(lacteo.mostrarDatos());
        Carne carne = new Carne("asd","asd",10,2);
        Lacteo leche = new Lacteo("asd","asd",15,1);
        Silla silla = new Silla("asd",4,2,2);
        Supermercado<Alimento> supermercado = new Supermercado();
        Supermercado<Mueble> supermercadoMuebles = new Supermercado();
        Supermercado<Producto> supermercadoTodo = new Supermercado<>();
        supermercadoTodo.registrarProducto(silla);
        supermercadoTodo.registrarProducto(carne);
        supermercadoTodo.registrarProducto(leche);
        supermercado.registrarProducto(carne);
        supermercado.registrarProducto(leche);
        supermercado.calcularPrecios();
        supermercadoMuebles.registrarProducto(silla);
        /*supermercado.calcularPrecioAn(new Alimento("asd","asd",12) {
            @Override
            public String mostrarDatos() {
                return "asd";
            }

            @Override
            public int calcularPrecio() {
                return (int) (this.precio * IVA_ALIMENTO);
            }

            @Override
            public void miMetodo() {
                super.miMetodo();
            }
        });*/

    }


}
