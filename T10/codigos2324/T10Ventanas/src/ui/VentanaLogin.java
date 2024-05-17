package ui;

import controller.GestorUsuarios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends JFrame implements ActionListener {

    private JPanel panelCentral;
    private JTextField textoCorreo, textoTelefono;
    private JButton botonLogin;
    private GestorUsuarios gestorUsuarios;

    public VentanaLogin(GestorUsuarios gestorUsuarios) throws HeadlessException {
        this.gestorUsuarios = gestorUsuarios;
        setTitle("Login usuarios");
        instancias();
        initGUI();
        acciones();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initGUI() {
        setContentPane(panelCentral);
        panelCentral.setLayout(new GridLayout(3, 1, 10, 0));
        panelCentral.add(textoCorreo);
        panelCentral.add(textoTelefono);
        panelCentral.add(botonLogin);
    }

    private void acciones() {
        botonLogin.addActionListener(this);
    }

    private void instancias() {
        panelCentral = new JPanel();
        textoCorreo = new JTextField();
        textoTelefono = new JTextField();
        botonLogin = new JButton("Login");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // login
        try {
            if (textoCorreo.getText().length() == 0 || textoTelefono.getText().length() == 0) {
                throw new Exception("No hay datos introducidos");
            } else {
                if (gestorUsuarios.realizarLogin(textoCorreo.getText(), Integer.parseInt(textoTelefono.getText())) != null) {
                    System.out.println("Realizado login correcto");
                    VentanaGeneral ventanaGeneral = new VentanaGeneral(gestorUsuarios
                            .realizarLogin(textoCorreo.getText(), Integer.parseInt(textoTelefono.getText())));
                    this.dispose();
                } else {
                    System.out.println("Realizado login incorrecto");
                }
            }

        } catch (NumberFormatException ex) {
            System.out.println("Datos erroneos");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
