package test.java.is.ru.fenrir.tictactoetest;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.is.ru.fenrir.tictactoe.Tictactoe;

public class Tictactoetest {

	@Before
	public void setUp() throws Exception {
		// maybe not needed
	}

	@After
	public void tearDown() throws Exception {
		// maybe not needed
	}

	@Test
	public void testMain() {
		Tictactoe tictactoe = new Tictactoe();
		assertNotNull(tictactoe);
	}

//	@Test
//	public void testSetToken() {
//		//fail("Not yet implemented");
//		assertEquals(true, Tictactoe.setToken());
//	}
}
