import java.util.Scanner;

public class Basic1_18 {
	public void main() {
		long binary1, binary2, product;
		byte digit;
		byte i = 0;
		int factor = 1;

		Scanner input = new Scanner(System.in);
		System.out.print("First Binary #: ");
		binary1 = input.nextLong();
		System.out.print("Second Binary #: ");
		binary2 = input.nextLong();

		// Determining the length of the array that will hold the results of multiplication
		// by each digit of the multiplier.
		// Each element of the array (row[]) will be added up to get the final product.
		int binary2Length = String.valueOf(binary2).length();
		long[] row = new long[binary2Length];

		// Multiplying the multiplicand (binary1) by each digit of the multiplier (binary2).
		// Then saving the results in each element of row[].
		while (binary2 != 0) {
			digit = (byte) (binary2 % 10);
			row[i++] = (long) (digit * binary1 * factor);
			factor *= 10;
			binary2 = binary2 / 10;
		}
		
		// Add up the elements of each row tro come up with final product.
		// Product is being condensed into the final element of row[].
		for (i = 1; i < binary2Length; i++) {
			row[i] = (long) (addBinary((long) row[i], (long) row[i-1]));
		}

		product = row[binary2Length - 1];

		System.out.println("Product: " + product);
	}

	// Function to add up the rows.
	static long addBinary(long binary1, long binary2) {
		int i = 0, remainder = 0;
		long[] sum = new long[100];
		long result = 0;

		while (binary1 != 0 || binary2 != 0) {
			sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
			remainder = (int) (binary1 % 10 + binary2 % 10 + remainder) / 2;
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		--i;
		while (i >= 0) {
			result = result * 10 + sum[i--];
		}
		return result;
	}
}