import java.util.Scanner;

public class Basic1_114 {
	public void main() {
		System.out.println(
				"Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).");

		Scanner input = new Scanner(System.in);

		System.out.print("String: ");
		String str = input.nextLine();
		System.out.print("Offset: ");
		int offset = input.nextInt();

		while (offset < 1 || offset > str.length()) {
			System.out.println("Offset must be greater than 0 and less than the length of the string.");
			System.out.print("Offset: ");
			offset = input.nextInt();
		}

		String rotatedStr = rotateString(str, offset);
		System.out.println(rotatedStr);
	}

	public String rotateString(String str, int offset) {
		char[] strArray = str.toCharArray();
		char[] rotatedStrArray = new char[strArray.length];
		String rotatedString = "";

		for (int i = 0; i < strArray.length; i++) {
			if (i + offset >= strArray.length) {
				rotatedStrArray[i + offset - strArray.length] = strArray[i];
			} else {
				rotatedStrArray[i + offset] = strArray[i];
			}
		}

		for (int i = 0; i < rotatedStrArray.length; i++) {
			rotatedString += String.valueOf(rotatedStrArray[i]);
		}

		return rotatedString;
	}
}