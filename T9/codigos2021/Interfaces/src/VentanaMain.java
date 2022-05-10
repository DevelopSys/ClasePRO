import javax.swing.*;
import java.awt.*;

public class VentanaMain extends JFrame {

    JLabel label;
    JList lista;
    DefaultListModel<Usuario> modeloLista;

    public VentanaMain(String nombre) {
        initGUI();
        instancias(nombre);
        rellenarLista();
        persoLayout();
        agregarComponentes();
    }

    private void rellenarLista() {
        for (int i = 0; i < 50; i++) {
            modeloLista.addElement(new Usuario("borja","asda"));
            modeloLista.addElement(new Usuario("dvsd","asda"));
            modeloLista.addElement(new Usuario("htr","asda"));
            modeloLista.addElement(new Usuario("wer","asda"));
        }

    }

    private void instancias(String nombre) {
        label = new JLabel(nombre);
        modeloLista = new DefaultListModel();
        lista = new JList(modeloLista);
    }

    private void persoLayout() {
        this.getContentPane().setLayout(new GridLayout(1,1));
    }

    private void agregarComponentes() {
        this.getContentPane().add(new JScrollPane(lista));
    }

    private void initGUI() {
        this.setVisible(true);
        this.setTitle("Ventana principal");
        this.setLocationRelativeTo(null);
        //this.setSize(new Dimension(300,300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setExtendedState(MAXIMIZED_BOTH);

    }
}
