import org.junit.jupiter.api.Test;

class MaxPathFromTheLeftTopCornerTest {

	private MaxPathFromTheLeftTopCorner main = new MaxPathFromTheLeftTopCorner();


	@Test
	void test() {
		int[][] matrix = {
				{9, 9, 3, 9},
				{9, 5, 8, 9},
				{5, 5, 6, 9},
				{7, 5, 6, 9},
				{4, 5, 6, 9},
				{4, 5, 6, 9},
		};

		String solution = main.solution(matrix);
		System.out.println(solution);
	}
}
