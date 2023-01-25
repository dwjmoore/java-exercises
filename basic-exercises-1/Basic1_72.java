import java.util.Scanner;

public class Basic1_72 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use '#' as substitute characters.");

		System.out.print("String: ");
		String str = input.nextLine();

		String newStr = "";

		if (str.length() >= 3) {
			newStr = str.substring(0, 3);
		} else if (str.length() == 2) {
			newStr = str.substring(0, 2) + "#";
		} else if (str.length() == 1) {
			newStr = str.substring(0, 1) + "##";
		} else {
			newStr = "###";
		}

		System.out.println(newStr);
	}
}