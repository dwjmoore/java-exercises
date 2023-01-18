import java.util.Scanner;

public class Basic1_20 {
	public void main() {
		long decimalNum;
		String[] hexadecimalArray = new String[20];
		int i = 0, hexadecimalValue;
		String hexadecimalNum = "";

		Scanner input = new Scanner(System.in);
		System.out.print("Decimal Number: ");
		decimalNum = input.nextLong();

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

		System.out.println("Hexadecimal Number: " + hexadecimalNum);
	}
}