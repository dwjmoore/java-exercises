import java.util.Scanner;

public class Basic1_112 {
	public void main() {
		System.out.println(
				"Write a Java program to compute the number of trailing zeros in a factorial.");

		Scanner input = new Scanner(System.in);

		System.out.print("Integer: ");
		int integer = input.nextInt();

		while (integer < 1) {
			System.out.println("The integer must be greater than 0.");
			System.out.print("Integer: ");
			integer = input.nextInt();
		}

		int factorial = calculateFactorial(integer);
		countZeros(factorial);
	}

	public int calculateFactorial(int num) {
		int result = 1;
		for (int i = 2; i <= num; i++) {
			result *= i;
		}
		System.out.println("Factorial of " + num + ": " + result);
		return result;
	}

	public void countZeros(int num) {
		int numZeros = 0;
		while (true) {
			if (num % 10 == 0) {
				numZeros++;
				num /= 10;
			} else {
				System.out.println("Trailing Zeros: " + numZeros);
				return;
			}
		}
	}
}