import java.util.Scanner;

public class Basic1_23 {
	public void main() {
		long binaryNum, decimalNum = 0, factor = 1;
		String[] hexadecimalArray = new String[20];
		int hexadecimalValue, i = 0;
		String hexadecimalNum = "";

		Scanner input = new Scanner(System.in);
		System.out.print("Binary #: ");
		binaryNum = input.nextLong();

		// Convert binary to decimal.
		while (binaryNum != 0) {
			decimalNum += (binaryNum % 10) * factor;
			binaryNum /= 10;
			factor *= 2;
		}

		// Convert decimal to hexadecimal.
		while (decimalNum != 0) {
			hexadecimalValue = (int) (decimalNum % 16);
			decimalNum /= 16;

			if (hexadecimalValue == 10) {
				hexadecimalArray[i++] = "A";
			} else if (hexadecimalValue == 11) {
				hexadecimalArray[i++] = "B";
			} else if (hexadecimalValue == 12) {
				hexadecimalArray[i++] = "C";
			} else if (hexadecimalValue == 13) {
				hexadecimalArray[i++] = "D";
			} else if (hexadecimalValue == 14) {
				hexadecimalArray[i++] = "E";
			} else if (hexadecimalValue == 15) {
				hexadecimalArray[i++] = "F";
			} else {
				hexadecimalArray[i++] = String.valueOf(hexadecimalValue);
			}
		}
		--i;

		while (i >= 0) {
			hexadecimalNum = hexadecimalNum + hexadecimalArray[i--];
		}

		System.out.println("Hexadecimal #: " + hexadecimalNum);
	}
}