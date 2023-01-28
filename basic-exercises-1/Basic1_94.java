import java.util.Scanner;
import java.util.Random;

public class Basic1_94 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 2) {
			System.out.println("Array length must be at least 2.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int [] array = createArray(len);

		System.out.print("Array = ");
		printArray(array);

		int[] arrangedArray = arrangeArray(array);
		System.out.print("arrangedArray = ");
		printArray(arrangedArray);
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
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

	public int[] arrangeArray(int[] array) {
		int[] newArray = new int[array.length];
		int newArrayIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				newArray[newArrayIndex] = array[i];
				newArrayIndex++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				newArray[newArrayIndex] = array[i];
				newArrayIndex++;
			}
		}
		return newArray;
	}
}