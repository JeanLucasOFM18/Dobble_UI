package model;

import java.util.Objects;

/**
 * Clase que simula un Player, que contiene un nombre (String) y su puntaje (Integer)
 * @version 11.0.2
 * @autor: Jean Lucas Rivera
 */
public class Player_20885272_RiveraRodriguez implements IPlayer_20885272_RiveraRodriguez {

    private String nombre;
    private Integer puntaje;

    public Player_20885272_RiveraRodriguez(String nombre, Integer puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    /**
     * Obtiene el nombre (String) único de un Player
     * @return String Si se obtiene el nombre único de un Player
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre (String) único de un Player
     * @param nombre (String). Corresponde al nombre único de un Player
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el puntaje (Integer) único de un Player
     * @return Integer Si se obtiene el puntaje único de un Player
     */
    public Integer getPuntaje() {
        return puntaje;
    }

    /**
     * Modifica el puntaje (Integer) único de un Player
     * @param puntaje (Integer). Corresponde al puntaje único de un Player
     */
    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * Transforma todo el contenido de un Player a String
     * @return String Si se convierte todo el contenido de un Player a String
     */
    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                ", puntaje=" + puntaje +
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
        Player_20885272_RiveraRodriguez player = (Player_20885272_RiveraRodriguez) o;
        return Objects.equals(getNombre(), player.getNombre()) && Objects.equals(getPuntaje(), player.getPuntaje());
    }
}