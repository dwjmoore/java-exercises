import java.util.Scanner;
import java.util.Random;

public class Basic1_106 {
	public void main() {
		System.out.println(
				"Write a Java program to create a new array that is left shifted from a given array of integers.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 2) {
			System.out.println("Array length must be at least 2.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = createArray(len);
		System.out.print("array = ");
		printArray(array);

		int[] shiftedArray = createShiftedArray(array);
		System.out.print("shiftedArray = ");
		printArray(shiftedArray);
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

	public int[] createShiftedArray(int[] array) {
		int[] shiftedArray = new int[array.length];
		for (int i = 0; i < shiftedArray.length; i++) {
			if (i == shiftedArray.length - 1) {
				shiftedArray[i] = array[0];
				break;
			}
			shiftedArray[i] = array[i + 1];
		}
		
		return shiftedArray;
	}
}