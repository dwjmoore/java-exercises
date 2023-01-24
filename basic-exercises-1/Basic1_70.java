import java.util.Scanner;

public class Basic1_70 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length.");

		System.out.print("String #1: ");
		String str1 = input.nextLine();
		System.out.print("String #2: ");
		String str2 = input.nextLine();

		while (str1.length() == str2.length()) {
			System.out.println("The strings must be different lengths.");
			System.out.print("String #1: ");
			str1 = input.nextLine();
			System.out.print("String #2: ");
			str2 = input.nextLine();
		}

		String newStr;

		if (str1.length() > str2.length()) {
			newStr = str2 + str1 + str2;
		} else {
			newStr = str1 + str2 + str1;
		}

		System.out.println(newStr);
	}
}