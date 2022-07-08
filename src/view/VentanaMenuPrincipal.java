package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import dobblegame.*;

public class VentanaMenuPrincipal extends JFrame implements ActionListener{

    private Dobble_20885272_RiveraRodriguez datosMazo;
    private DobbleGame_20885272_RiveraRodriguez datosJuego;
    private int habilitador = 0;
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
    private JPanel panelRegistro;
    private JTextField fieldNameUser;
    private JLabel labelQuestion6;
    private JButton botonAccion10;
    private JPanel panelDatos;
    private JButton botonAccion11;
    private JButton botonAccion12;
    private JButton botonAccion13;
    private JPanel panelDatosMazo;
    private JPanel panelDatosJuego;
    private JButton botonAccion14;
    private JButton botonAccion15;
    private JButton botonAccion16;
    private JButton botonAccion17;
    private JButton botonAccion18;
    private JButton botonAccion19;
    private JButton botonAccion20;
    private JButton botonAccion21;
    private JButton botonAccion22;
    private JButton botonAccion23;
    private JButton botonAccion24;
    private JButton botonAccion25;
    private JPanel panelExtra;
    private JLabel labelQuestion7;
    private JTextField fieldPosition;
    private JButton botonAccion26;
    private JButton botonAccion27;


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
        panelOpcion2();
        panelOpcion3();
        panelOpcionMazo();
        panelOpcionJuego();
        panelUsoExtra();
        add(panelPrincipal);
        add(panelCrearJuego);
        add(panelRegistro);
        add(panelDatos);
        add(panelDatosMazo);
        add(panelDatosJuego);
        add(panelExtra);
        panelCrearJuego.setVisible(false);
        panelRegistro.setVisible(false);
        panelDatos.setVisible(false);
        panelDatosMazo.setVisible(false);
        panelDatosJuego.setVisible(false);
        panelExtra.setVisible(false);
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

    private void panelOpcion2(){

        panelRegistro = new JPanel(new FlowLayout());
        panelRegistro.setBounds(0, 0, 220, 280);
        panelRegistro.setBackground(Color.YELLOW);

        labelQuestion6 = new JLabel("Ingrese el nombre del jugador:");
        fieldNameUser = new JTextField(10);
        botonAccion10 = new JButton("AGREGAR");

        panelRegistro.add(labelQuestion6);
        panelRegistro.add(fieldNameUser);
        panelRegistro.add(botonAccion10);

        botonAccion10.addActionListener(this);

    }

    private void panelOpcion3(){

        panelDatos = new JPanel(new FlowLayout());
        panelDatos.setBounds(0, 0, 220, 280);
        panelDatos.setBackground(Color.YELLOW);

        botonAccion11 = new JButton("MAZO");
        botonAccion12 = new JButton("JUEGO");
        botonAccion13 = new JButton("VOLVER ATRAS");

        panelDatos.add(botonAccion11);
        panelDatos.add(botonAccion12);
        panelDatos.add(botonAccion13);

        botonAccion11.addActionListener(this);
        botonAccion12.addActionListener(this);
        botonAccion13.addActionListener(this);

    }

    private void panelOpcionMazo(){

        panelDatosMazo = new JPanel(new FlowLayout());
        panelDatosMazo.setBounds(0, 0, 220, 280);
        panelDatosMazo.setBackground(Color.YELLOW);

        botonAccion14 = new JButton("MOSTRAR MAZO");
        botonAccion15 = new JButton("VERIFICAR MAZO");
        botonAccion16 = new JButton("CANTIDAD DE CARTAS");
        botonAccion17 = new JButton("OBTENER CARTA");
        botonAccion18 = new JButton("CANT. NECESARIA CARTAS");
        botonAccion19 = new JButton("CANT. NECESARIA ELEMENTOS");
        botonAccion20 = new JButton("CARTAS FALTANTES");
        botonAccion21 = new JButton("MAZO A STRING");
        botonAccion22 = new JButton("VOLVER ATRAS");
        //listaMazo = new JList(contenidoListaMazo);

        panelDatosMazo.add(botonAccion14);
        panelDatosMazo.add(botonAccion15);
        panelDatosMazo.add(botonAccion16);
        panelDatosMazo.add(botonAccion17);
        panelDatosMazo.add(botonAccion18);
        panelDatosMazo.add(botonAccion19);
        panelDatosMazo.add(botonAccion20);
        panelDatosMazo.add(botonAccion21);
        panelDatosMazo.add(botonAccion22);

        botonAccion14.addActionListener(this);
        botonAccion15.addActionListener(this);
        botonAccion16.addActionListener(this);
        botonAccion17.addActionListener(this);
        botonAccion18.addActionListener(this);
        botonAccion19.addActionListener(this);
        botonAccion20.addActionListener(this);
        botonAccion21.addActionListener(this);
        botonAccion22.addActionListener(this);

    }

    private void panelOpcionJuego(){

        panelDatosJuego = new JPanel(new FlowLayout());
        panelDatosJuego.setBounds(0, 0, 220, 280);
        panelDatosJuego.setBackground(Color.YELLOW);

        botonAccion23 = new JButton("LISTA DE JUGADORES");
        botonAccion24 = new JButton("ORDEN DE LOS TURNOS");
        botonAccion25 = new JButton("VOLVER ATRAS");

        panelDatosJuego.add(botonAccion23);
        panelDatosJuego.add(botonAccion24);
        panelDatosJuego.add(botonAccion25);
    }

