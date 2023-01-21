import java.util.Scanner;

public class Basic1_56 {
	public void main() {
		System.out.println("Write a Java program to find the number of values in a given range divisible by a given value.");
		Scanner input = new Scanner(System.in);
		System.out.print("Number 1: ");
		long num1 = input.nextLong();
		System.out.print("Number 2: ");
		long num2 = input.nextLong();
		System.out.print("Divisor: ");
		long divisor = input.nextLong();
		

		if (num1 >= num2) {
			System.out.println("Number 1 must be less than Number 2.");
			return;
		}

		long counter = 0;
		
		for (long i = num1; i <= num2; i++) {
			if (i % divisor == 0) {
				counter += 1;
			}
		}

		System.out.println("Result: " + counter);
	}
}