import java.util.Scanner;

public class Basic1_71 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.");

		System.out.print("String #1: ");
		String str1 = input.nextLine();
		System.out.print("String #2: ");
		String str2 = input.nextLine();

		while (str1.length() < 1 || str2.length() < 1) {
			System.out.println("The strings have a length of at least one.");
			System.out.print("String #1: ");
			str1 = input.nextLine();
			System.out.print("String #2: ");
			str2 = input.nextLine();
		}

		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();

		String newStr1 = "";
		String newStr2 = "";

		for (int i = 1; i < str1Array.length; i++) {
			newStr1 += String.valueOf(str1Array[i]);
		}

		for (int j = 1; j < str2Array.length; j++) {
			newStr2 += String.valueOf(str2Array[j]);
		}

		String newWholeStr = newStr1 + newStr2;

		System.out.println(newWholeStr);
	}
}