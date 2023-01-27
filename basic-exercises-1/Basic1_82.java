import java.util.Scanner;
import java.util.Random;

public class Basic1_82 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to find the largest element an array of integers of minimum length 2.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 2) {
			System.out.println("Array length must be at least 2.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = new int[len];
		array = createArray(len);
		System.out.print("Array = ");
		printArray(array);

		findLargestElement(array);
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(999);
		}
		return array;
	}

	public void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}

	public void findLargestElement(int[] array) {
		int maxValue = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println("maxValue = " + maxValue);
	}
}