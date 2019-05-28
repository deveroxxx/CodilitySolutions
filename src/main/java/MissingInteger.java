import java.util.Arrays;

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class MissingInteger {

	public int solution(int[] A) {
		if (A.length == 0) return 1;
		Arrays.sort(A);
		int firstPositiveIndex = -1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 1) {
				firstPositiveIndex = i;
				break;
			} else if (A[i] > 0) {
				return 1; //first positive element is greater than 1;
			}
		}

		if (firstPositiveIndex < 0) {
			return 1;
		}

		for (int i = firstPositiveIndex; i < A.length - 1; i++) {
			if (A[i] + 1 == A[i+1] || A[i] == A[i+1]) continue;
			return A[i] + 1;
		}

		return A[A.length - 1] + 1; //last element + 1
	}
}
