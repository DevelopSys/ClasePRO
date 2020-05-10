package clases.gui;

import clases.gui.utils.Usuario;
import com.sun.tools.javac.comp.Flow;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrganizacionBorder extends JFrame {

    private JButton botonNorte, botonEste, botonSur, botonOeste, botonCentro, bValidar;
    private JTextField texfieldValidar;
    private JPanel panelNorte;
    private Container container;
    private JList listaElementos;
    private DefaultListModel datosLista;

    public OrganizacionBorder() {
        initGUI();
    }

    public void initGUI() {

        instancias();
        agregarElementos();
        acciones();

        this.setVisible(true);
        this.setTitle("Organización con BorderLayout");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
    }

    public void instancias() {
        botonCentro = new JButton("Centro");
        botonEste = new JButton("Este");
        botonNorte = new JButton("Norte");
        botonOeste = new JButton("Oeste");
        botonSur = new JButton("Ver datos");
        bValidar = new JButton("Validar");
        texfieldValidar = new JTextField(10);
        container = getContentPane();
        panelNorte = new JPanel();
        datosLista = new DefaultListModel();
        listaElementos = new JList(datosLista);
        //panelNorte.setBackground(Color.BLUE);
    }

    public JPanel configurarPanelNorte() {
        panelNorte.setLayout(new FlowLayout());
        panelNorte.add(new JLabel("Por favor introduce un nombre valido"));
        panelNorte.add(texfieldValidar);
        panelNorte.add(bValidar);
        return panelNorte;
    }

    public void agregarDatosLista(Usuario usuario) {
        datosLista.addElement(usuario);
    }

    public void agregarElementos() {
        // container.setLayout(new FlowLayout());
        // configurarPanelNorte();
        container.add(new JScrollPane(listaElementos), BorderLayout.CENTER);
        //container.add(botonEste, BorderLayout.EAST);
        container.add(configurarPanelNorte(), BorderLayout.NORTH);
        container.add(botonSur, BorderLayout.SOUTH);
        //container.add(botonOeste, BorderLayout.WEST);
    }

    public void acciones() {

        bValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = texfieldValidar.getText();
                if (nombre.length() > 0) {
                    agregarDatosLista(new Usuario(nombre,"asdfdasd",123));
                } else {
                    System.out.println("nombre no validado");
                }
            }
        });

        botonSur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listaElementos.getSelectedIndex()>-1){
                    // hay cosas seleccionadas
                    Usuario usuario = (Usuario) datosLista.getElementAt(listaElementos.getSelectedIndex());
                    System.out.println(usuario.getApellido());
                } else {
                    System.out.println("no hay seleccion");
                }
                //listaElementos.setSelectedIndex(1);

            }
        });
        listaElementos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //System.out.println("cambio de seleccion");
                //System.out.println(listaElementos.getSelectedIndex());
                if (e.getValueIsAdjusting()){
                Usuario usuario = (Usuario) datosLista.getElementAt(listaElementos.getSelectedIndex());
                System.out.println(usuario.getApellido());}
            }
        });

    }

}
