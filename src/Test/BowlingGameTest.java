package Test;

import junit.framework.TestCase;

import Domain.*;

public class BowlingGameTest extends TestCase{
	private Game g;
	
	protected void setUp() throws Exception {
		g = new Game();
	}

	public void testGutterGame() throws Exception {
		for (int i=0; i<20; i++)
			g.roll(0);
		assertEquals(0, g.score());
	}
	
	public void testAllOnes() throws Exception {
		for (int i = 0; i < 20; i++)
			g.roll(1);
		assertEquals(20, g.score());	
	}

}
