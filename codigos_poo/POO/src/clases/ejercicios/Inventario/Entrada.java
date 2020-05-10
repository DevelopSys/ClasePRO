package clases.ejercicios.Inventario;

public class Entrada {


    public static void main(String[] args) {
        SupermercadoEsp<Alimento> supermercadoAlimentos = new SupermercadoEsp();
        supermercadoAlimentos.registrarElemento(new Carne("Ternera","España",3,5));
        supermercadoAlimentos.registrarElemento(new Carne("Pollo","España",432,5));
        supermercadoAlimentos.registrarElemento(new Lacteo("Leche","España",7,5));

        SupermercadoEsp<Mueble> supermercadoMuebles = new SupermercadoEsp<>();
        supermercadoMuebles.registrarElemento(new Silla("Madera",123,13,4));
        supermercadoMuebles.registrarElemento(new Mesa("Madera",123,123,4));

        SupermercadoEsp supermercadoTodos = new SupermercadoEsp();
        supermercadoTodos.registrarElemento(new Carne("asd","asd",2,1));
        supermercadoTodos.registrarElemento(new Silla("asd",123,2,1));

        SupermercadoEsp todosObject = new SupermercadoEsp();
        todosObject.registrarElemento(new Silla("asd",2,2,2));
        todosObject.registrarElemento(new Carne("asd","2",2,2));


        todosObject.mostrarPrecios();
    }
}
