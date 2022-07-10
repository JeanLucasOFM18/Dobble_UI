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
    private JPanel panelDatosMazo;
    private JPanel panelDatosJuego;
    private JPanel panelJuego;
    private JButton botonAccion;
    private JButton botonAccion2;
    private JButton botonAccion3;
    private JButton botonAccion4;
    private JButton botonAccion5;
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
        setSize(240, 280);
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

    private void panelMenuPrincipal(){

        panelPrincipal = new JPanel(new FlowLayout());
        panelPrincipal.setBounds(0, 0, 230, 280);
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

    private void panelOpcionMazo(){

        panelDatosMazo = new JPanel(new FlowLayout());
        panelDatosMazo.setBounds(0, 0, 235, 280);
        panelDatosMazo.setBackground(Color.YELLOW);

        botonAccion7 = new JButton("MOSTRAR MAZO");
        botonAccion8 = new JButton("VERIFICAR MAZO");
        botonAccion9 = new JButton("CANTIDAD DE CARTAS");
        botonAccion10 = new JButton("OBTENER CARTA");
        botonAccion11 = new JButton("CANT. NECESARIA CARTAS");
        botonAccion12 = new JButton("CANT. NECESARIA ELEMENTOS");
        botonAccion13 = new JButton("CARTAS FALTANTES");
        botonAccion14 = new JButton("MAZO A STRING");
        botonAccion15 = new JButton("VOLVER ATRAS");

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

    private void panelOpcionJuego(){

        panelDatosJuego = new JPanel(new FlowLayout());
        panelDatosJuego.setBounds(0, 0, 220, 280);
        panelDatosJuego.setBackground(Color.YELLOW);

        botonAccion16 = new JButton("LISTA DE JUGADORES");
        botonAccion17 = new JButton("ORDEN DE LOS TURNOS");
        botonAccion18 = new JButton("VOLVER ATRAS");

        panelDatosJuego.add(botonAccion16);
        panelDatosJuego.add(botonAccion17);
        panelDatosJuego.add(botonAccion18);

        botonAccion16.addActionListener(this);
        botonAccion17.addActionListener(this);
        botonAccion18.addActionListener(this);
    }

    private void panelJugar(){

        panelJuego = new JPanel(new FlowLayout());
        panelJuego.setBounds(0,0,220,280);
        panelJuego.setBackground(Color.YELLOW);

        botonAccion19 = new JButton("Estado del Juego");
        botonAccion20 = new JButton("Consultar turno");
        botonAccion21 = new JButton("Consultar puntaje");
        botonAccion22 = new JButton("Jugar");
        botonAccion23 = new JButton("Juego a String");
        botonAccion24 = new JButton("Finalizar Juego");

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
                    String message = "Se necesitan " + totalElementos + " cartas para tener un set válido";
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
