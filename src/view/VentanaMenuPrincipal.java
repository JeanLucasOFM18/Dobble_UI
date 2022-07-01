package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenuPrincipal extends JFrame implements ActionListener{

    private JButton botonAccion;
    private JButton botonAccion2;
    private JButton botonAccion3;
    private JButton botonAccion4;
    private JButton botonAccion5;
    private JButton botonAccion6;

    public VentanaMenuPrincipal() {
        // Esto siempre va en todas las ventanas
        super("Menú Principal");
        setSize(220, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        botonAccion = new JButton("CREAR JUEGO");
        botonAccion2 = new JButton("REGISTRAR JUGADOR");
        botonAccion3 = new JButton("DATOS DEL JUEGO");
        botonAccion4 = new JButton("JUGAR");
        botonAccion5 = new JButton("PROBAR FUNCIÓN TOSTRING");
        botonAccion6 = new JButton("SALIR");

        // Los componentes se agregan a la ventana con add
        add(botonAccion);
        add(botonAccion2);
        add(botonAccion3);
        add(botonAccion4);
        add(botonAccion5);
        add(botonAccion6);

        botonAccion.setSize(200,300);

        // Layout: Organizacion de los componentes graficos
        setLayout(new FlowLayout());

        // ActionLister: escucha cambios en los componentes graficos
        botonAccion.addActionListener(this);
        botonAccion2.addActionListener(this);
        botonAccion3.addActionListener(this);
        botonAccion4.addActionListener(this);
        botonAccion5.addActionListener(this);
        botonAccion6.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getSource() == botonAccion) {
                new VentanaCrearJuego().setVisible(true);
            } else if (evento.getSource() == botonAccion2) {
                String message = "Hola, este es el registro";
                JOptionPane.showMessageDialog(this, message);
            } else if (evento.getSource() == botonAccion3) {
                String message = "Hola, estos son los datos del juego";
                JOptionPane.showMessageDialog(this, message);
            } else if (evento.getSource() == botonAccion4) {
                String message = "Hola, esto es para jugar";
                JOptionPane.showMessageDialog(this, message);
            } else if (evento.getSource() == botonAccion5) {
                String message = "Hola, esta es funcion tostring";
                JOptionPane.showMessageDialog(this, message);
            } else if (evento.getSource() == botonAccion6) {
                String message = "Hola, esto es para salir";
                JOptionPane.showMessageDialog(this, message);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }

}
