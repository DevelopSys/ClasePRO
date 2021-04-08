package anonimas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntradaGrafica {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        JButton boton = new JButton("Pulsar");

        ventana.setLayout(new FlowLayout());
        ventana.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pulsar");
            }
        });

        ventana.setVisible(true);
    }
}
