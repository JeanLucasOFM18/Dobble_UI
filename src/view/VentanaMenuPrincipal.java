package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dobblegame.*;

public class VentanaMenuPrincipal extends JFrame implements ActionListener{

    private Dobble_20885272_RiveraRodriguez datosMazo;
    private DobbleGame_20885272_RiveraRodriguez datosJuego;
    int habilitador = 0;
    private JPanel panelPrincipal;
    private JPanel panelCrearJuego;
    private JButton botonAccion;
    private JButton botonAccion2;
    private JButton botonAccion3;
    private JButton botonAccion4;
    private JButton botonAccion5;
    private JButton botonAccion6;
    private JButton botonAccion7;
    private JButton botonAccion8;
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
    private JLabel labelQuestion5;
    private JButton botonAccion9;
    private JTextField fieldNumP;

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
        botonAccion8 = new JButton("OK");
        labelQuestion5 = new JLabel("Ingrese cantidad de jugadores en la partida:");
        fieldNumP = new JTextField(5);
        botonAccion9 = new JButton("OK");

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
        labelQuestion4.setVisible(false);
        panelCrearJuego.add(boxModoJuego);
        boxModoJuego.setVisible(false);
        panelCrearJuego.add(botonAccion8);
        botonAccion8.setVisible(false);
        panelCrearJuego.add(labelQuestion5);
        labelQuestion5.setVisible(false);
        panelCrearJuego.add(fieldNumP);
        fieldNumP.setVisible(false);
        panelCrearJuego.add(botonAccion9);
        botonAccion9.setVisible(false);

        botonAccion7.addActionListener(this);
        botonAccion8.addActionListener(this);
        botonAccion9.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getSource() == botonAccion) {
                if(habilitador == 0){
                    panelPrincipal.setVisible(false);
                    panelCrearJuego.setVisible(true);
                }
                else {
                    String message = "Ya se ha creado un juego";
                    JOptionPane.showMessageDialog(this, message);
                }
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
                    labelQuestion1.setVisible(false);
                    labelQuestion2.setVisible(false);
                    labelQuestion3.setVisible(false);
                    fieldElements.setVisible(false);
                    fieldMaxC.setVisible(false);
                    fieldNumC.setVisible(false);
                    botonAccion7.setVisible(false);
                    labelQuestion4.setVisible(true);
                    boxModoJuego.setVisible(true);
                    botonAccion8.setVisible(true);
                }
                else{
                    int error = getDatosMazo().senalarError();
                    String message;
                    if(error != 0){
                        message = "Para generar un mazo se debe agregar " + error + " elementos";
                    }
                    else{
                        message = "No se puede generar esa cantidad de cartas";
                    }
                    JOptionPane.showMessageDialog(this, message);
                    getDatosMazo().setNumC(0);
                    getDatosMazo().setMaxC(0);
                    getDatosMazo().getLis_elementos().removeAll(getDatosMazo().getLis_elementos());
                }
            } else if (evento.getSource() == botonAccion8){
                labelQuestion4.setVisible(false);
                boxModoJuego.setVisible(false);
                botonAccion8.setVisible(false);
                String eleccion = boxModoJuego.getSelectedItem().toString();
                int modoJuego;
                if(eleccion.equals("StackMode vs Amigos")){
                    labelQuestion5.setVisible(true);
                    fieldNumP.setVisible(true);
                    botonAccion9.setVisible(true);
                    modoJuego = 1;
                }
                else{
                    modoJuego = 2;
                }
                getDatosJuego().setGameMode(modoJuego);
            } else if(evento.getSource() == botonAccion9){
                if(getDatosJuego().getGameMode() == 1){
                    int numP = Integer.parseInt(fieldNumP.getText());
                    if(numP > 1){
                        getDatosJuego().setNumP(numP);
                        labelQuestion5.setVisible(false);
                        fieldNumP.setVisible(false);
                        botonAccion9.setVisible(false);
                        panelCrearJuego.setVisible(false);
                        panelPrincipal.setVisible(true);
                        habilitador = 1;
                        getDatosMazo().generarMazo(1);
                        getDatosJuego().setMazo(getDatosMazo());
                        String message = "El juego se ha creado exitosamente";
                        JOptionPane.showMessageDialog(this, message);
                    }
                    else{
                        String message = "No puede crearse un juego de " + numP + " persona en este modo";
                        JOptionPane.showMessageDialog(this, message);
                    }
                }
                if(getDatosJuego().getGameMode() == 2){
                    // SE REQUIRE PÁGINA DE REGISTER
                }
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }

}
