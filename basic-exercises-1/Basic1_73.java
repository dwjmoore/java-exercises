import java.util.Scanner;

public class Basic1_73 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Write a Java program to create a new string taking first and last characters from two given strings. If the length of either string is 0 use '#' for missing character.");

		System.out.print("String 1: ");
		String str1 = input.nextLine();
		System.out.print("String 2: ");
		String str2 = input.nextLine();

		int len1 = str1.length();
		int len2 = str2.length();

		String newStr = "";
		newStr += (len1 >= 1) ? str1.charAt(0) : '#';
		newStr += (len2 >= 1) ? str2.charAt(len2-1) : '#';

		System.out.println(newStr);
	}
}