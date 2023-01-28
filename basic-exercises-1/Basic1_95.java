import java.util.Scanner;

public class Basic1_95 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to create an array of string values. The elements will contain '0', '1', '2' … through ... n-1.");

		System.out.print("Array Length: ");
		int len = input.nextInt();

		while (len < 1) {
			System.out.println("Array length must be at least 1.");
			System.out.print("Array Length: ");
			len = input.nextInt();
		}

		String[] array = createArray(len);

		System.out.print("Array = ");
		printArray(array);
	}

	public String[] createArray(int len) {
		String [] array = new String[len];
		for (int i = 0; i < len; i++) {
			array[i] = String.valueOf(i);
		}
		return array;
	}

	public void printArray(String[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}
}