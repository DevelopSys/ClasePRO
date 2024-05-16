package ui;

import controller.GestorUsuarios;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class VentanaFormulario extends JFrame implements ActionListener {

    private JPanel panelCentral;
    private JTextField textoNombre, textoApellido, textoCorreo, textoTelefono;
    private JButton botonRegistro, botonListar;
    private JLabel etiquetaConfirmacion;
    private GestorUsuarios gestorUsuarios;


    public VentanaFormulario(GestorUsuarios gestorUsuarios) {
        this.gestorUsuarios = gestorUsuarios;
        setTitle("Formulario de registro");
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        instancias();
        initGUI();
        acciones();
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

    public void initGUI() {
        setContentPane(panelCentral);
        panelCentral.setLayout(new GridLayout(7, 1, 10, 0));
        panelCentral.add(textoNombre);
        panelCentral.add(textoApellido);
        panelCentral.add(textoCorreo);
        panelCentral.add(textoTelefono);
        panelCentral.add(botonRegistro);
        panelCentral.add(botonListar);
        panelCentral.add(etiquetaConfirmacion);
    }

    public void acciones() {
        botonRegistro.addActionListener(this);
        botonListar.addActionListener(this);
        botonRegistro.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonRegistro) {
            // Crear usuarios
            // Gestor y lo agrego
            try{
                if (textoNombre.getText().length()==0 || textoCorreo.getText().length() ==0 || textoApellido.getText().length()==0){
                    throw new Exception("Datos incompletos");
                } else {
                    Usuario usuario = new Usuario(textoNombre.getText(), textoApellido.getText()
                            , textoCorreo.getText(), Integer.parseInt(textoTelefono.getText()));
                    gestorUsuarios.agregarUsuario(usuario);

                    textoNombre.setText("");
                    textoCorreo.setText("");
                    textoApellido.setText("");
                    textoTelefono.setText("");

                    etiquetaConfirmacion.setText("El numero de usuarios registrados es: "
                            + gestorUsuarios.getListaUsuarios().size());
                }

            } catch (NumberFormatException ex){
                System.out.println("Datos incorrectos");
            } catch (Exception ex){
                System.out.printf(ex.getMessage());
            }


        } else if (e.getSource() == botonListar) {
            if (gestorUsuarios.getListaUsuarios().isEmpty()){
                System.out.println("No hay usuarios a listar");
            } else {
                gestorUsuarios.listarUsuarios();
            }
        }
    }
}
