import java.util.Scanner;
import java.util.Random;

public class Basic1_77 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to create a new array of length 2 from two arrays of integers with at least three elements. The new array will contain the first element of the first array and the last element from the second array.");

		System.out.print("Array 1 Length: ");
		int len1 = input.nextInt();
		System.out.print("Array 2 Length: ");
		int len2 = input.nextInt();

		while (len1 < 3 || len2 < 3) {
			System.out.println("Array length must be at least 3.");
			System.out.print("Array 1 Length: ");
			len1 = input.nextInt();
			System.out.print("Array 2 Length: ");
			len2 = input.nextInt();
		}

		int[] array1 = new int[len1];
		int[] array2 = new int[len2];
		int[] newArray = new int[2];

		System.out.print("Array1 = ");
		array1 = createArray(len1);

		System.out.print("Array2 = ");
		array2 = createArray(len2);

		newArray[0] = array1[0];
		newArray[1] = array2[array2.length - 1];

		System.out.println("newArray = [" + newArray[0] + ", " + newArray[1] + "]");
	}

	public int[] createArray(int len) {
		Random rand = new Random();
		int[] array = new int[len];
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
			if (i == array.length - 1) {
				System.out.print(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
		return array;
	}
}