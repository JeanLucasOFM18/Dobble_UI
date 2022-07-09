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
    private JButton botonAccion28;
    private DefaultListModel lDefault;
    private JList lista;
    private JLabel labelQuestion8;
    private JButton botonAccion29;
    private JButton botonAccion30;
    private JButton botonAccion31;
    private JPanel panelJuego;
    private JButton botonAccion32;
    private JButton botonAccion33;
    private JButton botonAccion34;
    private JButton botonAccion35;
    private JButton botonAccion36;
    private JButton botonAccion37;
    private JButton botonAccion38;
    private JButton botonAccion39;
    private JButton botonAccion40;
    private JLabel labelQuestion9;
    private JTextField fieldName;
    private JLabel labelQuestion10;
    private JComboBox boxDecision;

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
        panelOpcion4();
        add(panelPrincipal);
        add(panelCrearJuego);
        add(panelRegistro);
        add(panelDatos);
        add(panelDatosMazo);
        add(panelDatosJuego);
        add(panelExtra);
        add(panelJuego);
        panelCrearJuego.setVisible(false);
        panelRegistro.setVisible(false);
        panelDatos.setVisible(false);
        panelDatosMazo.setVisible(false);
        panelDatosJuego.setVisible(false);
        panelExtra.setVisible(false);
        panelJuego.setVisible(false);
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

        botonAccion23.addActionListener(this);
        botonAccion24.addActionListener(this);
        botonAccion25.addActionListener(this);
    }

    private void panelUsoExtra(){

        panelExtra = new JPanel(new FlowLayout());
        panelExtra.setBounds(0,0,220,280);
        panelExtra.setBackground(Color.YELLOW);

        labelQuestion7 = new JLabel( "Ingrese la posicion de la carta de muestra");
        labelQuestion8 = new JLabel("Ingrese la posicion de la carta que quiere ver");
        labelQuestion9 = new JLabel("Ingrese el nombre del jugador");
        labelQuestion10 = new JLabel("Desea generar el mazo completo?");
        String[] opciones = {"Si", "No"};
        boxDecision = new JComboBox(opciones);
        fieldPosition = new JTextField(5);
        fieldName = new JTextField(10);
        botonAccion26 = new JButton("OK");
        botonAccion27 = new JButton("OK");
        botonAccion28 = new JButton("OK");
        botonAccion29 = new JButton("OK");
        botonAccion30 = new JButton("OK");
        botonAccion31 = new JButton("OK");
        botonAccion39 = new JButton("OK");
        botonAccion40 = new JButton("OK");
        lDefault = new DefaultListModel();
        lista = new JList();
        lista.setModel(lDefault);

        panelExtra.add(labelQuestion7);
        labelQuestion7.setVisible(false);
        panelExtra.add(labelQuestion8);
        labelQuestion8.setVisible(false);
        panelExtra.add(labelQuestion9);
        labelQuestion9.setVisible(false);
        panelExtra.add(labelQuestion10);
        labelQuestion10.setVisible(false);
        panelExtra.add(fieldPosition);
        fieldPosition.setVisible(false);
        panelExtra.add(fieldName);
        fieldName.setVisible(false);
        panelExtra.add(botonAccion26);
        botonAccion26.setVisible(false);
        panelExtra.add(botonAccion27);
        botonAccion27.setVisible(false);
        panelExtra.add(lista);
        lista.setVisible(false);
        panelExtra.add(botonAccion28);
        botonAccion28.setVisible(false);
        panelExtra.add(botonAccion29);
        botonAccion29.setVisible(false);
        panelExtra.add(botonAccion30);
        botonAccion30.setVisible(false);
        panelExtra.add(botonAccion31);
        botonAccion31.setVisible(false);
        panelExtra.add(botonAccion39);
        botonAccion39.setVisible(false);
        panelExtra.add(botonAccion40);
        botonAccion40.setVisible(false);
        panelExtra.add(boxDecision);
        boxDecision.setVisible(false);

        botonAccion26.addActionListener(this);
        botonAccion27.addActionListener(this);
        botonAccion28.addActionListener(this);
        botonAccion29.addActionListener(this);
        botonAccion30.addActionListener(this);
        botonAccion31.addActionListener(this);
        botonAccion39.addActionListener(this);
        botonAccion40.addActionListener(this);
    }

    private void panelOpcion4(){

        panelJuego = new JPanel(new FlowLayout());
        panelJuego.setBounds(0,0,220,280);
        panelJuego.setBackground(Color.YELLOW);

        botonAccion32 = new JButton("Estado del Juego");
        botonAccion33 = new JButton("Consultar turno");
        botonAccion34 = new JButton("Consultar puntaje");
        botonAccion35 = new JButton("Pasar de turno");
        botonAccion36 = new JButton("Jugar");
        botonAccion37 = new JButton("Juego a String");
        botonAccion38 = new JButton("Finalizar Juego");

        panelJuego.add(botonAccion32);
        panelJuego.add(botonAccion33);
        panelJuego.add(botonAccion34);
        panelJuego.add(botonAccion35);
        panelJuego.add(botonAccion36);
        panelJuego.add(botonAccion37);
        panelJuego.add(botonAccion38);

        botonAccion32.addActionListener(this);
        botonAccion33.addActionListener(this);
        botonAccion34.addActionListener(this);
        botonAccion35.addActionListener(this);
        botonAccion36.addActionListener(this);
        botonAccion37.addActionListener(this);
        botonAccion38.addActionListener(this);

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
                    JOptionPane.showMessageDialog(this, message);
                }
                else {
                    if(datosJuego.comprobarDatos() == 0){
                        panelPrincipal.setVisible(false);
                        panelJuego.setVisible(true);
                    }
                    else if(datosJuego.comprobarDatos() == 1){
                        panelPrincipal.setVisible(false);
                        panelExtra.setVisible(true);
                        labelQuestion10.setVisible(true);
                        boxDecision.setVisible(true);
                        botonAccion40.setVisible(true);
                        message = "No posee las cartas necesarias";
                        JOptionPane.showMessageDialog(this, message);
                    }
                    else {
                        message = "No ha registrado a la totalidad de jugadores para jugar";
                        JOptionPane.showMessageDialog(this, message);
                    }
                }
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
                        fieldMaxC.setText("");
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
                panelDatosMazo.setVisible(false);
                panelExtra.setVisible(true);
                int i = 0;
                int largo = getDatosMazo().getMazo().size();
                while(i < largo){
                    List<String> sublista = getDatosMazo().mostrarMazo(i);
                    lDefault.addElement(sublista);
                    i = i + 1;
                }
                lista.setVisible(true);
                botonAccion28.setVisible(true);
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
                panelDatosMazo.setVisible(false);
                panelExtra.setVisible(true);
                labelQuestion8.setVisible(true);
                fieldPosition.setVisible(true);
                botonAccion29.setVisible(true);
            } else if(evento.getSource() == botonAccion18){
                panelDatosMazo.setVisible(false);
                panelExtra.setVisible(true);
                labelQuestion7.setVisible(true);
                fieldPosition.setVisible(true);
                botonAccion26.setVisible(true);
            } else if(evento.getSource() == botonAccion19){
                panelDatosMazo.setVisible(false);
                panelExtra.setVisible(true);
                labelQuestion7.setVisible(true);
                fieldPosition.setVisible(true);
                botonAccion27.setVisible(true);
            } else if(evento.getSource() == botonAccion20){
                panelDatosMazo.setVisible(false);
                panelExtra.setVisible(true);
                List<List> cartasFaltantes = getDatosMazo().missingCards();
                int largo = cartasFaltantes.size();
                int i = 0;
                while (i < largo){
                    lDefault.addElement(cartasFaltantes.get(i));
                    i = i + 1;
                }
                lista.setVisible(true);
                botonAccion28.setVisible(true);
            } else if(evento.getSource() == botonAccion21){
                panelDatosMazo.setVisible(false);
                panelExtra.setVisible(true);
                int i = 0;
                int j = 1;
                int largo = getDatosMazo().getMazo().size();
                while(i < largo){
                    List<String> sublista = getDatosMazo().mostrarMazo(i);
                    lDefault.addElement("Carta " + j + ": " + sublista);
                    i = i + 1;
                    j = j + 1;
                }
                lista.setVisible(true);
                botonAccion28.setVisible(true);
            } else if(evento.getSource() == botonAccion22){
                panelDatosMazo.setVisible(false);
                panelDatos.setVisible(true);
            } else if(evento.getSource() == botonAccion23){
                if(getDatosJuego().getJugadores().size() == 0){
                    String message = "No hay jugadores registrados";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    panelDatosJuego.setVisible(false);
                    panelExtra.setVisible(true);
                    int i = 0;
                    int largo = getDatosJuego().getJugadores().size();
                    while(i < largo){
                        String nombre = getDatosJuego().listaJugadores(i);
                        lDefault.addElement(nombre);
                        i = i + 1;
                    }
                    lista.setVisible(true);
                    botonAccion31.setVisible(true);
                }
            } else if(evento.getSource() == botonAccion24){
                if(getDatosJuego().getJugadores().size() == 0){
                    String message = "No hay jugadores registrados";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    panelDatosJuego.setVisible(false);
                    panelExtra.setVisible(true);
                    int i = 0;
                    int j = 1;
                    int largo = getDatosJuego().getJugadores().size();
                    while(i < largo){
                        String nombre = j + ". " + getDatosJuego().listaJugadores(i);
                        lDefault.addElement(nombre);
                        i = i + 1;
                        j = j + 1;
                    }
                    lista.setVisible(true);
                    botonAccion31.setVisible(true);
                }
            } else if(evento.getSource() == botonAccion25){
                panelDatosJuego.setVisible(false);
                panelDatos.setVisible(true);
            } else if(evento.getSource() == botonAccion26){
                int posicion = Integer.parseInt(fieldPosition.getText());
                int totalCartas = getDatosMazo().findTotalCards(posicion);
                if(totalCartas != 0){
                    String message = "Se necesitan " + totalCartas + " cartas para tener un set válido";
                    JOptionPane.showMessageDialog(this, message);
                    fieldPosition.setText("");
                    botonAccion26.setVisible(false);
                    labelQuestion7.setVisible(false);
                    fieldPosition.setVisible(false);
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
                    labelQuestion7.setVisible(false);
                    fieldPosition.setVisible(false);
                    panelExtra.setVisible(false);
                    panelDatosMazo.setVisible(true);
                }
                else{
                    String message = "No existe una carta en esta posición";
                    JOptionPane.showMessageDialog(this, message);
                    fieldPosition.setText("");
                }
            } else if (evento.getSource() == botonAccion28){
                botonAccion28.setVisible(false);
                lista.setVisible(false);
                lDefault.removeAllElements();
                panelExtra.setVisible(false);
                panelDatosMazo.setVisible(true);
            } else if (evento.getSource() == botonAccion29){
                int posicion = Integer.parseInt(fieldPosition.getText());
                if(posicion > getDatosMazo().getMaxC() - 1){
                    fieldPosition.setText("");
                    String message = "No existe una carta en esta posición";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    labelQuestion8.setVisible(false);
                    fieldPosition.setText("");
                    fieldPosition.setVisible(false);
                    botonAccion29.setVisible(false);
                    List<String> sublista = getDatosMazo().nthCard(posicion);
                    lDefault.addElement(sublista);
                    lista.setVisible(true);
                    botonAccion30.setVisible(true);
                }
            } else if (evento.getSource() == botonAccion30){
                lista.setVisible(false);
                botonAccion30.setVisible(false);
                lDefault.removeAllElements();
                panelExtra.setVisible(false);
                panelDatosMazo.setVisible(true);
            } else if (evento.getSource() == botonAccion31){
                lista.setVisible(false);
                botonAccion31.setVisible(false);
                lDefault.removeAllElements();
                panelExtra.setVisible(false);
                panelDatosJuego.setVisible(true);
            } else if(evento.getSource() == botonAccion32){
                String message = getDatosJuego().status();
                JOptionPane.showMessageDialog(this, message);
            } else if(evento.getSource() == botonAccion33){
                if(getDatosJuego().status().equals("Finalizado")){
                    String message = "Ya no se puede seguir jugando, favor terminar el juego";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    String message = getDatosJuego().whoseTurnIsIt();
                    JOptionPane.showMessageDialog(this, message);
                }
            } else if(evento.getSource() == botonAccion34){
                panelDatosJuego.setVisible(false);
                panelExtra.setVisible(true);
                labelQuestion9.setVisible(true);
                fieldName.setVisible(true);
                botonAccion39.setVisible(true);
            } else if(evento.getSource() == botonAccion35){
                String message = "Turno saltado con éxito";
                JOptionPane.showMessageDialog(this, message);
            } else if(evento.getSource() == botonAccion36){

            } else if(evento.getSource() == botonAccion37){

            } else if(evento.getSource() == botonAccion38){

            } else if(evento.getSource() == botonAccion39){
                String nombre = fieldName.getText();
                int largo = getDatosJuego().getJugadores().size();
                int posicion = getDatosJuego().score(nombre);
                if(posicion != largo){
                    String message = "El puntaje de " + getDatosJuego().getJugadores().get(posicion).getNombre() + " es: " + getDatosJuego().getJugadores().get(posicion).getPuntaje();
                    JOptionPane.showMessageDialog(this, message);
                    botonAccion39.setVisible(false);
                    labelQuestion9.setVisible(false);
                    fieldName.setVisible(false);
                    panelExtra.setVisible(false);
                    panelDatosJuego.setVisible(true);
                }
                else{
                    String message = "Este usuario no está en la lista de registro";
                    JOptionPane.showMessageDialog(this, message);
                    fieldName.setText("");
                }
            } else if(evento.getSource() == botonAccion40){
                labelQuestion10.setVisible(false);
                boxDecision.setVisible(false);
                botonAccion40.setVisible(false);
                String eleccion = boxDecision.getSelectedItem().toString();
                int valido = getDatosMazo().calculo(getDatosMazo().getNumC());
                if(eleccion.equals("Si")){
                    getDatosMazo().setMaxC(valido);
                    getDatosMazo().generarMazo(2);
                    getDatosJuego().setMazo(getDatosMazo());
                    panelExtra.setVisible(false);
                    panelPrincipal.setVisible(true);
                }
                else {
                    panelExtra.setVisible(false);
                    panelPrincipal.setVisible(true);
                }
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }

}
