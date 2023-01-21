import java.util.Scanner;

public class Basic1_65 {
	public void main() {
		System.out.println(
				"Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.");

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Integer #1: ");
			int int1 = input.nextInt();
			System.out.print("Integer #2: ");
			int int2 = input.nextInt();

			while (int1 < int2) {
				System.out.println("Integer #1 must be equal or greater than integer #2");
				System.out.print("Integer #1: ");
				int1 = input.nextInt();
				System.out.print("Integer #2: ");
				int2 = input.nextInt();
			}

			System.out.println("The remainder is " + checkRemainder(int1, int2) + ".");

			System.out.print("Do you want to play again? Enter Y or N: ");
			char answer = input.next().charAt(0);

			if (answer == 'N' || answer == 'n') {
				break;
			}
		}

		System.out.println("Goodbye!");
	}

	public int checkRemainder(int num1, int num2) {
		int divisionResult = num1 / num2;
		int remainder = num1 - (divisionResult * num2);
		return remainder;
	}
}