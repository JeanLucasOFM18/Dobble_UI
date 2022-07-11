package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import model.*;

/**
 * Clase de la interfaz gráfica, que permite la interacción con el usuario
 * @version 11.0.2
 * @autor: Jean Lucas Rivera
 */
public class VentanaMenu_20885272_RiveraRodriguez extends JFrame implements ActionListener{

    private Dobble_20885272_RiveraRodriguez datosMazo;
    private DobbleGame_20885272_RiveraRodriguez datosJuego;
    private int habilitador = 0;
    private JPanel panelPrincipal;
    private JPanel panelDatosMazo;
    private JPanel panelDatosJuego;
    private JPanel panelJuego;
    private JButton botonAccion;
    private JButton botonAccion2;
    private JButton botonAccion3;
    private JButton botonAccion4;
    private JButton botonAccion6;
    private JButton botonAccion7;
    private JButton botonAccion8;
    private JButton botonAccion9;
    private JButton botonAccion10;
    private JButton botonAccion11;
    private JButton botonAccion12;
    private JButton botonAccion13;
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

    /**
     * Método que obtiene el objeto Dobble
     */
    public Dobble_20885272_RiveraRodriguez getDatosMazo() {
        return datosMazo;
    }

    /**
     * Método que modifica el objeto Dobble
     */
    public void setDatosMazo(Dobble_20885272_RiveraRodriguez datosMazo) {
        this.datosMazo = datosMazo;
    }

    /**
     * Método que obtiene el objeto DobbleGame
     */
    public DobbleGame_20885272_RiveraRodriguez getDatosJuego() {
        return datosJuego;
    }

    /**
     * Método que modifica el objeto Dobble
     */
    public void setDatosJuego(DobbleGame_20885272_RiveraRodriguez datosJuego) {
        this.datosJuego = datosJuego;
    }

