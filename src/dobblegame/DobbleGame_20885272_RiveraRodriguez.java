package dobblegame;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que simula una mazo Dobble, que contiene una lista de cartas(List<Card>, una lista de elementos (List<String>),
 * la cantidad de elementos (Integer), número de elementos por carta (Integer) y el máximo de cartas a generar (Integer)
 * @version 11.0.2
 * @autor: Jean Lucas Rivera
 */
public class DobbleGame_20885272_RiveraRodriguez implements IDobbleGame_20885272_RiveraRodriguez {

    private Dobble_20885272_RiveraRodriguez mazo;
    private List<Player_20885272_RiveraRodriguez> jugadores;
    private int numP;
    private String estado;
    private int turno;
    private int gameMode;

    public DobbleGame_20885272_RiveraRodriguez() {
        this.jugadores = new ArrayList<>();
        this.numP = 0;
        this.estado = "No iniciado";
        this.turno = 0;
        this.mazo = new Dobble_20885272_RiveraRodriguez();
        this.gameMode = 0;
    }

    /**
     * Obtiene el modo de juego seleccionado por el usuario (Integer)
     * @return Integer Si se obtiene el modo de juego seleccionado
     */
    public int getGameMode() {
        return gameMode;
    }

    /**
     * Modifica el gameMode (Integer) por el modo de juego seleccionado por el usuario
     * @param gameMode (Integer). Corresponde a un modo de juego seleccionado por el usuario
     */
    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    /**
     * Obtiene el turno correspondiente al juego actual (Integer)
     * @return Integer Si se obtiene el turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Modifica el turno (Integer) por uno actualizado
     * @param turno (Integer). Corresponde al turno actualizado
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     * Obtiene el mazo del juego y sus datos correspondientes (Dobble)
     * @return Dobble Si se obtiene el mazo y sus datos
     */
    public Dobble_20885272_RiveraRodriguez getMazo() {
        return mazo;
    }

    /**
     * Modifica el mazo del juego y sus datos (Dobble) por uno actualizado
     * @param mazo (Dobble). Corresponde a un mazo actualizado según el transcurso del juego
     */
    public void setMazo(Dobble_20885272_RiveraRodriguez mazo) {
        this.mazo = mazo;
    }

    /**
     * Obtiene el estado del juego
     * @return String Si se obtiene el estado del juego
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Modifica el estado (String) por uno estado actualizado según la fase del juego
     * @param estado (String). Corresponde a un estado actualizado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene los jugadores (List<Player>)
     * @return List<Player> Si se obtiene los jugadores
     */
    public List<Player_20885272_RiveraRodriguez> getJugadores() {
        return jugadores;
    }

    /**
     * Modifica la lista de los jugadores (List<Player>) por una con datos actualizados
     * @param jugadores (List<Player>). Corresponde a una lista actualizada de jugadores
     */
    public void setJugadores(List<Player_20885272_RiveraRodriguez> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * Obtiene la cantidad de jugadores que serán parte del juego
     * @return Integer Si se obtiene la cantidad de jugadores
     */
    public int getNumP() {
        return numP;
    }

    /**
     * Modifica la cantidad de jugadores (Integer) por una actualizada
     * @param numP (Integer). Corresponde a una cantidad de jugadores nueva
     */
    public void setNumP(int numP) {
        this.numP = numP;
    }

    /**
     * Registra un nuevo jugador y lo agrega a la lista de jugadores existente
     */
    public boolean register(String nombre){

        int largo = getJugadores().size();

        if(getGameMode() == 2 && getNumP() == 1){
            Player_20885272_RiveraRodriguez jugador = new Player_20885272_RiveraRodriguez("CPU", 0);
            List<Player_20885272_RiveraRodriguez> listaJugadores = getJugadores();
            listaJugadores.add(jugador);
            setJugadores(listaJugadores);
            Player_20885272_RiveraRodriguez jugador2 = new Player_20885272_RiveraRodriguez(nombre, 0);
            List<Player_20885272_RiveraRodriguez> listaJugadores2 = getJugadores();
            listaJugadores2.add(jugador2);
            setJugadores(listaJugadores2);
            System.out.println("Registro exitoso");
            setNumP(2);
            return true;
        }
        else{
            int k = 0;
            if(largo < getNumP() && k == 0){
                int i = 0;
                int j = 0;
                while(i < largo){
                    String nombre2 = getJugadores().get(i).getNombre();
                    if(nombre.equals(nombre2)){
                        System.out.println("Ya existe un jugador con ese nombre");
                        i = largo;
                        j = 1;
                        return false;
                    }
                    else{
                        i = i + 1;
                    }
                }
                if(j == 0){
                    Player_20885272_RiveraRodriguez jugador = new Player_20885272_RiveraRodriguez(nombre, 0);
                    List<Player_20885272_RiveraRodriguez> listaJugadores = getJugadores();
                    listaJugadores.add(jugador);
                    setJugadores(listaJugadores);
                    System.out.println("Registro exitoso");
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Comprueba si se puede iniciar el juego con la cantidad de jugadores registrados y el mazo
     */
    public int comprobarDatos(){

        int largo = getJugadores().size();
        int numC = getMazo().getNumC();
        int cartasNecesarias = getMazo().calculo(numC);

        if(getMazo().getMaxC() == cartasNecesarias && getNumP() == largo){
            return 0;
        }
        else{
            if(getMazo().getMaxC() != cartasNecesarias){
                return 1;
            }
            else{
                return 2;
            }
        }
    }

    /**
     * Se muestra la lista de jugadores registrados
     */
    public String listaJugadores(int i){

        /*int i = 0;
        int j = 1;
        int largo = getJugadores().size();

        if(largo == 0){
            System.out.println("No hay jugadores registrados");
        }

        else{
            while(i < largo){
                System.out.println("Jugador " + j + ": " + getJugadores().get(i).getNombre());
                i = i + 1;
                j = j + 1;
            }
        }*/

        String nombre = getJugadores().get(i).getNombre();

        return nombre;
    }

    /**
     * Muestra el orden de los turnos del juego
     */
    public void turnos(){

        int largo = getJugadores().size();

        if(largo == 0){
            System.out.println("No hay jugadores registrados");
        }

        else{
            int i = 0;
            int j = 1;
            while(i < largo){
                System.out.println(j + ". " + getJugadores().get(i).getNombre());
                j = j + 1;
                i = i + 1;
            }
        }

    }

    /**
     * Muestra cuál es el estado actual del juego
     */
    public String status(){

        //System.out.println("El estado del juego es: " + getEstado());
        return getEstado();
    }

    /**
     * Muestra el puntaje de un jugador
     */
    public int score(String nombre){

        int i = 0;
        int largo = getJugadores().size();

        while(i < largo){
            if(getJugadores().get(i).getNombre().equals(nombre)){
                return i;
                //System.out.println("El puntaje de " + getJugadores().get(i).getNombre() + " es: " + getJugadores().get(i).getPuntaje());
            }
            else{
                i = i + 1;
            }
        }

        return largo;
        /*if(i == largo){
            return largo;
            System.out.println("Este jugador no existe en los registros");
        }*/

    }

    /**
     * Muestra a quien le corresponde el turno actual de jugar
     */
    public String whoseTurnIsIt() {

        int i = 0;
        int j = 0;
        int largo = getJugadores().size();
        while (i < largo) {
            if (i == getTurno()) {
                j = i;
                //System.out.println("El turno es de: " + getJugadores().get(i).getNombre());
                i = largo;
            }
            else {
                i = i + 1;
            }
        }

        return getJugadores().get(j).getNombre();
    }

    /**
     * Obtiene las 2 cartas que se encuentran en la cima de la pila de cartas y las muestra al usuario
     */
    public void voltearCartas(){

        int i = getMazo().getMazo().size() - 1;
        int j = i - 1;

        System.out.println("Carta 1: " + getMazo().getMazo().get(i).getCarta() + " | Carta 2: " + getMazo().getMazo().get(j).getCarta());

    }

    /**
     * Permite saltar el turno actual y pasar al siguiente
     */
    public void passTurn(){

        int turnoNuevo;

        if(getTurno() == getNumP() - 1){
            turnoNuevo = 0;
        }

        else{
            turnoNuevo = getTurno() + 1;
        }

        setTurno(turnoNuevo);

    }

    /**
     * Permite determinar si la igualdad indicada por el usuario es o no acertada
     * @return Integer Según se de alguna de las 3 opciones (Correcta, Incorrecta o Turno erróneo)
     */
    public int senalarIgualdad(){

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = in.nextLine();
        String nombreTurno = getJugadores().get(getTurno()).getNombre();
        int comparacion;

        if(nombre.equals(nombreTurno)){
            System.out.println("Ingrese la coincidencia encontrada: ");
            String coincidencia = in.nextLine();
            comparacion = validarCoincidencia(coincidencia);
            if(comparacion == 0){
                System.out.println("Coincidencia correcta");
                return 0;
            }
            else{
                System.out.println("Coincidencia incorrecta");
                return 1;
            }
        }
        else{
            System.out.println("No es el turno de " + nombre);
            return 2;
        }
    }

    /**
     * Comprueba si el elemento
     * @param coincidencia (String). Corresponde a la igualdad encontrada por el usuario
     * @return Integer Dependiendo de si la coincidencia es correcta o no
     */
    public int validarCoincidencia(String coincidencia){

        int k = getMazo().getMazo().size() - 1;
        int m = k - 1;


        int i = 0;
        int j = 0;
        String coincidenciaCorrecta = "";
        String elemento;
        String elemento2;
        while(i < getMazo().getNumC()){
            elemento = getMazo().getMazo().get(k).getCarta().get(i);
            while(j < getMazo().getNumC()){
                elemento2 = getMazo().getMazo().get(m).getCarta().get(j);
                if(elemento.equals(elemento2)){
                    coincidenciaCorrecta = elemento2;
                }
                j = j + 1;
            }
            j = 0;
            i = i + 1;
        }

        if(coincidencia.equals(coincidenciaCorrecta)){
            return 0;
        }
        else{
            return 1;
        }
    }

    /**
     * Permite sumar puntaje a un jugador en caso de que su coincidencia sea correcta
     */
    public void sumaPuntaje(){

        int i = 0;
        int largo = getJugadores().size();

        while(i < largo){
            if(i == getTurno()){
                int puntos = getJugadores().get(i).getPuntaje();
                puntos = puntos + 2;
                getJugadores().get(i).setPuntaje(puntos);
                i = largo;
            }
            else{
                i = i + 1;
            }
        }

    }

    /**
     * Permite eliminar un par de cartas en caso de que el jugador haya indicado una coincidencia correcta
     */
    public void eliminarCartas(){

        int i = getMazo().getMazo().size() - 1;
        int j = 0;

        while(j < 2){
            getMazo().getMazo().remove(i);
            i = i - 1;
            j = j + 1;
        }

    }

    /**
     * Permite devolver al inicio de un mazo un par de cartas en caso de que el jugador haya indicado una coincidencia incorrecta
     */
    public void devolverAlMazo(){

        int i = getMazo().getMazo().size() - 1;

        Card_20885272_RiveraRodriguez carta = getMazo().getMazo().get(i);
        Card_20885272_RiveraRodriguez carta2 = getMazo().getMazo().get(i-1);

        getMazo().getMazo().remove(i);
        getMazo().getMazo().remove(i-1);

        getMazo().getMazo().add(0, carta);
        getMazo().getMazo().add(1, carta2);

    }

    public void gameToString(){

        System.out.println("# ESTADO DEL JUEGO #");
        System.out.println(getEstado());

        int i = 0;
        int j = 1;
        int jugadores = getJugadores().size();
        System.out.println("# JUGADORES #");
        while(i < jugadores){
            System.out.println("Jugador " + j + ": " + getJugadores().get(i).getNombre() + " tiene " + getJugadores().get(i).getPuntaje() + " puntos");
            i = i + 1;
            j = j + 1;
        }

        System.out.println("# TURNO #");
        System.out.println("El turno es de: " + getJugadores().get(getTurno()).getNombre());

        System.out.println("# MESA DE JUEGO #");
        voltearCartas();

    }

    /**
     * Finaliza el juego y muestra al jugador/es el resultado final
     */
    public void endGame(){

        List<Integer> puntajes = new ArrayList<>();
        int largo = getJugadores().size();
        int i = 0;
        while(i < largo){
            puntajes.add(getJugadores().get(i).getPuntaje());
            i = i + 1;
        }

        int puntajeMax = Collections.max(puntajes);

        int contador = 0;
        int posicion = 0;
        i = 0;
        while(i < getNumP()){
            if(getJugadores().get(i).getPuntaje() == puntajeMax){
                contador = contador + 1;
                posicion = i;
            }
            i = i + 1;
        }

        if(contador != 1){
            System.out.println("La partida terminó en empate");
        }
        else{
            System.out.println("El ganador es: " + getJugadores().get(posicion).getNombre());
        }

        System.out.println("# POSICIONES FINALES #");

        i = 0;
        int j = 0;
        while(i < getNumP()){
            int k = i + 1;
            while(j < getNumP()){
                if(getJugadores().get(j).getPuntaje() == puntajeMax){
                    System.out.println(k + ". " + getJugadores().get(j).getNombre() + " con " + getJugadores().get(j).getPuntaje() + " puntos");
                    i = i + 1;
                }
                j = j + 1;
            }
            j = 0;
            puntajeMax = puntajeMax - 2;
        }
    }

    /**
     * Permite realizar la acción de jugar
     */
    public void play(int modo){

        int i = 0;
        if(modo == 1){
            voltearCartas();
            while(i == 0){
                int resultado = senalarIgualdad();
                if(resultado == 0){
                    System.out.println(getJugadores().get(getTurno()).getNombre() + " se lleva las 2 cartas volteadas");
                    sumaPuntaje();
                    passTurn();
                    eliminarCartas();
                    i = 1;
                }
                else if(resultado == 1){
                    passTurn();
                    devolverAlMazo();
                    System.out.println("Cartas devueltas al mazo");
                    i = 1;
                }
                else{
                    System.out.println("Vuelva a ingresar un nombre");
                }
            }
        }
        else{
            voltearCartas();
            while(i == 0){
                int resultado = vsCPUMode();
                if(resultado == 0){
                    System.out.println(getJugadores().get(getTurno()).getNombre() + " se lleva las 2 cartas volteadas");
                    sumaPuntaje();
                    passTurn();
                    eliminarCartas();
                    i = 1;
                }
                else if(resultado == 2){
                    System.out.println("Vuelva a ingresar un nombre");
                }
                else{
                    passTurn();
                    devolverAlMazo();
                    System.out.println("Cartas devueltas al mazo");
                    i = 1;
                }
            }

        }
    }

    /**
     * Permite ejecutar un juego vs la CPU
     * @return Integer Depende de si la coincidencia es correcta o no
     */
    public int vsCPUMode(){

        if(getTurno() == 0){
            Random aleatorio = new Random();
            int i = getMazo().getMazo().size() - 1;
            String coincidencia = getMazo().getMazo().get(i).getCarta().get(aleatorio.nextInt(getMazo().getNumC()));
            System.out.println("CPU señala que el elemento repetido es: " + coincidencia);
            int comparacion = validarCoincidencia(coincidencia);
            if(comparacion == 0){
                System.out.println("Coincidencia correcta");
                return 0;
            }
            else{
                System.out.println("Coincidencia incorrecta");
                return 1;
            }
        }
        else{
            return senalarIgualdad();
        }

    }

    /**
     * Transforma todo el contenido de un DobbleGame a String
     * @return String Si se convierte todo el contenido de un DobbleGame a String
     */
    @Override
    public String toString() {
        return "DobbleGame{\n" +
                "mazo=" + mazo +
                "\njugadores=" + jugadores +
                "\nnumP=" + numP +
                "\nestado='" + estado + '\'' +
                "\nturno=" + turno +
                "\ngameMode=" + gameMode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DobbleGame_20885272_RiveraRodriguez that = (DobbleGame_20885272_RiveraRodriguez) o;
        return getNumP() == that.getNumP() && getTurno() == that.getTurno() && getGameMode() == that.getGameMode() && getMazo().equals(that.getMazo()) && getJugadores().equals(that.getJugadores()) && getEstado().equals(that.getEstado());
    }

}