	public class TicTacToe {

		public static void main(String[] args) {

		char[] [] ticTacBoard = {{' ', '|', ' ', '|', ' '},
										 {' ', '|', ' ', '|', ' '},
										 {' ', '|', ' ', '|', ' '}};
		for(char[] row : ticTacBoard) {
			for(char ij : row) {
				System.out.print(ij);
			}
			System.out.println();
		}
	}
}
