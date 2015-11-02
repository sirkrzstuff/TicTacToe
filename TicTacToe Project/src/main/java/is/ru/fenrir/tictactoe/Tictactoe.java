package main.java.is.ru.fenrir.tictactoe;

import java.awt.Color;

public class Tictactoe {
	
	private static boolean playing = true;
	private static int currentPlayer = 1;
	private static boolean gameWon = false;
	private static boolean tie = false;
	private static char winner = ' ';
	
	public static void main(String[] args) {
		
		Graphics graphics = new Graphics();
		
		while(playing)
		{
			checkGameStatus(graphics);
			
			if(gameWon)
			{
				playing = false;
				graphics.changeStatus(winner + " won the game");
				graphics.setGameOver(true);
			}
			if(tie)
			{
				playing = false;
				graphics.changeStatus("It's a tie");
				graphics.setGameOver(true);
			}
		}
	}

	
	private static void checkGameStatus(Graphics graphics) {
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
		if (winner == ' ' && graphics.boardFull()) {
			tie = true;
		}
	}


	private static void checkButtons(Graphics graphics, int a, int b, int c) {
		if (winner == ' ') {
			if ((getButton(graphics,a) == getButton(graphics,b)) &&
			    (getButton(graphics,b) == getButton(graphics,c))) {
					gameWon = true;
					changeRowColor(graphics, a, b, c, Color.RED);
					winner = getButton(graphics,a);
			}
		}
	}

	private static void changeRowColor(Graphics graphics, int a, int b, int c, Color color) {
		graphics.changeButtonFontColor(a, color);
		graphics.changeButtonFontColor(b, color);
		graphics.changeButtonFontColor(c, color);
	}
	
	private static char getButton(Graphics graphics, int nr) {
		return graphics.getButtonValue(nr);
	}

	public int getPlayer() {
		return currentPlayer; 
	}
}