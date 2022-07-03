package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dobblegame.*;

public class VentanaMenuPrincipal extends JFrame implements ActionListener{

    private Dobble_20885272_RiveraRodriguez datosMazo;
    private DobbleGame_20885272_RiveraRodriguez datosJuego;
    private JPanel panelPrincipal;
    private JPanel panelCrearJuego;
    private JButton botonAccion;
    private JButton botonAccion2;
    private JButton botonAccion3;
    private JButton botonAccion4;
    private JButton botonAccion5;
    private JButton botonAccion6;
    private JButton botonAccion7;
    private JLabel labelQuestion;
    private JLabel labelQuestion1;
    private JLabel labelQuestion2;
    private JLabel labelQuestion3;
    private JTextField fieldCantElements;
    private JTextField fieldNumC;
    private JTextField fieldMaxC;
    private JTextField fieldElements;
    private JComboBox boxModoJuego;
    private JLabel labelQuestion4;

    public Dobble_20885272_RiveraRodriguez getDatosMazo() {
        return datosMazo;
    }

    public void setDatosMazo(Dobble_20885272_RiveraRodriguez datosMazo) {
        this.datosMazo = datosMazo;
    }

    public DobbleGame_20885272_RiveraRodriguez getDatosJuego() {
        return datosJuego;
    }

    public void setDatosJuego(DobbleGame_20885272_RiveraRodriguez datosJuego) {
        this.datosJuego = datosJuego;
    }

    public VentanaMenuPrincipal() {
        super("Menú Principal");
        setSize(220, 280);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        panelMenuPrincipal();
        panelOpcion1();
        add(panelPrincipal);
        add(panelCrearJuego);
        panelCrearJuego.setVisible(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.datosMazo = new Dobble_20885272_RiveraRodriguez();
        this.datosJuego = new DobbleGame_20885272_RiveraRodriguez();
    }

    private void panelMenuPrincipal(){

        panelPrincipal = new JPanel(new FlowLayout());
        panelPrincipal.setBounds(0, 0, 220, 280);
        panelPrincipal.setBackground(Color.YELLOW);

        botonAccion = new JButton("CREAR JUEGO");
        botonAccion2 = new JButton("REGISTRAR JUGADOR");
        botonAccion3 = new JButton("DATOS DEL JUEGO");
        botonAccion4 = new JButton("JUGAR");
        botonAccion5 = new JButton("PROBAR FUNCIÓN TOSTRING");
        botonAccion6 = new JButton("SALIR");

        panelPrincipal.add(botonAccion);
        panelPrincipal.add(botonAccion2);
        panelPrincipal.add(botonAccion3);
        panelPrincipal.add(botonAccion4);
        panelPrincipal.add(botonAccion5);
        panelPrincipal.add(botonAccion6);

        botonAccion.addActionListener(this);
        botonAccion2.addActionListener(this);
        botonAccion3.addActionListener(this);
        botonAccion4.addActionListener(this);
        botonAccion5.addActionListener(this);
        botonAccion6.addActionListener(this);
    }

    private void panelOpcion1(){

        panelCrearJuego = new JPanel(new FlowLayout());
        panelCrearJuego.setBounds(0, 0, 220, 280);
        panelCrearJuego.setBackground(Color.YELLOW);

        //labelQuestion = new JLabel("Ingrese cantidad de elementos que quiere agregar:");
        //fieldCantElements = new JTextField(5);
        labelQuestion1 = new JLabel("Ingrese cantidad de elementos por carta:");
        fieldNumC = new JTextField(5);
        labelQuestion2 = new JLabel("Ingrese cantidad de cartas que quiere generar:");
        fieldMaxC = new JTextField(5);
        botonAccion7 = new JButton("OK");
        labelQuestion3 = new JLabel("Ingrese los elementos:");
        fieldElements = new JTextField(10);
        labelQuestion4 = new JLabel("Escoja el modo de juego:");
        String[] modosJuego = {"StackMode vs Amigos", "StackMode vs CPU"};
        boxModoJuego = new JComboBox(modosJuego);
        //panelCrearJuego.add(labelQuestion);
        //panelCrearJuego.add(fieldCantElements);
        panelCrearJuego.add(labelQuestion3);
        panelCrearJuego.add(fieldElements);
        panelCrearJuego.add(labelQuestion1);
        panelCrearJuego.add(fieldNumC);
        panelCrearJuego.add(labelQuestion2);
        panelCrearJuego.add(fieldMaxC);
        panelCrearJuego.add(botonAccion7);
        panelCrearJuego.add(labelQuestion4);
        panelCrearJuego.add(boxModoJuego);

        botonAccion7.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getSource() == botonAccion) {
                panelPrincipal.setVisible(false);
                panelCrearJuego.setVisible(true);
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
            } else if (evento.getSource() == botonAccion7) {
                //int cantElementos = Integer.parseInt(fieldCantElements.getText());
                //getDatosMazo().setCantElementos(cantElementos);
                String elementos = fieldElements.getText();
                getDatosMazo().generarLista(elementos);
                int numC = Integer.parseInt(fieldNumC.getText());
                getDatosMazo().setNumC(numC);
                int maxC = Integer.parseInt(fieldMaxC.getText());
                getDatosMazo().setMaxC(maxC);
                if (datosMazo.comprobarDatos()){
                    String message = "Puede hacer el mazo";
                    //botonAccion7.setVisible(false);
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    String message = "No puede hacer el mazo";
                    JOptionPane.showMessageDialog(this, message);
                }
                //getDatosMazo().setCantElementos(cantElementos);
                //System.out.println(getDatosMazo().getCantElementos());
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }

}
