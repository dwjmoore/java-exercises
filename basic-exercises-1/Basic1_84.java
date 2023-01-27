import java.util.Scanner;

public class Basic1_84 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more.");

		System.out.print("String: ");
		String str = input.nextLine();

		while (str.length() < 3) {
			System.out.println("String length must be at least 3.");
			System.out.print("String: ");
			str = input.nextLine();
		}

		newString(str);
	}

	public void newString(String str) {
		String newStr = str.substring(str.length() - 3) + str + str.substring(str.length() - 3);
		System.out.println("newStr = " + newStr);
	}
}