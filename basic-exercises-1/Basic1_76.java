import java.util.Scanner;
import java.util.Random;

public class Basic1_76 {
	public void main() {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println(
				"Write a Java program to test if the first or the last element of two array of integers are same. The length of the array must be greater than or equal to 2.");

		System.out.print("Array 1 Length: ");
		int len1 = input.nextInt();
		System.out.print("Array 2 Length: ");
		int len2 = input.nextInt();

		while (len1 < 2 || len2 < 2) {
			System.out.println("Array length must be at least 2.");
			System.out.print("Array 1 Length: ");
			len1 = input.nextInt();
			System.out.print("Array 2 Length: ");
		  len2 = input.nextInt();
		}

		int[] array1 = new int[len1];
		int[] array2 = new int[len2];

		System.out.print("Array1 = ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rand.nextInt(11);
			System.out.print(array1[i] + ", ");
		}

		System.out.println();

		System.out.print("Array2 = ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = rand.nextInt(11);
			System.out.print(array2[i] + ", ");
		}

		System.out.println();
		
		if (
			array1[0] == array2[0] ||
			array1[0] == array2[array2.length - 1] ||
			array1[array1.length - 1] == array2[0] ||
			array1[array1.length - 1] == array2[array2.length - 1]
		) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}