import java.util.Scanner;

public class Basic1_64 {
	public void main() {
		System.out.println(
				"Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.");

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Integer #1: ");
			int int1 = input.nextInt();
			System.out.print("Integer #2: ");
			int int2 = input.nextInt();

			while (int1 < 25 ||
					int1 > 75 ||
					int2 < 25 ||
					int2 > 75) {
				System.out.println("Both integers must be between 25 to 75.");
				System.out.print("Integer #1: ");
				int1 = input.nextInt();
				System.out.print("Integer #2: ");
				int2 = input.nextInt();
			}

			System.out.println("The result is " + digitCheck(int1, int2) + ".");

			System.out.print("Do you want to play again? Enter Y or N: ");
			char answer = input.next().charAt(0);

			if (answer == 'N' || answer == 'n') {
				break;
			}
		}

		System.out.println("Goodbye!");
	}

	public boolean digitCheck(int num1, int num2) {

		String stringNum1 = Integer.toString(num1);
		String stringNum2 = Integer.toString(num2);
		char[] digits1 = stringNum1.toCharArray();
		char[] digits2 = stringNum2.toCharArray();

		for (int i = 0; i < digits1.length; i++) {
			for (int j = 0; j < digits2.length; j++) {
				if (digits1[i] == digits2[j]) {
					return true;
				}
			}
		}

		return false;
	}
}