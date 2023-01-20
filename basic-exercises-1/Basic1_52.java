import java.util.Scanner;

public class Basic1_52 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.print("1st Number: ");
		long num1 = input.nextLong();
		System.out.print("2nd Number: ");
		long num2 = input.nextLong();
		System.out.print("3rd Number: ");
		long num3 = input.nextLong();

		if (num1 + num2 == num3) {
			System.out.println("The result is true.");
		} else {
			System.out.println("The result is false.");
		}
	}
}