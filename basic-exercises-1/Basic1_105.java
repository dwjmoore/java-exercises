import java.util.Scanner;
import java.util.Random;

public class Basic1_105 {
	public void main() {
		System.out.println(
				"Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();
		System.out.print("l: ");
		int l = input.nextInt();

		while (len < l * 2) {
			System.out.println("Array length must be at least " + l * 2 + ".");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int [] array = createArray(len);
		System.out.print("array = ");
		printArray(array);

		checkArray(array, l);
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

	public void checkArray(int[] array, int l) {
		int x = array.length - l;
		for (int i = 0; i < l; i++) {
			if (array[i] != array[i + x]) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}
}

// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] len = 10, l = 3
// x = len - l = 7
// i = 0, array[i] == array[i + 7]