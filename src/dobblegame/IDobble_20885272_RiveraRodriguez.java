package dobblegame;

import java.util.List;

/**
 * Interfaz de Dobble, las explicaciones de los métodos empleados se ubican en su implementación
 * @version 11.0.2
 * @autor: Jean Lucas Rivera
 */
public interface IDobble_20885272_RiveraRodriguez {

    void generarLista(String elementos);

    boolean comprobarDatos();

    int senalarError();

    void generarMazo(int opcion);

    void firstCard();

    void nextCards();

    void lastCards();

    List<String> mostrarMazo(int i);

    boolean dobbleGame();

    int numCards();

    List<String> nthCard(int posicion);

    int findTotalCards(int posicion);

    void requiredElements();

    List<List> missingCards();

    int comparaCartas(List<String> sublista, List<String> sublista2);

    int calculo(int numC);

    String toString();

    boolean equals(Object o);

}
