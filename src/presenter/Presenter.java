package presenter;

import view.View;

import model.Game;
import model.givenGame.Given;
import model.numberGame.NumberGame;

/**
 * Clase Presenter, contenedora del metodo main desde el cual parte la ejecucion del programa
 *
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * @version 1.0 18/10/2022
 */

public class Presenter {
		private View view;

		public Presenter() {
			this.view = new View();
		}
  	/*
     * Unico metodo que se ejecuta en el main, el cual está encargado de la ejecucion correcta del programa
     */
		public void run() {
			// generate menu with two games to play
			int option = view.readInt("1. Number Game \n2. Given Game\n3. Exit\n Escoja un juego: ");
			switch (option) {
				case 1:
				    NumberGame game1= new NumberGame();
					int num1 = view.readInt("Ingrese el primer número juegador 1: ");
					int num2 = view.readInt("Ingrese el segundo número juegador 2: ");
					game1.setNumbers(new int[]{num1, num2});
					game(game1);
					break;
				case 2:
				    Given game2= new Given();
					game(game2);
					break;
					case 3:
					System.exit(0);
					break;
				default:
					view.showMessage("Opción no válida");
			}
		}

/*
 * Metodo que se encarga de la ejecucion de los juegos
 * @param game Variable que almacena el juego que se va a ejecutar
 */
		public void game(Game game) {
			String[] names = new String[2];
			names[0] = view.read("Ingrese el nombre del jugador 1: ");
			names[1] = view.read("Ingrese el nombre del jugador 2: ");
			view.showMessage(game.start(names));

			String message = "";
			do {
				view.showMessage(message);
				message = game.play();
			} while(message.charAt(0) != '-' && message.charAt(1) != '1');

			// string without the first two characters
			String nameWinPlayer = message.substring(2);
			view.showMessage(game.finish(nameWinPlayer));
		}
	/*
     * Punto de partida del programa
     * @param args
     */
		public static void main(String[] args) {
				new Presenter().run();
		}
}
