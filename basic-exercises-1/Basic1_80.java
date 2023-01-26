import java.util.Scanner;
import java.util.Random;

public class Basic1_80 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to get the larger value between first and last element of an array (of at least length 3) of integers..");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 3 ) {
			System.out.println("Array length must be at least 3.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = new int[len];

		System.out.print("Array = ");
		array = createArray(len);

		int maxValue = findMaxValue(array);
		System.out.println("maxValue = " + maxValue);
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

	public int findMaxValue(int[] array) {
		int maxValue = array[0];
		if (array[array.length - 1] > maxValue) {
			maxValue = array[array.length - 1];
		}
		return maxValue;
	}
}