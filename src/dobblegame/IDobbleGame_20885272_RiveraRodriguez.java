package dobblegame;

import java.util.List;

/**
 * Interfaz de DobbleGame, las explicaciones de los métodos empleados se ubican en su implementación
 * @version 11.0.2
 * @autor: Jean Lucas Rivera
 */
public interface IDobbleGame_20885272_RiveraRodriguez {

    boolean register(String nombre);

    int comprobarDatos();

    String listaJugadores();

    String turnos();

    String status();

    String score(String nombre);

    String whoseTurnIsIt();

    String voltearCartas();

    void passTurn();

    int senalarIgualdad(String coincidencia, String nombre);

    int validarCoincidencia(String coincidencia);

    void sumaPuntaje();

    void eliminarCartas();

    void devolverAlMazo();

    String endGame();

    int play(int modo, String coincidencia, String nombre);

    List<String> vsCPUMode();

    String gameToString();

    String toString();

    boolean equals(Object o);

}
