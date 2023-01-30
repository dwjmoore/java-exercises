import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Basic1_100 {
	public void main() {
		System.out.println(
				"Write a Java program to count the number of elements in two arrays that have a difference of 3 or less.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 5) {
			System.out.println("Array length must be at least 5.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int [] array1 = createArray(len);
		System.out.print("array1 = ");
		printArray(array1);

		int [] array2 = createArray(len);
		System.out.print("array2 = ");
		printArray(array2);

		checkArrayDifference(array1, array2, len);
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

	public void checkArrayDifference(int[] array1, int[] array2, int len) {
		int differenceCounter = 0, difference;
		for (int i = 0; i < len; i++) {
			difference = Math.abs(array1[i] - array2[i]);
			if (difference <= 3) {
				differenceCounter++;
			}
		}
		System.out.println("Elements: " + differenceCounter);
	}
}