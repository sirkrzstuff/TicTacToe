package main.java.is.ru.fenrir.tictactoe;

import javax.swing.JFrame;

public class Tictactoe {
	
	private static boolean playing = true;
	private static int currentPlayer = 1;
	private static boolean gameWon = false;
	private static boolean tie = false;
	
	public static void main(String[] args) {
		JFrame Graphics = new Graphics();
		

		while(playing)
		{
			if(gameWon)
			{
				playing = false;
			}
			if(tie)
			{
				playing = false;
			}
			
		}
	}
	
	public void changePlayer() {
		if (this.currentPlayer == 1)
			this.currentPlayer = 2;
		else
			this.currentPlayer = 1;
	}

	public static int getPlayer() {
		return currentPlayer; 
	}
}
