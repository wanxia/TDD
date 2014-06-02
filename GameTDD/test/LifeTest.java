import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
		boolean state2 = life.nextState(1, 3);
		assertTrue(state1);
		assertTrue(state2);
	}

	@Test
	public void convertArray2Str() {
		Life life = new Life();
		int[][] lifeArray = {{1, 0, 1},
							 {1, 0, 1},
							 {1, 0, 1}};
		assertNotNull(life.convertArray2Str(lifeArray));
	}
	
	@Test
	public void testWrapArray() {
		Life life = new Life();
		int[][] lifeArray = {{1, 0, 1},
							 {1, 0, 1},
							 {1, 0, 1}};
		int[][] array = life.wrapArray(lifeArray);
		assertTrue(array.length-lifeArray.length==2);
	}
	
	@Test
	public void testLifeEvolution() {
		Life life = new Life();
		int[][] lifeArray = {{1, 0, 1},
							 {1, 0, 1},
							 {1, 0, 1}};
		int[][] array = life.lifeEvolution(lifeArray);
		assertEquals(life.convertArray2Str(lifeArray), life.convertArray2Str(array));
	}
}
