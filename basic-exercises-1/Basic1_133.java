import java.util.Scanner;
import java.util.Random;

public class Basic1_133 {
	public void main() {
		System.out.println(
				"Write a Java program to find a path from top left-corner to bottom-right corner of a matrix which minimizes the sum of all numbers along its path.");

		Scanner input = new Scanner(System.in);

		System.out.print("Row Length: ");
		int rowLen = input.nextInt();
		System.out.print("Column Length: ");
		int columnLen = input.nextInt();

		while (rowLen < 1 || columnLen < 1) {
			System.out.println("Row and column lengths must be greater han 0.");
			System.out.print("Row Length: ");
			rowLen = input.nextInt();
			System.out.print("Column Length: ");
			columnLen = input.nextInt();
		}

		int[][] matrix = createMatrix(rowLen, columnLen);
		printMatrix(matrix);

		minPathSum(matrix);
	}

	public int[][] createMatrix(int rowLen, int columnLen) {
		Random rand = new Random();
		int[][] matrix = new int[rowLen][columnLen];
		for (int i = 0; i < rowLen; i++) {
			for (int j = 0; j < columnLen; j++) {
				matrix[i][j] = rand.nextInt(10);
			}
		}
		return matrix;
	}

	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrix[0].length; j++) {
				if (j == matrix[0].length - 1) {
					System.out.println(matrix[i][j] + "]");
					break;
				}
				System.out.print(matrix[i][j] + ", ");
			}
		}
	}

	public void minPathSum(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] temp = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					temp[i][j] = matrix[i][j];
					continue;
				}
				int from_up = i == 0 ? Integer.MAX_VALUE : temp[i - 1][j];
				int from_left = j == 0 ? Integer.MAX_VALUE : temp[i][j - 1];
				temp[i][j] = Math.min(from_up, from_left) + matrix[i][j];
			}
		}
		System.out.println(temp[m - 1][n - 1]);
	}
}