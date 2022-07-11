package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Clase que simula una mazo Dobble, que contiene una lista de cartas(List<Card>, una lista de elementos (List<String>),
 * la cantidad de elementos (Integer), número de elementos por carta (Integer) y el máximo de cartas a generar (Integer)
 * @version 11.0.2
 * @autor: Jean Lucas Rivera
 */
public class Dobble_20885272_RiveraRodriguez implements IDobble_20885272_RiveraRodriguez {

    private List<Card_20885272_RiveraRodriguez> mazo;
    private List<String> lis_elementos;
    private int cantElementos;
    private int numC;
    private int maxC;

    public Dobble_20885272_RiveraRodriguez() {
        this.mazo = new ArrayList <>();
        this.lis_elementos = new ArrayList<>();
        this.cantElementos = 0;
        this.maxC = 0;
        this.numC = 0;
    }

    /**
     * Obtiene el mazo (List<Card>)
     * @return List<Card> Si se obtiene el mazo
     */
    public List<Card_20885272_RiveraRodriguez> getMazo() {
        return mazo;
    }

    /**
     * Modifica el mazo (List<Card>) por otro mazo
     * @param mazo (List<Card>). Corresponde a un nuevo mazo
     */
    public void setMazo(List<Card_20885272_RiveraRodriguez> mazo) {
        this.mazo = mazo;
    }

    /**
     * Obtiene los elementos para la construcción del mazo (List<String>)
     * @return List<String> Si se obtiene la lista de elementos
     */
    public List<String> getLis_elementos() {
        return lis_elementos;
    }

    /**
     * Modifica la lista de elementos (List<String>) por otra lista
     * @param lis_elementos (List<String>). Corresponde a una nueva lista de elementos
     */
    public void setLis_elementos(List<String> lis_elementos) {
        this.lis_elementos = lis_elementos;
    }

    /**
     * Obtiene la cantidad de elementos (Integer)
     * @return Integer Si se obtiene la cantidad de elementos
     */
    public int getCantElementos() {
        return cantElementos;
    }

    /**
     * Modifica la cantidad de elementos (Integer) por otra nueva cantidad
     * @param cantElementos (Integer). Corresponde a una nueva cantidad de elementos
     */
    public void setCantElementos(int cantElementos) {
        this.cantElementos = cantElementos;
    }

    /**
     * Obtiene la cantidad de elementos por carta (Integer)
     * @return Integer Si se obtiene la cantidad de elementos por carta
     */
    public int getNumC() {
        return numC;
    }

    /**
     * Modifica la cantidad de elementos por carta (Integer) por otra nueva cantidad de elementos por carta
     * @param numC (Integer). Corresponde a una nueva cantidad de elementos por carta
     */
    public void setNumC(int numC) {
        this.numC = numC;
    }

    /**
     * Obtiene la cantidad de cartas a generar (Integer)
     * @return Integer Si se obtiene la cantidad de cartas a generar
     */
    public int getMaxC() {
        return maxC;
    }

    /**
     * Modifica la cantidad de cartas a generar (Integer) por otra nueva cantidad de cartas a generar
     * @param maxC (Integer). Corresponde a una nueva cantidad de cartas a generar
     */
    public void setMaxC(int maxC) {
        this.maxC = maxC;
    }

    /**
     * Crea una lista de elementos con los datos ingresados por el usuario (List<String>)
     * @param elementos (String). Corresponde a una cadena de string dada por el usuario con los elementos
     */
    public void generarLista(String elementos){

        String[] elementosUsuario = elementos.split(",");
        int largoLista = elementosUsuario.length;
        List<String> lis_elementos = getLis_elementos();

        int i = 0;
        int j = 0;
        int aux = 0;
        while(i < largoLista){
            String elemento = elementosUsuario[i];
            int largo = getLis_elementos().size();
            while(j < largo){
                String elemento2 = getLis_elementos().get(j);
                if(elemento.equals(elemento2)){
                    aux = 1;
                    j = largo;
                }
                else{
                    j = j + 1;
                }
            }
            if(aux == 1){
                i = i + 1;
                j = 0;
                aux = 0;
            }
            else{
                lis_elementos.add(elemento);
                setLis_elementos(lis_elementos);
                i = i + 1;
                j = 0;
            }
        }

        Collections.shuffle(getLis_elementos());
    }

    /**
     * Comprueba si se cuenta con la cantidad necesaria de cartas para iniciar el juego
     * @return Boolean Dependiendo si se tiene la cantidad de cartas necesarias o no
     */
    public boolean comprobarDatos(){

        int resultado = calculo(getNumC());
        int largo = getLis_elementos().size();

        return resultado <= largo && resultado >= getMaxC();
    }

    /**
     * Señala la cantidad de elementos que hacen falta para crear el mazo que solicita el usuario
     * @return Integer que simboliza la cantidad de elementos faltantes
     */
    public int senalarError(){

        int resultado = calculo(getNumC());
        int largo = getLis_elementos().size();

        int faltantes = resultado - largo;

        if(resultado > largo){
            return faltantes;
        }

        return 0;

    }

    /**
     * Genera un mazo con los datos obtenidos
     * @param opcion (Integer). La opción depende de si el usuario esté recién creando el mazo o bien decidió que el
     * programa cree uno mazo completo
     */
    public void generarMazo (int opcion){

        if(opcion == 1){
            firstCard();
            int maxC = calculo(getNumC());
            int i = maxC - 1;
            while(i >= getMaxC()){
                getMazo().remove(i);
                i = i - 1;
            }
        }

        else{
            getMazo().removeAll(getMazo());
            firstCard();
        }

        int i = 0;
        int largo = getMazo().size();
        while(i < largo){
            Collections.shuffle(getMazo().get(i).getCarta());
            i = i + 1;
        }

    }

    /**
     * Agrega la primera carta (Card) al mazo (List<Card>)
     */
    public void firstCard(){
        int i = 0;
        String elemento;
        List<String> elementos = new ArrayList<>();
        while(i < getNumC()){
            elemento = getLis_elementos().get(i);
            elementos.add(elemento);
            i = i + 1;
        }
        Card_20885272_RiveraRodriguez carta = new Card_20885272_RiveraRodriguez(elementos);
        List<Card_20885272_RiveraRodriguez> mazoaux = getMazo();
        mazoaux.add(carta);
        setMazo(mazoaux);

        nextCards();
    }

    /**
     * Agrega las siguientes N cartas (Card) al mazo (List<Card>)
     */
    public void nextCards(){
        int j = 1;
        int k;
        int aux;
        String elemento;
        while(j < getNumC()){
            List<String> elementos = new ArrayList<>();
            elemento = getLis_elementos().get(0);
            elementos.add(elemento);
            k = 0;
            while(k < (getNumC()-1)){
                aux = ((getNumC() - 1) * j) + (k + 1);
                elemento = getLis_elementos().get(aux);
                elementos.add(elemento);
                k = k + 1;
            }
            Card_20885272_RiveraRodriguez carta = new Card_20885272_RiveraRodriguez(elementos);
            List<Card_20885272_RiveraRodriguez> mazoaux = getMazo();
            mazoaux.add(carta);
            setMazo(mazoaux);
            j = j + 1;
        }
        lastCards();
    }

    /**
     * Agrega las siguientes N*N cartas (Card) al mazo (List<Card>)
     */
    public void lastCards(){
        int i = 0;
        int j;
        int k;
        int aux2 = getNumC() - 1;
        String elemento;
        int aux;
        while(i < aux2){
            j = 0;
            while(j < aux2){
                List<String> elementos = new ArrayList<>();
                aux = i + 1;
                elemento = getLis_elementos().get(aux);
                elementos.add(elemento);
                k = 0;
                while(k < aux2){
                    aux = (aux2 + 1 + aux2 * k + ((i * k + j) % aux2));
                    elemento = getLis_elementos().get(aux);
                    elementos.add(elemento);
                    k = k + 1;
                }
                j = j + 1;
                Card_20885272_RiveraRodriguez carta = new Card_20885272_RiveraRodriguez(elementos);
                List<Card_20885272_RiveraRodriguez> mazoaux = getMazo();
                mazoaux.add(carta);
                setMazo(mazoaux);
            }
            i = i + 1;
        }

    }

    /**
     * Muestra el mazo generado
     * @return Un string con los datos del mazo para ser mostrado al usuario
     */
    public String mostrarMazo() {

        int i = 0;
        int largo = getMazo().size();
        String mazo = "El mazo es: \n";

        while (i < largo){
            mazo = mazo + getMazo().get(i).getCarta() + "\n";
            i = i + 1;
        }

        return mazo;
    }

    /**
     * Determina si el set de cartas generado es válido o no para jugar
     * @return True si el set es válido y False de no serlo
     */
    public boolean dobbleGame(){

        int i = 0;
        int largo = getMazo().size();
        int calculo = calculo(getNumC());
        int j = 1;
        int comparacion = 0;

        if(largo != calculo){
            return false;
        }
        else{
            while(i < largo) {
                List<String> carta1 = getMazo().get(i).getCarta();
                while (j < largo) {
                    List<String> carta2 = getMazo().get(j).getCarta();
                    comparacion = comparaCartas(carta1, carta2);
                    if(comparacion != 0){
                        i = largo + 1;
                        j = largo + 1;
                        comparacion = 1;
                    }
                    j = j + 1;
                }
                i = i + 1;
                j = i + 1;
            }

            return comparacion == 0;
        }
    }

    /**
     * Obtiene la cantidad de cartas que tiene el mazo generado
     * @return Integer que indica la cantidad de cartas que tiene el set
     */
    public int numCards(){

        return getMazo().size();
    }

    /**
     * Obtiene la carta ubicada en la posición que indica el usuario, siempre y cuando esta posición exista
     * @param posicion (Integer) con la ubicación de la carta
     * @return String. Que obtiene los datos de la carta en esa posición
     */
    public String nthCard(int posicion){

        return "La carta ubicada en la posicion " + posicion + " es: \n" + getMazo().get(posicion).getCarta().toString();

    }

    /**
     * Obtiene la cantidad necesaria de cartas que se debe tener para poder tener un set válido,
     * todo esto a partir de una carta de muestra
     * @param posicion (Integer) que simboliza la ubicación de la carta de muestra
     * @return Integer, con la cantidad de cartas que son necesarias para tener un set completo
     */
    public int findTotalCards(int posicion){

        if(posicion > getMaxC() - 1){
            return 0;
        }
        else{
            List<String> sublista = getMazo().get(posicion).getCarta();
            int largo = sublista.size();
            return calculo(largo);
        }
    }

    /**
     * Obtiene la cantidad necesaria de elementos que se debe tener para poder tener un set válido,
     * todo esto a partir de una carta de muestra
     * @param posicion (Integer) que simboliza la ubicación de la carta de muestra
     * @return Integer, con la cantidad de elementos que son necesarios para tener un set completo
     */
    public int requiredElements(int posicion){

        if(posicion > getMaxC() - 1){
            return 0;
        }
        else{
            List<String> sublista = getMazo().get(posicion).getCarta();
            int largo = sublista.size();
            return calculo(largo);
        }
    }

    /**
     * Obtiene las cartas (Card) que hacen falta para poder tener un set válido
     * @return String con los datos de las cartas faltantes para tener un set válido
     */
    public String missingCards(){

        String faltantes;
        int maxC = calculo(getNumC());
        if(getMazo().size() == maxC){
            faltantes = "El set de cartas esta completo";
        }
        else{
            faltantes = "Las cartas faltantes para generar un set completo son: \n";
            List<Card_20885272_RiveraRodriguez> setUsuario = getMazo();
            Dobble_20885272_RiveraRodriguez mazoEntero = new Dobble_20885272_RiveraRodriguez();
            mazoEntero.setMaxC(maxC);
            mazoEntero.setNumC(getNumC());
            mazoEntero.setLis_elementos(getLis_elementos());
            mazoEntero.generarMazo(1);

            int largo2 = getMazo().size();
            int largo = mazoEntero.getMazo().size();

            int i = 0;
            int j = 0;
            int comparacion = 0;
            while(i < largo){
                List<String> sublista = mazoEntero.getMazo().get(i).getCarta();
                while(j < largo2){
                    List<String> sublista2 = setUsuario.get(j).getCarta();
                    comparacion = comparaCartas(sublista, sublista2);
                    if(comparacion == 1){
                        j = largo2 + 1;
                    }
                    else{
                        j = j + 1;
                    }
                }
                if(comparacion == 0){
                    faltantes = faltantes + mazoEntero.getMazo().get(i).getCarta() + "\n";
                }
                j = 0;
                i = i + 1;
            }
        }

        return faltantes;
    }

    /**
     * Obtiene una representación en base string del set de cartas
     * @return String con la representación del set de cartas en base string
     */
    public String cardsSetToString(){

        String cartas = "El mazo es: \n";
        int i = 0;
        int k = 0;
        int j = 1;
        int largo = getMazo().size();
        while(i < largo){
            cartas = cartas + "Carta " + j + ": ";
            while(k < getNumC()){
                if(k != getNumC() - 1){
                    cartas = cartas + getMazo().get(i).getCarta().get(k) + ", ";
                }
                else {
                    cartas = cartas + getMazo().get(i).getCarta().get(k) + "\n";
                }
                k = k + 1;
            }
            i = i + 1;
            j = j + 1;
            k = 0;
        }

        return cartas;
    }

    /**
     * Compara los elementos de 2 cartas y verifica si solo existe una igualdad entre ellas
     * @param sublista (List<String>) Corresponde a la primera carta
     * @param sublista2 (List<String>). Corresponde a la segunda carta
     * @return Integer Dependiendo del caso que se cumpla
     */
    public int comparaCartas(List<String> sublista, List<String> sublista2){

        int i = 0;
        int j = 0;
        int comparacion = 0;
        int largo = sublista.size();
        String elemento;
        String elemento2;
        while(i < largo){
            elemento = sublista.get(i);
            while(j < largo){
                elemento2 = sublista2.get(j);
                if(elemento.equals(elemento2)){
                    comparacion = comparacion + 1;
                }
                j = j + 1;
            }
            j = 0;
            i = i + 1;
        }

        if(comparacion == 1){
            return 0;
        }
        else{
            return 1;
        }
    }

    /**
     * Determina cuantos elementos y cantidad de cartas se necesita para tener un set de cartas válido
     * @param numC (Integer) Corresponde a la cantidad de elementos por carta
     * @return Integer Si se obtiene la cantidad total de elementos y cantidad de cartas necesarias
     */
    public int calculo (int numC){

        return ((numC - 1) * (numC - 1)) + (numC - 1) + 1;
    }

    /**
     * Transforma todo el contenido de un Dobble a String
     * @return String Si se convierte todo el contenido de un Dobble a String
     */
    @Override
    public String toString() {

        return "Dobble{\n" +
                "mazo=" + mazo +
                "\nlis_elementos=" + lis_elementos +
                "\ncantElementos=" + cantElementos +
                "\nnumC=" + numC +
                "\nmaxC=" + maxC +
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
        Dobble_20885272_RiveraRodriguez dobble20885272RiveraRodriguez = (Dobble_20885272_RiveraRodriguez) o;
        return getCantElementos() == dobble20885272RiveraRodriguez.getCantElementos() && getNumC() == dobble20885272RiveraRodriguez.getNumC() && getMaxC() == dobble20885272RiveraRodriguez.getMaxC() && getMazo().equals(dobble20885272RiveraRodriguez.getMazo()) && getLis_elementos().equals(dobble20885272RiveraRodriguez.getLis_elementos());
    }

}