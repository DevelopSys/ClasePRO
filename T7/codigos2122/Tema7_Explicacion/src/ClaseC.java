public class ClaseC {

    public void registrarMensaje(ClaseA claseA){
        // ClaseA --> claseA claseB
        claseA.mostrarMensaje();
        claseA.mensajeAbstracto();
    }

    public void modificarMensaje(String s, Modicables modicables){
        modicables.lanzarMayusculas(s);
        modicables.lanzarMinisculas(s);
    }
}
