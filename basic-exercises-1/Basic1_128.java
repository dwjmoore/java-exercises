import java.util.Scanner;
import java.util.Random;

public class Basic1_128 {
	public void main() {
		System.out.println(
				"Write a Java program to calculate the median of a given unsorted array of integers.");

		Scanner input = new Scanner(System.in);

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 1) {
			System.out.println("Array length must be greater than 0.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		int[] array = createArray(len);
		System.out.print("array = ");
		printArray(array);

		findMedian(array);
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

	public void findMedian(int[] array) {
		int median = 0;
		if (array.length % 2 == 0) {
			median = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
		} else {
			median = array[array.length / 2];
		}
		System.out.println(median);
	}
}