import java.util.Scanner;

public class Basic1_61 {
	public void main() {
		System.out.println("Write a Java program to reverse a word.");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String reversedStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}

		System.out.println(reversedStr);
	}
}