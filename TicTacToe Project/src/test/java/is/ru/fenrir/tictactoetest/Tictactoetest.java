package test.java.is.ru.fenrir.tictactoetest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.is.ru.fenrir.tictactoe.Tictactoe;

public class Tictactoetest {

	@Before
	public void setUp() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
	}

	@Test
	public void testMain() {
		Tictactoe tictactoe = new Tictactoe();
		assertNotNull(tictactoe);
	}

	@Test
	public void testChangePlayer() {
		Tictactoe tictactoe = new Tictactoe();
		int before = tictactoe.getPlayer();
		tictactoe.changePlayer();
		int after = Tictactoe.getPlayer();
		assertNotEquals(before, after);
	}

	@Test
	public void testGetPlayer() {
		assertNotNull(Tictactoe.getPlayer());
	}

}
