import java.util.Scanner;
import java.util.Random;

public class Basic1_123 {
	public void main() {
		System.out.println(
				"Write a Java program to find the subarray with smallest sum from a given array of integers.");

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

		subarraySum(array);
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

	public void subarraySum(int[] array) {
		int minSum = 0, i = 0, startIndex = 0, endIndex = 0;

		while (i < array.length) {
			int tempSum = 0;
			for (int j = i; j < array.length; j++) {
				tempSum += array[j];
				if (j == array.length - 1) {
					i++;
				}
				if (tempSum < minSum) {
					minSum = tempSum;
					startIndex = i;
					endIndex = j;
					break;
				}
			}
		}

		System.out.println("Sum: " + minSum);
		System.out.println("Start Index: " + startIndex);
		System.out.println("End Index: " + endIndex);
	}
}