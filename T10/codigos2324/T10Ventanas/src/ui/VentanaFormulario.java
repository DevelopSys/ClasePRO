package ui;

import javax.swing.*;
import java.awt.*;

public class VentanaFormulario extends JFrame {

    private JPanel panelCentral;
    private JTextField textoNombre, textoApellido, textoCorreo, textoTelefono;
    private JButton botonRegistro, botonListar;
    private JLabel etiquetaConfirmacion;

    public VentanaFormulario() {
        setTitle("Formulario de registro");
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        instancias();
        initGUI();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void instancias() {
        textoNombre = new JTextField();
        textoApellido = new JTextField();
        textoCorreo = new JTextField();
        textoTelefono = new JTextField();
        botonRegistro = new JButton("Registrar");
        botonListar = new JButton("Listar usuarios");
        panelCentral = new JPanel();
        etiquetaConfirmacion = new JLabel();
    }

    public void initGUI(){
        setContentPane(panelCentral);
        panelCentral.setLayout(new GridLayout(7,1,10,0));
        panelCentral.add(textoNombre);
        panelCentral.add(textoApellido);
        panelCentral.add(textoCorreo);
        panelCentral.add(textoTelefono);
        panelCentral.add(botonRegistro);
        panelCentral.add(botonListar);
        panelCentral.add(etiquetaConfirmacion);
    }

}
