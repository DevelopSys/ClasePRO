package database;

public interface Esquema {

    String PORT = "3306";
    String HOST = "127.0.0.1:"+PORT;
    String DB_NAME = "compras";
    String TAB_PRODUCTOS = "productos";
    String TAB_CLIENTES = "clientes";
    String COL_NOMBRE = "title";
    String COL_PRECIO = "price";
    String COL_CORREO = "correo";
    String COL_PASS = "pass";
    String COL_ID = "id";
}
