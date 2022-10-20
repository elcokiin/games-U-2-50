package view;

import java.util.Scanner;

public class View {
		private Scanner scanner = new Scanner(System.in);

		public void showMessage(String message) {
				System.out.println(message);
		}

		public String read(String message) {
				showMessage(message);
				return scanner.nextLine();
		}
		public int readInt(String message) {
				showMessage(message);
				return Integer.parseInt(scanner.nextLine());
		}
}
