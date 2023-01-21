import java.util.Scanner;

public class Basic1_63 {
	public void main() {
		System.out.println(
				"Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.");

		Scanner input = new Scanner(System.in);
		System.out.print("Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Number 2: ");
		int num2 = input.nextInt();

		System.out.println(checkNums(num1, num2));
	}

	public static int checkNums(int num1, int num2) {
		if (num1 % 6 == 0 && num2 % 6 == 0 && num1 < num2) {
			return num1;
		} else if (num1 % 6 == 0 && num2 % 6 == 0 && num2 < num1) {
			return num2;
		} else if (num1 > num2) {
			return num1;
		} else if (num2 > num1) {
			return num2;
		} else {
			return 0;
		}
	}
}