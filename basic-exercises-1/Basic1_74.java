import java.util.Scanner;
import java.util.Random;

public class Basic1_74 {
	public void main() {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println(
				"Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.");

		System.out.print("How long do you want the array of random integers? ");
		int len = input.nextInt();

		while (len < 2) {
			System.out.print("Array length must be at least 2: ");
			len = input.nextInt();
		}

		int[] array = new int[len];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
			System.out.print(array[i] + ", ");
		}

		System.out.println();

		if (array[0] == 10 || array[array.length - 1] == 10) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}