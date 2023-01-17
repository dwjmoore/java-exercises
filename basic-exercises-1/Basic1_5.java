import java.util.Scanner;

public class Basic1_5 {
  public void main() {
		Scanner input = new Scanner (System.in);
		System.out.print("First number: ");
		int num1 = input.nextInt();
		System.out.print("Second number: ");
		int num2 = input.nextInt();
		int product = num1 * num2;
		System.out.println();
		System.out.println("Product: " + product);
  }
}