import java.util.Scanner;

public class Basic1_12 {
  public void main() {
		Scanner input = new Scanner(System.in);
		System.out.print("First Number: ");
		double num1 = input.nextDouble();
		System.out.print("Second Number: ");
		double num2 = input.nextDouble();
		System.out.print("Third Number: ");
		double num3 = input.nextDouble();
		double avg = (num1 + num2 + num3) / 3;
		System.out.println("Average: " + avg);
  }
}