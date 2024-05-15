package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JPanel panelCentral;
    private JButton botonPulsar, botonReset, botonSuma, botonResta, botonDiv, botonMulti, botonOperar;
    private JTextField textFieldNombre;
    private JTextField operadorUnoTexto, operadorDosTexto;
    private Boton boton;
    private String operacion;
    public VentanaPrincipal() {
        setTitle("Ventana principal de mi app");
        setLocationRelativeTo(null);
        setSize(400,400);

        instancias();
        initGUI();
        acciones();

        setVisible(true);
    }

    public void acciones() {

        /*botonPulsar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perfecto XXX, has capturado un texto de un texfield
                // System.out.println("Boton pulsado correctamente");

                if (textFieldNombre.getText().length()>0){
                    System.out.printf("Perfecto %s has capturado un texto de un texfield %n",
                            textFieldNombre.getText());
                }
            }
        });

        botonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldNombre.setText("");
            }
        });*/
        // botonPulsar.addActionListener(this);
        // botonReset.addActionListener(this);
        botonSuma.addActionListener(this);
        botonResta.addActionListener(this);
        botonMulti.addActionListener(this);
        botonDiv.addActionListener(this);
        botonOperar.addActionListener(this);

    }
    public void instancias(){
        panelCentral = new JPanel();
        //panelCentral.setLayout(new GridLayout(0,2));
        //panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.X_AXIS));
        botonPulsar = new JButton("Pulsar");
        botonReset = new JButton("Resetear");
        textFieldNombre = new JTextField(20);
        operadorUnoTexto = new JTextField(3);
        operadorDosTexto = new JTextField(3);
        botonSuma = new JButton("+");
        botonDiv = new JButton("/");
        botonMulti = new JButton("*");
        botonResta = new JButton("-");
        botonOperar = new JButton("Operar");
    }
    public void initGUI(){
        setContentPane(panelCentral);
        // panelCentral.add(botonPulsar);
        // panelCentral.add(botonReset);
        // panelCentral.add(textFieldNombre);
        // panelCentral.add(botonReset);
        panelCentral.add(operadorUnoTexto);
        panelCentral.add(operadorDosTexto);
        panelCentral.add(botonSuma);
        panelCentral.add(botonResta);
        panelCentral.add(botonDiv);
        panelCentral.add(botonMulti);
        panelCentral.add(botonOperar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Este metodo se lo pongo a los dos botones
        // decidir que boton es el pulsado
        /*if (e.getSource() == botonPulsar){
            if (textFieldNombre.getText().length()>0){
                System.out.printf("Perfecto %s has capturado un texto de un texfield %n",
                        textFieldNombre.getText());
            }
        } else if (e.getSource() == botonReset){
            textFieldNombre.setText("");
        }*/
        if (e.getSource() == botonOperar){

            // capturo los dos textos
            try{
                int numeroUno = Integer.parseInt(operadorUnoTexto.getText());
                int numeroDos = Integer.parseInt(operadorDosTexto.getText());
                double resultado = 0;

                switch (operacion){
                    case "+":
                        resultado = numeroUno+numeroDos;
                        break;
                    case "-":
                        resultado = numeroUno-numeroDos;
                        break;
                    case "*":
                        resultado = numeroUno*numeroDos;
                        break;
                    case "/":
                        resultado = (double) numeroUno/numeroDos;
                        break;

                }

                System.out.printf("El resultado de la %s entre %d y %d es %.1f %n",
                        operacion, numeroUno, numeroDos, resultado);
            } catch (NumberFormatException ex){
                System.out.println("Datos incorretos");
            }


        } else {
            operacion = ((JButton)(e.getSource())).getLabel();
        }
    }
}
