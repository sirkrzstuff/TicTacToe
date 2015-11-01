package main.java.is.ru.fenrir.tictactoe;


public class Tictactoe {
	
	private static boolean playing = true;
	private static int currentPlayer = 1;
	private static boolean gameWon = false;
	private static boolean tie = false;
	private static char winner = ' ';
	
	public static void main(String[] args) {
		
		TTTGraphics graphics = new TTTGraphics();
		
		while(playing)
		{
			checkGameStatus(graphics);
			
			if(gameWon)
			{
				playing = false;
				graphics.changeStatus(winner + " won the game");
			}
			if(tie)
			{
				playing = false;
				graphics.changeStatus("It's a tie");
			}
		}
	}

	
	private static void checkGameStatus(TTTGraphics graphics) {
		// Check rows for a winner
		checkButtons(graphics, 0, 1, 2);
		checkButtons(graphics, 3, 4, 5);
		checkButtons(graphics, 6, 7, 8);
		
			
		// Check columns for a winner
		checkButtons(graphics, 0, 3, 6);
		checkButtons(graphics, 1, 4, 7);
		checkButtons(graphics, 2, 5, 8);
		
		
		// Check diagonal for a winner
		checkButtons(graphics, 0, 4, 8);
		checkButtons(graphics, 2, 4, 6);
		
		
		// Check for a tie
		if (graphics.boardFull() && !gameWon) {
			tie = true;
		}
	}


	private static void checkButtons(TTTGraphics graphics, int a, int b, int c) {
		if ((getButton(graphics,a) == getButton(graphics,b)) &&
		    (getButton(graphics,b) == getButton(graphics,c))) {
				gameWon = true;
				winner = getButton(graphics,a);
		}
	}
	
	private static char getButton(TTTGraphics graphics, int nr) {
		return graphics.getButtonValue(nr);
	}

	public int getPlayer() {
		return currentPlayer; 
	}
}
