import java.util.Scanner;
import java.util.Random;

public class Basic1_131 {
	public void main() {
		System.out.println(
				"Write a Java program to find the new length of a given sorted array where each element appear only once (remove the duplicates ).");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 1) {
			System.out.println("Array length must be greater than 0.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = createArray(len);
		array = sortArray(array);
		printArray(array);

		int[] newArray = removeDuplicateElements(array);
		printArray(newArray);
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

	public int[] removeDuplicateElements(int[] array) {
		int newArrayLength = 1;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				newArrayLength++;
			}
		}

		int[] newArray = new int[newArrayLength];
		System.out.println(newArrayLength);

		newArray[0] = array[0];
		int j = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				newArray[j] = array[i];
				j++;
			}
		}
		
		return newArray;
	}
}