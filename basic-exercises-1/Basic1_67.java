import java.util.Scanner;

public class Basic1_67 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a Java program to insert a word in the middle of the another string.");

		System.out.print("Enter a string of multiple words: ");
		String str = input.nextLine();
		System.out.print("Enter a word to insert into the middle of the string: ");
		String word = input.nextLine();

		String strArray[] = str.split(" ");
		String newStrArray[] = new String[strArray.length + 1];

		for (int i = 0; i < strArray.length / 2; i++) {
			newStrArray[i] = strArray[i];
		}

		newStrArray[strArray.length / 2] = word;

		for (int j = strArray.length / 2 + 1; j < newStrArray.length; j++) {
			newStrArray[j] = strArray[j - 1];
		}

		String newStr = "";

		for (int k = 0; k < newStrArray.length; k++) {
			newStr = newStr + newStrArray[k] + " ";
		}

		newStr = newStr.strip();

		System.out.println(newStr);
	}
}