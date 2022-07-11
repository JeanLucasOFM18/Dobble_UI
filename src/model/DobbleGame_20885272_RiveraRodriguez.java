package model;

import java.util.Collections;
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
     * @return True si el registro fue exitoso, de lo contrario False
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
            setNumP(2);
            return true;
        }
        else{
            if(largo < getNumP()){
                int i = 0;
                while(i < largo){
                    String nombre2 = getJugadores().get(i).getNombre();
                    if(nombre.equals(nombre2)){
                        return false;
                    }
                    else{
                        i = i + 1;
                    }
                }
                Player_20885272_RiveraRodriguez jugador = new Player_20885272_RiveraRodriguez(nombre, 0);
                List<Player_20885272_RiveraRodriguez> listaJugadores = getJugadores();
                listaJugadores.add(jugador);
                setJugadores(listaJugadores);
                return true;
            }
        }

        return false;
    }

    /**
     * Comprueba si se puede iniciar el juego con la cantidad de jugadores registrados y el mazo
     * @return Integer que simboliza si se puede jugar con el mazo actual
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
     * @return String con los nombres de los jugadores
     */
    public String listaJugadores(){

        String jugadores = "Los jugadores registrados son: \n";
        int largo = getJugadores().size();
        int i = 0;
        while (i < largo){
            jugadores = jugadores + getJugadores().get(i).getNombre() + "\n";
            i = i + 1;
        }

        return jugadores;
    }

    /**
     * Muestra el orden de los turnos del juego
     * @return String con el orden de los turnos del juego
     */
    public String turnos(){

        String jugadores = "El orden de los turnos es: \n";
        int largo = getJugadores().size();
        int i = 0;
        int j = 1;

        while (i < largo){
            jugadores = jugadores + j + ". " + getJugadores().get(i).getNombre() + "\n";
            i = i + 1;
            j = j + 1;
        }

        return jugadores;

    }

    /**
     * Muestra cuál es el estado actual del juego
     * @return String con el estado del juego
     */
    public String status(){

        return getEstado();
    }

    /**
     * Muestra el puntaje de un jugador
     * @return String con el puntaje del jugador siempre y cuando exista
     */
    public String score(String nombre){

        int i = 0;
        int largo = getJugadores().size();
        String jugador = "El jugador no está en la lista de registros";

        while(i < largo){
            if(getJugadores().get(i).getNombre().equals(nombre)){
                jugador = "El puntaje de " + getJugadores().get(i).getNombre() + " es: " + getJugadores().get(i).getPuntaje();
                i = largo;
            }
            else{
                i = i + 1;
            }
        }

        return jugador;
    }

    /**
     * Muestra a quien le corresponde el turno actual de jugar
     * @return String con el nombre del jugador al cual le pertenece el turno
     */
    public String whoseTurnIsIt() {

        int i = 0;
        int j = 0;
        int largo = getJugadores().size();
        while (i < largo) {
            if (i == getTurno()) {
                j = i;
                i = largo;
            }
            else {
                i = i + 1;
            }
        }

        return "El turno actual es de: " + getJugadores().get(j).getNombre();
    }

    /**
     * Obtiene las 2 cartas que se encuentran en la cima de la pila de cartas y las muestra al usuario
     * @return con los datos de las 2 cartas volteadas
     */
    public String voltearCartas(){

        String cartasVolteadas = "Carta 1: ";
        int i = getMazo().getMazo().size() - 1;
        int j = i - 1;

        cartasVolteadas = cartasVolteadas + getMazo().getMazo().get(i).getCarta() + " | Carta 2: ";
        cartasVolteadas = cartasVolteadas + getMazo().getMazo().get(j).getCarta() + "\n";

        return cartasVolteadas;
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
     * @param coincidencia y nombre (Strings)
     * @return Integer Según se de alguna de las 3 opciones (Correcta, Incorrecta o Turno erróneo)
     */
    public int senalarIgualdad(String coincidencia, String nombre){

        String nombreTurno = getJugadores().get(getTurno()).getNombre();
        int comparacion;

        if(nombre.equals(nombreTurno)){
            comparacion = validarCoincidencia(coincidencia);
            if(comparacion == 0){
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
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

    /**
     * Permite obtener una representación en base string del juego
     * @return String con la representación del juego en base string
     */
    public String gameToString(){

        String gameString;

        gameString = "# MODO DE JUEGO # \nStackMode \n\n";

        gameString = gameString + "# ESTADO DEL JUEGO # \n";
        gameString = gameString + getEstado() + "\n \n";

        int i = 0;
        int j = 1;
        int jugadores = getJugadores().size();
        gameString = gameString + "# JUGADORES # \n";
        while(i < jugadores){
            String jugador = "Jugador " + j + ": " + getJugadores().get(i).getNombre() + " tiene " + getJugadores().get(i).getPuntaje() + " puntos \n";
            gameString = gameString + jugador;
            i = i + 1;
            j = j + 1;
        }

        gameString = gameString + "\n # TURNO # \n";
        gameString = gameString + "El turno es de: " + getJugadores().get(getTurno()).getNombre() + "\n \n";

        gameString = gameString + "# MESA DE JUEGO # \n";
        String cartasMesa = voltearCartas();
        gameString = gameString + cartasMesa + "\n \n";

        return gameString;
    }

    /**
     * Finaliza el juego y muestra al jugador/es el resultado final
     * @return String con los datos del juego finalizado (ganadores y puntajes)
     */
    public String endGame(){

        String gameFinish;
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
            gameFinish = "La partida terminó en empate \n \n";
        }
        else{
            gameFinish = "El ganador es: " + getJugadores().get(posicion).getNombre() + "\n \n";
        }

        gameFinish = gameFinish + "# POSICIONES FINALES # \n";

        i = 0;
        int j = 0;
        while(i < getNumP()){
            int k = i + 1;
            while(j < getNumP()){
                if(getJugadores().get(j).getPuntaje() == puntajeMax){
                    String informacion = k + ". " + getJugadores().get(j).getNombre() + " con " + getJugadores().get(j).getPuntaje() + " puntos \n";
                    gameFinish = gameFinish + informacion;
                    i = i + 1;
                }
                j = j + 1;
            }
            j = 0;
            puntajeMax = puntajeMax - 2;
        }

        return gameFinish;
    }

    /**
     * Permite realizar la acción de jugar
     * @param modo, coincidencia y nombre (Strings)
     * @return Integer que simboliza lo que ocurrió en el juego (coincidencia correcta, incorrecta, etc)
     */
    public int play(int modo, String coincidencia, String nombre){

        int resultado = senalarIgualdad(coincidencia, nombre);
        if(resultado == 0){
            sumaPuntaje();
            passTurn();
            eliminarCartas();
            return 1;
        }
        else if(resultado == 1){
            passTurn();
            devolverAlMazo();
            return 2;
        }
        else{
            return 3;
        }
    }

    /**
     * Permite ejecutar un juego vs la CPU
     * @return List<String> con los datos del movimiento ejecutado por la CPU
     */
    public List<String> vsCPUMode(){

        String informacion;
        String validacion;
        List<String> modeCPU = new ArrayList<>();
        Random aleatorio = new Random();
        int i = getMazo().getMazo().size() - 1;
        String coincidencia = getMazo().getMazo().get(i).getCarta().get(aleatorio.nextInt(getMazo().getNumC()));
        informacion = "CPU señala que el elemento repetido es: " + coincidencia + "\n";
        int comparacion = validarCoincidencia(coincidencia);
        if(comparacion == 0){
            informacion = informacion + "Coincidencia correcta \n";
            validacion = "0";
        }
        else{
            informacion = informacion + "Coincidencia incorrecta \n";
            validacion = "1";
        }

        modeCPU.add(validacion);
        modeCPU.add(informacion);

        i = 0;
        while(i == 0){
            int resultado = Integer.parseInt(modeCPU.get(0));
            if(resultado == 0){
                sumaPuntaje();
                passTurn();
                eliminarCartas();
                i = 1;
            }
            else{
                passTurn();
                devolverAlMazo();
                i = 1;
            }
        }

        return modeCPU;
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

    /**
     * Verifica si dos objetos son iguales
     * @return True si son iguales, de lo contrario false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DobbleGame_20885272_RiveraRodriguez that = (DobbleGame_20885272_RiveraRodriguez) o;
        return getNumP() == that.getNumP() && getTurno() == that.getTurno() && getGameMode() == that.getGameMode() && getMazo().equals(that.getMazo()) && getJugadores().equals(that.getJugadores()) && getEstado().equals(that.getEstado());
    }

}