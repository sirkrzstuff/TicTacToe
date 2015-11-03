package main.java.is.ru.fenrir.tictactoe;

import java.awt.Color;

public class Tictactoe {
	
	private boolean playing;
	private int currentPlayer;
	private boolean gameWon;
	private boolean tie;
	private char winner;
	
	public Tictactoe() {
		playing = true;
		currentPlayer = 1;
		gameWon = false;
		tie = false;
		winner = ' ';
	}
	
	public static void main(String[] args) {
		
		TTTGraphics graphics = new TTTGraphics();
		Tictactoe ttt = new Tictactoe();
		
		while(ttt.playing)
		{
			ttt.checkGameStatus(graphics);
			
			if(ttt.gameWon)
			{
				ttt.playing = false;
				graphics.changeStatus(ttt.winner + " won the game");
				graphics.setGameOver(true);
			}
			if(ttt.tie)
			{
				ttt.playing = false;
				graphics.changeStatus("It's a tie");
				graphics.setGameOver(true);
			}
		}
	}

	
	public void checkGameStatus(TTTGraphics graphics) {
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
		if (this.winner == ' ' && graphics.boardFull()) {
			tie = true;
		}
	}


	public void checkButtons(TTTGraphics graphics, int a, int b, int c) {
	if (this.winner == ' ' && getButton(graphics,a) == getButton(graphics,b) && getButton(graphics,b) == getButton(graphics,c)) {
			gameWon = true;
			changeRowColor(graphics, a, b, c, Color.RED);
			this.winner = getButton(graphics,a);
		}
	}
	

	public void changeRowColor(TTTGraphics graphics, int a, int b, int c, Color color) {
		graphics.changeButtonFontColor(a, color);
		graphics.changeButtonFontColor(b, color);
		graphics.changeButtonFontColor(c, color);
	}
	
	public char getButton(TTTGraphics graphics, int nr) {
		return graphics.getButtonValue(nr);
	}

	public int getPlayer() {
		return currentPlayer; 
	}
	
	public boolean getGameWon() {
		return gameWon;
	}
	
	public boolean getTie() {
		return tie;
	}
}
