import java.util.Scanner;

public class Basic1_30 {
	public void main() {
		String hexadecimalNum;
		String[] hexadecimalArray;
		int arrayLength, i, factor = 1;
		long decimalNum = 0, octalNum = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Hexadecimal #: ");
		hexadecimalNum = input.nextLine();

		hexadecimalArray = hexadecimalNum.split("");
		arrayLength = hexadecimalArray.length;
		i = arrayLength - 1;

		while (i >= 0) {
			if (hexadecimalArray[i].equals("F")) {
				decimalNum += 15 * factor;
			} else if (hexadecimalArray[i].equals("E")) {
				decimalNum += 14 * factor;
			} else if (hexadecimalArray[i].equals("D")) {
				decimalNum += 13 * factor;
			} else if (hexadecimalArray[i].equals("C")) {
				decimalNum += 12 * factor;
			} else if (hexadecimalArray[i].equals("B")) {
				decimalNum += 11 * factor;
			} else if (hexadecimalArray[i].equals("A")) {
				decimalNum += 10 * factor;
			} else {
				decimalNum += Integer.valueOf(hexadecimalArray[i]) * factor;
			}
			--i;
			factor *= 16;
		}

		factor = 1;

		while (decimalNum != 0) {
			octalNum += (decimalNum % 8) * factor;
			decimalNum /= 8;
			factor *= 10;
		}

		System.out.println("Octal #: " + octalNum);
	}
}