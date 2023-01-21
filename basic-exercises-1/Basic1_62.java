import java.util.Scanner;

public class Basic1_62 {
	public void main() {
		System.out.println("Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others.");

		Scanner input = new Scanner(System.in);
		System.out.print("Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Number 2: ");
		int num2 = input.nextInt();
		System.out.print("Number 3: ");
		int num3 = input.nextInt();

		if (num1 >= 20 && (num1 < Math.abs(num2 - num3))) {
			System.out.println(true);
		} else if (num2 >= 20 && (num2 < Math.abs(num1 - num3))) {
			System.out.println(true);
		} else if (num3 >= 20 && (num3 < Math.abs(num1 - num2))) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}