import model.Usuario;

public class Entrada {

    public static void main(String[] args) {
        // OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        // operacionesFicheros.leerInformacion();
        // operacionesFicheros.crearDirectorio("src/recursos/escritura/completa");
        // operacionesFicheros.crearFichero("src/recursos/lectura/ejemplo_lectura.txt");
        // operacionesFicheros.lecturaUnitaria("src/recursos/lectura/ejemplo_lectura.txt");
        // operacionesFicheros.lecturaCodigoCompleta("src/recursos/lectura/ejemplo_lectura_codigo.txt");
        // operacionesFicheros.escribirFichero("src/recursos/escritura/completa/ejemplo_escritura.txt");
        // operacionesFicheros.guardarDatos("src/recursos/escritura/completa/ejemplo_escritura_datos.txt");
        // operacionesFicheros.escrituraFicheroCompleta("src/recursos/escritura/completa/ejemplo_escritura_completa.txt");
        OperacionesUsuario operacionesUsuario = new OperacionesUsuario();
        /*operacionesUsuario.escribirUsuario("src/recursos/agenda.txt",new Usuario("Borja1","Martin","borja@gmail.com",1234));
        operacionesUsuario.escribirUsuario("src/recursos/agenda.txt",new Usuario("Borja2","Martin","borja@gmail.com",1234));
        operacionesUsuario.escribirUsuario("src/recursos/agenda.txt",new Usuario("Borja3","Martin","borja@gmail.com",1234));
        operacionesUsuario.escribirUsuario("src/recursos/agenda.txt",new Usuario("Borja4","Martin","borja@gmail.com",1234));*/
        operacionesUsuario.lecturaUsuarios("src/recursos/agenda.txt");
    }
}
