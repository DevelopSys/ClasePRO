package ui;

import javax.swing.*;

public class VentanaGeneral extends JFrame{
    private JPanel panelCentral;
    private JLabel etiquedaNombre;
    private JButton botonCerrar;
    private JPanel panelDatos;
    private JLabel textoNombre;
    private JLabel texroApellido;

    public VentanaGeneral() {
        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
