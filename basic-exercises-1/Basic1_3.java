import java.util.Scanner;

public class Basic1_3 {
  public void main() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		int result = num1 / num2;
		System.out.println();
		System.out.print("Result: " + result);
  }
}