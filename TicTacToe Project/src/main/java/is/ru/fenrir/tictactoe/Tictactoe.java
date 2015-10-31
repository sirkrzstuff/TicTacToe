package main.java.is.ru.fenrir.tictactoe;

import javax.swing.JFrame;

public class Tictactoe {
	
	private static boolean playing = true;
	private static int currentPlayer = 1;
	private static boolean gameWon = false;
	private static boolean tie = false;
	private static char winner = ' ';
	
	//public Tictactoe() {
	//	Graphics graphics = new Graphics();
	//}
	
	public static void main(String[] args) {
		//JFrame graphics = new Graphics();
		//Tictactoe game = new Tictactoe();
		
		Graphics graphics = new Graphics();
		
		graphics.getButtonValue(1);
		
		while(playing)
		{
			checkGameStatus(graphics);
			
			
			//checkGameOver();
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

	
	// 012
	// 345
	// 678
	private static void checkGameStatus(Graphics graphics) {
		// Check rows for a winner
		if ((getButton(graphics,0) == getButton(graphics,1)) &&
		    (getButton(graphics,1) == getButton(graphics,2)))
				gameWon = true;
				winner = getButton(graphics,0);
		if ((getButton(graphics,3) == getButton(graphics,4)) &&
		    (getButton(graphics,4) == getButton(graphics,5)))
				gameWon = true;
				winner = getButton(graphics,3);
		if ((getButton(graphics,6) == getButton(graphics,7)) &&
		    (getButton(graphics,7) == getButton(graphics,8)))
				gameWon = true;
				winner = getButton(graphics,6);
			
		// Check columns for a winner
		if ((getButton(graphics,0) == getButton(graphics,3)) &&
			(getButton(graphics,3) == getButton(graphics,6)))
				gameWon = true;
				winner = getButton(graphics,0);
		if ((getButton(graphics,1) == getButton(graphics,4)) &&
			(getButton(graphics,4) == getButton(graphics,7)))
				gameWon = true;
				winner = getButton(graphics,1);
		if ((getButton(graphics,2) == getButton(graphics,5)) &&
			(getButton(graphics,5) == getButton(graphics,8)))
				gameWon = true;
				winner = getButton(graphics,2);
		
		// Check diagonal for a winner
		if ((getButton(graphics,0) == getButton(graphics,4)) &&
		(getButton(graphics,4) == getButton(graphics,8)))
			gameWon = true;
			winner = getButton(graphics, 0);
		if ((getButton(graphics,2) == getButton(graphics,4)) &&
		(getButton(graphics,4) == getButton(graphics,6)))
			gameWon = true;
			winner = getButton(graphics, 2);
	}
	
	private static char getButton(Graphics graphics, int nr) {
		return graphics.getButtonValue(nr);
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
