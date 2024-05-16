import controller.GestorUsuarios;
import ui.VentanaFormulario;
import ui.VentanaLogin;
import ui.VentanaPrincipal;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GestorUsuarios gestorUsuarios = new GestorUsuarios();
                // VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                VentanaFormulario ventanaFormulario = new VentanaFormulario(gestorUsuarios);
                VentanaLogin ventanaLogin = new VentanaLogin(gestorUsuarios);
            }
        });

    }
}
