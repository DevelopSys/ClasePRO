public class EntradaLogin {

    public static void main(String[] args) {
        OperacionesLogin operacionesLogin = new OperacionesLogin();
        operacionesLogin.conectarDB();
        operacionesLogin.realizarLogin();
        operacionesLogin.cerrarConexion();
    }
}
