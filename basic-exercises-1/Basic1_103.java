import java.util.Scanner;
import java.util.Random;

public class Basic1_103 {
	public void main() {
		System.out.println(
				"Write a Java program to create a new array from a given array of integers. The new array will contain the elements from the given array after the last element value 10.");

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

		int[] newArray = createNewArray(array);
		if (array == newArray) {
			System.out.println("There are no 10s in the array. No new array could be made.");
		} else {
			System.out.print("newArray = ");
			printArray(newArray);
		}
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100) + 1;
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

	public int[] createNewArray(int[] array) {
		int[] newArray;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == 10) {
				newArray = new int[array.length - 1 - i];
				i++;
				for (int j = 0; j < newArray.length; j++) {
					newArray[j] = array[i++];
				}
				return newArray;
			} 
		}
		return array;
	}
}