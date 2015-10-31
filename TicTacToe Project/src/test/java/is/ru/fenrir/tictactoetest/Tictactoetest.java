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
		Tictactoe tictactoe = new Tictactoe();
	}

	@After
	public void tearDown() throws Exception {
		// maybe not needed
	}

	@Test
	public void testMain() {
		Tictactoe tictactoe = new Tictactoe();
		tictactoe.changePlayer();
		int testPlayer = tictactoe.getPlayer();
		assertEquals(2, testPlayer);
	}

	@Test
	public void testChangePlayer() {
		assertEquals(1, Tictactoe.getPlayer());
	}
}
