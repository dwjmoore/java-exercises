import java.util.Scanner;
import java.util.Random;

public class Basic1_83 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to multiply corresponding elements of two arrays of integers. Array length must be at least 1.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 1) {
			System.out.println("Array length must be at least 1.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array1 = new int[len];
		int[] array2 = new int[len];
		
		array1 = createArray(len);
		array2 = createArray(len);
		
		System.out.print("Array1 = ");
		printArray(array1);
		System.out.print("Array2 = ");
		printArray(array2);

		int[] newArray = multiplyArrays(array1, array2, len);
		System.out.print("newArray = ");
		printArray(newArray);
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

	public int[] multiplyArrays(int[] array1, int[] array2, int len) {
		int[] newArray = new int[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = array1[i] * array2[i];
		}
		return newArray;
	}
}