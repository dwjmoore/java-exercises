import java.util.Scanner;
import java.util.Random;

public class Basic1_92 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to count the number of even and odd elements in a given array of integers.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 1) {
			System.out.println("Array length must be at least 1.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = new int[len];
		array = createArray(len);

		System.out.print("Array = ");
		printArray(array);

		countElements(array);
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
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

	public void countElements(int[] array) {
		int numEven = 0, numOdd = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				numEven++;
			} else {
				numOdd++;
			}
		}
		System.out.println("Even Numbers: " + numEven);
		System.out.println("Odd Numbers: " + numOdd);
	}
}