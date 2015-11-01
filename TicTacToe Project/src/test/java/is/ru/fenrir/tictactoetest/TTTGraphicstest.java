package test.java.is.ru.fenrir.tictactoetest;

import static org.junit.Assert.*;

import javax.swing.JFrame;

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
		JFrame Graphics = new TTTGraphics();
		assertNotNull(Graphics);
	}
	
	@Test 
	public void testCounter() {
		TTTGraphics t = new TTTGraphics();
		t.setButtonValue(0, "X");
		t.setButtonValue(3, "O");
		t.setButtonValue(1, "X");
		t.setButtonValue(4, "O");
		t.setButtonValue(2, "X");
		assertEquals(5, t.getCounter());
	}

}
