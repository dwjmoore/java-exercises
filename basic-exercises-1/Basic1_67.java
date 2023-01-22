import java.util.Scanner;

public class Basic1_67 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a Java program to insert a word in the middle of the another string.");

		while (true) {
			System.out.print("Do you want to play again? Enter Y or N: ");
			char answer = input.next().charAt(0);

			if (answer == 'N' || answer == 'n') {
				break;
			}
		}

		System.out.println("Goodbye!");
	}
}