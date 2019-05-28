import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaxCountersTest {

	MaxCounters maxCounters = new MaxCounters();

	@Test
	void solution() {
		int[] solution = maxCounters.solution(5, new int[]{3,4,4,6,1,4,4});
		int[] expected = new int[]{3, 2, 2, 4, 2};
		assertArrayEquals(expected, solution,
				"Expected: " + Arrays.toString(expected) + ", got: " + Arrays.toString(solution));
	}

	@Test
	void oneCounterWithNoMax() {
		int[] solution = maxCounters.solution(1, new int[]{1, 1, 1});
		int[] expected = new int[]{3};
		assertArrayEquals(expected, solution,
				"Expected: " + Arrays.toString(expected) + ", got: " + Arrays.toString(solution));
	}

	@Test
	void oneCounterWithMax() {
		int[] solution = maxCounters.solution(1, new int[]{1, 3, 1});
		int[] expected = new int[]{2};
		assertArrayEquals(expected, solution,
				"Expected: " + Arrays.toString(expected) + ", got: " + Arrays.toString(solution));
	}

	@Test
	void oneCounterWithOnly() {
		int[] solution = maxCounters.solution(1, new int[]{3, 3, 3});
		int[] expected = new int[]{0};
		assertArrayEquals(expected, solution,
				"Expected: " + Arrays.toString(expected) + ", got: " + Arrays.toString(solution));
	}
}