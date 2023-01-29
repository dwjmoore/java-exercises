import java.util.Scanner;
import java.util.Random;

public class Basic1_98 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to check if the value 2 appears three times and no 2's are next to each other in a given array of integers.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 5) {
			System.out.println("Array length must be at least 5.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int [] array = createArray(len);

		System.out.print("Array = ");
		printArray(array);

		checkArrayForTwos(array);
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
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

	public void checkArrayForTwos(int[] array) {
		int twosCounter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2 && array[i - 1] == 2) {
				System.out.println("The integer 2 is in two consecutive elements.");
				return;
			}
			if (array[i] == 2) {
				twosCounter++;
			}
		}
		if (twosCounter == 3) {
			System.out.print("There are at least three 2's, and none of them are next to each other.");
			return;
		}
		System.out.print("There are not at least three 2's.");
	}
}