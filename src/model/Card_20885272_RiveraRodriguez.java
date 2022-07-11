package model;

import java.util.List;
import java.util.Objects;

/**
 * Clase que simula una Card, que contiene una lista de elementos
 * @version 11.0.2
 * @autor: Jean Lucas Rivera
 */
public class Card_20885272_RiveraRodriguez implements ICard_20885272_RiveraRodriguez {

    private List<String> carta;

    public Card_20885272_RiveraRodriguez(List<String> elementos) {
        this.carta = elementos;
    }

    /**
     * Obtiene la carta (List<String>) con la cantidad de elementos indicado
     * @return List<String> Si se obtiene la carta
     */
    public List<String> getCarta() {
        return carta;
    }

    /**
     * Modifica la carta (List<String>) por otra
     * @param carta (List<String>). Corresponde a una nueva carta
     */
    public void setCarta(List<String> carta) {
        this.carta = carta;
    }

    /**
     * Transforma todo el contenido de una Card a String
     * @return String Si se convierte todo el contenido de una Card a String
     */
    @Override
    public String toString() {
        return "Card{" +
                "carta=" + carta +
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
        Card_20885272_RiveraRodriguez card20885272RiveraRodriguez = (Card_20885272_RiveraRodriguez) o;
        return Objects.equals(getCarta(), card20885272RiveraRodriguez.getCarta());
    }

}