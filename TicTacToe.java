		import java.util.Scanner;
		public class TicTacToe {

		public static void main(String[] args) {

			char[] board = createBoard();
         Scanner userInput = new Scanner(System.in);
         char userLetter = chooseUserLetter(userInput);
         char computerLetter = (userLetter == 'X') ? 'O' : 'X';
			displayBoard(board);
			}

			private static char[] createBoard() {
				char[] board = new char[10];
				for(int i = 0; i < board.length ; i++) {
					board[i] = ' ';
				}
				return board;
			}

			private static char chooseUserLetter(Scanner userInput) {
				System.out.print("Choose your Letter: ");
				return userInput.next().toUpperCase().charAt(0);
	 	}
			public static void displayBoard(char[] board) {
			System.out.println("\n" + board[1] + " | " + board[2] + " | " + board[3]);
			System.out.println("___________");
         System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
         System.out.println("___________");
         System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
         System.out.println("___________");

	}
}
