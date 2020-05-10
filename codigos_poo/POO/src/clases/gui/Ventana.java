package clases.gui;

import com.sun.tools.javac.comp.Flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private Container contenedor;
    private JLabel etiqueta;
    private JButton boton, botonCambio;
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextArea textArea;

    public Ventana() {
        initGUI();
    }

    public void initGUI(){
        // creo una ventana
        //JFrame ventana = new JFrame();

        instancias();
        agregarElementos();
        acciones();
        this.setVisible(true);
        this.setTitle("Primera ventana en Swing");
        this.setSize(500,500);
        //ventana.setExtendedState(JFrame.MAXIMIZED_VERT);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        //ventana.setLocation(50,50);
        //ventana.setSize(new Dimension(100,100));
        //ventana.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void acciones() {
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Botón pulsado");
                agregarEtiqueta();
                //etiqueta.setText("Valor cambiado");
                pack();
            }
        });
        botonCambio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //etiqueta.setText("Valor cambiado");
                //System.out.println(textField.getText());
                //textField.setText("texto nuevo");
                etiqueta.setText(textField.getText());
            }
        });
    }

    private void agregarEtiqueta(){
        contenedor.add(new JLabel("nueva"));
    }

    private void agregarElementos() {
        //etiqueta.setText("Texto nuevo de etiqueta");
        //contenedor.setLayout(new FlowLayout());
        contenedor.setLayout(new GridLayout(2,2,10,10));
        contenedor.add(etiqueta);
        boton.setText("Pulsar nuevo");
        boton.setEnabled(true);
        boton.setToolTipText("Pulsa este botón para agregar elementos");
        contenedor.add(botonCambio);
        contenedor.add(boton);
        contenedor.add(textField);
        //contenedor.add(passwordField);
        //contenedor.add(textArea);
    }

    private void instancias(){
        contenedor = this.getContentPane();
        etiqueta = new JLabel("Ejemplo de etiqueta");
        boton = new JButton("Agregar Etiqueta");
        botonCambio = new JButton("Cambiar valor");
        textField = new JTextField("hint",5);
        passwordField = new JPasswordField(5);
        textArea = new JTextArea(3,5);
    }

}
