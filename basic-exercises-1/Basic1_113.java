import java.util.Scanner;
import java.util.Random;

public class Basic1_113 {
	public void main() {
		System.out.println(
				"Write a Java program to merge two given sorted array of integers and create a new sorted array.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 1) {
			System.out.println("Array length must be greater than 0.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array1 = createArray(len);
		System.out.print("array1 = ");
		printArray(array1);

		int[] array2 = createArray(len);
		System.out.print("array2 = ");
		printArray(array2);

		array1 = sortArray(array1);
		System.out.print("array1 = ");
		printArray(array1);

		array2 = sortArray(array2);
		System.out.print("array2 = ");
		printArray(array2);

		int[] concatenatedArray = concatenateArrays(array1, array2);
		System.out.print("concatenatedArray = ");
		printArray(concatenatedArray);

		int[] sortedConcatenatedArray = sortArray(concatenatedArray);
		System.out.print("sortedConcatenatedArray = ");
		printArray(sortedConcatenatedArray);
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100) + 1;
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

	public int[] sortArray(int[] array) {
		int n = array.length;
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public int[] concatenateArrays(int[] array1, int[] array2) {
		int[] concatenatedArray = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, concatenatedArray, 0, array1.length);
		System.arraycopy(array2, 0, concatenatedArray, array1.length, array2.length);
		return concatenatedArray;
	}
}