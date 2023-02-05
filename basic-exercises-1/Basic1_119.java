import java.util.Random;
import java.util.Scanner;

public class Basic1_119 {
	public void main() {
		System.out.println(
				"Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int arrayLength = input.nextInt();
		System.out.print("Integer to search for: ");
		int searchInt = input.nextInt();

		while (arrayLength < 1) {
			System.out.println("Array length must be greater than 0.");
			System.out.print("Array Length: ");
			arrayLength = input.nextInt();
		}

		int[] array = createArray(arrayLength);
		printArray(array);

		findElement(array, searchInt);
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

	public void findElement(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				System.out.println("The number " + num + " is found at index " + i + ".");
				return;
			}
		}
		System.out.println("No match.");
	}
}