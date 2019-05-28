import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PermMissingElemTest {

	private PermMissingElem permMissingElem = new PermMissingElem();

	@Test
	void general() {
		int solution = permMissingElem.solution(new int[]{2, 3, 1, 5});
		assertEquals(4, solution);
	}

	@Test
	void first_missing() {
		int solution = permMissingElem.solution(new int[]{ 2, 3});
		assertEquals(1, solution);
	}

	@Test
	void last_missing() {
		int solution = permMissingElem.solution(new int[]{ 1, 2});
		assertEquals(3, solution);
	}

	@Test
	void noElement() {
		int solution = permMissingElem.solution(new int[]{});
		assertEquals(1, solution);
	}

	@Test
	void oneElement() {
		int solution = permMissingElem.solution(new int[]{1});
		assertEquals(2, solution);
	}
}