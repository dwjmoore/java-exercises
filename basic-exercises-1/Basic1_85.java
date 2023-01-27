import java.util.Scanner;

public class Basic1_85 {
	public void main() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Write a Java program to check if a string starts with a specified word.");

		System.out.print("Sentence: ");
		String str = input.nextLine();
		System.out.print("Word: ");
		String word = input.nextLine();

		checkString(str, word);
	}

	public void checkString(String str, String word) {
		String[] strArray = str.split(" ");
		String wordSentence = strArray[0].toUpperCase();
		String wordWord = word.toUpperCase();
		System.out.println(wordSentence.equals(wordWord));
	}
}