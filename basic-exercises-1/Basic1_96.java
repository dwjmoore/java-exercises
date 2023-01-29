import java.util.Scanner;
import java.util.Random;

public class Basic1_96 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to check if there is a 1 in a given array of integers with a 2 somewhere later in the array.");

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

		checkArrayForOneAndTwo(array);
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

	public void checkArrayForOneAndTwo(int[] array) {
		boolean oneInArray = false;
		for (int i = 0; i <  array.length; i++) {
			if (array[i] == 1) {
				oneInArray = true;
			}
			if (oneInArray && array[i] == 2) {
				System.out.println("There is a 1 and then a 2 in the array.");
				return;
			}
		}
		if (oneInArray){
			System.out.println("There is only a 1 in the array.");
			return;
		}
		System.out.println("There is no 1 nor a 2 in the array.");
	}
}