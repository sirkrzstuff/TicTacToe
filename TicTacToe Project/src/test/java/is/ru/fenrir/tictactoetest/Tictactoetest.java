package test.java.is.ru.fenrir.tictactoetest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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

}
