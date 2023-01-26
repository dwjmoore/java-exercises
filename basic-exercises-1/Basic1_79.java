import java.util.Scanner;
import java.util.Random;

public class Basic1_79 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to rotate an array (of at least length 3) of integers in left direction.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 3 ) {
			System.out.println("Array length must be at least 2.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = new int[len];

		System.out.print("Array = ");
		array = createArray(len);

		int [] rotatedArray = rotateArray(array);

		System.out.print("rotatedArray = [");
		for (int i = 0; i < rotatedArray.length; i++) {
			if (i == rotatedArray.length - 1) {
				System.out.print(rotatedArray[i] + "]");
			} else {
				System.out.print(rotatedArray[i] + ", ");
			}
		}
		System.out.println();
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

	public int[] rotateArray(int[] array) {
		int[] rotatedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				rotatedArray[array.length - 1] = array[0];
			} else {
				rotatedArray[i - 1] = array[i];
			}
		}
		return rotatedArray;
	}
}