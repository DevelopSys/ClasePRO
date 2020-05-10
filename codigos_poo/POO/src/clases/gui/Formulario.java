package clases.gui;

import clases.gui.utils.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Formulario extends JFrame {

    private JTextField textNombre, textApellido, textTelefono;
    private JButton bAceptar, bVer;
    private Container container;
    private ArrayList<Usuario> listaUsuarios;

    public Formulario() {
        initGUI();
    }
    private void initGUI() {

        instancias();
        agregarElementos();
        acciones();
        this.setVisible(true);
        this.setTitle("Agenda");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(300, 200);
        this.pack();

    }
    private void agregarElementos() {
        container.setLayout(new GridLayout(4, 2, 20, 20));
        container.add(new JLabel("Nombre"));
        container.add(textNombre);
        container.add(new JLabel("Apellido"));
        container.add(textApellido);
        container.add(new JLabel("Teléfono"));
        container.add(textTelefono);
        container.add(bAceptar);
        container.add(bVer);
    }
    private void acciones() {

        bAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Boton aceptar pulsado");
                String nombre = textNombre.getText();
                String apellido = textApellido.getText();
                int telefono = 0;
                if (textTelefono.getText().length() > 0) {
                    try {
                        telefono = Integer.parseInt(textTelefono.getText());
                    }
                    catch (NumberFormatException ex){
                        System.out.println("Por favor solo valen números");
                    }
                }

                if (textNombre.getText().length() == 0 || textApellido.getText().length() == 0 || telefono == 0) {
                    System.out.println("Falta algún dato");
                } else {
                    //System.out.printf("Nombre: %s, Apellido: %s, Teléfono: %d %n", nombre, apellido, telefono);
                    listaUsuarios.add(new Usuario(nombre,apellido,telefono));
                    limpiarCampos();
                    System.out.println(listaUsuarios.size());
                }

            }
        });
        bVer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Boton ver pulsado");
                if (listaUsuarios.size()>0){
                    for (Usuario u: listaUsuarios) {
                        System.out.println(u.toString());
                    }
                } else {
                    System.out.println("No hay elementos a mostrar");
                }

            }
        });
        textTelefono.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                //System.out.println("typed");
                //System.out.println(e.getKeyChar());
                //'q';

                if (!Character.isDigit(e.getKeyChar())) {
                    e.consume();
                } else {
                    if (textTelefono.getText().length()>8){
                        e.consume();
                    }
                }
            }
        });



    }
    public void limpiarCampos() {
        textApellido.setText("");
        textNombre.setText("");
        textTelefono.setText("");
    }
    private void instancias() {
        listaUsuarios = new ArrayList<>();
        container = this.getContentPane();
        textNombre = new JTextField();
        textApellido = new JTextField();
        textTelefono = new JTextField();
        bAceptar = new JButton("Aceptar");
        bVer = new JButton("Ver");
    }

}
