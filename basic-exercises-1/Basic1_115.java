import java.util.Scanner;

public class Basic1_115 {
	public void main() {
		System.out.println(
				"Write a Java program to check if a positive number is a palindrome or not.");

		Scanner input = new Scanner(System.in);

		System.out.print("Number: ");
		int num = input.nextInt();

		while (num < 1) {
			System.out.println("The number must be positive.");
			System.out.print("Number: ");
			num = input.nextInt();
		}

		String strNum = String.valueOf(num);

		char[] numCharArray = strNum.toCharArray();

		checkPalindrome(numCharArray);
	}

	public void checkPalindrome(char[] array) {
		int i = 0, j = array.length - 1;
		while (i <= array.length / 2 - 1) {
			if (array[i] != array[j]) {
				System.out.println(false);
				return;
			}
			i++;
			j--;
		}
		System.out.println(true);
	}
}