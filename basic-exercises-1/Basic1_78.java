import java.util.Scanner;
import java.util.Random;

public class Basic1_78 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to test that a given array of integers of at least length 2 contains a 4 or a 7.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 2 ) {
			System.out.println("Array length must be at least 2.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = new int[len];

		System.out.print("Array = ");
		array = createArray(len);

		System.out.println(checkArray(array));
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
			if (i == array.length - 1) {
				System.out.print(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
		return array;
	}

	public boolean checkArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 4 || array[i] == 7) {
				return true;
			}
		}
		return false;
	}
}