import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MissingIntegerTest {

	public MissingInteger missingInteger = new MissingInteger();

	private final Object[] getInputArray_one() {
		return new Object[]{
				new int[]{-3, -2, -5},
				new int[]{2, 2, 2},
				new int[]{-4, -4, -4},
				new int[]{-4},
				new int[]{0},
				new int[]{0, 0},
				new int[]{-999999, 100000}
		};
	}

	@Test
	@Parameters(method = "getInputArray_one")
	public void outputShouldBeOne(int[] array) {
		int result = missingInteger.solution(array);
		assertEquals(1, result);
	}


	private final Object[] getInputArray_two() {
		return new Object[]{
				new int[]{-3, -2, -5, 1 , 2, 3, 4},
				new int[]{1 , 2, 3, 4, 2, 2, 2},
				new int[]{-4, -4, -4, 1 , 2, 3, 4},
				new int[]{-999999, 100000, 1 , 2, 3, 4},
				new int[]{1 , 2, 3, 4}
		};
	}

	@Test
	@Parameters(method = "getInputArray_two")
	public void outputShouldBeFive(int[] array) {
		int result = missingInteger.solution(array);
		assertEquals(5, result);
	}

}