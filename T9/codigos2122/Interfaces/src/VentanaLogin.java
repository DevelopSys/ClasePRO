import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

public class VentanaLogin extends JFrame {

    Connection connection;
    JLabel etiqueta;
    JButton boton;
    JTextField nombre;
    JPasswordField password;

    public VentanaLogin() {
        instancias();
        initGUI();
        persoLayout();
        agregarComponentes();
        acciones();
        this.pack();

    }

    private void acciones() {
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nombre.getText().length() > 0 && password.getText().length() > 0) {
                    /*String nombreTxt = nombre.getText();
                    String passTxt = password.getText();
                    Usuario usuario = new Usuario(nombreTxt, passTxt);
                    VentanaMain ventanaMain = new VentanaMain(nombreTxt);
                    setVisible(false);*/
                    //ResultSet resultSet = connection.createStatement().executeUpdate("")
                    //executeQuery("SELECT * FROM USUARIO WHERE NOMBRE=asdasd AND PASSWORD=asdasdasd")
                    /*if (resultSet.next()){
                        // haz login
                    }*/

                } else {
                    System.out.println("Por favor intro cosas");
                }
            }
        });
        //boton.setBackground(null);
    }

    private void instancias() {
        etiqueta = new JLabel("LOGIN DE USUARIOS");
        nombre = new JTextField(10);
        password = new JPasswordField(10);
        boton = new JButton("LOGIN");
    }

    private void agregarComponentes() {
        this.getContentPane().add(etiqueta);
        this.getContentPane().add(nombre);
        this.getContentPane().add(password);
        this.getContentPane().add(boton);
    }

    private void persoLayout() {
        //this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().setLayout(new GridLayout(4, 2, 1, 1));
    }

    private void initGUI() {
        this.setVisible(true);
        this.setTitle("Login usuario");
        this.setLocationRelativeTo(null);
        //this.setSize(new Dimension(300,300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setExtendedState(MAXIMIZED_BOTH);

    }
}
