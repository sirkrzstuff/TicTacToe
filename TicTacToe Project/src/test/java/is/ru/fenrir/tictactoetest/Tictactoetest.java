package test.java.is.ru.fenrir.tictactoetest;

import static org.junit.Assert.*;

import java.awt.Color;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import main.java.is.ru.fenrir.tictactoe.TTTGraphics;
import main.java.is.ru.fenrir.tictactoe.Tictactoe;

public class Tictactoetest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testMain() {
		Tictactoe tictactoe = new Tictactoe();
		assertNotNull(tictactoe);
	}

	@Test
	public void testGetPlayer() {
		Tictactoe tictactoe = new Tictactoe();
		assertNotNull(tictactoe.getPlayer());
	}

	@Test
	public void testGetButton() {
		Tictactoe ttt = new Tictactoe();
		TTTGraphics graphics = new TTTGraphics();
		graphics.setButtonValue(0, "");
		assertEquals("0".toCharArray()[0], ttt.getButton(graphics, 0));
	}
	
	@Test
	public void testChangeRowColor() {
		Tictactoe ttt = new Tictactoe();
		TTTGraphics graphics = new TTTGraphics();
		graphics.getJButton(0).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(2).doClick();
		ttt.changeRowColor(graphics, 0, 1, 2, Color.GREEN);
		assertEquals(Color.GREEN, graphics.getButtons()[0].getForeground());
		assertEquals(Color.GREEN, graphics.getButtons()[1].getForeground());
		assertEquals(Color.GREEN, graphics.getButtons()[2].getForeground());
	}
	
	@Test
	public void testCheckButtonsNotWon() {
		Tictactoe ttt = new Tictactoe();
		TTTGraphics graphics = new TTTGraphics();
		graphics.getJButton(0).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(2).doClick();
		ttt.checkButtons(graphics, 0, 1, 2);
		assertFalse(ttt.getGameWon());
	}
	
	@Test
	public void testCheckButtonsGameWon() {
		Tictactoe ttt = new Tictactoe();
		TTTGraphics graphics = new TTTGraphics();
		graphics.getJButton(0).doClick();
		graphics.getJButton(3).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(4).doClick();
		graphics.getJButton(2).doClick();
		ttt.checkGameStatus(graphics);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(true, ttt.getGameWon());
	}
	
	@Test
	public void testCheckButtonsGameTie() {
		Tictactoe ttt = new Tictactoe();
		TTTGraphics graphics = new TTTGraphics();
		graphics.getJButton(0).doClick();
		graphics.getJButton(3).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(4).doClick();
		graphics.getJButton(5).doClick();
		graphics.getJButton(2).doClick();
		graphics.getJButton(6).doClick();
		graphics.getJButton(7).doClick();
		graphics.getJButton(8).doClick();
		ttt.checkGameStatus(graphics);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(true, ttt.getTie());
	}
	
	@Test
	public void testMainInstanceCreated() {
		Tictactoe ttt = new Tictactoe();
		assertNotNull(ttt);
	}	
}
