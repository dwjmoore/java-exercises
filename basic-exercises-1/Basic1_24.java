import java.util.Scanner;

public class Basic1_24 {
	public void main() {
		long binaryNum, decimalNum = 0, factor = 1, octalNum = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Binary #: ");
		binaryNum = input.nextLong();

		// Convert binary to decimal.
		while (binaryNum != 0) {
			decimalNum += (binaryNum % 10) * factor;
			binaryNum /= 10;
			factor *= 2;
		}
		factor = 1;
		// Convert decimal to octal.
		while (decimalNum != 0) {
			octalNum += (decimalNum % 8) * factor;
			decimalNum /= 8;
			factor *= 10;
		}

		System.out.println("Octal #: " + octalNum);
	}
}