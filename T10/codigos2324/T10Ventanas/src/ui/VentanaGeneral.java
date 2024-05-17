package ui;

import model.Usuario;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaGeneral extends JFrame{
    private JPanel panelCentral;
    private JLabel etiquedaNombre;
    private JButton botonCerrar;
    private JPanel panelDatos;
    private JLabel textoNombre;
    private JLabel etiquetaApellido;
    private JList listaHobbies;
    private ArrayList<Usuario> listado;
    private DefaultListModel modelo;
    private Usuario usuario;

    public VentanaGeneral(Usuario usuario) {
        setContentPane(panelCentral);
        this.usuario = usuario;
        listado = new ArrayList<>();
        listado.add(new Usuario("Borja1","Martin","correo",123));
        listado.add(new Usuario("Borja2","Martin","correo",123));
        listado.add(new Usuario("Borja3","Martin","correo",123));
        listado.add(new Usuario("Borja4","Martin","correo",123));
        listado.add(new Usuario("Borja5","Martin","correo",123));
        //listado.add("Informatica");
        //listado.add("Cine");
        //listado.add("Lectura");
        modelo = new DefaultListModel();
        modelo.addAll(listado);
        listaHobbies.setModel(modelo);
        setUsuarioData();
        pack();
        acciones();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void acciones() {
        /*listaHobbies.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println(listaHobbies.getSelectedIndex());
            }
        });*/
        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(listado.get(listaHobbies.getSelectedIndex()).getCorreo());
            }
        });
    }

    private void setUsuarioData(){
        this.textoNombre.setText(usuario.getNombre());
        this.etiquedaNombre.setText("Bienvenido "+usuario.getCorreo());
        this.etiquetaApellido.setText(usuario.getApellido());
    }
}
