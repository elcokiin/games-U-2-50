package model.givenGame;

import model.Game;
/* Clase que implementa la interfaz Game, es decir, que implementa los métodos start, play y finish.
 * Esta clase es la que se encarga de manejar el juego de los dados.
 *  
*@author Diego Aguirre, Vicente Matallana, Samir Molinares
* version 1.0
**/
public class Given implements Game {
    /*Variable que almacena el nombre de los jugadores
     * */
    private String[] names;
/*
 * Metodo que empieza el juego pidiendo el nombre de los jugadores
 * @param names Nombre de los jugadores
 * @return Regresa el nombre de los jugadores
 */
    public String start(String[] names) {
        this.names = names;
        return "Bienvenido " + names[0] + " y " + names[1] + " a Given el juego super cool";
    }
/*
 * Metodo que inicializa el juego como tal
 * max Variable que define el valor maximo que se puede generar
 * min Varaible que define el valor minimo que se puede generar
 * dado1_1 Variable que almacena el valor del primer dado del jugador 1
 * dado1_2 Variable que almacena el valor del segundo dado del jugador 1
 * dado2_1 Variable que almacena el valor del primer dado del jugador 2
 * dado2_2 Variable que almacena el valor del segundo dado del jugador 2
 * @return Si los dados del primer jugador son igulaes restorna el nombre del jugador 1, 
 * Si los dados del segundo jugador son iguales retorna el nombre del jugador 2, de lo contrario
 * retorna los resultados obtenidos por cada jugador
 */
    public String play() {
        int max = 6;
        int min = 1;

        int dado1_1 = (int) (Math.random() * ((max - min) + 1)) + min;
        int dado1_2 = (int) (Math.random() * ((max - min) + 1)) + min;
        int dado2_1 = (int) (Math.random() * ((max - min) + 1)) + min;
        int dado2_2 = (int) (Math.random() * ((max - min) + 1)) + min;

        if (dado1_1 == dado1_2) {
            return "-1" + names[0] + " le salió el valor de " + dado1_1 + " en el primer dado y en el segundo dado " + dado1_2;
        } else if (dado2_1 == dado2_2) {
            return "-1" + names[1] + " le salió el valor de " + dado2_1 + " en el primer dado y en el segundo dado " + dado2_2;
        } else {
            return "A " + names[0] + " le salió el valor de " + dado1_1 + " en el primer dado y en el segundo dado " + dado1_2
                    + "\n" + "A " + names[1] + " le salió el valor de " + dado2_1 + " en el primer dado y en el segundo dado "
                    + dado2_2 + " ninguno gana aún";
        }
    }
/*
 * Metodo que termina el juego
 * @param message Nombre del ganador
 * @return Regresa un mensaje con el nombre del ganador
 */
    public String finish(String message) {
        return "El ganador es " + message + " felicitaciones";
    }
}
