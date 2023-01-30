import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Basic1_101 {
	public void main() {
		System.out.println(
				"Write a Java program to check if the number of 1s is greater than the number of 2s in a given array of integers.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 3) {
			System.out.println("Array length must be at least 3.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int [] array = createArray(len);
		System.out.print("array = ");
		printArray(array);

		checkArrayFor1And2(array);
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

	public void checkArrayFor1And2(int[] array) {
		int oneCounter = 0, twoCounter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				oneCounter++;
			}
			if (array[i] == 2) {
				twoCounter++;
			}
		}
		if (oneCounter > twoCounter) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}