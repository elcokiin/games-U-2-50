package model.numberGame;

import model.Game;
/*
 * Clase que implementa la interfaz Game, es decir, que implementa los métodos start, play y finish.
 * Esta clase es la que se encarga de manejar el juego de los numeros.
 * *@author Diego Aguirre, Vicente Matallana, Samir Molinares
* version 1.0
 */
public class NumberGame implements Game {
    /*names Variable que almacena el nombre de los jugadores
     * number Variable que almacena los numeros ingresados por los jugadores
     * player Variable que intercala el turno de los jugadores 
     * */
    private String[] names;
    private int[] numbers;
    private int player = 0;
/*
 *  Metodo que empieza el juego pidiendo el nombre de los jugadores
 * @param names Arreglo que almacena el nombre de los jugadores
 * @return Regresa un mensaje de bienvenidae con el nombre de los jugadores
 */
    public String start(String[] names) {
        this.names = names;
        return "Bienvenido " + names[0] + " y " + names[1] + " a Number Game el juego para apostar con tus compas"; 
    }

    /*
     * Metodo que inicializa el juego como tal
     * En este metodo se invoca el metodo generateNumber y la computadora 
     */
    public String play() {
        int numRandom = generateNumRandom();
        if(numbers[0] == numRandom) {
            return "-1" + names[0] + " has ganado eres muy pro" + " el numero era " + numRandom;
        } else if(numbers[1] == numRandom) {
            return "-1" + names[1] + " has ganado eres muy pro" + " el numero era " + numRandom;
        } else {
            String message = "A " + names[player] + " le salió el valor de " + numRandom + " aún no has ganado";
            if(player == 0) {
                player = 1;
            } else {
                player = 0;
            }
            return message;
        }
    }

    /*
     * Metodo que finaliza el juego
     * @param message Mensaje que se muestra al finalizar el juego
     * @return Regresa un mensaje de despedida
     */
    public String finish(String message) {
        return message;
    }
/*
 * Metodo que inicializa el arreglo de numeros
 * @param numbers Arreglo que almacena los numeros ingresados por los jugadores
 */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

/*
 * Metodo que genera un numero aleatorio
 * @return Regresa un numero aleatorio
 */
    public int generateNumRandom() {
        int max = 10;
        int min = 1;
        int numRandom = (int) (Math.random() * ((max - min) + 1)) + min;
        return numRandom;
    }

}
