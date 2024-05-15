package ui;

import javax.swing.*;

public class Boton extends JButton {

    public Boton(String text) {
        super(text);
    }

    public void confugurarAccion(PulsacionePerso pulsacionePerso){
        pulsacionePerso.pulsacion();
    }
}
