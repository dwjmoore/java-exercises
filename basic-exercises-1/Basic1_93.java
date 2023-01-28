import java.util.Scanner;
import java.util.Random;

public class Basic1_93 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to test if an array of integers contains an element 1 next to 1 or an element 2 next to 2, but not both.");

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

		testArray(array);
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(21);
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

	public void testArray(int[] array) {
		boolean consecutive1 = false, consecutive2 = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1 && array[i - 1] == 1) {
				consecutive1 = true;
			}
			if (array[i] == 2 && array[i - 1] == 2) {
				consecutive2 = true;
			}
		}
		if (
			(consecutive1 == true && consecutive2 == true) ||
			(consecutive1 == false && consecutive2 == false)
		) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
	}
}