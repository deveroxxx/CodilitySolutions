/**
 * You are given a matrix A consisting of N rows and M columns, where each cell contains a digit. Your task is to find a continuous sequence of neighbouring cells, starting in the top-left corner and ending in the bottom-right corner (going only down and right), that creates the biggest possible integer by concatenation of digits on the path. By neighbouring cells we mean cells that have exactly one common side.
 *
 * Write a function:
 *
 * class Solution { public String solution(int[][] A); }
 *
 * that, given matrix A consisting of N rows and M columns, returns a string which represents the sequence of cells that we should pick to obtain the biggest possible integer.
 *
 * For example, given the following matrix A:
 *
 * [9 9 7]
 * [9 7 2]
 * [6 9 5]
 * [9 1 2]
 *
 * the function should return "997952", because you can obtain such a sequence by choosing a path as shown below:
 *
 * [9 9 *]
 * [* 7 *]
 * [* 9 5]
 * [* * 2]
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N and M are integers within the range [1..1,000];
 * each element of matrix A is an integer within the range [1..9].
 */
public class MaxPathFromTheLeftTopCorner {
	public String solution(int[][] A) {
		StringBuilder pathString = new StringBuilder();
		int x = 0;
		int y = 0;
		return roadFinder(A, pathString, x, y);
	}

	// O(2**(N+M)) or O(N*M*(N+M))
	private String roadFinder(int[][] A, StringBuilder pathString, int x, int y) {
		int row = A.length - 1;
		int column = A[0].length - 1;
		pathString.append(A[x][y]);
		while (x != row || y != column) {
			if (x == row) {
				y++;
			} else if (y == column) {
				x++;
			} else if (A[x+1][y] > A[x][y+1]) {
				x++;
			} else if (A[x][y+1] > A[x+1][y]) {
				y++;
			} else {
				String a = roadFinder(A, new StringBuilder(pathString), x + 1, y);
				String b = roadFinder(A, new StringBuilder(pathString), x, y + 1);
				if (a.compareTo(b) > 0) {
					return a;
				} else {
					return b;
				}
			}
			pathString.append(A[x][y]);
		}
		return pathString.toString();
	}
}
