import java.util.Scanner;

public class Basic1_117 {
	public void main() {
		System.out.println("Write a Java program to compute the square root of a given integer.");

		Scanner input = new Scanner(System.in);

		System.out.print("Integer: ");
		double num = input.nextDouble();

		while (num < 1) {
			System.out.println("Integer must be greater than 0.");
			System.out.println("Integer: ");
			num = input.nextDouble();
		}

		double root = findSquareRoot(num);

		System.out.printf("%,.11f", root);
		System.out.println();
	}

	public double findSquareRoot(double num) {

		if (num == 0 || num == 1) {
			return num;
		}

		// Using Newton's Method => x = x_0 - (f(x_0)/f'(x_0))
		// x * x = a => f(x) = 0 = x * x - a;  => f'(x) = 2 * x;
		// x = x_0 - (x_0 * x_0 - a) / (2 * x_0);
		
		// Rearranging the above equation into the Babylonian Method
		// x = (1 / 2) * (2 * x_0 - (x_0 - a / x_0)) = (1 / 2) * (x_0 + a / x_0);

		double root = 1d, guess = 0.5 * num;

		while (root * root < num - 0.0000000001 || root * root > num + 0.0000000001) {
			root = 0.5 * (guess + (num / guess));
			guess = root;
		}

		return root;
	}
}