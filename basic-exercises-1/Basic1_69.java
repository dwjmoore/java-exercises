import java.util.Scanner;

public class Basic1_69 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a Java program to extract the first half of a string of even length.");

		System.out.print("Enter a string of even length: ");
		String str = input.nextLine();

		while (str.length() % 2 != 0) {
			System.out.print("Enter a string of even length: ");
			str = input.nextLine();
		}

		String newStr = str.substring(0, str.length() / 2);
		System.out.println(newStr);
	}
}