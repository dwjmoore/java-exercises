import java.util.Scanner;

public class Basic1_54 {
	public void main() {
		Scanner input = new Scanner(System.in);
		System.out.print("1st Number: ");
		long num1 = input.nextLong();
		System.out.print("2nd Number: ");
		long num2 = input.nextLong();
		System.out.print("3rd Number: ");
		long num3 = input.nextLong();

		System.out.println("The result is " + test(num1, num2, num3) + ".");
	}

	public boolean test(long num1, long num2, long num3) {
		if (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10) {
			return true;
		}
		return false;
	}
}