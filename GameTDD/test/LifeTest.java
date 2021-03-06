import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class LifeTest {
	private Life life;

	@Before
	public void setUp() throws Exception {
		life = new Life();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNextState() {
		boolean state1 = life.nextState(0, 3);
		boolean state2 = life.nextState(1, 3);
		assertTrue(state1);
		assertTrue(state2);
	}

	@Test
	public void convertArray2Str() {
		int[][] lifeArray = {{1, 0, 1},
							 {1, 0, 1},
							 {1, 0, 1}};
		assertNotNull(life.convertArray2Str(lifeArray));
	}
	
	@Test
	public void testWrapArray() {
		int[][] lifeArray = {{1, 0, 1},
							 {1, 0, 1},
							 {1, 0, 1}};
		int[][] array = life.wrapArray(lifeArray);
		assertTrue(array.length-lifeArray.length==2);
	}
	
	@Test
	public void testLifeEvolution() {
		int[][] lifeArray = {{1, 0, 1},
							 {1, 0, 1},
							 {1, 0, 1}};
		int[][] array = life.lifeEvolution(lifeArray);
		assertEquals("000101000", life.convertArray2Str(array));
	}
}
