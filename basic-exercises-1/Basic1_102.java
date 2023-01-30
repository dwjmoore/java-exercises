import java.util.Scanner;
import java.util.Random;

public class Basic1_102 {
	public void main() {
		System.out.println(
				"Write a Java program to check if a specified array of integers contains 1 or 3.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 1) {
			System.out.println("Array length must be at least 1.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int [] array = createArray(len);
		System.out.print("array = ");
		printArray(array);

		checkArrayFor1or3(array);
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10) + 1;
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

	public void checkArrayFor1or3(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1 || array[i] == 3) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}
}