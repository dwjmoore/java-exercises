import java.util.Random;
import java.util.Scanner;

public class Basic1_118 {
	public void main() {
		System.out.println(
				"Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.");

		Scanner input = new Scanner(System.in);

		// System.out.print("String Length: ");
		// int strLength = input.nextInt();

		System.out.print("String to search for: ");
		String strSearch = input.nextLine();

		/*
		while (strLength < 1) {
			System.out.println("String length must be greater than 0.");
			System.out.print("String Length: ");
			strLength = input.nextInt();
		}
		*/

		String str = createString(10);

		searchString(str, strSearch);
	}

	public String createString(int len) {
		Random rand = new Random();
		String str = "";
		int ascii, casePicker;
		
		for (int i = 0; i < len; i++) {
			casePicker = rand.nextInt(2);
			if (casePicker == 0) {
				ascii = rand.nextInt(26) + 65;
			} else {
				ascii = rand.nextInt(26) + 97;
			}

			str += (char) ascii;
		}

		return str;
	}

	public void searchString(String str, String strSearch) {
		char[] strArray = str.toCharArray();
		char[] strSearchArray = strSearch.toCharArray();
		int strPosition;
		boolean strMatch = false;

		for (int i = 0; i <= strArray.length - strSearchArray.length; i++) {
			System.out.print("str1[" + i + "]: " + strArray[i] + " ");
			System.out.println("str2[" + 0 + "]: " + strSearchArray[0]);
			if (Character.compare(strArray[i], strSearchArray[0]) == 0) {
				System.out.println("Hi there!");
				strPosition = i;
				strMatch = true;
				int k = i;
				for (int j = 1; j < strSearchArray.length; j++) {
					k++;
					if (Character.compare(strArray[k], strSearchArray[j]) != 0) {
						strMatch = false;
						break;
					}
				}
				if (strMatch) {
					System.out.print("The searched-for string begins at index " + strPosition + ".");
					return;
				}
			}
		}
		System.out.println("No match");
	}
}