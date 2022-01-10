public class Entrada {

    // ambito de clase
    // String nombre = "Borja";

    public static void main(String[] args) {
        // ambito de metodo - local
        // String nombre = "Borja";
        Usuario usuario1 = new Usuario();
        // nombre="Por defecto", pass=null, correo="Por defecto", edad=0, fecha=null

        Usuario usuario2 = new Usuario();
        // nombre="Por defecto", pass=null, correo="Por defecto", edad=0, fecha=null

        Usuario usuario3 = new Usuario("Borja","borja.martin@ces.es"
                ,"pass");
        // nombre="Borja", pass="pass", correo="borja.martin@ces.es", edad=0, fecha=null

        Usuario usuario4 = new Usuario("borja.martin@ces.es","pass",20);
        // nombre=null, pass="pass", correo="borja.martin@ces.es", edad=20, fecha=null

        /*System.out.println(usuario1.password);
        usuario1.password = "contraseña";
        System.out.println(usuario1.password);
        // nombre="Por defecto", pass="contraseña", correo="Por defecto", edad=0, fecha=null
        */

        usuario1.setPassword("contraseña");
        System.out.println(usuario1.getPassword());





    }


}
