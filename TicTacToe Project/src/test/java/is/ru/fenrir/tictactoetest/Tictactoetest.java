package test.java.is.ru.fenrir.tictactoetest;

import javax.swing.JFrame;

import junit.framework.TestCase;

public class Tictactoetest extends TestCase {
	
	public void testCreateJFrame() throws Exception {
		JFrame frame = new JFrame("TicTacToe");
		assertNotNull(frame);
	}
}
