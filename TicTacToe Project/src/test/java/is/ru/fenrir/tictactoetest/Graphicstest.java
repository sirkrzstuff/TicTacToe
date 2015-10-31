package test.java.is.ru.fenrir.tictactoetest;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.is.ru.fenrir.tictactoe.Graphics;

public class Graphicstest {

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
		JFrame Graphics = new Graphics();
		assertNotNull(Graphics);
	}

}