    private void panelUsoExtra(){

        panelExtra = new JPanel(new FlowLayout());
        panelExtra.setBounds(0,0,220,280);
        panelExtra.setBackground(Color.YELLOW);

        labelQuestion7 = new JLabel( "Ingrese la posicion de la carta de muestra");
        fieldPosition = new JTextField(5);
        botonAccion26 = new JButton("OK");
        botonAccion27 = new JButton("OK");

        panelExtra.add(labelQuestion7);
        panelExtra.add(fieldPosition);
        panelExtra.add(botonAccion26);
        botonAccion26.setVisible(false);
        panelExtra.add(botonAccion27);
        botonAccion27.setVisible(false);

        botonAccion26.addActionListener(this);
        botonAccion27.addActionListener(this);
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
                String message;
                if(habilitador == 0){
                    message = "Debe crear el juego para acceder a esta funcion";
                    JOptionPane.showMessageDialog(this, message);
                }
                else if(getDatosJuego().getNumP() == getDatosJuego().getJugadores().size()){
                    message = "Ya se ha registrado la cantidad máxima de jugadores";
                    JOptionPane.showMessageDialog(this, message);
                }
                else {
                    panelPrincipal.setVisible(false);
                    panelRegistro.setVisible(true);
                }
            } else if (evento.getSource() == botonAccion3) {
                String message;
                if(habilitador == 0){
                    message = "Debe crear el juego para acceder a esta funcion";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    panelPrincipal.setVisible(false);
                    panelDatos.setVisible(true);
                }
            } else if (evento.getSource() == botonAccion4) {
                String message;
                if(habilitador == 0){
                    message = "Debe crear el juego para acceder a esta funcion";
                }
                else {
                    message = "Hola, esto es para jugar";
                }
                JOptionPane.showMessageDialog(this, message);
            } else if (evento.getSource() == botonAccion5) {
                String message;
                if(habilitador == 0){
                    message = "Debe crear el juego para acceder a esta funcion";
                }
                else {
                    message = "Hola, esta es funcion tostring";
                }
                JOptionPane.showMessageDialog(this, message);
            } else if (evento.getSource() == botonAccion6) {
                dispose();
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
            } else if (evento.getSource() == botonAccion10){
                String nombre = fieldNameUser.getText();
                if(getDatosJuego().register(nombre)){
                    String message = "Se registro correctamente al usuario: " + nombre;
                    JOptionPane.showMessageDialog(this, message);
                    fieldNameUser.setText("");
                    panelRegistro.setVisible(false);
                    panelPrincipal.setVisible(true);
                }
                else {
                    String message = "Ya existe un usuario con el nombre: " + nombre;
                    fieldNameUser.setText("");
                    JOptionPane.showMessageDialog(this, message);
                }
            } else if(evento.getSource() == botonAccion11){
                panelDatos.setVisible(false);
                panelDatosMazo.setVisible(true);
            } else if(evento.getSource() == botonAccion12){
                panelDatos.setVisible(false);
                panelDatosJuego.setVisible(true);
            } else if(evento.getSource() == botonAccion13){
                panelDatos.setVisible(false);
                panelPrincipal.setVisible(true);
            } else if(evento.getSource() == botonAccion14){

            } else if(evento.getSource() == botonAccion15){
                if(getDatosMazo().dobbleGame()){
                    String message = "El set de cartas es válido para jugar";
                    JOptionPane.showMessageDialog(this, message);
                }
                else {
                    String message = "El set de cartas no es válido para jugar";
                    JOptionPane.showMessageDialog(this, message);
                }
            } else if(evento.getSource() == botonAccion16){
                int cantCartas = getDatosMazo().numCards();
                String message = "El set contiene " + cantCartas + " cartas";
                JOptionPane.showMessageDialog(this, message);
            } else if(evento.getSource() == botonAccion17){

            } else if(evento.getSource() == botonAccion18){
                panelDatosMazo.setVisible(false);
                panelExtra.setVisible(true);
                botonAccion26.setVisible(true);
            } else if(evento.getSource() == botonAccion19){
                panelDatosMazo.setVisible(false);
                panelExtra.setVisible(true);
                botonAccion27.setVisible(true);
            } else if(evento.getSource() == botonAccion20){

            } else if(evento.getSource() == botonAccion21){

            } else if(evento.getSource() == botonAccion22){
                panelDatosMazo.setVisible(false);
                panelDatos.setVisible(true);
            } else if(evento.getSource() == botonAccion23){

            } else if(evento.getSource() == botonAccion24){

            } else if(evento.getSource() == botonAccion25){

            } else if(evento.getSource() == botonAccion26){
                int posicion = Integer.parseInt(fieldPosition.getText());
                int totalCartas = getDatosMazo().findTotalCards(posicion);
                if(totalCartas != 0){
                    String message = "Se necesitan " + totalCartas + " cartas para tener un set válido";
                    JOptionPane.showMessageDialog(this, message);
                    fieldPosition.setText("");
                    botonAccion26.setVisible(false);
                    panelExtra.setVisible(false);
                    panelDatosMazo.setVisible(true);
                }
                else{
                    String message = "No existe una carta en esta posición";
                    JOptionPane.showMessageDialog(this, message);
                    fieldPosition.setText("");
                }
            } else if(evento.getSource() == botonAccion27){
                int posicion = Integer.parseInt(fieldPosition.getText());
                int totalElementos = getDatosMazo().findTotalCards(posicion);
                if(totalElementos != 0){
                    String message = "Se necesitan " + totalElementos + " elementos para formar un set válido";
                    JOptionPane.showMessageDialog(this, message);
                    fieldPosition.setText("");
                    botonAccion27.setVisible(false);
                    panelExtra.setVisible(false);
                    panelDatosMazo.setVisible(true);
                }
                else{
                    String message = "No existe una carta en esta posición";
                    JOptionPane.showMessageDialog(this, message);
                    fieldPosition.setText("");
                }
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }

}
