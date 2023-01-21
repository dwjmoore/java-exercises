import java.util.Scanner;

public class Basic1_57 {
	public void main() {
		System.out.println("Write a Java program to accepts an integer and count the factors of the number.");

		Scanner input = new Scanner(System.in);
		System.out.print("Integer: ");
		long userInt = input.nextLong();

		long counter = 0;

		for (long i = 1; i <= userInt; i++) {
			if (userInt % i == 0) {
				counter++;
			}
		}

		System.out.println("Result: " + counter);
	}
}