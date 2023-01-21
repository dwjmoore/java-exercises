import java.util.Scanner;

public class Basic1_58 {
	public void main() {
		System.out.println("Write a Java program to capitalize the first letter of each word in a sentence.");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();

		String upperCaseSentence = "";

		Scanner sentenceScan = new Scanner(sentence);

		while (sentenceScan.hasNext()) {
			String word = sentenceScan.next();
			upperCaseSentence += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}

		System.out.println(upperCaseSentence.trim());
	}
}