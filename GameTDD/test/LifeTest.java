import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LifeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNextState() {
		Life life = new Life();
		boolean state1 = life.nextState(0, 3);
		boolean state2 = life.nextState(0, 1);
		boolean state3 = life.nextState(1, 3);
		boolean state4 = life.nextState(1, 1);
		assertTrue(state1);
		assertFalse(state2);
		assertTrue(state3);
		assertFalse(state4);
	}

}
