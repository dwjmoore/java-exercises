import java.util.Scanner;
import java.util.Random;

public class Basic1_97 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to check if an array of integers contains a specified number next to each other or there are two same specified numbers separated by one element.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 3) {
			System.out.println("Array length must be at least 3.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		System.out.print("Enter an integer between 0 and 9: ");
		int userInt = input.nextInt();

		while (userInt < 0 || userInt > 9) {
			System.out.print("Enter an integer between 0 and 9: ");
			userInt = input.nextInt();
		}

		int [] array = createArray(len);

		System.out.print("Array = ");
		printArray(array);

		checkArrayForUserInt(array, userInt);
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

	public void checkArrayForUserInt(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num && array[i - 1] == num) {
				System.out.println("The integer " + num + " is in two consecutive elements.");
				return;
			}
			if (array[i] == num && array[i - 2] == num) {
				System.out.println("There is an element between two " + num + "'s.");
				return;
			}
		}
		System.out.println("The chosen integer is not in the array under the required conditions.");
	}
}