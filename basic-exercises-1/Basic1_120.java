import java.util.Scanner;
import java.util.Random;

public class Basic1_120 {
	public void main() {
		System.out.println("Write a Java program that searches a value in an m x n matrix.");

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

		System.out.print("Number to search for: ");
		int num = input.nextInt();

		int[][] matrix = createMatrix(rowLen, columnLen);
		printMatrix(matrix);

		numSearch(matrix, num);
	}

	public int[][] createMatrix(int rowLen, int columnLen) {
		Random rand = new Random();
		int[][] matrix = new int[rowLen][columnLen];
		for (int i = 0; i < rowLen; i++) {
			for (int j = 0; j < columnLen; j++) {
				matrix[i][j] = rand.nextInt(10) + 1;
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

	public void numSearch(int[][] matrix, int num) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == num) {
					System.out.println("The number " + num + " is at index [" + i + "][" + j + "].");
					return;
				}
			}
		}
		System.out.println("No match.");
	}
}