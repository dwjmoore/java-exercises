import java.util.Scanner;
import java.util.Random;

public class Basic1_81 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to swap the first and last elements of an array (length must be at least 2) and create a new array.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 2 ) {
			System.out.println("Array length must be at least 2.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = new int[len];

		
		array = createArray(len);
		System.out.print("Array = ");
		printArray(array);

		int[] newArray = switchElements(array);
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

	public int[] switchElements(int[] array) {
		int[] newArray = new int[array.length];
		newArray[0] = array[array.length - 1];
		for (int i = 1; i < array.length - 2; i++) {
			newArray[i] = array[i];
		}
		newArray[newArray.length - 1] = array[0];
		return newArray;
	}

	public void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 2; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length -1] + "]");
	}
}