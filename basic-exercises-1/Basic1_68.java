import java.util.Scanner;

public class Basic1_68 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above.");

		System.out.println("Enter a string with at least three characters: ");
		String str = input.nextLine();

		while (str.length() < 3) {
			System.out.println("Enter a string with at least three characters: ");
			str = input.nextLine();
		}

		char[] strArray = str.toCharArray();

		String last3Chars = "";

		for (int i = strArray.length - 3; i < strArray.length; i++) {
			last3Chars += String.valueOf(strArray[i]);
		}

		String newStr = "";

		for (int j = 1; j <= 4; j++) {
			newStr += last3Chars;
		}
		
		System.out.println(newStr);
	}
}