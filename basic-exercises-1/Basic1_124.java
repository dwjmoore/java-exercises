import java.util.Scanner;
import java.util.Random;

public class Basic1_124 {
	public void main() {
		System.out.println(
				"Write a Java program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();
		System.out.println("Value to find: ");
		int value = input.nextInt();

		while (len < 1) {
			System.out.println("Array length must be greater than 0.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = createArray(len);
		int[] sortedArray = sortArray(array);
		System.out.print("array = ");
		printArray(sortedArray);

		findValue(sortedArray, value);
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			int posOrNeg = rand.nextInt(2);
			if (posOrNeg == 0) {
				array[i] = rand.nextInt(10);
			}
			if (posOrNeg == 1) {
				array[i] = rand.nextInt(10) * (-1);
			}

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

	public void findValue(int[] array, int value) {
		boolean valueInArray = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				valueInArray = true;
				System.out.println(valueInArray);
				System.out.println("Index: " + i);
				return;
			}
			if (!valueInArray && array[i] > value) {
				if (value < array[0]) {
					System.out.println(valueInArray);
					System.out.println("Index: " + 0);
				} else {
					System.out.println(valueInArray);
					System.out.println("Index: " + (i - 1));
				}
				return;
			}
		}
		if (!valueInArray && value > array[array.length - 1]) {
			System.out.println(valueInArray);
			System.out.println("Index: " + (array.length - 1));
			return;
		}
	}
}