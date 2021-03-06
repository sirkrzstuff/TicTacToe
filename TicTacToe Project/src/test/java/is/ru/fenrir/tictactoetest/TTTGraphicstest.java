package test.java.is.ru.fenrir.tictactoetest;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.is.ru.fenrir.tictactoe.TTTGraphics;

public class TTTGraphicstest {

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
		TTTGraphics graphics = new TTTGraphics();
		assertNotNull(graphics);
	}
	
	@Test 
	public void testButtonClick() {
		TTTGraphics graphics = new TTTGraphics();
		graphics.getJButton(0).doClick();
		assertEquals("X".toCharArray()[0], graphics.getButtonValue(0));
	}
	
	@Test
	public void testGameOne() {
		TTTGraphics graphics = new TTTGraphics();
		// Setup
		graphics.getJButton(0).doClick();
		graphics.getJButton(1).doClick();
		graphics.getJButton(3).doClick();
		graphics.getJButton(2).doClick();
		graphics.getJButton(6).doClick();
		// Check
		boolean checkme = false;
		if (graphics.getButtonValue(0) == 'X' && graphics.getButtonValue(3) == 'X' && graphics.getButtonValue(6) == 'X')
			checkme = true;
		// Assert
		assertTrue(checkme);
	}
	
	@Test
	public void testGameboardFull() {
		TTTGraphics graphics = new TTTGraphics();
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
		TTTGraphics graphics = new TTTGraphics();
		// Setup
		graphics.getJButton(0).doClick();
		graphics.getJButton(3).doClick();
		graphics.getJButton(1).doClick();
		// Check
		assertFalse(graphics.boardFull());
	}
	
	@Test
	public void testSetButtonValue() {
		TTTGraphics graphics = new TTTGraphics();
		graphics.setButtonValue(0, "X");
		assertEquals("X", String.valueOf(graphics.getButtonValue(0)));
		
	}
	
	@Test
	public void testSetButtonFontColor() {
		TTTGraphics graphics = new TTTGraphics();
		graphics.changeButtonFontColor(0, Color.RED);
		assertEquals(Color.RED, graphics.getButtons()[0].getForeground());
	}
	
	@Test
	public void testGetButtonValueWithEmptyString() {
		TTTGraphics graphics = new TTTGraphics();
		graphics.setButtonValue(0, "");
		assertEquals("0".toCharArray()[0], graphics.getButtonValue(0));
	}
	
	@Test
	public void testChangeStatus() {
		TTTGraphics graphics = new TTTGraphics();
		graphics.changeStatus("TEST");
		assertEquals("TEST", graphics.getStatus());
	}
	
	@Test
	public void testSetGameOver() {
		TTTGraphics graphics = new TTTGraphics();
		graphics.setGameOver(true);
		assertEquals(true, graphics.getGameover());
	}
	
	@Test
	public void testGetCounter() {
		TTTGraphics graphics = new TTTGraphics();
		assertEquals(0, graphics.getCounter());
	}	
}
