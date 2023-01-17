import java.util.Scanner;

public class Basic1_6 {
  public void main() {
		Scanner input = new Scanner(System.in);
		System.out.print("First Number: ");
		int num1 = input.nextInt();
		System.out.print("Second Number: ");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		int product = num1 * num2;
		int subtract = num1 - num2;
		int division = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Subtraction: " + subtract);
		System.out.println("Division: " + division);
		System.out.println("Remainder: " + remainder);
  }
}