package test.java.is.ru.fenrir.tictactoetest;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.is.ru.fenrir.tictactoe.Graphics;

public class Graphicstest {
	
	public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main("test.java.is.ru.stringcalculator.Graphicstest");
	}

	@Before
	public void setUp() throws Exception {
		// maybe not needed
	}

	@After
	public void tearDown() throws Exception {
		// maybe not needed
	}


	@Test
	public void testGraphics() {
		//fail("Not yet implemented");
		// Test constructor
		Graphics graphics = new Graphics();
		assertNotNull(graphics);
	}
	
	@Test 
	public void testButtonClick() {
		Graphics graphics = new Graphics();
		graphics.getJButton(0).doClick();
		assertEquals("X".toCharArray()[0], graphics.getButtonValue(0));
	}
	
	@Test
	public void testGameOne() {
		Graphics graphics = new Graphics();
		// Setup
		graphics.getJButton(0).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(3).doClick();
		graphics.getJButton(2).doClick();
		graphics.getJButton(6).doClick();
		// Check
		boolean checkme = false;
		if ((graphics.getButtonValue(0) == 'X') && (graphics.getButtonValue(3) == 'X') && (graphics.getButtonValue(6) == 'X'))
			checkme = true;
		// Assert
		assertTrue(checkme);
	}
	
	@Test
	public void testGameboardFull() {
		Graphics graphics = new Graphics();
		// Setup
		graphics.getJButton(0).doClick();
		graphics.getJButton(3).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(4).doClick();
		graphics.getJButton(5).doClick();
		graphics.getJButton(2).doClick();
		graphics.getJButton(6).doClick();
		graphics.getJButton(7).doClick();
		graphics.getJButton(8).doClick();
		// Check
		assertTrue(graphics.boardFull());
	}
	
	@Test
	public void testGameboardNotFull() {
		Graphics graphics = new Graphics();
		// Setup
		graphics.getJButton(0).doClick();
		graphics.getJButton(3).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(4).doClick();
		graphics.getJButton(5).doClick();
		graphics.getJButton(2).doClick();
		graphics.getJButton(6).doClick();
		graphics.getJButton(7).doClick();
		// Check
		assertFalse(graphics.boardFull());
	}
	
	/*@Test
	public void testCounter() {
		assertEquals(14, Graphics.getCounter());
	}*/
	
	@Test
	public void testSetGameOverAndGetGameover() {
		Graphics graphics = new Graphics();
		// Setup
		graphics.setGameOver(true);
		// Check
		assertTrue(graphics.getGameover());
	}
	
	@Test
	public void testGameNotOver() {
		Graphics graphics = new Graphics();
		// Setup
		graphics.getJButton(0).doClick();
		graphics.getJButton(3).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(4).doClick();
	
		// Check
		assertFalse(graphics.getGameover());
	}
	
	
	
}