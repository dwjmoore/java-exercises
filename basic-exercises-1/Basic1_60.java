import java.util.Scanner;

public class Basic1_60 {
	public void main() {
		System.out.println("Write a Java program to find the penultimate (next to last) word of a sentence.");

		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = input.nextLine();

		String[] words = sentence.split(" ");

		System.out.println("The penultimate word of the sentence is " + words[words.length - 2] + ".");
	}
}