    public VentanaMenu_20885272_RiveraRodriguez() {
        super("Menú Principal");
        setSize(300, 380);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        panelMenuPrincipal();
        panelOpcionMazo();
        panelOpcionJuego();
        panelJugar();
        add(panelPrincipal);
        add(panelDatosMazo);
        add(panelDatosJuego);
        add(panelJuego);
        panelDatosMazo.setVisible(false);
        panelDatosJuego.setVisible(false);
        panelJuego.setVisible(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.datosMazo = new Dobble_20885272_RiveraRodriguez();
        this.datosJuego = new DobbleGame_20885272_RiveraRodriguez();
    }

    /**
     * JPanel que representa al menu principal, el cual se agrega al Frame
     */
    private void panelMenuPrincipal(){

        panelPrincipal = new JPanel(null);
        panelPrincipal.setBounds(0, 0, 300, 380);
        panelPrincipal.setBackground(Color.YELLOW);

        JLabel labelTitulo1 = new JLabel("DOBBLE");
        labelTitulo1.setFont(new Font("impact",Font.BOLD,40));
        labelTitulo1.setBounds(20,0, 320, 80);
        labelTitulo1.setLocation(90,0);
        botonAccion = new JButton("CREAR JUEGO");
        botonAccion.setBounds(20,70,200,20);
        botonAccion.setLocation(50,70);
        botonAccion2 = new JButton("REGISTRAR JUGADOR");
        botonAccion2.setBounds(20,100,200,20);
        botonAccion2.setLocation(50,100);
        botonAccion3 = new JButton("DATOS DEL JUEGO");
        botonAccion3.setBounds(20,130,200,20);
        botonAccion3.setLocation(50,130);
        botonAccion4 = new JButton("JUGAR");
        botonAccion4.setBounds(20,160,200,20);
        botonAccion4.setLocation(50,160);
        botonAccion6 = new JButton("SALIR");
        botonAccion6.setBounds(20,190,200,20);
        botonAccion6.setLocation(50,190);

        panelPrincipal.add(labelTitulo1);
        panelPrincipal.add(botonAccion);
        panelPrincipal.add(botonAccion2);
        panelPrincipal.add(botonAccion3);
        panelPrincipal.add(botonAccion4);
        panelPrincipal.add(botonAccion6);

        botonAccion.addActionListener(this);
        botonAccion2.addActionListener(this);
        botonAccion3.addActionListener(this);
        botonAccion4.addActionListener(this);
        botonAccion6.addActionListener(this);
    }

    /**
     * JPanel que representa a los datos del Mazo, el cual se agrega al Frame
     */
    private void panelOpcionMazo(){

        panelDatosMazo = new JPanel(null);
        panelDatosMazo.setBounds(0, 0, 300, 380);
        panelDatosMazo.setBackground(Color.YELLOW);

        JLabel labelTitulo2 = new JLabel("DATOS MAZO");
        labelTitulo2.setFont(new Font("impact",Font.BOLD,40));
        labelTitulo2.setBounds(20,0, 320, 80);
        labelTitulo2.setLocation(50,0);
        botonAccion7 = new JButton("MOSTRAR MAZO");
        botonAccion7.setBounds(20,70,230,20);
        botonAccion7.setLocation(30,70);
        botonAccion8 = new JButton("VERIFICAR MAZO");
        botonAccion8.setBounds(20,100,230,20);
        botonAccion8.setLocation(30,100);
        botonAccion9 = new JButton("CANTIDAD DE CARTAS");
        botonAccion9.setBounds(20,130,230,20);
        botonAccion9.setLocation(30,130);
        botonAccion10 = new JButton("OBTENER CARTA");
        botonAccion10.setBounds(20,160,230,20);
        botonAccion10.setLocation(30,160);
        botonAccion11 = new JButton("CANT. NECESARIA CARTAS");
        botonAccion11.setBounds(20,190,230,20);
        botonAccion11.setLocation(30,190);
        botonAccion12 = new JButton("CANT. NECESARIA ELEMENTOS");
        botonAccion12.setBounds(20,220,230,20);
        botonAccion12.setLocation(30,220);
        botonAccion13 = new JButton("CARTAS FALTANTES");
        botonAccion13.setBounds(20,250,230,20);
        botonAccion13.setLocation(30,250);
        botonAccion14 = new JButton("MAZO A STRING");
        botonAccion14.setBounds(20,280,230,20);
        botonAccion14.setLocation(30,280);
        botonAccion15 = new JButton("VOLVER ATRAS");
        botonAccion15.setBounds(20,310,230,20);
        botonAccion15.setLocation(30,310);

        panelDatosMazo.add(labelTitulo2);
        panelDatosMazo.add(botonAccion7);
        panelDatosMazo.add(botonAccion8);
        panelDatosMazo.add(botonAccion9);
        panelDatosMazo.add(botonAccion10);
        panelDatosMazo.add(botonAccion11);
        panelDatosMazo.add(botonAccion12);
        panelDatosMazo.add(botonAccion13);
        panelDatosMazo.add(botonAccion14);
        panelDatosMazo.add(botonAccion15);

        botonAccion7.addActionListener(this);
        botonAccion8.addActionListener(this);
        botonAccion9.addActionListener(this);
        botonAccion10.addActionListener(this);
        botonAccion11.addActionListener(this);
        botonAccion12.addActionListener(this);
        botonAccion13.addActionListener(this);
        botonAccion14.addActionListener(this);
        botonAccion15.addActionListener(this);

    }

    /**
     * JPanel que representa a los datos del Juego, el cual se agrega al Frame
     */
    private void panelOpcionJuego(){

        panelDatosJuego = new JPanel(null);
        panelDatosJuego.setBounds(0, 0, 300, 380);
        panelDatosJuego.setBackground(Color.YELLOW);

        JLabel labelTitulo3 = new JLabel("DATOS JUEGO");
        labelTitulo3.setFont(new Font("impact",Font.BOLD,40));
        labelTitulo3.setBounds(20,0, 320, 80);
        labelTitulo3.setLocation(40,0);
        botonAccion16 = new JButton("LISTA DE JUGADORES");
        botonAccion16.setBounds(20,70,200,20);
        botonAccion16.setLocation(50,70);
        botonAccion17 = new JButton("ORDEN DE LOS TURNOS");
        botonAccion17.setBounds(20,100,200,20);
        botonAccion17.setLocation(50,100);
        botonAccion18 = new JButton("VOLVER ATRAS");
        botonAccion18.setBounds(20,130,200,20);
        botonAccion18.setLocation(50,130);

        panelDatosJuego.add(labelTitulo3);
        panelDatosJuego.add(botonAccion16);
        panelDatosJuego.add(botonAccion17);
        panelDatosJuego.add(botonAccion18);

        botonAccion16.addActionListener(this);
        botonAccion17.addActionListener(this);
        botonAccion18.addActionListener(this);
    }

    /**
     * JPanel que representa al Juego, el cual se agrega al Frame
     */
    private void panelJugar(){

        panelJuego = new JPanel(null);
        panelJuego.setBounds(0,0,220,280);
        panelJuego.setBackground(Color.YELLOW);

        JLabel labelTitulo4 = new JLabel("JUEGO");
        labelTitulo4.setFont(new Font("impact",Font.BOLD,40));
        labelTitulo4.setBounds(20,0, 320, 80);
        labelTitulo4.setLocation(100,0);
        botonAccion19 = new JButton("ESTADO DEL JUEGO");
        botonAccion19.setBounds(20,70,200,20);
        botonAccion19.setLocation(50,70);
        botonAccion20 = new JButton("CONSULTAR TURNO");
        botonAccion20.setBounds(20,100,200,20);
        botonAccion20.setLocation(50,100);
        botonAccion21 = new JButton("CONSULTAR PUNTAJE");
        botonAccion21.setBounds(20,130,200,20);
        botonAccion21.setLocation(50,130);
        botonAccion22 = new JButton("JUGAR");
        botonAccion22.setBounds(20,160,200,20);
        botonAccion22.setLocation(50,160);
        botonAccion23 = new JButton("JUEGO A STRING");
        botonAccion23.setBounds(20,190,200,20);
        botonAccion23.setLocation(50,190);
        botonAccion24 = new JButton("FINALIZAR JUEGO");
        botonAccion24.setBounds(20,220,200,20);
        botonAccion24.setLocation(50,220);

        panelJuego.add(labelTitulo4);
        panelJuego.add(botonAccion19);
        panelJuego.add(botonAccion20);
        panelJuego.add(botonAccion21);
        panelJuego.add(botonAccion22);
        panelJuego.add(botonAccion23);
        panelJuego.add(botonAccion24);

        botonAccion19.addActionListener(this);
        botonAccion20.addActionListener(this);
        botonAccion21.addActionListener(this);
        botonAccion22.addActionListener(this);
        botonAccion23.addActionListener(this);
        botonAccion24.addActionListener(this);

    }

    /**
     * Se determina las instrucciones a seguir dependiendo de la acción ejercida por el usuario
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getSource() == botonAccion) {
                if(habilitador == 0){
                    String elementos = JOptionPane.showInputDialog("Ingrese los elementos:");
                    getDatosMazo().generarLista(elementos);
                    int numC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos por carta:"));
                    getDatosMazo().setNumC(numC);
                    int maxC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cartas a generar"));
                    getDatosMazo().setMaxC(maxC);
                    if (datosMazo.comprobarDatos()){
                        String[] modosJuego = {"StackMode vs Amigos", "StackMode vs CPU"};
                        int eleccion = JOptionPane.showOptionDialog(this, "Elige el modo de juego", "SELECCIÓN MODO DE JUEGO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, modosJuego, modosJuego[0]);
                        if(eleccion == 0){
                            int modoDeJuego = 1;
                            int numP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de jugadores en la partida:"));
                            if (numP > 1){
                                getDatosJuego().setNumP(numP);
                                getDatosJuego().setGameMode(modoDeJuego);
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
                        else{
                            int modoDeJuego = 2;
                            getDatosJuego().setGameMode(modoDeJuego);
                            int numP = 1;
                            habilitador = 1;
                            getDatosJuego().setNumP(numP);
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador/a: ");
                            getDatosJuego().register(nombre);
                            getDatosMazo().generarMazo(1);
                            getDatosJuego().setMazo(getDatosMazo());
                            String message = "El juego se ha creado exitosamente";
                            JOptionPane.showMessageDialog(this, message);
                        }
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
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador/a");
                    if(getDatosJuego().register(nombre)){
                        message = "Se registro correctamente al usuario: " + nombre;
                        JOptionPane.showMessageDialog(this, message);
                    }
                    else {
                        message = "Ya existe un usuario con el nombre: " + nombre;
                        JOptionPane.showMessageDialog(this, message);
                    }
                }
            } else if (evento.getSource() == botonAccion3) {
                String message;
                if(habilitador == 0){
                    message = "Debe crear el juego para acceder a esta funcion";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    String[] opciones = {"Mazo", "Juego", "Volver atrás"};
                    int eleccion = JOptionPane.showOptionDialog(this, "Elige la opción que quiere ver", "ELECCIÓN DATOS", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                    if(eleccion == 0){
                        panelPrincipal.setVisible(false);
                        panelDatosMazo.setVisible(true);
                    }
                    else if(eleccion == 1){
                        panelPrincipal.setVisible(false);
                        panelDatosJuego.setVisible(true);
                    }
                    else{
                        panelPrincipal.setVisible(true);
                    }
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
                        String[] opciones = {"Si", "No"};
                        int eleccion = JOptionPane.showOptionDialog(this, "No posee las cartas necesarias \n Desea completar el mazo automáticamente", "JUEGO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                        if(eleccion == 0){
                            int maximo = getDatosMazo().calculo(getDatosMazo().getNumC());
                            getDatosMazo().setMaxC(maximo);
                            getDatosMazo().generarMazo(2);
                            getDatosJuego().setMazo(getDatosMazo());
                            message = "Se completó el mazo correctamente";
                            JOptionPane.showMessageDialog(this, message);
                        }
                        else{
                            message = "No se ha completado el mazo";
                            JOptionPane.showMessageDialog(this, message);
                        }
                    }
                    else {
                        message = "No ha registrado a la totalidad de jugadores para jugar";
                        JOptionPane.showMessageDialog(this, message);
                    }
                }
            } else if (evento.getSource() == botonAccion6) {
                dispose();
            } else if (evento.getSource() == botonAccion7) {
                String mazo = getDatosMazo().mostrarMazo();
                JOptionPane.showMessageDialog(this, mazo);
            } else if (evento.getSource() == botonAccion8){
                if(getDatosMazo().dobbleGame()){
                    String message = "El set de cartas es válido para jugar";
                    JOptionPane.showMessageDialog(this, message);
                }
                else {
                    String message = "El set de cartas no es válido para jugar";
                    JOptionPane.showMessageDialog(this, message);
                }
            } else if(evento.getSource() == botonAccion9){
                int cantCartas = getDatosMazo().numCards();
                String message = "El set contiene " + cantCartas + " cartas";
                JOptionPane.showMessageDialog(this, message);
            } else if (evento.getSource() == botonAccion10){
                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una posición:"));
                if(posicion > getDatosMazo().getMaxC() - 1 || posicion < 0){
                    String message = "No existe una carta en esta posición";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    String carta = getDatosMazo().nthCard(posicion);
                    JOptionPane.showMessageDialog(this, carta);
                }
            } else if(evento.getSource() == botonAccion11){
                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición de la carta de muestra:"));
                if(posicion > getDatosMazo().getMaxC() - 1 || posicion < 0){
                    String message = "No existe una carta en esta posición";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    int totalCartas = getDatosMazo().findTotalCards(posicion);
                    String message = "Se necesitan " + totalCartas + " cartas para tener un set válido";
                    JOptionPane.showMessageDialog(this, message);
                }
            } else if(evento.getSource() == botonAccion12){
                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición de la carta de muestra:"));
                if(posicion > getDatosMazo().getMaxC() - 1 || posicion < 0){
                    String message = "No existe una carta en esta posición";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    int totalElementos = getDatosMazo().requiredElements(posicion);
                    String message = "Se necesitan " + totalElementos + " elementos para tener un set válido";
                    JOptionPane.showMessageDialog(this, message);
                }
            } else if(evento.getSource() == botonAccion13){
                String cartasFaltantes = getDatosMazo().missingCards();
                JOptionPane.showMessageDialog(this, cartasFaltantes);
            } else if(evento.getSource() == botonAccion14){
                String cartas = getDatosMazo().cardsSetToString();
                JOptionPane.showMessageDialog(this, cartas);
            } else if(evento.getSource() == botonAccion15){
                panelDatosMazo.setVisible(false);
                panelPrincipal.setVisible(true);
            } else if(evento.getSource() == botonAccion16){
                if(getDatosJuego().getJugadores().size() == 0){
                    String message = "No hay jugadores registrados";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    String jugadores = getDatosJuego().listaJugadores();
                    JOptionPane.showMessageDialog(this, jugadores);
                }
            } else if(evento.getSource() == botonAccion17){
                if(getDatosJuego().getJugadores().size() == 0){
                    String message = "No hay jugadores registrados";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    String jugadores = getDatosJuego().turnos();
                    JOptionPane.showMessageDialog(this, jugadores);
                }
            } else if(evento.getSource() == botonAccion18){
                panelDatosJuego.setVisible(false);
                panelPrincipal.setVisible(true);
            } else if(evento.getSource() == botonAccion19){
                String message = "El estado del juego es: " + getDatosJuego().status();
                JOptionPane.showMessageDialog(this, message);
            } else if(evento.getSource() == botonAccion20){
                if(getDatosJuego().status().equals("Finalizado")){
                    String message = "Ya no se puede seguir jugando, favor terminar el juego";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    String message = getDatosJuego().whoseTurnIsIt();
                    JOptionPane.showMessageDialog(this, message);
                }
            } else if(evento.getSource() == botonAccion21){
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador/a:");
                String jugador = getDatosJuego().score(nombre);
                JOptionPane.showMessageDialog(this, jugador);
            } else if(evento.getSource() == botonAccion22){
                if(getDatosMazo().getMazo().size() < 2){
                    String message = "Ya no se puede seguir jugando, favor terminar el juego";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    if(getDatosJuego().getJugadores().get(getDatosJuego().getTurno()).getNombre().equals("CPU")){
                        String cartasVolteadas = getDatosJuego().voltearCartas();
                        List<String> modeCPU = getDatosJuego().vsCPUMode();
                        int juego = Integer.parseInt(modeCPU.get(0));
                        if(juego == 0){
                            JOptionPane.showMessageDialog(this, "Cartas Volteadas: \n" + cartasVolteadas + modeCPU.get(1));
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Cartas Volteadas: \n" + cartasVolteadas + modeCPU.get(1));
                        }
                        getDatosJuego().setEstado("En juego");
                    }
                    else{
                        String cartasVolteadas = getDatosJuego().voltearCartas();
                        String[] opciones = {"Pasar de Turno", "Señalar Coincidencia"};
                        int eleccion = JOptionPane.showOptionDialog(this, "Cartas Volteadas: \n" + cartasVolteadas, "JUEGO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                        if(eleccion == 0) {
                            getDatosJuego().passTurn();
                            getDatosJuego().devolverAlMazo();
                            String message = "Se pasó el turno con éxito";
                            JOptionPane.showMessageDialog(this, message);
                        }
                        else{
                            int i = 0;
                            while (i == 0) {
                                String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                                String coincidencia = JOptionPane.showInputDialog("Ingrese la coincidencia encontrada");
                                int juego = getDatosJuego().play(getDatosJuego().getGameMode(), coincidencia, nombre);
                                if (juego == 1) {
                                    String message = "Coincidencia correcta";
                                    JOptionPane.showMessageDialog(this, message);
                                    i = 1;
                                } else if (juego == 2) {
                                    String message = "Coincidencia incorrecta";
                                    JOptionPane.showMessageDialog(this, message);
                                    i = 1;
                                } else {
                                    String message = "No es el turno de este jugador";
                                    JOptionPane.showMessageDialog(this, message);
                                }
                            }
                            getDatosJuego().setEstado("En juego");
                        }
                    }
                }
            } else if(evento.getSource() == botonAccion23){
                if(getDatosJuego().getEstado().equals("Finalizado") || getDatosMazo().getMazo().size() < 2){
                    String message = "Ya no se puede seguir jugando, favor terminar el juego";
                    JOptionPane.showMessageDialog(this, message);
                }
                else{
                    String gameString = getDatosJuego().gameToString();
                    JOptionPane.showMessageDialog(this, gameString);
                }
            } else if(evento.getSource() == botonAccion24){
                String gameFinish = getDatosJuego().endGame();
                getDatosJuego().setEstado("Finalizado");
                JOptionPane.showMessageDialog(this, gameFinish);
                dispose();
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }

}
